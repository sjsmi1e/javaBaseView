package adapter;


//客户对象
public class Clinet {

    //调用接口实现所需的功能
    public static void test(Target target){
        target.handler();
    }

    public static void main(String[] args) {
        Adaptee a = new Adaptee();
        Adaper b = new Adaper(a);
        Clinet.test(b);

    }
}
