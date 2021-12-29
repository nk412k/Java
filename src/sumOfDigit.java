import java.util.Scanner;

public class sumOfDigit {
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int sum=sumDigit(a);
        if(sum!=-1){
            System.out.println(sum);
        }
        else{
            System.out.println("wrong input");
        }
    }
    public static int sumDigit(int n){
        if(n<10)
            return -1;
        else{
            int d=0,sum=0;
            while(n!=0){
                d=n%10;
                sum=sum+d;
                n=n/10;
            }
            return sum ;
        }

    }
}
