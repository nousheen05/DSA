class Main
{
    public static void main(String[] args)
    {
        int[] arr = {12, 45, 56, 77, 100, -1, 32, -11};
        int target = 56;
        int ans = linearSearch(arr, target);
        boolean ans2 = linearSearch2(arr, target);
        System.out.println(ans);
        System.out.println(ans2);
    }
    
    // if element is found then returns index of element 
    // returns -1 if not found
    static int linearSearch(int[] arr, int target)
    {
        if(arr.length==0) return -1;
        
        for(int i=0;i<arr.length; i++)
        {
            if(arr[i] == target)
            {
                return i;
            }
        }
        
        //if none of the above statemnts get executed
        //element is not found
        return -1;
    }
    
    //it checks whether target element present
    //if present returns true
    //not found returns false
    static boolean linearSearch2(int[] arr, int target)
    {
        if(arr.length==0) return false;
        
        for(int x: arr)
        {
            if(x== target)
            {
                return true;
            }
        }
        
        //if none of the above statemnts get executed
        //element is not found
        return false;
    }
}
