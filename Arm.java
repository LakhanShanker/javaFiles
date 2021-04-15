import java.util.Scanner;

public class Arm {
    long arm(int a){
       int temp= a;
       long r=0,sum=0;
       while(a>0){
           r=a%10;
           sum=sum+(r*r*r);
           a=a/10;
       }
       if(temp==sum){
           System.out.println("Armstrong Number");
       }
       else {
           System.out.println("Not a Armstrong Number");
       }
        return 0;
    }

    public static void main(String[] args) {
        Scanner r=new Scanner(System.in);
        System.out.println("Enter number you want to check");
        int d=r.nextInt();
        Arm obj=new Arm();
        obj.arm(d);
    }
}
