package singleton;

//静态内部类实现单例
public class StaticInnerClass {
    //静态内部类
    private static class GetInstance{
        public static StaticInnerClass instance = new StaticInnerClass();
    }
    private StaticInnerClass(){}
    //获得实例方法
    public static StaticInnerClass getInstance(){
        return GetInstance.instance;
    }

}
