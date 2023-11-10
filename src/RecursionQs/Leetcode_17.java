package RecursionQs;

import java.util.ArrayList;
import java.util.List;

public class Leetcode_17 {
    public static void main(String[] args) {
        System.out.println(letterCombinations("2"));
    }

    public static List<String> letterCombinations(String digits) {

        List<String> ans = new ArrayList<>(); //final answer

        if(digits.isEmpty()){
            return ans;
        }

        String[] arr = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"}; //mapping
        StringBuilder output=new StringBuilder(); //processed string
        int index=0; //points to the unprocessed input string(digits)
        helper(digits, output, index, ans, arr);
        return ans;
    }
    static void helper(String digits, StringBuilder output, int index, List<String> ans, String[] arr){

        //base condition
        if(index>=digits.length()){
            ans.add(String.valueOf(output));
            return;
        }

        int num = digits.charAt(index);      //num stores which digit the index is pointing to
        String val = arr[num - '0'];

        for (int i = 0; i < val.length(); i++) {
            output.append(val.charAt(i));
            helper(digits, output, index+1, ans, arr);
            output.deleteCharAt(output.length()-1);
        }
    }
}