package ArrayQs;
// https://www.hackerrank.com/challenges/one-month-preparation-kit-mini-max-sum/problem?isFullScreen=true&h_l=interview
// &playlist_slugs%5B%5D=preparation-kits&playlist_slugs%5B%5D=one-month-preparation-kit&playlist_slugs%5B%5D=one-month-week-one

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class miniMaxSum {
    public static void miniMaxSum(List<Integer> arr) {
        // Write your code here
        Integer max = arr.get(0);
        Integer min = arr.get(0);
        long sum = 0;

        for(int i : arr){
            sum += i;
            if(i > max){
                max = i;
            }
            if(i < min){
                min = i;
            }
        }
        System.out.println((sum - max) + " " + (sum - min));

    }

    public static void main(String[] args) {
        List<Integer> lis = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter 5 Elements: ");
        for(int i = 0; i < 5; i++){
            int num = scan.nextInt();
            lis.add(num);
        }
        miniMaxSum(lis);
    }
}


