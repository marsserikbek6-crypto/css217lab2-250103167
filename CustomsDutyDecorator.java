package task4;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class CustomsDutyDecorator extends PricingDecorator {
    private static final BigDecimal DUTY_MULTIPLIER = new BigDecimal("1.085"); // 8.5% customs tax

    public CustomsDutyDecorator(PricingService wrapped) { super(wrapped); }

    @Override
    public double calculateTotal() {
        double subtotal = super.calculateTotal();
        // BigDecimal avoids binary floating-point error (145 * 1.085 = 157.325 exactly -> 157.33)
        return BigDecimal.valueOf(subtotal)
                .multiply(DUTY_MULTIPLIER)
                .setScale(2, RoundingMode.HALF_UP)
                .doubleValue();
    }

    @Override
    public String getReceiptBreakdown() {
        return super.getReceiptBreakdown() + " + [Customs Duty: 8.5%]";
    }
}
