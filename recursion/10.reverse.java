// reverse a number using recursion
//1234 - 4321 

public class Main
{
    public static void main(String[] args)
    {
        reverse(1234 );
        System.out.println(sum);
    }
    
    static int sum = 0;
    static void reverse(int n)
    {
        if(n==0) return;
        sum = sum*10 + n%10;
        reverse(n/10);
    }
}
