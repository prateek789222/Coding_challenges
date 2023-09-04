package ArrayQs;

//INCOMPLETE
public class Leetcode_48 {
    public static void main(String[] args) {
        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        rotate(matrix);
    }
    public static void rotate(int[][] matrix) {
        int[][] ans=new int[][]{};
        for(int row = matrix.length-1; row > 0; row--){
            for(int col = 0; col < matrix[row].length; col++){
                ans[row][col] = matrix[row][col];
            }
        }
    }
}
