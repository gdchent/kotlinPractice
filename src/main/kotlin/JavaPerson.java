public class JavaPerson {

    private String name=null;
    private String sound=null;
    private  int age=0;

    public JavaPerson(String name,String sound,int age){
         this.name=name;
         this.sound=sound;
         this.age=age;
         System.out.println("被调用");
    }
}
