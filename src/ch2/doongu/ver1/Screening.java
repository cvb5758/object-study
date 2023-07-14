package ch2.doongu.ver1;

import java.time.LocalDateTime;

public class Screening {
    private final Movie movie;
    private final int sequence;
    private final LocalDateTime whenScreened;

    public Screening(Movie movie, int sequence, LocalDateTime whenScreened) {
        this.movie = movie;
        this.sequence = sequence;
        this.whenScreened = whenScreened;
    }

    // 상영 시작 시간을 반환
    public LocalDateTime getStartTime() {
        return whenScreened;
    }

    // 순번의 일치 여부를 검사 -> 할인 조건에 해당
    public boolean isSequence(int sequence) {
        return this.sequence == sequence;
    }

    // 기본 요금을 반환
    public Money getMovieFee() {
        return movie.getFee();
    }

    //예매 정보 인스턴스 반환
    public Reservation reserve(Customer customer, int audienceCount){
        //요금을 계산해서 전달
        return new Reservation(customer, this, calculateFee(audienceCount), audienceCount);
    }
}
