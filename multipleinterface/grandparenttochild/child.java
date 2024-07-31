package multipleinterface.grandparenttochild;

public class child implements grandparent,parent{

    @Override
    public void plot() {
        System.out.println("Grand parent plot");
    }

    @Override
    public void money() {
        System.out.println("Grand parent money");

    }

    @Override
    public void bike() {
        System.out.println(" parent bike");

    }

    @Override
    public void home() {
        System.out.println(" parent home");

    }

    public static void main(String[] args) {
        child c=new child();
        c.bike();
        c.home();
        c.money();
        c.plot();
    }
}
