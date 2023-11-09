//selection sort


import java.util.Arrays;
public class Main
{
    public static void main(String[] args)
    {
        int[] arr ={5,8,2,3,-1};
        insertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    
    static void insertionSort(int[] arr)
    {
        int n = arr.length;
        //counter for counting no of steps
        for(int i=1;i<n;i++)
        {
            int temp = arr[i]; // container for target(that is to be placed in ites correct position)
            int j = i-1;
            while(j>=0 && arr[j] > temp)
            {
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = temp;
        }
    }
}
