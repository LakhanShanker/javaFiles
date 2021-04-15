import javax.swing.*;
import java.util.Scanner;

public class CharReverse {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        String sc=s.nextLine();
        char str[]=new char[sc.length()];
        int j=0;
        for(int i=sc.length()-1;i>=0;i++)
            str[j++]=sc.charAt(i);
        for(int i=0;i<j-1;i++)
            System.out.print(str[i]);
    }
}
