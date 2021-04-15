import java.lang.reflect.Array;
import java.util.Scanner;

public class Arry {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int size,temp;
        System.out.println("Enter size of array");
        size=s.nextInt();
        int[] a=new int[size];
        System.out.println("Enter values");
        for(int i=0;i<size;++i){
            a[i]=s.nextInt();
        }
        for(int i=0;i<size;++i){
            for(int j=0;j<size;++j){
                if(a[i]>a[j]){
                    temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }

        System.out.println("Array after sorting");
        for(int i=0;i<size;++i){
            System.out.println(a[i]);
        }
    }
}
