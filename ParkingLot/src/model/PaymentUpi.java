package model;

import enums.PaymentMode;
import enums.PaymentStatus;

public class PaymentUpi extends Payment{

    public PaymentUpi(Invoice invoice , PaymentMode paymentMode){
        super(invoice, paymentMode);
    }

    @Override
    public void executePayment() {
        System.out.println("----Payment by UPI----");
        this.paymentStatus = PaymentStatus.SUCCESS;
        this.invoice.setPaid(true);
    }
}
