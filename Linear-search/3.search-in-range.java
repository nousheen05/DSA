class Main
{
    public static void main(String[] args)
    {
        int[] arr = {-11, 12, 34, 55, 67};
        int target = 34;
        int start = 1;
        int end = 4;
        System.out.println(search(arr, target, start, end));

    }
    

    //searching in specified range
    static int search(int[] arr, int target, int start, int end)
    {
        if(arr.length==0) return -1;
        
        //traversing and comparing each character of string 
        for(int i=start; i<=end; i++)
        {
            if(arr[i] == target)
            return i;
        }
        
        return -1;
    }
}