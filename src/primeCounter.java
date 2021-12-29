public class primeCounter {
    public static void main(String args[]){
        int c=0;
        for(int i=10;i<30;i++){
            if(isprime(i)==true){
                c++;
                System.out.println(i);
            }
            if(c==30)
                break;

        }
    }
    public static boolean isprime(int n){
        if(n==1)
            return false;
        else{
            for(int i=2;i<=(int)Math.sqrt(n);i++){
                if(n%i==0) {
                    return false;
                }
            }
            return true;
        }
    }
}
