import java.util.Scanner;

public class StringReversal {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        int  x=str.length();
        String str2="";
        for(int i=x-1;i>=0;i--) {
            str2 += str.charAt(i);
        }
        if(str.equals(str2))
            System.out.println("PAlindrom");
        else
            System.out.println("not");




    }
}
