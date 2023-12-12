public class RewardValue {
    private double cashValue;

    private double milesValue;

    public RewardValue() {

    }

    //getters
    public double getCashValue() {
        return cashValue;
    }

    public double getMilesValue() {
        return milesValue;
    }
    //constructors
    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
    }

    public RewardValue(int milesValue) {
        this.milesValue = milesValue;
    }

    public double convertMilesToCash(double miles) {
        //milesToCashRate is the conversion rate
        double milesToCashRate = 0.0035;

        // Perform the conversion
        cashValue = miles * milesToCashRate;

        return cashValue;


    }

    public double convertCashToMiles(double cashValue) {

        //milesToCashRate is the conversion rate
        double milesToCashRate = 0.0035;

        // Perform the conversion
        double milesValue = cashValue / milesToCashRate;

        return milesValue;
    }
}


