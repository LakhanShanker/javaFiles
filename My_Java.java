import java.util.Scanner;
public class My_Java {
    public static void main(String a[]) {
        My_Java obj = new My_Java();
        Scanner h = new Scanner(System.in);
        int arr[] = new int[50];
        System.out.println("Enter number of sets");
        int p = h.nextInt();
        for (int i = 1; i <= p; ++i) {
            System.out.println(i + ". ");
            arr[i] = obj.op();
        }
        for (int i = 1; i <= p; ++i) {
            System.out.println(a[i]);

        }
    }

    public int op() {
        Scanner h = new Scanner(System.in);
        System.out.println("Enter name");
                String na = h.nextLine();
        System.out.println("Enter Roll NO.");
        int r = h.nextInt();
 return r;
    }
}