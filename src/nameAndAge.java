import java.util.Scanner;

public class nameAndAge {
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter your name and year of birth");
        String name=s.nextLine();
        int year=s.nextInt();
        System.out.println(name+" is "+(2022-year)+" year old");
    }
}
