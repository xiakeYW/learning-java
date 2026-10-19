// 章节: 继承 
package learn.advancedOOP;

public class Inheritance {
  public static void main(String[] args) {
    Son son = new Son();
    son.test();
  }
}

class Father {
  public boolean test() {
    System.out.println("run tset");
    return false;
  }

  Father(int a, int b) {
    System.out.println(String.format("get a: %s, b: %s", a, b));
  }
}

class Son extends Father {
  Son() {
    super(100, 200); // 运行父类构造方法
  }

  // 覆写方法
  @Override
  public boolean test() {
    System.out.println("override method");
    return true;
  }
  /*
   * Override 要求:
   * 1. 范围不得小于父类
   * 2. 方法签名要一致
   */
}
