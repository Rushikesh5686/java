package abstractmethof;

public class Final extends example{
    @Override
    void car() {
        System.out.println("I am in  car final");

    }

    @Override
    void cs() {
        System.out.println("I am in final in cs");

    }

    @Override
    void PTC() {
        System.out.println("i am in PTC In final");

    }

    @Override
    public void demo() {

    }
    @Override
    public void hod(){
        System.out.println("Edited by HOD");
    }
    @Override
    public void TPO(){
        System.out.println("Edited by Tpo");
    }

    public static void main(String[] args) {
        Final ob=new Final();
        ob.hod();
        ob.TPO();
        ob.car();
        ob.cs();
        ob.PTC();
    }


}
