package Observe;

import java.util.Observable;

public class ContreteSubject extends Observable {

    //状态
    private int state;

    public int getState() {
        return state;
    }

    public void setState(int state) {
        if (this.state != state ){
            this.state = state;
            //标识已经改变
            setChanged();
            //通知所有人
            notifyObservers(state);
        }
    }
}
