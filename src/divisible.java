import java.util.*;
class divisible
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        if((a%5==0)&&(a%7==0))
        System.out.println("Found-easily");
        else
        System.out.println("not found-Try again");
    }
}