package ArrayQs;//CYCLIC SORT

public class Leetcode_268 {
    public static void main(String[] args) {
        int[] nums={2,1,2};
        System.out.println(missing_no(nums));
    }
    static int missing_no(int[] arr){
        int i=0;
        while(i<=arr.length-1){ //for n elements, only n-1 comparisons are required
            if(i!=arr[i]){//check if element is in correct index or not, if no....
                if(arr[i]==arr.length) {
                    i++;
                }
                else
                {
                    swap(arr, i, arr[i]); //swap with correct index
                    }
            }else{
                i++; //else increment i value
            }
        }
        for(int j=0;j<=arr.length-1;j++){
            if(j!=arr[j]){
                return j;
            }
        }
        return arr.length;
    }
    static void swap(int[] arr,int x,int y){
        int temp=arr[x];
        arr[x]=arr[y];
        arr[y]=temp;
    }
}