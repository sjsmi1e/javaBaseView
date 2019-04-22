package Observe;

public class Test {
    public static void main(String[] args) {
        ObserverA observer1 = new ObserverA();
        ObserverA observer2 = new ObserverA();
        ObserverA observer3 = new ObserverA();

        ContreteSubject contreteSubject = new ContreteSubject();
        contreteSubject.addObserver(observer1);
        contreteSubject.addObserver(observer2);
        contreteSubject.addObserver(observer3);

        contreteSubject.setState(12);

        System.out.println(observer1.getState()+" "+observer2.getState()+" "+observer3.getState());

        contreteSubject.setState(0);

        System.out.println(observer1.getState()+" "+observer2.getState()+" "+observer3.getState());

    }
}
