import java.util.*;
public class myNew {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String time=sc.nextLine();
        String time1=sc.nextLine();
        int a=0;
        int b=0;


        try {
            a = Integer.parseInt(time);
            b = Integer.parseInt(time1);
        }
        catch (NumberFormatException e)
        {
            a = a+b;
        }
        System.out.println(a);
    }
}
