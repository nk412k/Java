import java.util.Scanner;

public class readUserInputChallenge {
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        boolean isnum;
        int sum=0,n;
        for(int i =1;i<=10;i++){
            System.out.println("Enter number #"+i);
            isnum=s.hasNextInt();
            if(isnum){
                n=s.nextInt();
                sum+=n;
            }
            else{
                System.out.println("Wrong input");
            }
            s.nextLine();
        }
        System.out.printf("sum= "+sum);
    }
}
