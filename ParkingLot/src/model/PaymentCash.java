package model;

import enums.PaymentMode;
import enums.PaymentStatus;

public class PaymentCash extends Payment{

    public PaymentCash(Invoice invoice , PaymentMode paymentMode){
        super(invoice, paymentMode);
    }

    @Override
    public void executePayment() {
        System.out.println("----Payment by Cash----");
        this.paymentStatus = PaymentStatus.SUCCESS;
        this.invoice.setPaid(true);
    }
}
