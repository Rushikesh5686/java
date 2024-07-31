package staticmethod;

public class c {
    public void add(int a,int b){
        int c=a+b;
        System.out.println(c);

    }

    public static void main(String[] args) {
        c ob=new c();
        ob.add(5,5);
    }
}
