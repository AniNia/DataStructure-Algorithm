package Sorting;

import java.util.ArrayList;
/*
Merge sort is a classic divide-and-conquer algorithm used for sorting an array or list of elements.
It's efficient and stable, making it a popular choice for many applications. Here's an in-depth look
at how merge sort works:

How Merge Sort Works

Divide:
1. Split the array into two halves.
2. Recursively sort each half until the base case is reached (an array of size 1 or 0).

Conquer:
Merge the two sorted halves back together to form a single sorted array.
Steps of Merge Sort
Splitting:
Continue splitting the array until each sub-array contains a single element.
This is the recursive part of the algorithm.
Merging:
Start merging sub-arrays back together in a sorted manner.
Compare the elements of the sub-arrays and combine them in order, creating a larger sorted array.


Advantages of Merge Sort
1. Stable Sort: Maintains the relative order of equal elements.
2. O(n log n) Time Complexity: Efficient for large datasets.
3. Divide and Conquer: Naturally parallelizable, making it suitable for multi-threaded implementations.

Disadvantages of Merge Sort
1. Space Complexity: Requires O(n) additional space for the temporary arrays used in merging.
2. Slower for Small Data Sets: Compared to algorithms like quicksort or insertion sort, merge sort may
perform slower for small datasets due to overhead from recursive calls and merging.


Applications
Merge sort is widely used in various applications due to its stability and efficiency,
especially where stable sorting is crucial, such as:

1. Sorting linked lists.
2. External sorting (sorting large files that do not fit into memory).
*/

public class MergeSort {
    public static void  main(String arg[]){
        int arr[] = new int[] {17, 0, 60, 76, 34, 56, 100, 1, 23};
        int n = arr.length;
        System.out.println("Array elements before sorting: ");
        print(arr, n);
        mergeSort(arr, 0, n-1);
        System.out.println("Array elements before sorting: ");
        print(arr, n);
    }

    private static void print(int arr[], int n){
        for(int i=0; i<n; i++){
            System.out.print(arr[i] +" ");
        }
        System.out.println();
    }

    private static void mergeSort(int arr[], int low, int high){
        if(low == high) return;

        int mid = (low + high) / 2;
        mergeSort(arr, low, mid);
        mergeSort(arr, mid+1, high);
        merge(arr, low, mid, high);
    }

    private static void merge(int arr[], int low, int mid, int high){
        int left = low;
        int right = mid+1;
        ArrayList<Integer> temp = new ArrayList<>();

        while(left <= mid && right <= high){
            if(arr[left] <= arr[right]){
                temp.add(arr[left++]);
            } else{
                temp.add(arr[right++]);
            }
        }

        while(left <= mid){
            temp.add(arr[left++]);
        }

        while(right <= high){
            temp.add(arr[right++]);
        }

        for(int i=low; i<=high; i++){
            arr[i] = temp.get(i - low);
        }
    }
}
