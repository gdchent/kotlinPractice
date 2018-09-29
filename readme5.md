
## kotlin的扩展成员 代码如下

//输出 int个重复的字符串
fun String.multiply(int: Int): String {
    val stringBuilder: StringBuilder = StringBuilder()
    for (i in 0 until int) {
        stringBuilder.append(this)
    }

    return stringBuilder.toString()
}

//kot扩展整型数组排序
fun IntArray.customSort(a: IntArray): IntArray {

    Arrays.sort(a)
    return a;
}


//main函数运行如下
fun main(args: Array<String>) {
    println("abc".multiply(2))

    var intArray: IntArray = intArrayOf(22, 3, 66, 99, 88)
    var intArray2: IntArray = intArrayOf(22, 3, 66, 99, 88,1,199)
    var newIntArray=intArray2.customSort(intArray2)
     for(i in 0 until  newIntArray.size){
         println(newIntArray[i])
     }
    intArray.sort()
    for (i in 0 until intArray.size) {
        println(intArray[i])
    }
}