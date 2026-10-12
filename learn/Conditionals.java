// 章节： 条件语句 
package learn;

public class Conditionals {
  public static void main(String[] args) {
    // if elseif else
    int a = 67;
    if (a == 67) {
      System.out.println("67");
    } else if ((a / 67) == 91) {
      System.out.println("91");
    } else {
      System.out.println("default");
    }

    // switch
    int key = 1;
    switch (key) {
      case 1:
        System.out.println("one");
        break;
      case 2:
        System.out.println("two");
        break;
      case 3:
        System.out.println("three");
        break;
      default:
        System.out.println("default");
    }

    // 三元运算符
    int b = 1;
    boolean t = (b == 1) ? true : false;
    System.out.println(t);
  }
}
