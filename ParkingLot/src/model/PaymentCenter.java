package model;
import enums.PaymentMode;

public class PaymentCenter {
    double totalRevenue;

    public Invoice generateInvoice(Ticket ticket) {
        Invoice invoice = new Invoice(ticket);
        ticket.exitTime = LocalDateTime.now();
        long hours = ChronoUnit.HOURS.between(entryTime, exitTime);
        double fee = 5 * hours;
        invoice.setAmount(fee);
        ticket.getSpot().setVehicle(null);
        ticket.getSpot().setFree(true);
        return invoice;
    }

    public Payment payInvoice(Invoice invoice, PaymentMode paymentMode) {
        invoice.paymentMode = paymentMode;
        Payment payment = Payment.createPayment(invoice, paymentMode);
        payment.executePayment();
        totalRevenue += payment.getAmount();
        return payment;
    }

}
