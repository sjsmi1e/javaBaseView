package decorate;

public class SwinCar extends SuperCar {

    public SwinCar(Icar icar) {
        super(icar);
    }
    public void swim(){
        super.move();
        System.out.println("我可以下水。。。");
    }
}
