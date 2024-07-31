package variable;

public class imp extends B {
    int a=15;
    int b=30;
    public void m1(){
        int a=100;
        int b=200;
        System.out.println(a);
        System.out.println(this.a);//
        System.out.println(super.a);
    }

    public static void main(String[] args) {
        imp ob=new imp();
        ob.m1();
    }

}

