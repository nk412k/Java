import java.util.Scanner;

public class InterfaceBank2 {
    public static void main(String args[]){

        bank2 nk=new bank2("nokhalal",1234567890,200,"nokhalal123@gmail.com",1234567);
        System.out.println(nk.getUserData());
        nk.depositMoney(1200);
        nk.withdrawMoney(500);

    }
}
