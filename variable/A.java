package variable;

public class A {
    int a=15;
    static int b =40;
    public void m1(){
        System.out.println(a);
        System.out.println(b);
    }
    public static void m2(){
        //System.out.println(a); //static not call non static
        System.out.println(b);
    }

    public static void main(String[] args) {
        A ob=new A();
        ob.m2();


    }

}
