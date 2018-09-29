package day03

class KotManager :Driver,Writter{

    override fun drive() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        println("经理实现开车功能")
    }

    override fun write() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        println("经理实现写作")
    }
}

// 接口代理  就是
class DeepManager(val driver: Driver,val writter: Writter):Driver by driver,Writter by writter{
//    override fun drive() {
//        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
//    }
//
//    override fun write() {
//        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
//    }

}

class CarDriver:Driver{
    override fun drive() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}

class PPTWriter :Writter{
    override fun write() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}

//开车

interface Driver{
     fun  drive()
}
//写作
interface Writter{
     fun write()
}

fun main(args: Array<String>) {
     var kotManager:KotManager= KotManager()
    kotManager.drive()
    kotManager.write()
    val driver=CarDriver()
    val writter=PPTWriter()
}