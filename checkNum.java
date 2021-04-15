import java.util.Scanner;

public class checkNum {
    public static void main(String[] args) {
        number nu=new number();
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        nu.number1(num);
    }

}
     class number {
        void  number1(int num) {
             if (num >= 0)
                 System.out.println("Positive Number");
             else
                 System.out.println("Negative Number");
         }
     }

