// 章节：错误处理 
package learn;

/*
 * Throwable, Error, Exception 的关系 
Throwable                      ← 所有可抛出对象的基类
├── Error                      ← 严重错误，程序不该处理
└── Exception                  ← 异常，程序可处理
    ├── 受检异常 (Checked)      如 IOException、SQLException
    └── 非受检异常 (Runtime)    如 NullPointerException 
*/

public class ExceptionHandling {
  public static void main(String[] args) {
    try {
      // 检测错误
    } catch (Throwable e) {
      // 如果发生错误, 在这里处理错误
      e.printStackTrace();
    } finally {
      // 无论是否发生异常都会运行
    }
  }
}
