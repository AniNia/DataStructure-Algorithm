package Array1D;

import java.util.Arrays;

public class FindSecondLargest {
    public void findSecondLargest(){
        int arr[] = new int[]{1, 3, 0, 9, 5, 7};
        int ans = solve(arr);
        System.out.println("Second largest element in the array: "+ans);
    }

    private int solve(int[] arr){
        if(arr.length < 2) return -1;
        Arrays.sort(arr);
        return arr[arr.length-2];
    }
}
