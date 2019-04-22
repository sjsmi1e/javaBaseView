package strategy;

public class Context {
    //算法对象
    private Strategy s ;

    public Context(Strategy s) {
        this.s = s;
    }

    //设置要使用的算法
    public void setS(Strategy s) {
        this.s = s;
    }

    //打印价格
    public void printPrice(double standerPrice){
        System.out.println(s.getPrice(standerPrice));
    }
}
