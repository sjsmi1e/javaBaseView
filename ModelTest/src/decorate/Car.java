package decorate;

public class Car implements Icar {
    @Override
    public void move() {
        System.out.println("我是一辆普通的车。。。");
    }
}
