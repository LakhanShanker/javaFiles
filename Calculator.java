import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        Scanner x=new Scanner(System.in);
        String r="";
{
    System.out.println("What you want \n 1.Addition \n2.Subtraction \n 3.Multiplication \n 4.Division");
    int d = x.nextInt();
    switch (d) {
        case 1:
            Add();
            break;
        case 2:
            Sub();
            break;
        case 3:
            Mul();
            break;
        case 4:
            Div();
            break;
            default:
                System.out.println("Wrong choice");

    }

}

    }
     public static void Add()   {
        Scanner x=new Scanner(System.in);
        Calculator c=new Calculator();
        double m=0,n=0;
        System.out.println("Enter first number");
        m=x.nextDouble();
        System.out.println("Enter second number");
        n=x.nextDouble();
        double y=c.add(m,n);
        System.out.println("Sum is "+y);
    }
    public double add(double a,double b){
        double sum=a+b;
        return sum;
    }
    public static void Sub()   {
        Scanner x=new Scanner(System.in);
        Calculator c=new Calculator();
        double m=0,n=0;
        System.out.println("Enter first number");
        m=x.nextDouble();
        System.out.println("Enter second number");
        n=x.nextDouble();
        double y=c.sub(m,n);
        System.out.println("Subtraction is "+y);
    }
    public double sub(double a,double b){
        if(a>b) {
            double sub = a - b;
        }
        else{
            double sub= b-a;

        }
        return a;
    }
    public static void Mul()   {
        Scanner x=new Scanner(System.in);
        Calculator c=new Calculator();
        double m=0,n=0;
        System.out.println("Enter first number");
        m=x.nextDouble();
        System.out.println("Enter second number");
        n=x.nextDouble();
        double y=c.mul(m,n);
        System.out.println("Multiplication is "+y);
    }
    public double mul(double a,double b){
        double sum=a*b;
        return sum;
    }
    public static void Div()   {
        Scanner x=new Scanner(System.in);
        Calculator c=new Calculator();
        double m=0,n=0;
        System.out.println("Enter first number");
        m=x.nextDouble();
        System.out.println("Enter second number");
        n=x.nextDouble();
        double y=c.div(m,n);
        int z=(int)c.rem(m,n);
        int r=(int)c.div(m,n);
        System.out.println("Divison is "+y);
        System.out.println("Quotient is "+r);
        System.out.println("Remainder is "+z);
    }
    public double div(double a,double b){
        double d= a/b;
        return d;
    }
    public double rem(double a,double b){
        double d= a%b;
        return d;
    }
}
