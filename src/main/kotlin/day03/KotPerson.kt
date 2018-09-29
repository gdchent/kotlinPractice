package day03


abstract class KotPerson( age:Int){

    public var age :Int=age

    init {
        println("调用父类构造器初始化方法 $age =====")
    }
    open fun  work(){
        println("kotlin父类 $age")
    }
}


class MaLong(age:Int):KotPerson(age){

    init {
        println("调用码龙构造器初始化方法 $age")
    }

    override fun work() {
        super.work()
        println("我是码农 年龄$age")
    }
}
class Doctor(age: Int):KotPerson(age){

    init {
        println("我是医生构造器 今年 $age 岁")
    }
    override fun work() {
        super.work()
        println("医生工作 年龄 $age")
    }
}

fun main(args: Array<String>) {
    var kotPerson:KotPerson=MaLong(20)
    kotPerson.work()

    var docPerson:KotPerson=Doctor(22)
    docPerson.work()
}