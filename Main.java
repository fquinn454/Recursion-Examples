public class Main {
    public static void main(String[] args) {
        factRecursive factRecursive = new factRecursive();
        System.out.println(factRecursive.factorial(3));
        factTailRecursive factTailRecursive = new factTailRecursive();
        System.out.print(factTailRecursive.tailFact(3, 1));
    }
}
