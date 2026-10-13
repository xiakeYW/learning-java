// 章节: 权限修饰符
package learn.basicOfOOP;

public class AccessSpecifiers {
  public static void main(String[] args) {
    Demo d = new Demo();
  }
}

class Demo {
  int x = 100; // 默认
  public int y = 100; // 公开属性
  private int z = 100; // 私有属性
  protected int w = 100; // 受保护的
  /*
   * private: 自身
   * default: 自身,同包
   * protected: 自身,同包,子类
   * public: 自身,同包,子类,任意
   */
}
