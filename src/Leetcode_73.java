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
            int[][] matrix = new int[][]{{1,0,2,0}, {3,4,5,2}, {1,3,0,5}};

            for (int[] print:matrix){
                System.out.println(Arrays.toString(print));
            }
            System.out.println("\n");
            Leetcode_73 l=new Leetcode_73();
            l.setZeroes(matrix);

        }
    }


//    The time complexity of the given code is O(m * n), where m is the number of rows in the matrix and n is the number of columns.
//
//        The code consists of several loops that iterate over the matrix elements. Let's analyze each part of the code:
//
//        The first two loops iterate over the first row and the first column of the matrix, respectively. These loops have a complexity of O(n) and O(m) each.
//
//        The nested loops starting from the third loop iterate over the non-marker elements of the matrix. These loops iterate m-1 * n-1 times, which gives a complexity of O((m-1) * (n-1)).
//
//        The next two loops iterate over the rows and columns of the matrix, excluding the first row and column. These loops iterate (m-1) * n and m * (n-1) times, respectively, resulting in a complexity of O((m-1) * n) and O(m * (n-1)).
//
//        The last two loops iterate over the first column and the first row of the matrix, respectively. These loops have a complexity of O(m) and O(n) each.
//
//        Overall, the dominant factor in terms of time complexity is the loop that iterates over the non-marker elements of the matrix, which has a complexity of O((m-1) * (n-1)). Therefore, the overall time complexity of the code is O(m * n) since the other parts of the code have lower order complexity.
