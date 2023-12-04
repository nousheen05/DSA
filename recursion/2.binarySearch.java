
//Binary search using recursion

public class Main 
{
    public static void main(String[] args)
    {
        System.out.println(binarySearch(new int[]{1,4,6,9,12,88,100}, 12, 0, 6));
    }
    static int binarySearch(int[] arr, int target, int s, int e)
    {
        if(s>e)
        {
            return -1;
        }
        int m = s +(e-s)/2;
        if(arr[m] == target)
        {
            return m;
        }
        if(arr[m] > target)
        {
            return binarySearch(arr, target, s, m-1);
        }
        
        return binarySearch(arr, target, m+1, e);
    }
}
