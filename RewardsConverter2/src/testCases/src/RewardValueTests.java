import static org.junit.jupiter.api.Assertions.assertEquals;

public class RewardValueTests {
    public static final double MILES_TO_CASH_CONVERSION_RATE = 0.0035;

    @Test
    void create_with_cash_value() {
        @@ -20,11 +21,17 @@ void create_with_miles_value() {

            @Test
            void convert_from_cash_to_miles() {
                assert false;
                double cashValue = 100;
                var rewardValue = new RewardValue(cashValue);
                int expextedMilesValue = (int)(cashValue / MILES_TO_CASH_CONVERSION_RATE);
                assertEquals(expextedMilesValue, rewardValue.getMilesValue());
            }

            @Test
            void convert_from_miles_to_cash() {
                assert false;
                int milesValue = 10000;
                var rewardValue = new RewardValue(milesValue);
                double expectedCashValue = milesValue * MILES_TO_CASH_CONVERSION_RATE;
                assertEquals(expectedCashValue, rewardValue.getCashValue());
            }
        }
    }