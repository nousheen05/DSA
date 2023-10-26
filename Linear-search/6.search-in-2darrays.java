import java.util.Arrays;
class Main
{
    public static void main(String[] args)
    {
        int[][] arr = {
            {12, 23,54,67},
            {11,23},
            {-1, 99, -100}
        };
        int target = -1;
        
        int[] ans = search(arr, target);//format of return is - arr[row, col] of target element
        System.out.println(Arrays.toString(ans));

    }
    

    //serach in 2-d array
    //format of return is - arr[row, col] of target element
    static int[] search(int[][] arr, int target)
    {
        for(int i=0; i<arr.length; i++)
        {
            for(int j=0; j<arr[i].length; j++)
            {
                if(arr[i][j] == target)
                {
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{-1,-1};
    }
}