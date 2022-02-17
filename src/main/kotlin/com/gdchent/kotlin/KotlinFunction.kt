class KotlinFunction {

    constructor(name:String,age:Int,callback:(name:String,age:Int)->Unit){
            callback.invoke(name,age)
    }
    fun setLambda(name:String,age:Int,callback:(name:String,age:Int)->Unit){
            callback.invoke(name,age)
    }
}