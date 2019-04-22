package Factory;

import javax.sound.midi.Soundbank;

public class Audi implements Car {
    @Override
    public void run() {
        System.out.println("奥迪正在跑。。。");
    }
}
