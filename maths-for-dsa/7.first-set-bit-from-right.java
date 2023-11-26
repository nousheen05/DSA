
// find the position of right most set bit

public class Main 
{
    public static void main(String[] args)
    {
        int n = 10; //1010
        int i = 2;
        int res = n & (-n); 
        System.out.println(Math.log(res)/Math.log(2));
        
    }
}
