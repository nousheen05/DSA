
// find unique number - 1

public class Main 
{
    public static void main(String[] args)
    {
        int[] arr = {1, 3, 6, 1, 3};
        int ans = arr[0]^arr[1];
        for(int i=2;i<arr.length;i++)
        {
            ans = ans ^ arr[i];
        }
        System.out.println(ans);
    }
}

