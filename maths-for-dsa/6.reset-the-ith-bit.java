
// reset the ith position bit

public class Main 
{
    public static void main(String[] args)
    {
        int n = 10; //1010
        int i = 2;
        int res = n & ~(1<<(i-1)); //1101
        System.out.println(res);
        
    }
}
