import CreditPaymentService.CreditPaymentService;

public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        double monthlysum12 = service.calculate(1_000_000, 12);
        System.out.println("Ваш ежемесячный платеж  = " + (int)monthlysum12 + " Ваша процентная ставка = 9.99%\n");

        double monthlysum24 = service.calculate(1_000_000, 24);
        System.out.println("Ваш ежемесячный платеж  = " + (int)monthlysum24 + " Ваша процентная ставка = 9.99% \n" );

        double monthlysum36 = service.calculate(1_000_000, 36);
        System.out.println("Ваш ежемесячный платеж  = " + (int)monthlysum36 + " Ваша процентная ставка = 9.99%");
    }
}
