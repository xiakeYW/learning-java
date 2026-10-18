// 章节：lambda 表达式 
package learn;

import java.util.function.*;

/*
Function<T,R>：1参1返回
BiFunction<T,U,R>：2参1返回
Consumer<T>：1参无返回
Supplier<T>：无参1返回
Runnable：无参无返回
*/

// java 中函数不是一等公民，无法直接传递函数引用, 必须要包装在 interface 中, 实现包装方法 

public class LambdaExpressions {
  public static void main(String[] args) {
    Function<Integer, Integer> fx = x -> x * 100;// lambda 表达式
    Integer y = fx.apply(2);
    System.out.println(y);
  }
}
