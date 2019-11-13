public class GoldenRatio {
    public static double estimateB(double a, double bMin, double bMax, double err) {
        var bEst = (bMin + bMax) / 2;
        var left = (a + bEst) / a;
        var right = a / bEst;
        var absDiff = Math.abs(left - right);
        if (absDiff < err)
            return bEst;
        else {
            if (left < right)
                // bEst is too low
                return estimateB(a, bEst, bMax, err);
            else
                // bEst is too high
                return estimateB(a, bMin, bEst, err);
        }
    }
    public static void main(String[] args) {
        GoldenRatio goldenRatio = new GoldenRatio();
        double a = 10.0;
        System.out.println("Estimate is " + a/goldenRatio.estimateB(a, 0, a, .000000001));
    }
}
