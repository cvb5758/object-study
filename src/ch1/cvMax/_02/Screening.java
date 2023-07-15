package ch1.cvMax._02;

import java.time.LocalDateTime;

/**
 *  인스턴스 변수는 private
 *  메소드는 public
 *  어떤 부분을 감추고 어떤 부분을 열어놔야 하지?
 */
public class Screening {
    private Movie movie; // 상영할 영화
    private int sequence; // 순번
    private LocalDateTime whenScreened; // 사영 시작 시간자

    /**
     * Reservation 에서 메세지를 받음
     * @param movie 메세지 보냄
     */
    public Screening(Movie movie, int sequence, LocalDateTime whenScreened) { // 인스턴스 변수를 전부 초기화한다
        this.movie = movie;
        this.sequence = sequence;
        this.whenScreened = whenScreened;
    }

    public Reservation reserve(Customer customer, int audienceCount) { // 영화 예매 정보를 반환
        return new Reservation(customer, this, calculateFee(audienceCount), audienceCount); // Reservation 생성자
    }

    private Money calculateFee(int audienceCount) {
        return movie.calculateMovieFee(this).times(audienceCount);
    }

    public Money getMovieFee() { // 영화 요금 반환 메서드
        return movie.getFee();
    }

    public boolean isSequence(int sequence) { // 영화 순번 일치 검사
        return this.sequence == sequence;
    }

    public LocalDateTime getStartTime() { // 상영 시작 시간
        return whenScreened;
    }
}
