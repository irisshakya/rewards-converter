public class RewardValue {
    
    //set it private and provide getters
    private double cashValue;
    private int milesValue;

    // accepts cash value
    public RewardValue(double cashValue){
        this.cashValue = cashValue;
        this.milesValue = (int) (cashValue / 0.0035);
    }

    //accepts miles value
    public RewardValue(int milesValue){
        this.milesValue = milesValue;
        this.cashValue = milesValue * 0.0035;
    }

    // calculating cash value of rewards
    public double getCashValue(){
        return cashValue;
    }

    //calculating miles value of rewards
    public int getMilesValue(){
        return milesValue;
    }
}
