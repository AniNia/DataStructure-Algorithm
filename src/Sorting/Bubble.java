package Sorting;
/*
Bubble sort is a simple sorting algorithm that repeatedly steps through the list, compares adjacent elements,
and swaps them if they are in the wrong order. The pass through the list is repeated until the list is sorted.
However, the basic bubble sort algorithm is not very efficient, especially for large lists. An optimized version
can improve its performance significantly.

Performance
Best Case Time Complexity: O(n) when the array is already sorted.
Average and Worst Case Time Complexity: O(n^2) although the optimized version performs better than
the basic version in practice.
Space Complexity: O(1), as it is an in-place sorting algorithm.
*/
public class Bubble {
    public static void main(String arg[]){
        int arr[] = new int[] {56, 7, 90, 1, 100, 143, 34, 26};
        int n = arr.length;
        System.out.println("Arrays elements before sorting : ");
        for(int i=0; i<n; i++){
            System.out.print(arr[i] + " ");
        }
        bubbleSort(n, arr);
        System.out.println("\nArrays elements after sorting : ");
        for(int i=0; i<n; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    private static void bubbleSort(int n, int arr[]){
        for(int i=n-1; i>=0; i--){
            boolean swapped = false;
            for(int j=0; j<i; j++){
                if(arr[j] > arr[j+1]){
                    swap(j, j+1, arr);
                    swapped = true;
                }
            }
            // if no two elements were swapped in the inner loop, break
            if(!swapped) break;
        }
    }

    private static void swap(int i, int j, int arr[]){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
