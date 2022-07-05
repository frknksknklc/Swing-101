package Slider;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;

public class Slider implements ChangeListener {
    JFrame frame;
    JPanel panel;
    JLabel label;
    JSlider slider;
    Slider(){
        frame = new JFrame("Slider");
        panel = new JPanel();
        label = new  JLabel();
        slider = new JSlider(0,100,50);
        slider.setPreferredSize(new Dimension(400,200));
        slider.setPaintTicks(true);
        slider.setMinorTickSpacing(10);

        slider.setPaintTicks(true);
        slider.setMajorTickSpacing(25);

        slider.setPaintLabels(true);

        slider.setOrientation(SwingConstants.VERTICAL);
        slider.addChangeListener(this);

        panel.add(slider);
        panel.add(label);
        frame.add(panel);
        frame.setSize(420,420);
        frame.setVisible(true);



    }
    @Override
    public void stateChanged(ChangeEvent e) {
        label.setText("Celsius " + slider.getValue());
    }
}
