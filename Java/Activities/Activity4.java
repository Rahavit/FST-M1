package activities;

import java.util.Arrays;

public class Activity4 {
public static void main(String[] args){
    int[] iArray = {10, 20, -10, 0, 20};
    System.out.println("Before Sorting: "+ Arrays.toString(iArray));
    insertionSort(iArray);
}
    // Function to perform insertion sort on an array
    public static void insertionSort(int[] sortArray) {
        int n = sortArray.length;
        for (int i = 1; i < n; i++) {
            int key = sortArray[i];
            int j = i - 1;
            while (j >= 0 && sortArray[j] > key) {
                sortArray[j + 1] = sortArray[j];
                j--;
            }
            sortArray[j + 1] = key;
        }
        System.out.println("After Sorting: "+ Arrays.toString(sortArray));
    }

}
