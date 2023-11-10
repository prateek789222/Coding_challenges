package ArrayQs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
//CYCLIC SORT

public class Leetcode_448 {
    public static void main(String[] args) {
        int[] nums={1,1};
        System.out.println(findDisappearedNumbers(nums));
    }
    static List<Integer> findDisappearedNumbers(int[] nums) {
        int i=0;
        while(i<nums.length){
            if(i!=nums[i]-1 && nums[i]!=nums[nums[i]-1]){
                swap(nums,i,nums[i]-1);
            }
            else{
                i++;
            }
        }
//        System.out.println(Arrays.toString(nums));
        List<Integer> ans=new ArrayList<>();
        for(int j=0;j<nums.length;j++){
            if(j!=nums[j]-1){
                ans.add(j+1);
            }
        }

    return ans;
    }
    static void swap(int[] arr,int x,int y){
        int temp=arr[x];
        arr[x]=arr[y];
        arr[y]=temp;
    }
}
