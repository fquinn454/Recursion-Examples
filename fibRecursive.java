public class fibRecursive {
    public int fibRecursive(int n) {
        if(n == 0){
            return 0;
        }
        else if (n == 1) {
            return 1;
        }
        return fibRecursive(n - 1) + fibRecursive(n - 2);
    }



public static void main(String[]args) {
    fibRecursive a = new fibRecursive();
    System.out.println(a.fibRecursive(45));
    }
}
