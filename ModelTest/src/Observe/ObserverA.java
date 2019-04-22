package Observe;

import java.util.Observable;
import java.util.Observer;

public class ObserverA implements Observer {
    private int state;

    @Override
    public void update(Observable o, Object arg) {
        state = ((ContreteSubject)o).getState();
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }
}
