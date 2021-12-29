public class hourminutechallenge {
    public static void main(String args[]){
        System.out.println(getDurationString(124,24));
        System.out.println(getDurationString(23,24));
        System.out.println(getDurationString(120,24));
        System.out.println(getDurationString(243));
    }
    public static String getDurationString(int minutes,int second){
        int h=0,m=0,s=0;
        String st="";
        if(minutes<0 ||(second<0 || second>59))
            return "Invalid Value";
        else{
            h=minutes/60;
            m=minutes%60;
            s=second;
            return h+"h "+m+"m "+s+"s";
        }
    }
    public static String getDurationString(int second){
        if(second<0){
            return "Invalid Input";
        }
        else{
            int m=second/60;
            int s=second%60;
            return getDurationString(m,s);
        }

    }
}
