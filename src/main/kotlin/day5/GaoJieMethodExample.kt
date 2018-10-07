package day5


fun main(args: Array<String>) {

    var list = listOf<Int>(22, 33, 66, 55)  //int数组

    var intList = arrayOf(22, 99, 88)
    var arrayList = ArrayList<Int>() //实例化一个list集合


    //map用来映射数据  跟js的map差不多 如果每一项需要改变数据结构可以这样写
    var mapList = list.map {
        it * 2 + 3
    }
    //注意这里不能用 Int.toDouble
    var doubleList = list.map { it -> it.toDouble() }  //使用高阶函数的方式

    //然后遍历
    doubleList.forEach({ it -> println("使用lambda方式遍历" + it) })
    doubleList.forEach(::println)

    var iterator = intList.iterator()

    for (i in intList.indices) {
        println("遍历元素" + intList[i])
    }

    when (iterator.hasNext()) {
    //打印当前元素
        true -> {
            var itItem = iterator.next()
            println("itItem" + itItem)

        }
        false -> {

        }
    }
    println("=====listof测试====")
    var myList = listOf(1..20, 2..5, 3..332)  //
    var flatList = myList.flatMap {
        it
    }
    flatList.forEach(::println)

    println("====使用reduce函数测试 ===求和======")
    var total = flatList.reduce { acc, i -> acc + i }
    println("求和结果：" + total)
    println("======使用reduce阶乘======")

    println("====let的使用=====")

//    var testName=""
//    testName?:return
//    println("执行")
    var value = factorial(6L)
    println("递归结果" + value)
}


data class Person(val name: String, val age: Int)


//这里定义一个方法可以为空
fun FindPerson(): Person? {
    return null
}


fun factorial(n: Long): Long {

    if (n <= 0) {
        println("返回值为0");
        return  1L
    }

    return n * factorial(-1)
}

