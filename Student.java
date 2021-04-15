import java.util.Scanner;

public class Student {
    String name;
    int roll_no;
    long mobile_no;
    Student(String name,int roll_no,long mobile_no){
        this.name=name;
        this.mobile_no=mobile_no;
        this.roll_no=roll_no;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no of Students");
        int n= sc.nextInt();
        Student[] s;
        s = new Student[n];
        for(int i=0;i<n;i++)
        {
            System.out.println("Enter name");
            sc.nextLine();
            String name=sc.nextLine();
            System.out.println("Enter Roll No.");
            int roll_no=sc.nextInt();
            System.out.println("Enter mobile No");
            long mobile_no=sc.nextLong();
            s[i]=new Student(name,roll_no,mobile_no);
        }
        for(int i=0;i<n;i++)
        {
            System.out.println("Name: "+ s[i].name);

            System.out.println("Roll No. "+s[i].roll_no );

            System.out.println("Mobile No "+s[i].mobile_no);

        }


    }
}
