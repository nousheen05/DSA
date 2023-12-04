// palindrome number checking
// 121

public class Main
{
    public static void main(String[] args)
    {
        reverse(121);
        System.out.println((sum==121));
    }
    
    static int sum = 0;
    static void reverse(int n)
    {
        if(n==0) return;
        sum = sum*10 + n%10;
        reverse(n/10);
    }
}
