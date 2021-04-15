import java.util.Scanner;


public class Fibbno {
    long fib(long x){
        int f=1;
        for(int i=2;i<=x;++i){
            f=f*i;
        }
        return f;
    }
    public static void main(String[] args) {
        System.out.println("Enter number you want fibnocai ");
        Scanner fi=new Scanner (System.in);
        long c=fi.nextLong();
        Fibbno th=new Fibbno();
        System.out.println("The answer is: "+th.fib(c));
    }
}

