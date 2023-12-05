// checking whether array is sorted using recursion

public class Main
{
    public static void main(String[] args)
    {
        System.out.println(isSorted(new int[]{1,4,6,9}, 0));
    }
    
    static boolean isSorted(int[] arr, int idx)
    {
        if(idx == arr.length-1) return true;
        return arr[idx] < arr[idx+1] && isSorted(arr, idx+1);
    }
}
