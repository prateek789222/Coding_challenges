public class Leetcode_342 {
    public static boolean isPowerOfFour(int n) {
        if(n==0)
            return false;
        else if(n == 1)
            return true;
        else if(n%4==0 && isPowerOfFour(n / 4))
            return true;
        return false;
    }

    public static void main(String[] args) {
        System.out.println(isPowerOfFour(64));
    }
}
