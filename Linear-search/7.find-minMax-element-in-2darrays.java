import java.util.Arrays;
class Main
{
    public static void main(String[] args)
    {
        int[][] arr = {
            {12, 23,54,67},
            {11,23},
            {-1, 100, -100}
        };
       int[] ans = minMax(arr);
       System.out.println(Arrays.toString(ans));
        
        

    }
    

    //find min, max in 2-d array
    //format of return is - arr[min, max] 
    static int[] minMax(int[][] arr)
    {
        int[] ans = {Integer.MAX_VALUE, Integer.MIN_VALUE};
        for(int i=0; i<arr.length; i++)
        {
            for(int j=0; j<arr[i].length; j++)
            {
                if(arr[i][j] < ans[0])
                {
                    ans[0] = arr[i][j];
                }
                if(arr[i][j] > ans[1])
                {
                    ans[1] = arr[i][j];
                }
            }
        }
        return ans;
    }
}