//bubble short
//every sorting algorithm do something in some no.of steps

import java.util.Arrays;
public class Main
{
    public static void main(String[] args)
    {
        int[] arr ={5,3,6,2,9};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    
    static void bubbleSort(int[] arr)
    {
        int n = arr.length;
        //counter for counting no of steps
        for(int i=0;i<n-1;i++)
        {
            boolean flag = true;
            for(int j=0;j<n-1;j++)
            {
                if(arr[j] > arr[j+1])
                {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    flag = false;
                }
            }
            if(flag)
            break;
        }
    }
}
