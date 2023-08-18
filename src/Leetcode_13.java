import java.util.*;
public class Leetcode_13 {
    public static void main(String[] args) {
        System.out.println(romanToInt("III"));

    }
    public static int romanToInt(String s) {
        int num=0,ans=0,prev=0;
        for (int i = s.length() - 1; i >= 0; i--) {
            switch (s.charAt(i)){
                case 'I': num=1; break;
                case 'V': num=5; break;
                case 'X': num=10; break;
                case 'L': num=50; break;
                case 'C': num=100; break;
                case 'D': num=500; break;
                case 'M': num=1000; break;
            }
            if(num>=prev){
                ans=ans+num;
            }
            else
                ans=ans-num;
            prev=num;
        }
        return ans;
    }

}