java

比如一个类种有一个静态的方法 此时通过类名去调用该方法
会首先调用static然后再调用该静态方法,此时如果再new出
该类实例 将不再调用static静态块
## 总结:比如一个类种 staic静态块只会调用一次 并且是最先会被调用）

## java跟kotlin这里是一样的 如果一旦new出实例那么将不能通过实例对象来调用该类的静态方法示例代码如下：

java类中的代码如下
public class TestMethodClass {

    public TestMethodClass(){
        System.out.println("构造函数被调用");
    }

    static {
        System.out.println("static");
    }
    //执行方法
    public void exeMethod(){

      System.out.println("执行方法非静态的");
    }

    public static void staticMethod(){
         //静态方法
        System.out.println("静态方法");
    }
}

## main函数调用

 //第一种情况  java调用 静态
        TestMethodClass.staticMethod();

        //如果在java种new出实例
        TestMethodClass testMethodClass=new TestMethodClass();

        testMethodClass.exeMethod();
        //testMethodClass.staticMethod()// XXX这是调用不到的