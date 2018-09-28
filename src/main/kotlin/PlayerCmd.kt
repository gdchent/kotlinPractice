
//class前面加sealed  (密封类)  子类必须跟密封类在同一个文件中
sealed class PlayerCmd {

    class Play(val url:String,val posion:Long) :PlayerCmd()

    class Seek(val posion: Long):PlayerCmd()

    object Pause:PlayerCmd()

    object Resume:PlayerCmd()

    object Stop:PlayerCmd()
}


enum class PlayerState{
    IDLE,PAUSE,PLAGING
}