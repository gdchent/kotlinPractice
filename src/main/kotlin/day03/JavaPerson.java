package day03;

public class JavaPerson {


    public String name=null;
    public JavaPerson(String name){

         this.name=name;
         System.out.println("java构造器调用"+name);
    }
    public void work(){

    }
     public static class MaLong extends JavaPerson{


         public MaLong(String name) {
             super(name);
             System.out.println("码龙构造器"+name);
         }

         //@Override
         public void work() {
             //super.work();
             System.out.println("码龙工作："+name);
         }
     }

     public static class Doctor extends JavaPerson{
         public Doctor(String name) {
             super(name);
             System.out.println("医生构造器"+name);
         }

         @Override
         public void work() {
             super.work();
             System.out.println("医生工作："+name);
         }
     }

     public static void main(String [] args){
         //实例一个码龙
         JavaPerson javaPerson=new MaLong("码龙");
         javaPerson.work();
         JavaPerson javaPerson2=new Doctor("我是医生");
         javaPerson2.work();
     }
}

