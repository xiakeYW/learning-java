// 章节: 静态关键字 
package learn.basicOfOOP;

// 静态导入 
import static java.lang.Math.max;
// 普通import最小单元是class, import static 可以导入最小成员 

public class StaticKeyword {
  public static void main(String[] args) {
    fn(); // 直接调用无需实例化
    max(1, 3);
  }

  public static void fn() { // 静态方法
    System.out.println("Text");
  }

  static { // class第一次被实例化或者调用静态属性才会运行一次
    System.out.println("静态代码块");
  }
}
