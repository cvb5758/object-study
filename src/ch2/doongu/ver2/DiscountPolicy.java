package ch2.doongu.ver2;

//DiscountPolicy 안에 "중복 코드"를 두고 AmountDisCountPolicy와 PercentDiscountPolicy가
// 이를 상속받게 함. 그래서 추상클래스로 만듬!


// 이 코드 처럼 부모 클래스에 기본적인 알고리즘 흐름을 구현하고
// 중간에 필요한 처리를 자식 클래스에게 위임하는 디자인 패턴을
// TEMPLATE METHOD 패턴이라고 부른다.

// DiscountCondition은 인터페이스임.

//DiscountPolicy를 dlsxjvpdltmfh qusrudgkwk.
public interface DiscountPolicy {
    Money calculateDiscountAmount(Screening screening);
}
