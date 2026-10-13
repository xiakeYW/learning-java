// 章节: final 关键字 
package learn.basicOfOOP;

public final class FinalKeyword { // 不能被继承
  public static final int X = 100; // 常量

  public static void main(String[] args) {
    final double PI = 3.1415926535;// 常量
  }

  public final void test() { // 不能被重写

  }

  public void test2(final int i) {
    // i 不得被赋值
  }
}

/*
 * 1. final class 不能继承
 * 2. final variable 常量，只能初始化赋值一次
 * 3. final methods 不可重写
 * 4. final args 不可赋值
 */
