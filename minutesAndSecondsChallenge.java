public class minutesAndSecondsChallenge {
    public static void main(String[] args) {
        getDuration(81);
    }
    static void  getDuration(int minutes,int seconds) {
        int sec=0,min=0,hr=0;
        if(minutes>0&&seconds>0){
            if(seconds>60){
                sec=seconds/60;
                seconds%=60;
            }
            int x=minutes+sec;
            if(x>60){
                min=x/60;
                x%=60;
            }
            hr+=min;
            System.out.println(hr + "h " + x + "m " + seconds + "s");
        }else
            System.out.println("Invalid time.");
    }
    static void getDuration(int seconds){
        int sec=0,min=0;
        if(seconds>0){
            if(seconds>60){
                sec=seconds/60;
                seconds%=60;
            }
            min+=sec;
            System.out.println(min+"m "+seconds+"s");
        }else{
            System.out.println("Error");
        }
    }
}
