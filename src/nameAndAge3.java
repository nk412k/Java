import java.util.Scanner;

public class nameAndAge3 {
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter year of birth");
        boolean isnumber=s.hasNextInt();
        if(isnumber){
            int year=s.nextInt();
            s.nextLine();
            System.out.println("Enter your name");
            String name=s.nextLine();
            if(year>1800){
                System.out.println(name+ " is "+(2022-year)+ " year old");
            }
            else{
                System.out.println("Wrong age");
            }
        }
        else{
            System.out.println("Invalid year of birth");
        }
    }
}
