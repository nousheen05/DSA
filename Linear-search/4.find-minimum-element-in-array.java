class Main
{
    public static void main(String[] args)
    {
        int[] arr = {-11, -12, 34, 55, 67};
        System.out.println(findMin(arr));

    }
    

    //finding minimum element in the given array
    //returns the minimum value in the array
    static int findMin(int[] arr)
    {
        //assuming first element is minimum
        int ans = arr[0];
    
        for(int i=1; i<arr.length; i++)
        {
            //check is any element is lesser than current ans
            if(arr[i] < ans)
            ans = arr[i];
        }
        
        return ans;
    }
}