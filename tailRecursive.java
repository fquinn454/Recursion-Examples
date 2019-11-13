public class tailRecursive {

    // A tail recursive function to
    // calculate n th fibonacci number
    public int fib(int n, int a, int b) {
        if (n == 0)
            return a;
        if (n == 1)
            return b;
        return fib(n - 1, b, a + b);
    }

public static void main (String[] args) {
    tailRecursive a = new tailRecursive();
    System.out.println(a.fib(45, 0, 1));
    }
}
