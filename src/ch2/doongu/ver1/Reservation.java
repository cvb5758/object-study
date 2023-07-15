package ch2.doongu.ver1;

public class Reservation {
    private Customer customer;
    private Screening screening;
    private Money fee;
    private int audienceCount;

    public Reservation(Customer customer, Screening screening, Money fee, int audienceCount){
        this.audienceCount = audienceCount;
        this.fee = fee;
        this.screening = screening;
        this.customer = customer;
    }
}
