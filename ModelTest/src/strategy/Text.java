package strategy;

public class Text {
    public static void main(String[] args) {
        Alg01 a = new Alg01();
        LessPrice b = new LessPrice();
        Moreprice c = new Moreprice();
        Context d = new Context(c);
        d.printPrice(20);
    }
}
