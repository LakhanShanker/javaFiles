import java.lang.String;
import java.util.Scanner;

public class BankAccount {
    private String accountNo;
    private String name;
    private float balance;
    private String email;
    private String phoneNo;

    public void setAccountNo(String accountNo){
        this.accountNo=accountNo;
    }
    public void setName(String name){
        this.name=name;
    }
    public void setBalance(float balance){
        this.balance=balance;
    }
    public void setEmail(String email){
        this.email=email;
    }
    public void setPhoneNo(String phoneNo){
        this.phoneNo=phoneNo;
    }
    public String getAccountNo(String accountNo){
        return this.accountNo;
    }
    public String getName(String name){
        return this.name;
    }
    public float getBalance(float balance){
        return this.balance;
    }
    public String getEmail(String email){
        return this.email;
    }
    public String getPhoneNo(String phoneNo){
        return this.phoneNo;
    }
    public void addBalance(float balance){
        this.balance+=balance;
        System.out.println("Your Balance is :"+this.balance);
    }
    public void withdrawBalance(float balance){
        if(this.balance>balance) {
            this.balance -= balance;
            System.out.println("Your Balance is :" + this.balance);
        }else
            System.out.println("Your Account Balance is not enough ");
    }

    public static void main(String[] args) {
        String str;
        do{
            BankAccount b=new BankAccount();
            Scanner sc= new Scanner(System.in);

            System.out.println("Enter your name");
            String name = sc.nextLine();
            b.setName(name);
            System.out.println("Enter your Account Number");
            String accountNo = sc.nextLine();
            b.setAccountNo(accountNo);
            System.out.println("Enter amount to be deposited first time");
            float bal = sc.nextFloat();
            b.setBalance(bal);
            System.out.println("Enter your E-mail");
            sc.nextLine();
            String email = sc.nextLine();
            b.setEmail(email);
            System.out.println("Enter your Phone Number");
            String phone = sc.nextLine();
            b.setPhoneNo(phone);
            System.out.println("Enter Amount to deposit to your balance");
            float amount = sc.nextFloat();
            b.addBalance(amount);
            System.out.println("Enter Amount to withdraw to your account");
            float withamount = sc.nextFloat();
            b.withdrawBalance(withamount);
            System.out.println("Want to check again (Y/N)");
            sc.nextLine();
            str = sc.nextLine();
            str=str.toUpperCase();
        } while(str.equals("Y"));


    }
}
