package bookingsystem;

public interface PaymentOption {
    public String getUrl();
    public String getName();
    public Byte[] getLogo();
    public String getId();
}
