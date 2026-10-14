// 章节: 嵌套类 
package learn.basicOfOOP;

public class NestedClasses {
  static int a = 100;

  // 静态嵌套类
  public static class StaticNested {
    StaticNested() {
      System.out.println(a);
    }
  }

  // 成员内部类
  public class Inner {
    Inner() {
      System.out.println("Inner");
    }
  }

  public static void main(String[] args) {
    StaticNested sn = new StaticNested();
    NestedClasses nc = new NestedClasses();
  }
}
