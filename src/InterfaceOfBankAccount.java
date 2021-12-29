import java.util.Scanner;

public class InterfaceOfBankAccount {
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter Name");
        String name=s.nextLine();
        System.out.println("Enter Account number");
        long accountnumber=s.nextLong();
        s.nextLine();
        System.out.println("Enter email");
        String email=s.nextLine();
        System.out.println("enter Balance");
        double balance=s.nextDouble();
        System.out.println("Enter phone number");
        long phonenumber=s.nextLong();
        BankAccount obj1=new BankAccount();
        obj1.setAccountNumber(accountnumber);
        obj1.setBalance(balance);
        obj1.setEmail(email);
        obj1.setName(name);
        obj1.setPhoneNumber(phonenumber);
        System.out.println(obj1.getUserData());
        System.out.println("1.Deposit");
        System.out.println("2.Withdraw");
        System.out.println("Enter your choice");
        int c=s.nextInt();
        switch (c){
            case 1:
                System.out.println("Enter money to deposit");
                double d=s.nextDouble();
                obj1.depositMoney(d);
                break;
            case 2:
                System.out.println("Enter money to withdraw");
                double wd=s.nextDouble();
                obj1.withdrawMoney(wd);
                break;
            default:
                System.out.println("Wrong input");
        }
    }
}
