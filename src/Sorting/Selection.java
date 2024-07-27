package Sorting;
/*
Selection Sort Algorithm:

-----------------Explanation----------------------
1. The outer loop iterates through each element of the array.
2. For each element, the inner loop finds the minimum element in the unsorted portion of the array.
3. The minimum element is then swapped with the first element of the unsorted portion.

-----------------Complexity----------------------
1. The time complexity of the Selection Sort algorithm is O(n^2), where n is the number of elements in the array.
2. It is not a stable sort, meaning that the relative order of equal elements may not be preserved.
3. It is an in-place sorting algorithm, requiring only a constant amount O(1) of additional memory space.

-----------------Usage----------------------
1. This algorithm is straightforward and easy to implement, making it useful for small datasets or educational purposes.
2. However, for large datasets, more efficient algorithms like Merge Sort or Quick Sort are generally preferred.

*/

public class Selection {
    public static void main(String arg[]){
        int arr[] = new int[] {10, 60, 70, 4, 3};
        int n = arr.length;
        System.out.println("Before sorting array elements are: ");
        for(int i=0; i<n; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println("After sorting array elements are: ");
        selectionSort(n, arr);
        for(int i=0; i<n; i++){
            System.out.print(arr[i] + " ");
        }
    }

    private static void selectionSort(int n, int arr[]){
        // One by one move the boundary of the unsorted subarray
        for(int i=0; i<n-1; i++){
            // Find the minimum element in the unsorted array
            int mini = i;
            for(int j = i; j<n; j++){
                if(arr[j] < arr[mini]) {
                    mini = j;
                }
            }
            // Swap the found minimum element with the first element
            swap(i, mini, arr);
        }
    }

    private static void swap(int i, int j, int arr[]){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
