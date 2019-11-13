public class fibIterative {
    public int fibIterative  (int n) {

        if(n <= 1) {
            return n;
        }
        int fib = 1;
        int prevFib = 1;

        for(int i=2; i<n; i++) {
            int temp = fib;
            fib+= prevFib;
            prevFib = temp;
        }
        return fib;
    }

    public static void main(String[]args) {
        fibIterative a = new fibIterative();
        System.out.println(a.fibIterative(45));
    }

}
