package decorate;

public class FlyCar extends SuperCar {
    public FlyCar(Icar icar) {
        super(icar);
    }

    public void fly(){
        super.move();
        System.out.println("可以飞。。。");
    }
}
