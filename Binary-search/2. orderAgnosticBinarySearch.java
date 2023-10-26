class Main
{
    public static void main(String[] args)
    {
        int[] arr = {99, 67, 8, 4, 2, -2};
        int target = 67;
        int ans = orderAgnosticBinarySearch(arr, target);
        System.out.println(ans);
    }
    

    //return index of target if found
    //else -1
    static int orderAgnosticBinarySearch(int[] arr, int target)
    {
        int start = 0;
        int end = arr.length-1;

        //to check if elements are present in AO or DO
        boolean isAsc = arr[0] < arr[end];
        
        while(start<=end)
        {
            int mid = start + (end-start)/2;
            
            if(arr[mid]==target)
            {
                return mid;
            }
            if(isAsc){
                if(target > arr[mid])
                {
                    start = mid+1;
                }   
                else
                {
                    end = mid-1;
                }
            }
            else
            {
                if(target < arr[mid])
                {
                    start = mid+1;
                }   
                else
                {
                    end = mid-1;
                }
            }
        }
        return-1;
    }
}