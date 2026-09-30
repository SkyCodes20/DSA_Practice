package recursion;

public class arrayRecursion {
    public static void main(String[] args) {
        System.out.println(sorted(new int[]{1, 2, 3, 4, 4, 4, 5},0));
    }

// check if an array is sorted or not
    static boolean sorted(int arr[], int idx){
        if (idx == arr.length-1)
            return true;
        return arr[idx] <= arr[idx + 1] && sorted(arr, idx+1);
    }
}
