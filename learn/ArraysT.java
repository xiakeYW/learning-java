// 章节: 数组 
package learn;

import java.util.*;

public class ArraysT {
  public static void main(String[] args) {
    // 初始化方式
    int[] intArr = new int[4];
    int[] intArr2 = { 4, 1, 3, 2 };
    // 所有类型的默认值
    // byte 0
    // short 0
    // int 0
    // long 0L
    // float 0.0f
    // double 0.0
    // boolean false
    // char '\u0000'
    // object null

    // Arrays 类常用方法
    System.out.println(Arrays.toString(intArr)); // Array 转 String
    Arrays.sort(intArr2); // 排序数字
    Arrays.fill(intArr, 67); // 填充数据
    System.out.println(Arrays.equals(intArr, intArr2)); // 数组内容否一致
    System.out.println(Arrays.toString(intArr));
    System.out.println(Arrays.toString(intArr2));
  }
}
