// linear search using recursion

public class Main
{
    public static void main(String[] args)
    {
        System.out.println(search(new int[]{1,4,6,9}, 10, 0));
    }
    
    static boolean search(int[] arr, int target, int idx)
    {
        if(idx == arr.length) return false;
        
        //we tell checked for first element
        // now go for rest of array and check
        //how can we pass rest of array? by passing pointer in the argument
        return arr[idx] == target || search(arr, target, idx+1);
    }
}
