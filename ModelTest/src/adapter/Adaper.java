package adapter;


//适配器
public class Adaper implements Target {
    Adaptee a = new Adaptee();

    public Adaper(Adaptee a) {
        this.a = a;
    }

    @Override
    public void handler() {
        a.fun();
    }
}
