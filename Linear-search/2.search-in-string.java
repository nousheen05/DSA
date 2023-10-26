import java.util.Arrays;
class Main
{
    public static void main(String[] args)
    {
        String s = "Nousheen";
        char target = '1';
        System.out.println(search2(s, target));
        char[] arr = s.toCharArray();
        System.out.println(Arrays.toString(arr));
    }
    
    static boolean search2(String str, char target)
    {
        if(str.length()==0) return false;
        
        //traversing and comparing each character of string using for each loop
        //string converted to char array - str.toCharArray
        for(char ch: str.toCharArray())
        {
            if(ch == target)
            return true;
        }
        
        return false;
    }
    
    
    static boolean search(String str, char target)
    {
        if(str.length()==0) return false;
        
        //traversing and comparing each character of string 
        for(int i=0; i<str.length(); i++)
        {
            if(str.charAt(i) == target)
            return true;
        }
        
        return false;
    }
}