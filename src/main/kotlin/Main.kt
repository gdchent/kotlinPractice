fun main(args: Array<String>) {

    //testMethod()

    //testShiftData()
    //testString()


    //testObject()

    //kotlin的空类型

    //如果字符串为空  立即终止 不为空就赋值接收
//    var name:String=getName()?:return
//    //打印长度
//    println(name!!.length)
//
//    val range:IntRange=0..1024 //[0,1024]

    //println(range[0])
    //arrayOfInt()
    //stringArray()

    //functionNumberUtil()

    //var javaString: JavaStringutil = JavaStringutil()
    // javaString.testString()

    println("lumbda表达式")
    val sum = { arg1: Int, arg2: Int -> arg1 * arg2 }
    println(sum(22, 33))
    println(sum.invoke(22, 33))

    println()

    var stringArray2 = arrayOf("数据1", "数据2", "数据3")
    for (string in stringArray2){
        println("遍历获取的每一项"+string)
    }

    for ((index, value) in stringArray2.withIndex()) {
        println("$index -> $value -> ")
    }

    //循环第三种方式
    stringArray2.forEach({ element-> println(element)})

    //创建Computer实例
    var computer:Computer =Computer()
    var usbMouse :USBMouse=LogitechMouse()
    computer.addInput(usbMouse)

    var javaName:JavaName=JavaName("javaname666")

    println("data==========")
    var dataClass:DataClass =DataClass("name","sound")
    println(dataClass.sound)
    println(dataClass.component1())
    println(dataClass.component2())
    println("data==========")
    //for ((index,value) in args.withIndex())

   var componentX:ComponentX=ComponentX()
    var (a,b)=componentX
    println("$a == $b")
}


//kotlin基本类型的转换
fun testShiftData(): Unit {
    var anInt: Int = 6
    //var resLong:Long=anInt;  报错  跟Java不一样 不能直接转 必须通过包装类来转
    var aLong: Long = anInt.toLong()
    println("测试结果" + aLong)
}


//测试数据类型最大值最小值方法
fun testMethod(): Unit {
    var anotherInt: Int = 0xff;
    var maxInt: Int = Int.MAX_VALUE
    var minInt: Int = Int.MIN_VALUE
    var maxLong: Long = Long.MAX_VALUE
    var minLong: Long = Long.MIN_VALUE

    var floatMax: Float = Float.MAX_VALUE
    var floatMin: Float = Float.MIN_VALUE
    var maxDouble: Double = Double.MAX_VALUE
    var minDouble: Double = Double.MIN_VALUE
    println(anotherInt)
    println("输出整数的最大值" + maxInt)
    println("输出整数的最小值" + minInt)
    println("输出LONG的最大值" + maxLong)
    println("输出LONG的最小值" + minLong)
    println("输出float的最大值" + floatMax)
    println("输出float的最小值" + floatMin)

}

//
fun testString() {

    var string: String = "HelloWorld"
    var fromChars: String = String(charArrayOf('H', 'e', 'l', 'l', 'o', 'W', 'o', 'r', 'l', 'd'))
    println(string == fromChars)   //比较的是内容 相当于java里面的equal
    println(string === fromChars)  //比较的是2个对象的引用   相当于Java里面的==   所以返回false

    var salary: Int = 1000
    println("\$$salary")
    print("flkfd\n")
    println("dksfkdsa")

}


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
//前面加 ？

fun getName(): String? {
    return null
}


fun arrayOfInt() {
    val arrayOfInt: IntArray = intArrayOf(1, 3, 5, 7)
    println(arrayOfInt[2])
    println(arrayOfInt.first())
    println(arrayOfInt.lastIndex)
    for (int in arrayOfInt) {
        println(int)
    }
}

fun charArray() {
    var arrayOfChar: CharArray = charArrayOf('H', 'E', 'L', 'L', 'O', 'W', 'O', 'R', 'L', 'D')
    //for()
}

//获取字符串数组
fun stringArray() {
    var stringArray: String = String(charArrayOf('H', 'E', 'L', 'L', 'O', 'W', 'O', 'R', 'L', 'D'))

    println(stringArray)
    var stringArray2 = arrayOf("数据1", "数据2", "数据3")
    for (i in stringArray2.indices) {
        println(stringArray2[i])
    }

    // println(stringArray2[2])
}

fun testStringIsNull() {
    val testString = ""

    if (testString == null) {
        println("为空")
    } else {
        println("不为空")
    }
    if (testString == "") {
        println("内容为空")
    } else {
        println("内容不为空")
    }
}

fun functionNumberUtil() {

    while (true) {

        try {
            println("请输入算式列如：3+4")
            var input = readLine() ?: break
            if (input.trim().isEmpty()) {
                println("请输入数字")
                return
            }
            val splits = input.trim().split(" ")
            val arg1 = splits[0].toDouble()
            val op = splits[1]
            val arg2 = splits[2].toDouble()
            var operator: Operator = Operator(op)
            println("$arg1 $op $arg2 = ${operator.apply(arg1, arg2)}")

            println("大佬 再来一发?[Y]")
            var cmd = readLine()  //再次接受
            if (cmd == null || cmd.toLowerCase() != "y") {  //判断输入的是不是 y跟Y

                break
            }
        } catch (e: NumberFormatException) {
            println("数据输入格式错误" + e.message)
        }


    }

}


fun testIntFor() {

}


fun lambda() {

}


fun sumTotal(a: Int, b: Int): Int {
    return a + b
}


class Operator(op: String) {
    val opFun: (left: Double, right: Double) -> Double

    init {
        opFun = when (op) {
            "+" -> { l, r -> l + r }
            "-" -> { l, r -> l - r }
            "*" -> { l, r -> l * r }
            "/" -> { l, r -> l / r }
            "%" -> { l, r -> l % r }
            else -> {
                throw UnsupportedOperationException(op)
            }
        }
    }


    //
    fun apply(left: Double, right: Double): Double {

        return opFun(left, right)
    }

}








