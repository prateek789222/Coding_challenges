package Others;

import java.util.ArrayList;

//https://practice.geeksforgeeks.org/problems/rat-in-a-maze-problem/1
public class RatInMaze {
    public static void main(String[] args) {
        int[][] m ={{1, 0, 0, 0},
                    {1, 1, 1, 1},
                    {0, 1, 1, 1},
                    {0, 1, 1, 1}};
        System.out.println(findPath(m,4));
    }
    public static ArrayList<String> findPath(int[][] m, int n){
        int[][] vis = new int[n][n]; //creating a visited array
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                vis[i][j] = 0;      //initially all 0
            }
        }
        ArrayList<String> ans = new ArrayList<>();
        if(m[0][0]==1)
            helper("",0,0,ans,m,n,vis);
        return ans;
    }

    static void helper(String p, int row, int col, ArrayList<String> ans,int[][] m,int n,int[][] vis){
        //base condition
        if(row == n - 1 && col == n - 1){
            ans.add(p);
            return;
        }
        //lexicographical order: D,L,R,U

        //down
        if(row + 1 < n && vis[row+1][col]==0 && m[row+1][col]==1){
            vis[row][col]=1;        //mark as visited
            helper(p + "D",row + 1,col,ans,m,n,vis);
            vis[row][col]=0;        //imp: when we return back, its no longer part of our path, and we must reset it
            // again for another recursion call/path.
        }

        //left
        if(col - 1 >= 0 && vis[row][col-1]==0 && m[row][col-1]==1){
            vis[row][col]=1;        //mark as visited
            helper(p + "L",row,col - 1,ans,m,n,vis);
            vis[row][col]=0;        //again backtracking

        }

        //right
        if(col + 1 < n && vis[row][col+1]==0 && m[row][col+1]==1){
            vis[row][col]=1;
            helper(p + "R",row,col + 1,ans,m,n,vis);
            vis[row][col]=0;        //restore while moving back as it was

        }

        //up
        if(row - 1 >= 0 && vis[row-1][col]==0 && m[row-1][col]==1){
            vis[row][col]=1;
            helper(p + "U",row-1,col ,ans,m,n,vis);
            vis[row][col]=0;
        }
    }
}
