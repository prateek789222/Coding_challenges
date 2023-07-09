package Others;//Left shifting a line of words to the left according to a given shift value.(Elements at the beginning will go to
// the end after shifting

import java.util.Arrays;

public class word_shift {
    public static void main(String[] args) {
        String str="a b c d";
        System.out.println(Arrays.toString(shiftOp(str,"-1")));
    }
    public static String[] shiftOp(String str,String n1) {
        String[] str_arr = str.split(" "); //converting the string to an array
        int n=Integer.parseInt(n1);

        if (n<0) {
            System.out.println("INVALID SHIFTING");
            return null;
        } else {
            String[] temp = new String[n]; //to store those words which will get sifted to the end
            for (int i = 0; i < n; i++) { //storing words which will now go to the end
                temp[i] = str_arr[i];
            }

            for (int j = 0; j < str_arr.length - n; j++) { //left shifting the remaining words
                str_arr[j] = str_arr[j + n];
            }

            int s = 0;
            for (int k = str_arr.length - n; k < str_arr.length; k++) { //putting back the words from temp array to original
                // one, hence shifting of element is now complete.
                str_arr[k] = temp[s];
                s++;
            }
            return str_arr;
        }
    }
}
