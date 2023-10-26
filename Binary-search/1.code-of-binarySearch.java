class Main
{
    public static void main(String[] args)
    {
        int[] arr = {-22, -1, 10, 99, 897};
        int target = -1;
        int ans = binarySearch(arr, target);
        System.out.println(ans);
    }
    

    //return index of target if found
    //else -1
    static int binarySearch(int[] arr, int target)
    {
        int start = 0;
        int end = arr.length-1;
        while(start<=end)
        {
            int mid = start + (end-start)/2;
            if(arr[mid]==target)
            {
                return mid;
            }
            else if(target > arr[mid])
            {
                start = mid+1;
            }
            else
            {
                end = mid-1;
            }
        }
        return-1;
    }
}