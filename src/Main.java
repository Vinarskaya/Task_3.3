public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();

        System.out.println();
        System.out.println("Ежемесячный платеж при сроке кредита 1 год");
        System.out.println(service.calculate(1_000_000, 12, (float) 9.99));

        System.out.println();
        System.out.println("Ежемесячный платеж при сроке кредита 2 года");
        System.out.println(service.calculate(1_000_000, 24, (float) 9.99));

        System.out.println();
        System.out.println("Ежемесячный платеж при сроке кредита 3 года");
        System.out.println(service.calculate(1_000_000, 36, (float) 9.99));
    }
}
