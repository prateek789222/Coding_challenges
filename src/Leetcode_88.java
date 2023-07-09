//https://leetcode.com/problems/merge-sorted-array/description/?envType=study-plan-v2&envId=top-interview-150

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Leetcode_88 {

    static void merge(int[] nums1, int m, int[] nums2, int n) {
        ArrayList<Integer> lis = new ArrayList<>();

        for (int i=0;i<m;i++){
            lis.add(nums1[i]);
        }

        for (int j=0;j<n;j++){
            lis.add(nums2[j]);
        }

        Collections.sort(lis);
        for (int i = 0; i < lis.size(); i++) {
            nums1[i] = lis.get(i);
        }
        System.out.println(Arrays.toString(nums1));
    }

    public static void main(String[] args) {
        int[] nums1={-1,0,1,1,0,0,0,0,0};
        int[] nums2={-1,0,2,2,3};
        int m=4;
        int n=5;
        merge(nums1,m,nums2,n);
    }
}
