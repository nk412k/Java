public class sumof3and5 {
    public static void main(String args[]){
        int sum=0,c=0;
        for(int i=1;i<=1000;i++){
            if(i%3==0 &&i%5==0){
                sum=sum+i;
                c++;
            }
            if(c==5)
                break;
        }
        System.out.println(sum);
    }
}
