package Array1D;

import java.util.*;

public class FindPlatformOptimized {

    public static void main(String ar[]){
        findMinimumPlatformRequired();
    }

    public static void findMinimumPlatformRequired(){
        int arr[] = new int[]{100, 300, 600};
        int dep[] = new int[]{900, 400, 500};
        int n = arr.length;
        int ans = solve(arr, dep, n);
        System.out.println("Minimum platform required: "+ ans);
    }

//    Sweep Line Algorithm
//    Time complexity O(n)
//    Space Complexity O(1) because we are using fix size of array i.e. maxDepartureTime + 2
    private static int solve(int[] arr, int dep[], int n){
        int count = 0;
        int maxPlatform = 0;
        int maxDepartureTime = dep[0];

        for(int i=1; i<n; i++){
            maxDepartureTime = Math.max(maxDepartureTime, dep[i]);
        }

        List<Integer> v = new ArrayList<>(maxDepartureTime + 2);
        for(int i = 0; i < maxDepartureTime + 2; i++){
            v.add(0);
        }

        for(int i = 0; i < n; i++){
            v.set(arr[i], v.get(arr[i]) + 1);
            v.set(dep[i] + 1, v.get(dep[i] + 1) - 1);
        }

        for(int i = 0; i < maxDepartureTime + 2; i++){
            count += v.get(i);
            maxPlatform = Math.max(maxPlatform, count);
        }

        return maxPlatform;
    }
}
