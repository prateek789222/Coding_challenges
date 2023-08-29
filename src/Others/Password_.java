package Others;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Password_ {
    public static void main(String[] args) {
        String pwrd = "Yyhs@9845";

        String[] arr = new String[6];
        arr[0] = ".{8,20}";
        arr[1] = ".*\\d.*";
        arr[2] = ".*[A-Z].*";
        arr[3] = ".*[a-z].*";
        arr[4] = ".*[!@#$%^&*()_+=].*";
        arr[5] =  ".*\\S.*"; // \s - non-white space character
//      String pattern = "^(?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#$%^&*()_+=])(?!.*\\s).{8,20}$";

        System.out.println("For Password: "+pwrd+", No. of Violations: "+pwrdViolations(pwrd,arr));

    }
    static int pwrdViolations(String pwrd,String[] arr){
        int count = 0;

        for(String x: arr){
            if(!Pattern.matches(x,pwrd)){
                count++;
            }
        }
        return count;
    }
}
