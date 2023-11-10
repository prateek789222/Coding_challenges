package ArrayQs;//https://leetcode.com/problems/richest-customer-wealth/description/

public class Leetcode_1672 {
    public static int maximumWealth(int[][] a) {
        int sum=0;
        int max=0;
        for (int i=0;i<a.length;i++){
            for (int j=0;j<a[i].length;j++){
                sum=sum+a[i][j];
                if (j==a[i].length-1){
                    if(sum>=max)
                        max=sum;
                    sum=0;
                }
            }

        }

    return max;
    }

    public static void main(String[] args) {
        int[][] a={{1,2,3},{3,2,1}};
        System.out.println(maximumWealth(a));
    }
}
