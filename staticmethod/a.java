package staticmethod;

public class a {
    public void m1(){
        System.out.println("In a class in m1");

    }

    public static void main(String[] args) {
        a obj1=new a();
        obj1.m1();
        b obj2=new b();
        obj2.m2();
    }

}
