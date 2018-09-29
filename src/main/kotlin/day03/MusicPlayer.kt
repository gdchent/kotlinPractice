package day03

//object 就是Java里面的单例
object MusicPlayer:Player(),OnExternalDriverMountListener {

    var state:Int=0

    override fun onMount(driver: Driver) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onUnMount(undriver: Driver) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    fun play(url:String){

    }

    fun stop(){

    }


}

interface OnExternalDriverMountListener{
     fun onMount(driver: Driver)

    fun onUnMount(undriver:Driver)
}

abstract class Player{}

fun main(args: Array<String>) {

      //var musicPlayer:Player=MusicPlayer.state

    //现在想拿到 静态方法
     //第一步拿到
    Latitude.Companion.ofDouble(3.0)
    var latitude:Latitude=Latitude.ofDouble(6.0)
    println(latitude.value)
}

class Latitude private constructor(val value:Double){
      companion object {
          @JvmStatic
          fun ofDouble(double: Double):Latitude{

              return Latitude(double)
          }

          fun ofLatitude(latitude: Latitude):Latitude{

              return Latitude(latitude.value)
          }
      }
}
