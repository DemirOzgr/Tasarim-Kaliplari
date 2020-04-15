import java.util.HashMap;
import java.util.Map;
public abstract class Payment {
    public String type() {
        return "Odeme";
    }
}

class CreditCard extends Payment {

    public String type() {
        return "KrediKarti";
    }
}

class Cash extends Payment {

    public String type() {
        return "KapidaOdeme";
    }
}

class Point  extends Payment {

    public String type() {
        return "Puan";
    }
}

class Transfer  extends Payment {

    public String type() {
        return "Havale";
    }
}


class PaymentSource {

    private static PaymentSource source = new PaymentSource();
    private Map<Class<? extends Payment> , Payment> paymentMap = new HashMap<Class<? extends Payment>, Payment>();

    private PaymentSource() {

    }

    public static Payment getPayment(Class<? extends Payment> clazz) throws IllegalAccessException, InstantiationException {
        Payment b = source.paymentMap.get(clazz);
        return b;
    }

    public static void main(String[] args) throws InstantiationException, IllegalAccessException {

        Payment payment = PaymentSource.getPayment(CreditCard.class);
        System.out.println(payment.type() + " " + payment);
        Payment payment2 = PaymentSource.getPayment(CreditCard.class);
        System.out.println(payment2.type() + " " + payment2);
        Payment payment3 = PaymentSource.getPayment(Cash.class);
        System.out.println(payment3.type() + " " + payment3);
        Payment payment4 = PaymentSource.getPayment(Point.class);
        System.out.println(payment4.type() + " " + payment4);
        Payment payment5 = PaymentSource.getPayment(Transfer.class);
        System.out.println(payment5.type() + " " + payment5);
        Payment payment6 = PaymentSource.getPayment(Point.class);
        System.out.println(payment6.type() + " " + payment6);

    }
}

