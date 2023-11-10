
import java.util.Arrays;
public class Main
{
    public static void main(String[] args)
    {
        //String pool - how string objects with same literals will be stored
        
        String name = "Tom";
        String name1 = "Tom";
        System.out.println(name==name1);//comparing the reference to which they point
        
        
        //immutability - we cant really change the string literal but we can make new object and the old reference can point to it
        String a = "xyz";
        System.out.println(a);
        a = "abc";
        System.out.println(a);
    }
    
    
}
