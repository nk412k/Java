import java.sql.SQLOutput;

public class methodoverload {
    public static void main(String args[]){
        System.out.println(calcFeetAndInchesToCentimeters(12));
        System.out.println(calcFeetAndInchesToCentimeters(1,12));
        System.out.println(calcFeetAndInchesToCentimeters(12,21));
    }
    public static double calcFeetAndInchesToCentimeters(int feet,int inche){
        if(feet<0 || (inche<0 || inche>12))
            return -1;
        else{
            return (12*feet +inche)*2.54;
        }
    }
    public static double calcFeetAndInchesToCentimeters(int inche){
        if(inche<0)
            return -1;
        else{
            return inche/12;
        }
    }
}
