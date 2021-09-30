public class Time{
    public static void main(String[] args){
        float totalsec = (24 * 60) * 60;
        float hour = 23;
        float minute = 24;
        float second = 26;
        float sincemid = ((hour * 60) * 60) + (minute * 60) + second;
        float percent = (sincemid / totalsec) * 100;
        int newmin = 56;
        int newsec = 12;
        System.out.print(sincemid + " ");
        System.out.print(percent + " ");
        System.out.println(totalsec - sincemid);
    }
}
