import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Your Calculator");
        String str;
        float a=sc.nextFloat();
        do{

            sc.nextLine();
            str = sc.nextLine();
            switch (str){
            case "+":
                float b=sc.nextFloat();
                a=a+b;
                System.out.println(a);
                break;
            case "-":
                float c=sc.nextFloat();
                a=a-c;
                System.out.println(a);
                break;
            case "*":
                float d=sc.nextFloat();
                a=a*d;
                System.out.println(a);
                break;
            case "/":
                float e=sc.nextFloat();
                a=a/e;
                System.out.println(a);
                break;
            case "%":
                float f=sc.nextFloat();
                a=a%f;
                System.out.println(a);
                break;

            default:
                System.out.println(a);
                break;
            }
        } while(str.equals("+")||str.equals("-")||str.equals("*")||str.equals("/")||str.equals("%"));

    }
    }
