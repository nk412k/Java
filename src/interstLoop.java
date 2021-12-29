public class interstLoop {
    public static void main(String args[]){
        int p=10000;
        for(int i=2;i<=8;i++){
            System.out.println(p+" amount to "+(p+(p*i/100))+" at the interest of"+i );
        }
    }
}
