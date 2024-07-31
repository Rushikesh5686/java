package staticmethod;

public class parameter {
    public int add(int a,int b){
        int c=a+b;
        return c;

    }

    public static void main(String[] args) {
        parameter obj=new parameter();
        int d=obj.add(5,15);
        System.out.println(d);


    }
}
