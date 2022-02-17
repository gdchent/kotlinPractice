package com.gdchent.kotlin;

public class TestMethodClass {

    public TestMethodClass(){
        System.out.println("构造函数被调用");
    }

    static {
        System.out.println("static");
    }
    //执行方法
    public void exeMethod(){

      System.out.println("执行方法非静态的");
    }

    public static void staticMethod(){
         //静态方法
        System.out.println("静态方法");
    }
}
