package bookingsystem.model;

import bookingsystem.interfaces.PaymentOption;

import java.util.List;

public class PaymentGateway {
    List<PaymentOption> paymentOptions;

    public void addOption(){}
    public boolean makePayment(String paymentOptionID){ return true; }
}
