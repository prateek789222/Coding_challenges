package ArrayQs;//https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/

import java.util.Arrays;

public class Leetcode_34 {
    public static void main(String[] args) {
        int[] nums = {5, 7, 7, 8, 8, 10};
        int target = 7;
        System.out.println(Arrays.toString(searchRange(nums, target)));
    }

    public static int[] searchRange(int[] nums, int target) {
        int[] ans = {-1, -1};
        // check for first occurrence if target first
        ans[0] = search(nums, target, true); //First element of our answer
        if (ans[0] != -1) { //if first elem is -1, this means the target is not inside our array
            ans[1] = search(nums, target, false); //second element of our answer
        }
        return ans;
    }

    // this function just returns the index value of target
    static int search(int[] nums, int target, boolean findStartIndex) {
        int ans = -1;
        //usual binary search
        int start = 0;
        int end = nums.length - 1;
        while(start <= end) {
            int mid = start + (end - start) / 2;
            if (target < nums[mid]) {
                end = mid - 1;
            } else if (target > nums[mid]) {
                start = mid + 1;
            } else {
                ans = mid; //potential ans found
                //----------till here usual binary search
                if (findStartIndex) { //if we pass true--> to check if there is any possible ans in our left side of
                    // the
                    // potential ans
                    end = mid - 1;  //now bs is performed again but this time only in left of the potential ans
                } else { //if we passed false--> to check if there is any possible ans in our right side of the potential ans
                    start = mid + 1; //now bs is performed again but this time only in right of the potential ans

                    //now if we dont find any element in right or left of potential answer, while condn. will be violated and loop breaks
                    // we anyways have ans=mid, which will be then returned
                }
            }
        }
        return ans;
    }
}
