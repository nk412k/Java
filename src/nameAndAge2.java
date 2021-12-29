import java.util.Scanner;

public class nameAndAge2 {
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter your year of birth");
        int year=s.nextInt();
        s.nextLine();
        System.out.println("Enter your name");
        String name=s.nextLine();
        System.out.println(name+" is "+(2022-year)+ " year old");
    }
}
