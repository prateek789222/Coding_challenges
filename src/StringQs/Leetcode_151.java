package StringQs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Leetcode_151 {
    public static void main(String[] args) {
        String s = "a good   example";

        System.out.println(reverseWords(s));
    }
    public static String reverseWords(String s) {
        String[] ans = s.split(" ");
        System.out.println(Arrays.toString(ans));
//        System.out.println(ans[3]);
        List<String> lis = new ArrayList<>();
        for(int i = ans.length-1; i >= 0; i--){
            if(!(ans[i].equals("")))
                lis.add(ans[i]);
        }
        s="";
        for(String ss : lis){
           s = s + ss + " ";
        }
        return s.strip();
    }
}
