import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class Label {
    public static void main(String[] args) {

        ImageIcon image = new ImageIcon("dude.png");
        Border border = BorderFactory.createLineBorder(Color.GREEN, 3);



        JLabel label = new JLabel();  // create label
        label.setText("Bro, do you even code?"); // set text label
        label.setIcon(image);
        label.setHorizontalTextPosition(JLabel.CENTER); // set text LEFT,CENER,RIGTH of imageicon
        label.setVerticalTextPosition(JLabel.TOP);
        label.setForeground(Color.GREEN);
        label.setFont(new Font("MV Boli",Font.PLAIN,20)); // set font of color
        label.setIconTextGap(100);
        label.setBackground(Color.BLACK); // set background color
        label.setOpaque(true); // display background color
        label.setBorder(border);
        label.setVerticalAlignment(JLabel.CENTER);



        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,500);
        frame.setVisible(true);
        frame.add(label);

    }
}
