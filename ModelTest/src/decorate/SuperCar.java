package decorate;

public class SuperCar implements Icar {
    protected Icar icar;

    public SuperCar(Icar icar) {
        this.icar = icar;
    }

    @Override
    public void move() {
        icar.move();
    }
}
