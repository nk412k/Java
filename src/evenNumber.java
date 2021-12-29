import java.util.Scanner;

public class evenNumber {
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int a;
        for(int i=1;i<=10;i++){
            a=s.nextInt();
            isEvenNumber(a);
        }
    }
    public static void isEvenNumber(int n){
        if(n%2==0)
            System.out.println(n+" Even number");
        else
            System.out.println(n +" is odd number");
    }
}
