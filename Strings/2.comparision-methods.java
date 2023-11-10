
import java.util.Arrays;
public class Main
{
    public static void main(String[] args)
    {
        //creating different objects for same literals
        String a = new String("Tom");
        String b = new String("Tom");
        System.out.println(a==b);
        System.out.println(a.equals(b));
        String c = b;
        System.out.println(c==b);
        System.out.println(c.equals(b));
        
        //string pool example
        String a1 = "Tom";
        String b1= "Tom";
        System.out.println(a1==b1);
        System.out.println(a1.equals(b1));
    }
    
    
}
