interface InputDevice {


    fun input(event: Any)

    fun inputTest(){

    }
}


interface USBInputDdevice : InputDevice {
    //    override fun input(event: Any) {
//        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
//    }
    fun addUSBInputDevice(inputDevice: InputDevice) {
      println("添加的是usb的设备")
    }
}


interface BLEInputDevice : InputDevice {
    //    override fun input(event: Any) {
//        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
//    }
    fun addBlEInputDevice(inputDevice: InputDevice) {
        //
        println("添加的是蓝牙设备 $inputDevice")
    }
}


interface OpticalMouse{

}

abstract class USBMouse constructor(var name: String) : USBInputDdevice, OpticalMouse {


    //实现接口必须实现所有方法
    override fun input(event: Any) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }


    //重写toString方法
    override fun toString(): String {
        return name
    }
}

//电脑类
class Computer {

    /**
     * 实用lambda表达式  这里相当于switch-case
     */
    fun addInput(inputDevice: InputDevice): Unit {

        when (inputDevice) {  //判断父类是否是子类的实例出来的
            is USBInputDdevice -> {
                println("输出USB设备"+inputDevice)
            }
            is BLEInputDevice -> {
                println("输出蓝牙设备"+inputDevice)
            }
            else -> {
                throw IllegalArgumentException("设备异常")
            }
        }
    }
}

class LogitechMouse:USBMouse("罗技鼠标构造函数参数"){

}
