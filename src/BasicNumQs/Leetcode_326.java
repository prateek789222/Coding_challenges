package BasicNumQs;

public class Leetcode_326 {
    public static boolean isPowerOfThree(int n) {
        if(n==0)
            return false;
        else if(n == 1)
            return true;
        else if(n%3==0 && isPowerOfThree(n / 3))
            return true;
        return false;
    }
    public static void main(String[] args) {
        System.out.println(isPowerOfThree(9));
    }
}