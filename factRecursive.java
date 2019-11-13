public class factRecursive {

    public int factorial(int x){
        if(x <= 1){
            return 1;
        }
        else
            return factorial(x-1)*x;
    }
}


