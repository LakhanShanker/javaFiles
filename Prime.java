import java.util.Scanner;

public class Prime {
    long PrimeNumber(long a){
        long p=0;
        for(int i=2;i<a;i++){
            if(a%i==0){
                p=1;
            }

        }
        if(p==1){
            System.out.println("Not a Prime Number");
        }
        else{
            System.out.println("Prime Number");
        }
    return p;
    }

    public static void main(String[] args) {
        Scanner pr=new Scanner (System.in);
        System.out.println("Enter a number you want to check");
        long x=pr.nextLong();
        Prime obj=new Prime();
        obj.PrimeNumber(x);
    }
}
