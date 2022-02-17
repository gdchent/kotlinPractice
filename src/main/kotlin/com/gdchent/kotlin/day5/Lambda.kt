package day5


fun main(args: Array<String>) {

    //定义一个lambda表达式
    var lam = { a: Int, b: Int ->
        a + b
    }
    //调用匿名哈数
    println(lam(3, 6))

    var printHellow = {
        println("hellow")
    }
    println(printHellow().toString())
    println(printHellow.invoke())

    var strArray = arrayOf("test1", "test2", "test3","","test4")
    strArray.forEach(){
        println(it)
    }

    var x=fun(x:Int):Long{
        return x.toLong()
    }
    var res=x(33)
    println(res)

    println(lam)

    //调用函数赋值给一个变量
    var hellow=TesClass::hellow  //这个就相当于java的类的静态方法一样

    var result=strArray.filter(String::isEmpty)
    result.forEach {
        println("空的"+it)
    }
    var pdfPrinter:PdfPrinter= PdfPrinter()
    pdfPrinter.pdfPrinter("any")
    PdfPrinter.printMethod("any")
}

class PdfPrinter{
     //自己定义一个方法
    companion object {
        fun printMethod(any: Any){
            println("printLn函数打印 $any")
        }

    }

    fun pdfPrinter(any:Any){
        println("pdfPrinter")
    }

}
class TesClass{
    fun hellow(){
         println("我是hellow函数")
    }
}