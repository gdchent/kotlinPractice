package com.gdchent.java;

public class LambdaUtil {


    public void lambdaStudy(){
         System.out.println("============开始执行Java的lambda表达式逻辑代码==============");
         MathOperation addition = (int a, int b) -> a + b;
         int result=addition.operation(3,3);
         System.out.println("添加结果"+result);

    }
}
