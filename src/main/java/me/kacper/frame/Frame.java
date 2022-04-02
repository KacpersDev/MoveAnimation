package me.kacper.frame;

import lombok.Getter;

import javax.swing.*;
import java.awt.*;

@Getter
public class Frame {
    
    private final String title;
    private final int width;
    private final int height;
    private final JFrame frame;
    private final JPanel panel;
    private final JLabel label;
    private final FrameAnimation animation;

    public Frame(String title, int width, int height){
        
        this.title = title;
        this.width = width;
        this.height = height;
        this.frame = new JFrame();
        this.panel = new JPanel();
        this.label = new JLabel();
        this.animation = new FrameAnimation();
    }
    
    public void generate(){

        frame.setTitle(title);
        frame.setSize(width, height);
        label.setBackground(Color.RED);
        label.setBounds(0,0,100,100);
        label.setOpaque(true);
        panel.setBackground(Color.BLACK);
        frame.add(label);
        frame.add(panel);
        this.animation.animate(label);
        frame.setVisible(true);

    }
}
