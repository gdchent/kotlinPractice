package day03

import java.lang.StringBuilder
import java.util.*

/**
 * 方法重载  kotlin方法重载可以设置默认值  java必须设置默认值
 */

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

fun String.multiply(int: Int): String {
    val stringBuilder: StringBuilder = StringBuilder()
    for (i in 0 until int) {
        stringBuilder.append(this)
    }

    return stringBuilder.toString()
}


fun IntArray.customSort(a: IntArray): IntArray {

    Arrays.sort(a)
    return a;
}
