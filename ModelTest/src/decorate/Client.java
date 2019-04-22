package decorate;

public class Client {
    public static void main(String[] args) {
        Car car = new Car();
        car.move();
        System.out.println("==========================");

        Car car2 = new Car();
        FlyCar flyCar = new FlyCar(car2);
        flyCar.fly();
        System.out.println("==============================");
        SwinCar swinCar = new SwinCar(new FlyCar(new Car()));
        swinCar.swim();

    }
}
