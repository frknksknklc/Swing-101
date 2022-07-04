import javax.swing.*;

public class JoptionPane {
    public static void main(String[] args) {

        JOptionPane.showMessageDialog(null,"This is some message","title",JOptionPane.PLAIN_MESSAGE);
        JOptionPane.showMessageDialog(null,"This is informatiın message","title",JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null,"This is question message","title",JOptionPane.QUESTION_MESSAGE);
        JOptionPane.showMessageDialog(null,"This is warning message","title",JOptionPane.WARNING_MESSAGE);
        JOptionPane.showMessageDialog(null,"This is ERROR message","title",JOptionPane.ERROR_MESSAGE);

        JOptionPane.showConfirmDialog(null,"Bro, do yuo even code","This is my title",JOptionPane.YES_NO_CANCEL_OPTION);
        String name= JOptionPane.showInputDialog("Whats your name?");
        System.out.println("Hello " + name);
    }
}
