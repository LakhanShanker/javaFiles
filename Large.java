import java.util.Scanner;

public class Large {
    public static void main(String[] args) {
        Scanner p=new Scanner(System.in);
        System.out.println("Enter size of Array");
        int size=p.nextInt();
        int[] s=new int[size];
        System.out.println("Start to Enter");
        for(int i=0;i<size;++i){
            s[i]= p.nextInt();
        }
        int t=s[0]; //3 5 4 7 9 4
        for(int i=0;i<size;++i){
            for(int j=0;j<size;j++){
         if (t<s[j]){
             t=s[j];
         }
            }
        }
        System.out.println("The largest element of all is "+t);
    }
}
