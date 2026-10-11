// 章节: 变量属性及作用域
package learn;

public class VariablesAndScopes {

  public String k = "实例变量";
  public static String x = "静态变量";
  public final String y = "不可变变量(只可赋值一次)";

  public static void main(String[] args) {

    // 这是一个常量
    final int w = 100;

    // w = 114; 报错

    int i = 1;
    {
      int j = 2;
      System.out.println(i + j);
    }
    // Error: System.out.println(j); 读取不到变量j
  }

  public void function(int z) {
    System.out.println(z); // 参数变量
  }
}

/*
 * 变量的属性
 * - 公开范围 public private protected
 * - 变量，static 静态，final 常量
 */
