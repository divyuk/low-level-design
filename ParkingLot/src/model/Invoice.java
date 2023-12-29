package model;

import enums.PaymentMode;

import java.util.UUID;

public class Invoice {
    String invoiceId;
    Ticket ticket;
    double amount;
    PaymentMode paymentMode;

    public String getInvoiceId() {
        return invoiceId;
    }

    public void setInvoiceId(String invoiceId) {
        this.invoiceId = invoiceId;
    }

    public Ticket getTicket() {
        return ticket;
    }

    public void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public PaymentMode getPaymentMode() {
        return paymentMode;
    }

    public void setPaymentMode(PaymentMode paymentMode) {
        this.paymentMode = paymentMode;
    }

    public boolean isPaid() {
        return isPaid;
    }

    public void setPaid(boolean paid) {
        isPaid = paid;
    }

    boolean isPaid;
    public Invoice(Ticket ticket){
        this.invoiceId = "I-" + UUID.randomUUID();
        this.isPaid = false;
        this.ticket = ticket;
    }

}