package CreditPaymentService;
public class CreditPaymentService {
    double monthcreditrate = 9.99 / 100 / 12;
    public double calculate (long creditsum, int creditterm ){
        return  (monthcreditrate * Math.pow((1 + monthcreditrate), creditterm) / (Math.pow((1 + monthcreditrate), creditterm) - 1)) * creditsum;
    }
}