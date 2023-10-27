class Main
{
    public static void main(String[] args)
    {
        int[] arr = {-22, -1, 10, 99, 100, 222, 657};
        int target = 99;
        int ans = binarySearch(arr, target);
        System.out.println(ans);
    }
    
    //dont use length function to find size of array
    static int binarySearch(int[] arr, int target)
    {
        //find the range in which the target element would lie
        int start = 0;
        int end = 1;
        while(target > arr[end])
        {
            int newStart = end+1;
            end = end + (end-start+1)*2;
            start = newStart;
        }
        return binarySearch2(arr, target, start, end);
    }
    
    //find element in the found range(start, end)
    static int binarySearch2(int[] arr, int target, int start, int end)
    {
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