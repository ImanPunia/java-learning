package Recursion;

class Fibonacci
{
    static int fib(int k)
    {
        if (k <= 1)
            return k;

        return fib(k-1) + fib(k-2);
    }
      
    public static void main (String args[])
    {
        int k = 4;
        System.out.println(fib(k));
    }
}