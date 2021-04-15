import java.util.Arrays;
import java.util.Scanner;

public class DuplicateString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str= sc.nextLine();
        char ch[]= str.toCharArray();
        int count[]=new int[256];
        Arrays.fill(count,0);
        for(int i=0;i<str.length();i++) {
                    count[ch[i]]++;
        }
        for(int i=0;i<255;i++){
            if(count[i]>1){
                System.out.println((char)i+","+ count[i]);
            }
        }
    }
}
