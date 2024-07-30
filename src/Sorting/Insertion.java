package Sorting;

/*
Insertion Sort is a straightforward and intuitive comparison-based sorting algorithm that works similarly
to how you might sort playing cards in your hands. It builds the sorted array one item at a time by repeatedly
picking the next item and inserting it into its correct position among the already sorted items. While not the
most efficient algorithm for large datasets, it excels in small datasets and nearly sorted data due to its
simplicity and low overhead.

------------Complexity Analysis------------

Time Complexity:
Best Case: O(n) when the array is already sorted.
Average and Worst Case: O(n^2) due to the nested loop structure.
Space Complexity: O(1) since it is an in-place sorting algorithm.
Stability: Insertion Sort is a stable sort, meaning that it preserves the relative order of equal elements.

------------Advantages------------
Simple Implementation: Easy to implement and understand.
Efficient for Small Data Sets: Performs well for small datasets and nearly sorted data.
In-Place Sorting: Requires a constant amount of additional memory space.

------------Disadvantages------------
Inefficient for Large Data Sets: Due to its quadratic time complexity, it is not suitable for large datasets.
Performance Degrades with Increasing Input Size: As the input size grows, the number of comparisons
and shifts increases significantly.

------------Use Cases------------
Small Arrays: Ideal for sorting small arrays or when the array size is not known to be large.
Nearly Sorted Arrays: Particularly efficient when the array is already nearly sorted.
Online Sorting: Suitable for online sorting where data arrives one element at a time.
*/

public class Insertion {
    public static void main(String arg[]){
        int arr[] = new int[]{30, 6, 8, 45, 86, 0};
        int n = arr.length;
        System.out.println("Array elements before sorting: ");
        for(int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
        insertionSort(arr, n);
        System.out.println("\nArray elements after sorting: ");
        for(int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
    }

    private static void insertionSort(int arr[], int n){
        for(int i=0; i<n; i++){
            int j = i;
            while(j > 0 && arr[j] < arr[j-1]){
                swap(arr, j, j-1);
                j--;
            }
        }
    }

    private static void swap(int arr[], int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
