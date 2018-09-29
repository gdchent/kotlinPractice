

class KotManager :Driver,Writter{

    override fun drive() {
        //TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        println("经理实现开车功能")
    }

    override fun write() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        println("经理实现写作")
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

  ## 课程总结1：
  如果 一个类 同时实现2个接口 早kt中 要么注释TUDO 否则会抛出异常 如果实现一个接口不注释TUDO也不会抛出异常


 ## 接口代理
  代码如下：

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
 ## 接口代理总结：
 在kt中如果一个类同时实现2个接口  可以通过by关键字进行接口委托代理  理解就是如以上代码就是通过传入进来的实体来完成调用drive或者write方法

 举例可以 诸葛亮的亲力亲为   可以完全交给下属去完成