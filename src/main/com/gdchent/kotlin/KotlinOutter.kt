class KotlinOutter {

    //比如定义外部变量
    val a:Int=0
    //如果要将类静态类转化为非静态类 需要在class前面加上inner (相当于Java里面的static)
   inner class Inner(val name:String){


        //内部类定义方法   在内部类为非静态类
        fun  testMethod(){
             //非静态内部类要拿到外部类的成员变量
            //this.@KotlinOutter.a
            println(this@KotlinOutter.a)
        }
    }
}

interface OnClickListener{
     fun onClick()
}


class View{
    var onClickListener:OnClickListener?=null;

}
fun main(args: Array<String>) {


    var kotlinOutter:KotlinOutter=KotlinOutter(); //获取外部类实例
    println(kotlinOutter.a)
    println(kotlinOutter.Inner("name"))

    var view:View=View()
    view.onClickListener=object :OnClickListener{

        override fun onClick() {
            TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        }
    }


}
