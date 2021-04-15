import java.util.Scanner;

public class Plalin {
    long Pla(long x){
        long p=0,sum=0;
  long temp=x;
  while(x>0){
      long r=x%10;
      sum=(sum*10)+r;
      x=x/10;
  }
  if(temp==sum){
      System.out.println("Plalindrom Number");
  }
  else{
      System.out.println("Not a Plalindrom Number");
  }
        return p;
    }

    public static void main(String[] args) {
        Scanner plalin=new Scanner(System.in);
        System.out.println("Enter the number you want to check");
        long c=plalin.nextLong();
        Plalin pl=new Plalin();
        pl.Pla(c);

    }
}
