package com.gdchent.kotlin.lambda

fun main() {
    //lambda表达式的测试1
    val kotlinLambda = KotlinLambda()
    kotlinLambda.lambdaTest()
    //lambda表达式的第二次测试
    val lambdaUtil=LambdaUtil()
    lambdaUtil.lambdaStudy()

    //调用上面函数
    kotlinLambda.funcByLambdaParams(22,3,{customIt->
        run {
            println("获取计算结果2" + customIt)
        }
    })
     kotlinLambda.funcByLambdaParams(22,3,{
         it
    })
}