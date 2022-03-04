package com.gdchent.kotlin.lambda

class LambdaUtil {

    public fun lambdaStudy(){

        println("=================开始执行lambdaStudy函数逻辑==============")
         //定义一个lambda表达式类型
        val lam1:(Int)-> Int ={a-> a}
        val resultLam1 = lam1(3)
        println("调用lambda表达式一个参数的类型的结果"+resultLam1)
        val lam1_2 = {a:String->  a}
        val resultLam1_2 = lam1_2("param1")
        println("resultLam1_2:"+resultLam1_2)

        //那同理 如果是2个参数
        val lam2_1:(Int,Int)-> Int = {a:Int,b:Int-> a+b }
        val resultLam2_1 = lam2_1(2,3)
        println("2个参数的第一种写法的lambda表达式："+resultLam1_2)

    }
}