public class CreditPaymentService {
    public int calculate(int a, int b, float c) {
        float d = c / (100 * 12);
        float e;
        float f = 1 + d;
        int g = -1 * b;
        e = (float) Math.pow(f, g);
        int result = (int) (a * (d / (1 - e)));
        return result;
    }
}
