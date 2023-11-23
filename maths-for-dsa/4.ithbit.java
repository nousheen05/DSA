
// ith position bit

public class Main 
{
    public static void main(String[] args)
    {
        int n = 10; //1010
        int i = 3;
        n = n>>(i-1);
        System.out.println(n&1);
        
    }
}
