public class calhighscoreposition {
    public static void main(String args[]){
        System.out.println(calculatehighscoreposition(501));
        System.out.println(calculatehighscoreposition(1001));
        System.out.println(calculatehighscoreposition(101));
    }
    static int calculatehighscoreposition(int score){
        if(score>=1000){
            return 1;
        }
        else if (score>=500)
            return 2;
        else if(score>=100)
            return 3;
        else
            return 4;
    }
}
