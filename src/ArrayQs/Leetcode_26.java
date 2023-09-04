package ArrayQs;//https://leetcode.com/problems/remove-duplicates-from-sorted-array/description/
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Leetcode_26 {
    public static void main(String[] args) {
        int[] nums={0,0,1,1,1,2,2,3,3,4};
        System.out.println(removeDuplicatesSet(nums));
    }
    public static int removeDuplicates(int[] nums) {
        ArrayList<Integer> nums2=new ArrayList<>();

    for (int i=0;i< nums.length;i++){
        if(nums2.contains(nums[i])!=true){
            nums2.add(nums[i]);
        }
    }
//        System.out.println(nums2);
        for (int i=0;i<nums2.size();i++){
            nums[i]=nums2.get(i);
        }
        System.out.println(Arrays.toString(nums));
        return nums2.size();
    }

    public static int removeDuplicatesSet(int[] nums) {
        Set<Integer> numsSet = new HashSet<>();

        for (int i=0;i< nums.length;i++){
            numsSet.add(nums[i]);
        }
        int numOfUniqueElements = numsSet.size();
        System.out.println(numsSet);

//         Copy the elements of the set back to the original array
//        for (int i=0;i<numOfUniqueElements;i++){
//            nums[i] = numsSet.iterator().next();
//        }
//
//
//        System.out.println(Arrays.toString(nums));
        return numOfUniqueElements;
    }
}