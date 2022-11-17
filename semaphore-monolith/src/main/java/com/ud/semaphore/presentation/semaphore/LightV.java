package com.ud.semaphore.presentation.semaphore;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.JPanel;

/**
 *
 * @author mac
 */
public class LightV extends JPanel{

    private boolean red;
    private boolean yellow;
    private boolean green;
    private boolean off;
    private boolean fail;

    public LightV() {
        red = false;
        yellow = false;
        green = false;
    }

    public void red() {
        red = true;
        yellow = false;
        green = false;
        repaint();
    }

    public void yellow() {
        red = false;
        yellow = true;
        green = false;
        repaint();
    }

    public void green() {
        red = false;
        yellow = false;
        green = true;
        repaint();
    }

    public void off() {
        red = false;
        yellow = false;
        green = false;
        repaint();
    }

    public void fail() {
        red = true;
        yellow = false;
        green = false;
        repaint();
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        if (red) {
            g.setColor(Color.red);
            g.fillOval(20,20,30,30);
            g.setColor(Color.black);
            g.drawOval(20,55,30,30);
            g.drawOval(20,90,30,30);
            g.drawRect(5,5,60,130);
            g.setColor(Color.ORANGE);
            g.fillRect(20,136,30,80);
        } else if (yellow) {
            g.setColor(Color.yellow);
            g.fillOval(20,55,30,30);
            g.setColor(Color.black);
            g.drawRect(5,5,60,130);
            g.drawOval(20,20,30,30);
            g.drawOval(20,90,30,30);
            g.setColor(Color.ORANGE);
            g.fillRect(20,136,30,80);
        } else if (green) {
            g.setColor(Color.green);
            g.fillOval(20,90,30,30);
            g.setColor(Color.black);
            g.drawRect(5,5,60,130);
            g.drawOval(20,20,30,30);
            g.drawOval(20,55,30,30);
            g.setColor(Color.ORANGE);
            g.fillRect(20,136,30,80);
        } else if (off){
            g.setColor(Color.black);
            g.drawRect(5, 5, 30, 80);
            g.drawOval(10, 10, 20, 20);
            g.drawOval(10, 35, 20, 20);
            g.drawOval(10, 60, 20, 20);
        }else if (fail) {
            g.setColor(Color.red);
            g.drawRect(5,5,60,130);
            g.drawOval(20,20,30,30);
            g.drawOval(20,55,30,30);
            g.drawOval(20,90,30,30);
            g.setColor(Color.ORANGE);
            g.fillRect(20,136,30,80);
        }else{
            g.setColor(Color.black);
            g.drawRect(5,5,60,130);
            g.drawOval(20,20,30,30);
            g.drawOval(20,55,30,30);
            g.drawOval(20,90,30,30);
            g.setColor(Color.ORANGE);
            g.fillRect(20,136,30,80);
        }
    }

    @Override
    public Dimension getPreferredSize() {
        return new Dimension(70, 200);
    }
}

