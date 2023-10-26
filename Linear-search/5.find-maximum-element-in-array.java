class Main
{
    public static void main(String[] args)
    {
        int[] arr = {-11, -12, 34, 555, 67};
        System.out.println(findMax(arr));

    }
    

    //finding maximum element in the given array
    //returns the maximum value in the array
    static int findMax(int[] arr)
    {
        //assuming first element is maximum
        int ans = arr[0];
    
        for(int i=1; i<arr.length; i++)
        {
            //check is any element is greater than current ans
            if(arr[i] > ans)
            ans = arr[i];
        }
        
        return ans;
    }
}