import java.util.Scanner;

public class minMAxChallenge {
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);

        boolean isnum,flag=true;
        int min=0,max=0,n;
            while(true){
                System.out.println("Enter number");
                isnum=s.hasNextInt();
                if(isnum){
                    n=s.nextInt();
                    if(flag) {
                        min = n;
                        max = n;
                        flag = false;
                    }
                    if(n>max)
                        max=n;
                    if(n<min)
                        min=n;
                }
                else
                    break;
                s.nextLine();
            }
            System.out.println("Min "+min);
            System.out.println("Max "+max);
        }
    }

