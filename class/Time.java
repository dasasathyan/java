import java.io.*;
import java.util.*;

public class Time {
    int hh,mm;
    int timeInMinutes = 0;


    public Time(){
        hh=0;
        mm=0;
    }

    void readTime() throws IOException{
        Calendar cal = new GregorianCalendar();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter Hours ");
        hh = Integer.parseInt(br.readLine());
        System.out.println("Enter Minutes ");
        mm = Integer.parseInt(br.readLine());
    }

    void displayTime(){
        System.out.println("Time is "+hh+" : "+mm);
    }

    int timeToMinutes(){
        timeInMinutes = hh*60;
        timeInMinutes = timeInMinutes+mm;
        return timeInMinutes;
    }

    void minutesToTime(int m){
        if(m<0)
            m=m*(-1);
        hh = m/60;
        mm = m%60;
        System.out.println("Minutes : "+m);
        System.out.println("Hours : "+hh+" Minutes : "+mm);
    }

    static void diffTime(Time t1,Time t2){
        int T1mins = t1.timeToMinutes();
        int T2mins = t2.timeToMinutes();

        if(T1mins<T2mins){
            t1.minutesToTime(T2mins-T1mins);
        }
        else {
            System.out.println("Over Night Session");
            t1.minutesToTime((1440-T1mins)+T2mins);
        }
    }
    public static void main(String[] args) throws IOException{
        Time startTime = new Time();
        Time endTime = new Time();

        String user,pass;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter Username");
        user = br.readLine();
        System.out.println("Enter Password");
        pass = br.readLine();
        if(user.equals(pass)){
            System.out.println("Login Successful");
            startTime.readTime();
            startTime.displayTime();
        }
        else
            System.exit(1);

        System.out.println("Press 0 to log out");
        while (true) {
            if (br.readLine().equals("0")) {
                endTime.readTime();
                endTime.displayTime();
                break;
            }
        }

        diffTime(startTime,endTime);

    }
}
