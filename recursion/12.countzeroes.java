// counting number of zeroes
// 1020 - 2

public class Main
{
    public static void main(String[] args)
    {
        System.out.println(count(1030));
    }
    
    
    static int count(int n)
    {
        return helper(n, 0);
    }
    static int helper(int n, int c)
    {
        if(n==0) return c;
        if(n%10==0)
        {
            return helper(n/10, c+1);
        }
        return helper(n/10, c);
    }
}
