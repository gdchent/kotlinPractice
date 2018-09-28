enum class LogLevel(val id:Int) {

    VERBOSE(0),DEBUG(1),INFO(2),WARN(3),ERROR(4),ASSERT(5);

    fun getTag() :String{
         return "$id $name"
    }
}

fun main(args: Array<String>) {

}

class LogLevel2 {

}
