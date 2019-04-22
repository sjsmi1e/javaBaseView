package Factory;

public class Test {
    public static void main(String[] args) {
        CarFactory c = new AudiFactory();
        c.createCar().run();
        BydFactory b = new BydFactory();
        b.createCar().run();
    }
}
