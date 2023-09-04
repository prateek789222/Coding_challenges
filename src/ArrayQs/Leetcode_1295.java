package ArrayQs;

//Given an array nums of integers, return how many of them contain an even number of digits.
//Input: nums = [12,345,2,6,7896]
//        Output: 2
//        Explanation:
//        12 contains 2 digits (even number of digits).
//        345 contains 3 digits (odd number of digits).
//        2 contains 1 digit (odd number of digits).
//        6 contains 1 digit (odd number of digits).
//        7896 contains 4 digits (even number of digits).
//        Therefore, only 12 and 7896 contain an even number of digits.
public class Leetcode_1295 {
    static int findNumbers(int[] nums) {
        int flag = 0;
        for (int i = 0; i < nums.length; i++) {
            if (String.valueOf(nums[i]).length() % 2 == 0) //String.valueof()-->convert int to string & .length() gives
                // the integer value of length of the string(i.e digits of number)
                flag += 1;
        }
        return flag;
    }

    public static void main(String[] args) {
        int[] nums = {12, 345, 2, 6, 7896};
        System.out.println(findNumbers(nums));
    }
}
//time complexity=O(n)