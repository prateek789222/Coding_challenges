import java.util.Arrays;
//CYCLIC SORT
public class LeetCode_287 {
    public static void main(String[] args) {
        int[] nums={3,1,3,4,2};
        System.out.println(findDuplicate(nums));
    }
    static int findDuplicate(int[] arr) {
        int i = 0;
        while (i < arr.length - 1) { //for n elements, only n-1 comparisons are required
            if (i != arr[i]-1 && arr[i] != arr[arr[i] - 1]) {//check if element is in correct index or not, if no....
                swap(arr, i, arr[i]-1); //swap with correct index
            } else {
                i++; //else increment i value
            }
        }
//        System.out.println(Arrays.toString(arr));
        for (int j = 0; j < arr.length; j++) {
            if (j != arr[j] - 1) {
                return arr[j];
            }

        }return -1;
    }
        static void swap ( int[] arr, int x, int y){
            int temp = arr[x];
            arr[x] = arr[y];
            arr[y] = temp;
        }
}
