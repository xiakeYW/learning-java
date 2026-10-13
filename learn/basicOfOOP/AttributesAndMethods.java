// 章节: 属性与方法
package learn.basicOfOOP;

public class AttributesAndMethods {
  public int a = 100; // 类属性

  public static void main(String[] args) {
    sayHi();
    sayHi("Alex");
  }

  public static void sayHi() { // 声明一个类方法
    System.out.println("Hi");
  }

  public static void sayHi(String name) { // 方法的重载
    System.out.println(String.format("Hi %s !", name));
  }
}
