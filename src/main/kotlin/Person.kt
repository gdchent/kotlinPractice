open class Person constructor(name:String,age:Int,var sound:String){

     init {
         println("new了一个人的对象，ta的name$name 年龄$age 声音$sound")
     }

    //测试方法
    fun run(){
            println("人的run方法")
    }
 }

class Student(name:String,age: Int,sound: String):Person(name,age,sound){
    init {
        println("new了一个学生对象，ta的name$name 年龄$age 声音$sound")
    }

}

class Teacher(name:String,age:Int,sound: String){
     init {
         println("new了一个老师实体，ta的名字叫$name,年龄$age,声音:$sound")
     }
}