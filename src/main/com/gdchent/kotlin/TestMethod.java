public class TestMethod {

    public static void main(String ... args){


        //第一种情况  java调用 静态
        TestMethodClass.staticMethod();

        //如果在java种new出实例
        TestMethodClass testMethodClass=new TestMethodClass();

        testMethodClass.exeMethod();
        //testMethodClass.st
    }
}
