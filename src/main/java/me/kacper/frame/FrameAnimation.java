package me.kacper.frame;

import javax.swing.*;
import java.util.Timer;
import java.util.TimerTask;

public class FrameAnimation {

    private final Timer timer = new Timer();

    public void animate(JLabel label){

        timer.schedule(new TimerTask() {

            int i = 2; // 1, 0, -1, -2, -3, -4, -5, -6, -7, -8, -9 ,- 10, -11-12-13-14-15-16-

            @Override
            public void run() {

                i--;

                if (i <= 0) {
                    i = 2;
                    label.setLocation((int) (label.getLocation().getX() + 5), (int) (label.getLocation().getY() + 5));
                }

            }
        },100,1000L);
    }
}
