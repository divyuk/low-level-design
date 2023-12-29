package model;

import enums.PaymentMode;
import enums.PaymentStatus;

import java.util.UUID;

public abstract class Payment {
    String paymentId;
    Invoice invoice;
    double amount;
    PaymentMode paymentMode;
    PaymentStatus paymentStatus;

    public Payment(Invoice invoice, PaymentMode paymentMode){
        this.paymentId = "P-" + UUID.randomUUID();
        this.invoice = invoice;
        this.amount = invoice.getAmount();
        this.paymentMode = paymentMode;
        this.paymentStatus = PaymentStatus.PENDING;
    }

    public static Payment createPayment(Invoice invoice , PaymentMode paymentMode){
        Payment payment;
        switch (paymentMode) {
            case CASH:
                payment = new PaymentCash(invoice, paymentMode);
                break;
            case CARD:
                payment = new PaymentCard(invoice, paymentMode);
                break;
            case UPI:
                payment = new PaymentUpi(invoice, paymentMode);
                break;
            default:
                throw new IllegalArgumentException("Unsupported payment mode: " + paymentMode);
        }
        return payment;
    }

    public abstract void executePayment();

}
