package ch1.cvMax._02;

public class Reservation {
    private Customer customer;
    private Screening screening;
    private Money fee;
    private int audienceCount;

    /**
     *
     * @param customer 메세지를 보냄
     * @param screening 메세지를 보냄
     * @param fee 메세지를 보냄
     */
    public Reservation(Customer customer, Screening screening, Money fee, int audienceCount) {
        this.customer = customer;
        this.screening = screening;
        this.fee = fee;
        this.audienceCount = audienceCount;
    }

}
