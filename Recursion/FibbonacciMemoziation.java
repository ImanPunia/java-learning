package Recursion;

public class FibbonacciMemoziation {
    static int fib(int n)
    {
    /* Declare an array to store Fibonacci numbers. */
        int f[] = new int[n+2]; // 1 extra to handle case, n = 0
        int i;
      
    /* 0th and 1st number of the series are 0 and 1*/
        f[0] = 0;
        f[1] = 1;
     
        for (i = 2; i <= n; i++)
        {
        /* Add the previous 2 numbers in the series
            and store it */
            f[i] = f[i-1] + f[i-2];
        }
      
        return f[n];
    }
      
    public static int fibonacci(int k) {

        return fibonacci(k, new int[k + 1]);
    
    }
    
    public static int fibonacci(int k, int[] cache) {
    
        if (k <= 1) {
    
            return k;
    
        } else if (cache[k] > 0) {
    
            return cache[k];
    
        }
    
        cache[k] = fibonacci(k - 2, cache)
    
            + fibonacci(k - 1, cache);
    
        return cache[k];
    
    }
    public static void main (String args[])
    {
        int n = 4;
        System.out.println(fibonacci(n));
    }
}


