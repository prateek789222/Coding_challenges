package StringQs;

public class Leetcode_9 {
    public static void main(String[] args) {
        int x = 99;
        String original = Integer.toString(x);
        String rev = "";
        for (int i = original.length() - 1; i >= 0; i--) {
            rev += original.charAt(i);
        }
        if (original.equals(rev)) {
            System.out.println("PALINDROME");
        } else {
            System.out.println("NON PALINDROME");
        }
    }

}
