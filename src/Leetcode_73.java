import java.util.Arrays;

//SET MATRIX ZERO
//Given an m x n integer matrix, if an element is 0, set its entire row and column to 0's.
//
//You must do it in place.
class Leetcode_73 {
        public void setZeroes(int[][] matrix) {
            int x=1; //row marker
            int y=1; //column marker
            int m= matrix.length; //no. of rows
            int n= matrix[0].length; //no. of columns

            for (int i=0;i<m;i++){ //check if there is 0 element in row marker
                if (matrix[i][0]==0)
                    x=0;
            }

            for (int j=0;j<n;j++){ //check if there is 0 element in column marker
                if (matrix[0][j]==0)
                    y=0;
            }

            for (int i=1;i<m;i++){ //check for 0 in non marker element and update marker value accordingly
                for (int j=1;j<n;j++){
                    if (matrix[i][j]==0){
                        matrix[0][j]=0;
                        matrix[i][0]=0;
                    }
                }
            }

            for (int i=1;i<m;i++){ //if there is 0 at particular index in row marker, convert whole row to 0s
                if (matrix[i][0]==0){
                    for (int j=1;j<n;j++){
                        matrix[i][j]=0;
                    }
                }
            }

            for (int j=1;j<n;j++){ //if there is 0 at particular index in column marker, convert whole column to 0s
                if (matrix[0][j]==0){
                    for (int i=1;i<m;i++){
                        matrix[i][j]=0;
                    }
                }
            }

            if (x==0) { //if the row marker had a 0 in it while giving input, make the whole row 0
                for (int i = 0; i < m; i++) {
                   matrix[i][0]=0;
                }
            }

            if (y==0) { //if the column marker had a 0 in it while giving input, make the whole column 0
                for (int j = 0; j < n; j++) {
                    matrix[0][j]=0;
                }
            }
            System.out.println("output array: ");
            for (int[] print:matrix){
                System.out.println(Arrays.toString(print));
            }

        }

        public static void main(String[] args) {
            System.out.println("input array: ");
            int[][] matrix = new int[][]{{0,1,2,0}, {3,4,5,2}, {1,3,1,5}};
            for (int[] print:matrix){
                System.out.println(Arrays.toString(print));
            }
            Leetcode_73 l=new Leetcode_73();
            l.setZeroes(matrix);

        }
    }

