package strategy;

//获得两倍报价
public class Moreprice implements Strategy {
    @Override
    public double getPrice(double price) {
        return price*2.0;
    }
}
