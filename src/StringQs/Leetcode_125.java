package StringQs;

public class Leetcode_125 {
    public static void main(String[] args) {
        String s="A man, a plan, a canal: Panama";
        System.out.println(isPalindrome(s));
    }
    static boolean isPalindrome(String n){
        String original=n.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        String rev = "";
        for (int i = original.length() - 1; i >= 0; i--) {
            rev += original.charAt(i);
        }
        if (original.equals(rev)) {
            return true;
        } else {
            return false;
        }
    }
}
