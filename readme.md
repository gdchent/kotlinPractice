
# java中的字符串数组获取

String [] str=new String[]{
   "数据1",
   "数据2",
   "数据3",
}
//转变为kotlin的字符串
 val stringArray = arrayOf("数据1", "数据2", "数据3")
        //kotlin的字符串数组的遍历
        for (i in stringArray.indices) {
            print(stringArray[i] + "\t")
        }

  # java中获取字符串

  //方式1
  Sting str=new String("我是字符串");
  //方式2
   char [] chars=new char[] {
                "a",
                "b",
                "f",
        };
   String string=new String(chars);
  ## kotlin中获取字符串
   var string: String = "HelloWorld"
   var fromChars: String = String(charArrayOf('H', 'e', 'l', 'l', 'o', 'W', 'o', 'r', 'l', 'd'))

   //字符串数组的遍历
   var stringArray2 = arrayOf("数据1", "数据2", "数据3")
       for (i in stringArray2.indices) {
           println(stringArray2[i])
       }

        //实用foreach方式遍历
       stringArray2.forEach({element-> println(element)})

       // kotlin中的类 以及 继承
       //人类
       open class Person constructor(name:String,age:Int,var sound:String){

            init {
                println("new了一个人的对象，ta的name$name 年龄$age 声音$sound")
            }
           //测试方法
           fun run(){
                   println("人的run方法")
           }
        }
       //学生类
       class Student(name:String,age: Int,sound: String):Person(name,age,sound){
           init {
               println("new了一个学生对象，ta的name$name 年龄$age 声音$sound")
           }

       }

       //教师类
       class Teacher(name:String,age:Int,sound: String){
            init {
                println("new了一个老师实体，ta的名字叫$name,年龄$age,声音:$sound")
            }
       }



      # 创建面向对象实例

      fun testObject() {
          var javaPerson: JavaPerson = JavaPerson("java", "java_sound", 666)  //kotlin里面调用Java实例
          var people: Person = Person("张三", 22, "吹逼的声音")
          var student: Student = Student("李四", 33, "吹水的66666")
          var teacher: Teacher = Teacher("王五", 36, "声音一点都不爽")


          var person2: Person = Student("person2", 33, "吹水的66666")
          student.run()

          if (student is Person) {
              println("输出学生是人")
          } else {
              print("输出的学生不是人")
          }

          // is用户判断 是否属于什么    相当于Java跟js里面的instance of
          if (person2 is Student) {
              //
              println("输出的person2是student")
          } else {
              println("输入的person2不是student")
          }
      }


      # 整数数组遍历  kotlin方式
      fun arrayOfInt() {
          val arrayOfInt: IntArray = intArrayOf(1, 3, 5, 7)
          println(arrayOfInt[2])
          println(arrayOfInt.first())
          println(arrayOfInt.lastIndex)
          for (int in arrayOfInt) {
              println(int)
          }
      }


       # lumbda表达式

        println("lumbda表达式")
          val sum = { arg1: Int, arg2: Int -> arg1 * arg2 }
          println(sum(22, 33))
          println(sum.invoke(22, 33)) //只有在实用lumbda表达式的时候才可以实用invoke方法
}


//面向对象总结java vs kotlin  区别
在Java中接口里面的所有方法必须为抽象方法不能在接口中直接实现
而在kotlin中如果父接口中有实现了的方法  子类或者子接口不一定要实现  可以腹写方法也可以不实现

## kotlin 再见JavaBean
 //获取Javabean
 var dataClass:DataClass =DataClass("name","sound")
 data class DataClass (var name: String,var sound: String)

  println(dataClass.sound)
   //反编译可以看到 component1   component2 依次为data类的参数
     println(dataClass.component1())
     println(dataClass.component2())


###关于Javabean 写个
    class ComponentX {
         operator fun component1():Int{
                  return 1
          }

          operator fun component2():Int{
                         return 2
           }


         }

    var componentX:ComponentX=ComponentX()
    var (a,b)=componentX
    println("$a == $b")