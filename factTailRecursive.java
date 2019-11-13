public class factTailRecursive {

    public int tailFact(int i, int current_factorial){
        if(i == 1){
            return current_factorial;
        }
        else
            return tailFact(i-1, current_factorial*i);

    }
}
