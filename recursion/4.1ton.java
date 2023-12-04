
// print from 1 to n

class Main {
    public static void main(String[] args) {
        
        print(5);
    }
    static void print(int n)
    {
        if(n==0)
        {
            return;
        }
        
        print(n-1);
        System.out.println(n);
    }
}
