public class array {
    public static void main(String[] args) {
        int a[]=new int[4];
        int sum=0;
        int avg=0;
        a[0]=1;
        a[1]=8;
        a[2]=9;
        a[3]=7;
        int b[]={1,2,3,4,};
        System.out.println("A array");
        for (int i=0;i<a.length;i++){
            System.out.print(a[i]);
        }

        for (int i=0;i<b.length;i++){
            System.out.print(b[i]);
        }
        System.out.println("A array");
        System.out.println(a[0]);
        System.out.println(a[1]);
        System.out.println(a[2]);
        System.out.println(a[3]);
        System.out.println("B array");
        System.out.println(b[0]);
        System.out.println(b[1]);
        System.out.println(b[2]);
        System.out.println(b[3]);
        for (int i=0;i<a.length;i++){
            System.out.print(a[i]);
            sum=sum+a[i];
            avg=sum/a.length;
        }
        System.out.println("The sum is"+sum);
        System.out.println("The avg is:"+avg);


    }
}
