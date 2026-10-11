// 章节: String以及相关方法
package learn;

public class StringsAndMethods {
  public static void main(String[] args) {
    // 字符串申明
    String str = "String";
    // 字符串拼接
    String str2 = "Hello" + "Java";
    // 字符串常量池
    String a = "Hello";
    String b = "Hello"; // 不仅数据一样，引用也一样, "Hello"被复用了
    System.out.println(a == b);
    System.out.println(a.equals(b));

    // 常用方法
    // 格式化字符串
    System.out.println(String.format("str: %s, str2: %s", str, str2));
    // 字符串拼接
    System.out.println(String.join(str, str2));
    // 转换为char[]
    System.out.println(str.toCharArray());
    // 去除两边空格
    String c = " Hello ";
    System.out.println(c.trim());

  }
}
