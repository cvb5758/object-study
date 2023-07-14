package ch2.doongu.ver1;

// 할인 조건.
public interface DiscountCondition {
    //할인이 가능한 경우 True , 아니면 False
    boolean isSatisfiedBy(Screening screening);
}

// 할인 정책과 달리 할인 조건은 구현을 공유할 필요가 없기 때문에 (자식과)
// 자바의 인터페이스를 통해 구현해볼 수 있다.