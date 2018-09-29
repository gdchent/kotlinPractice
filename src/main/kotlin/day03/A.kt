package day03

class X



class A{

    var b=0
    lateinit var c:String   //讲道理这里要初始化  如果我现在这里不想初始化   延迟初始化
    lateinit var d:X
    val e:X by lazy {
        println("init X")
        X()
    }


}

fun main(args: Array<String>) {
    println("start")
    val a=A()
    println("init a")

    println(a.b)
    println(a.e)
}