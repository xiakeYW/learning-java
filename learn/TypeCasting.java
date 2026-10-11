// 章节: 数据类型转换
package learn;

public class TypeCasting {
  public static void main(String[] args) {
    // 自动类型转换(小转大)
    // byte → short → int → long → float → double
    // ↑
    // char
    int a = 100;
    long b = a;

    float c = 0.3f;
    double d = c;

    char e = 'e';
    int f = e;
    System.out.println(String.format("int > long: %d, float > double: %f, char > int: %d", b, d, f));
    // 注意! boolean 不能转换类型，也没必要转换类型

    // 强制类型转换(大转小)
    long g = 100000L;
    byte h = (byte) g; // 损失精度
    double i = Math.PI;
    int j = (int) i;

    System.out.println(String.format("long > byte: %d, double > int: %d", h, j));
    // 引用类型的转换 略, 一样的，小转大自动，大转小强制
  }
}
