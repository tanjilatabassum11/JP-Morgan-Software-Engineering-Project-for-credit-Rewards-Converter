import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RewardValueTests {

    @Test
    void create_with_cash_value() {
        double cashValue = 100;
        var rewardValue = new RewardValue(cashValue);
        assertEquals(cashValue, rewardValue.getCashValue());
    }

    @Test
    void create_with_miles_value() {
        int milesValue = 10000;
        var rewardValue = new RewardValue(milesValue);
        assertEquals(milesValue, rewardValue.getMilesValue());
    }

    @Test
    void convert_from_cash_to_miles() {
        double cashValue = 50.0; // Replace with the cash value you want to test
        double expectedMiles = 50.0 / 0.0035; //  the conversion rate is 0.0035

        // When
        RewardValue rewardValue = new RewardValue();
        double actualMiles = rewardValue.convertCashToMiles(cashValue);

        // Then
        assertEquals(expectedMiles, actualMiles, 0.001); // Adjust the delta based on precision
    }

    @Test
    void convert_from_miles_to_cash() {
        // Given
        double miles = 100.0; // Replace with the miles value you want to test
        double expectedCashValue = miles * 0.0035; // Assuming the conversion rate is 0.0035

        // When
        RewardValue rewardValue = new RewardValue();
        double actualCashValue = rewardValue.convertMilesToCash(miles);

        // Then
        assertEquals(expectedCashValue, actualCashValue, 0.001); // Adjust the delta based on precision
    }
}
