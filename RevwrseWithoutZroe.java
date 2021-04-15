import java.util.Arrays;
import java.util.Scanner;
import java.lang.String;

public class RevwrseWithoutZroe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string");
        String str=sc.nextLine();
        int n=str.length();
        char[] s=new char[n];
        for(int i=0;i<n;i++){
         s[i]=str.charAt(i);
        }
        boolean stat=false;
        for(int i=n-1;i>=0;i--){
            if(!stat){
                if(s[i] != '0') {
                    System.out.print(s[i]);
                    stat = true;
                }
            }
            else{
                System.out.print(s[i]);
            }
        }
    }
}
