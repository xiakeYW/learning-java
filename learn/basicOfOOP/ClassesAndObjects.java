// 章节: 类与对象 
package learn.basicOfOOP;

public class ClassesAndObjects { // 唯一的公开类
  public static void main(String[] args) {
    Utils u = new Utils(); // 实例化一个类

  }
}

class Utils { // 其他类，每个源文件里只可以有一个公开类
  Utils() { // 构造方法
    System.out.println("实例化");
  }
}
