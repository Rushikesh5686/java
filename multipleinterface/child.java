package multipleinterface;

public class child implements parent1,parent2{

    @Override
    public void demo() {
        System.out.println("Parent1");
    }

    @Override
    public void demo1() {
        System.out.println("Parent2");

    }

    public static void main(String[] args) {
        child c=new child();
        c.demo();
        c.demo1();
    }
}
