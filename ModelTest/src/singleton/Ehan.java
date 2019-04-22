package singleton;

public class Ehan {
    //直接创建实例
    public static Ehan instance = new Ehan();
    private Ehan(){}
    //得到实例方法
    public static Ehan getInstance(){
        return instance;
    }
}
