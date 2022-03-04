package com.gdchent.kotlin.lambda

class KotlinLambda {

    fun lambdaTest(){

        //定义一个无参数的lambda表达式
        val test1_1 = { println("无参数") }
        test1_1()
        val test1_2:(String)->String = {param1-> param1}
        val test2 = {param1:String->
            println("一个参数的lambda表达式执行了")
            param1
        }
        val resultTest2=test2("我是参数1")
        println("获取接收结果1:"+resultTest2)
        println("==============开始执行2个参数的lambda表达式第1种写法==============")
        val test3_1 ={param1:String,param2:String -> param1+param2 }
        val resultTest3_1:String = test3_1("参数1","参数2")
        println(resultTest3_1)
        println("==============开始执行2个参数的lambda表达式第2种写法==============")
        val test3_2:(Int , Int) -> Int = {a , b -> a + b}
        val resultTest3_2=test3_2(1,2)
        println(resultTest3_2)
    }

    //比如写一个加法计算器 用户输入1+2
    fun funcByLambdaParams(num1:Int,num2:Int,callback:(result:Int)->Unit){
         //执行callbacck
        callback(num1+num2)
    }

}

