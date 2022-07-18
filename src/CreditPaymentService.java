public class CreditPaymentService {
    public int calculate(int creditAmount, int period, float CreditRate) {
        float monthlyInterestRate = CreditRate / (100 * 12);
        float exponentiationFormula;
        exponentiationFormula = (float) Math.pow(1 + monthlyInterestRate, -1 * period);
        int result = (int) (creditAmount * (monthlyInterestRate / (1 - exponentiationFormula)));
        return result;
    }
}
