package Others;
// https://www.hackerrank.com/interview/preparation-kits/one-month-preparation-kit/one-month-week-one/challenges

public class Time_Conversion {
    public static String timeConversion(String s) {
        // Write your code here
        String meri = s.substring(8);
        String hour = s.substring(0,2);
        String min = s.substring(3,5);
        String sec = s.substring(6,8);

        if(hour.equals("12") && min.equals("00") && sec.equals("00") && meri.equals("AM")){
            return "00" +  ":" + min + ":" + sec;
        }
        if(hour.equals("12") && min.equals("00") && sec.equals("00") && meri.equals("PM")){
            return hour +  ":" + min + ":" + sec;
        }

        if(meri.equals("AM")){
            if(Integer.parseInt(sec) >= 1){
                if(Integer.parseInt(hour) == 12 ) {
                    hour = "00";
                }
            }
        }
        else{
            if(Integer.parseInt(sec) >= 1){
                if(Integer.parseInt(hour) < 12){
                    hour = String.valueOf(Integer.parseInt(hour) + 12);
                }
            }
        }

        return hour +  ":" + min + ":" + sec;

    }

    public static void main(String[] args) {
        System.out.println(timeConversion("12:00:00AM"));
    }
}
