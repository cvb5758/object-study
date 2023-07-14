package ch1.cvMax._02;

import java.math.BigDecimal;

public class Money {
    public static final Money ZERO = Money.wons(0);
    private final BigDecimal amount;

    /**
     * 영화 가격 반환
     */

    public static Money wons(long amount) {
        return new Money(BigDecimal.valueOf(amount));
    }

    public static Money wons(double amount) {
        return new Money(BigDecimal.valueOf(amount));
    }
    public Money plus(Money amount) {
        return new Money(this.amount.add(amount.amount));
    }
    public Money minus(Money amount) {
        return new Money(this.amount.subtract(amount.amount));
    }
    public Money times(double percent) {
        return new Money(this.amount.multiply(
                BigDecimal.valueOf(percent)
        ));
    }
    public boolean isLessThan(Money other) {
        return amount.compareTo(other.amount) < 0;
    }

    public boolean isGreaterThanOrEqual(Money other) {
        return amount.compareTo(other.amount) >= 0;
    }


    Money(BigDecimal amount) {
        this.amount = amount;
    }
}
