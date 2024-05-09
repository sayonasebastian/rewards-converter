public class RewardValue {
    private double cash;
    private int miles;
    RewardValue(double cash){
        this.cash = cash;
        this.miles = (int) (cash / 0.0035);
    }
    RewardValue(int miles){
        this.miles = miles;
        this.cash = miles * 0.0035;
    }
    double getCashValue(){
        return this.cash;
    }
    int getMilesValue(){
        return this.miles;
    }
}
