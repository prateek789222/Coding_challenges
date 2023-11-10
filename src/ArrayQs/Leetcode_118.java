package ArrayQs;//https://leetcode.com/problems/pascals-triangle/description/
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Leetcode_118 {
    public static void main(String[] args) {
        int numRows=7; //no. of rows we want to generate
        System.out.println(Arrays.asList(generate(numRows))); //prints the output
    }
    public static List<List<Integer>> generate(int numRows) {
        if (numRows==0){
            return null;
        }
        List<List<Integer>> result=new ArrayList(); //create a 2d list called result. Will be our solution
        for (int i=1;i<=numRows;i++){ //Iterate as rows.
            //list index:   Row index:
            //  0               1
            //  1               2       //as row index=no. of elements in it(first row has 1 element etc...)
            //  2               3
            List<Integer> row=new ArrayList(); //create an individual row

            for (int j=0;j<i;j++){ //iterate as columns in a row. As i = row_index = no.of.elements in a row < j(as i
                // starts from 1 and j starts from 0)
                if (j==0 || j==i-1){ //add 1 to first and last column
                    row.add(1);
                }
                else { //get the prev row j(column) element and j-1 element value and add them(pascal triangle addition)
                    row.add(result.get(i-2).get(j)+result.get(i-2).get(j-1)); //i-2 as, row_index=i=(list_index+1),
                    // therfore to get prev list row, list_index=i-1-1
                }
            }
            result.add(row); //add that row to result list
        }

        return result; //return the solution
    }
}

