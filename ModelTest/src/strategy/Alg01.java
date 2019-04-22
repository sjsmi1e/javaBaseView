package strategy;

//获得标准报价
public class Alg01 implements Strategy {
    @Override
    public double getPrice(double price) {
        return price;
    }
}
