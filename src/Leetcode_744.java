//https://leetcode.com/problems/find-smallest-letter-greater-than-target/description/
//using binary search. Same like returning ceiling value of an array
public class Leetcode_744 {
    public static void main(String[] args) {
        char[] letters={'c','f','j'};
        char target='c';
        System.out.println(nextGreatestLetter(letters,target));
    }
    public static char nextGreatestLetter(char[] letters, char target) {
        int s = 0;
        int e = letters.length - 1;
        while (s <= e) {
            int mid = s + (e - s) / 2;

            if (target < letters[mid]) {
                e = mid - 1;
            }
            else {
                s = mid + 1;

            }
        }
        return letters[s%letters.length];  //if [c,f,g] and target=h, then return c.
    }
}
