package com.demo;

import java.util.Random;
import java.util.Scanner;
import java.util.random.*;

public class GuessNumber {

  public static void consoleClear() {
    System.out.println("\033[H\033[2J");
    System.out.flush();
  }

  public static void main(String[] args) {
    consoleClear();
    Random rand = new Random();
    Scanner scan = new Scanner(System.in);
    int number = rand.nextInt(0, 10);
    int count = 3;
    while (true) {
      System.out.println("猜 [0, 10] 其中一个数:");
      int result = scan.nextInt();
      if (result > number | result < number) {
        if (result > number) {
          System.out.println("猜大了");
        } else {
          System.out.println("猜小了");
        }
        count -= 1;
        if (count == 0) {
          System.out.println("你没有机会了");
          break;
        }
        System.out.println(String.format("你还有 %d 次机会", count));
        continue;
      }
      consoleClear();
      System.out.println(String.format("猜对了, 数字是 %d", number));
      break;
    }
  }
}
