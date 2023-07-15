package ch1.cvMax._02;

public interface DiscountCondition {
    /**
     * DiscountCondition 의 메소드를 재정의한 2가지 할인 상태가 정의되어 있다
     * 실제 할인 정책이 들어가고 할인을 해줄때 여기에 정의된
     * isSatisfiedBy를 통해 할인 가능한지 boolean 타입으로 리턴해서
     * 할인이 들어간다????
     */
    boolean isSatisfiedBy(Screening screening);
}
