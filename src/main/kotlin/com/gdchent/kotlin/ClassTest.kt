

class ClassTest {

     //定义成员变量   默认为public 在Java中默认为protected
    var b=0
    //lateinit var c String

    lateinit var c:String
    lateinit var d:ClassTest

    val e:ClassTest by lazy {
         println("init classTest")
         ClassTest()
    }
//    get() {
//        println("调用函数B")
//        return field
//    }
//     //设置函数
//    set(value){
//         println("set函数")
//         field=value
//    }

}

fun main(args: Array<String>) {
     val a=ClassTest()
     println(a.e)
}