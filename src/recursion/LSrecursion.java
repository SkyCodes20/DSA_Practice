package recursion;

public class LSrecursion {
    public static void main(String[] args) {
        System.out.println(LS(new int[] {1,2,3,4,5,6,7,8,9},6,0));
    }

// Linear search using recursion...

    static int LS(int arr[] , int target, int idx){
        if (idx == arr.length)
            return -1;
        if (arr[idx] != target)
            return LS(arr,target,idx+1);
        return idx;

    }

}
