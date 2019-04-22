package singleton;

public class Lanhan {
    //加载类
    public static Lanhan instance;
    private Lanhan(){}
    //锁的获得类
    public static synchronized Lanhan getInstance(){
        if (instance==null){
            instance = new Lanhan();
        }
        return instance;
    }

}
