#!/usr/bin/env bash
set -euo pipefail

cd "$(dirname "$0")/.."

README="README.md"
START="<!-- TREE:START -->"
END="<!-- TREE:END -->"

TREE_OUTPUT="$(tree -I 'out|token|*.class' --dirsfirst)"

python3 - "$README" "$START" "$END" "$TREE_OUTPUT" <<'PY'
import re
import sys

readme, start, end, tree = sys.argv[1:5]

with open(readme, encoding="utf-8") as f:
    content = f.read()

if start not in content or end not in content:
    sys.exit(f"README 缺少标记: {start} / {end}")

block = f"{start}\n```\n{tree}\n```\n{end}"
content = re.sub(
    re.escape(start) + r".*?" + re.escape(end),
    lambda _: block,
    content,
    flags=re.DOTALL,
)

with open(readme, "w", encoding="utf-8") as f:
    f.write(content)

print("README 项目树已更新")
PY
