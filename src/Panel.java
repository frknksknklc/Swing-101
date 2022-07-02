import javax.swing.*;
import java.awt.*;

public class Panel {
    public static void main(String[] args) {

        ImageIcon image = new ImageIcon("like.png");


        JLabel label = new JLabel();
        label.setText("Hi");
        label.setIcon(image);
        label.setVerticalAlignment(JLabel.TOP);
        label.setHorizontalAlignment(JLabel.RIGHT);

        JPanel redpanel = new JPanel();
        redpanel.setBackground(Color.red);
        redpanel.setBounds(0,0,250,250);

        JPanel bluepanel = new JPanel();
        bluepanel.setBackground(Color.blue);
        bluepanel.setBounds(250,0,250,250);

        JPanel greenpanel = new JPanel();
        greenpanel.setBackground(Color.green);
        greenpanel.setBounds(0,250,500,250);
        greenpanel.setLayout(new BorderLayout());


        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setSize(500,500);
        frame.setVisible(true);
        greenpanel.add(label);
        frame.add(redpanel);
        frame.add(bluepanel);
        frame.add(greenpanel);

    }
}
