package model;

import enums.PaymentMode;
import enums.PaymentStatus;

public class PaymentCard extends Payment{

    public PaymentCard(Invoice invoice , PaymentMode paymentMode){
        super(invoice, paymentMode);
    }

    @Override
    public void executePayment() {
        System.out.println("----Payment by Card----");
        this.paymentStatus = PaymentStatus.SUCCESS;
        this.invoice.setPaid(true);
    }
}
