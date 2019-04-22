package strategy;

//获得半折
public class LessPrice implements Strategy {
    @Override
    public double getPrice(double price) {
        return price*0.5;
    }
}
