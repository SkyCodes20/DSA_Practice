package sorting;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
    int [] arr = {3,1,4,6,7,2,5};
    SelectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void swap(int arr[], int first , int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
    static int max(int arr[], int start, int end){
        int max = start;
        for(int i = 0; i <= end; i++) {
            if (arr[max] < arr[i])
                max = i;
        }
        return max;
    }

    static void SelectionSort(int arr[]){
        for(int i =0; i<arr.length; i++) {
            int last = arr.length - 1 - i;
            int maxVal = max(arr,0,last);
            swap(arr,maxVal,last);
        }
    }

}
