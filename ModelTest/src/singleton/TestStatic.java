package singleton;

public class TestStatic {

    static String str = "静态字符串";
    static {
        System.out.println("静态代码块！");
    }

    static class InnerClass{
        static {
            System.out.println("静态内部类静态代码块！");
        }
    }

    public void print(){
        System.out.println("print 方法！");
    }


    public static void main(String[] args) {
        TestStatic s;
        System.out.println(TestStatic.str);
    }
}
