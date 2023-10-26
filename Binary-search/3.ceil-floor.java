class Main
{
    public static void main(String[] args)
    {
        int[] arr = {2, 3, 5, 9, 14, 16, 18};
        int ceil = ceil(arr, 10);
        int floor = floor(arr, 4);
        System.out.println(ceil);
         System.out.println(floor);
    }
    
    //a number which is greater than or equal to the given number
    //and smallest among the numbers present in array
    static int ceil(int[] arr, int num)
    {
        int start = 0;
        int end = arr.length-1;
        while(start<=end)
        {
            int mid = start + (end-start)/2;
            if(arr[mid]==num)
            {
                return arr[mid];
            }
            else if(num < arr[mid])
            {
                end = mid-1;
            }
            else
            {
                start = mid+1;
            }
        }
        if(start<arr.length)
        return arr[start];
        return -1;
    }
    
    //a number that is smaller than or equal to the given number
    //and the number should be largest among the numbers in the array
    static int floor(int[] arr, int num)
    {
        int start = 0;
        int end = arr.length-1;
        while(start<=end)
        {
            int mid = start + (end-start)/2;
            if(arr[mid]==num)
            {
                return arr[mid];
            }
            else if(num < arr[mid])
            {
                end = mid-1;
            }
            else
            {
                start = mid+1;
            }
        }
        if(end>0)
        return arr[end];
        return -1;
    }
}