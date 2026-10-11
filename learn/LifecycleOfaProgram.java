// 章节: java运行原理及生命周期
package learn;

public class LifecycleOfaProgram {
  public static void main(String[] args) { // main 方法，程序执行的起始
    // 程序从上至下执行
    System.out.println("1");
    System.out.println("2");
    System.out.println("3");
    System.out.println("4");
  }
}

/*
 * 编译过程
 * 1. javac -d out Source.java 将源文件编译为java字节码 .java -> .class
 * 2. java -cp out com.example.main.Main 将java字节码交给JVM运行, 指定主类(包含main方法的类)
 */
