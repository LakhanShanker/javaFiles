import javax.swing.JOptionPane;

public class MyGame {
    public static void main(String[] args) {
         String name=JOptionPane.showInputDialog("Enter you name");
                 JOptionPane.showMessageDialog(null,"Hello "+name);
        int age=Integer.parseInt(JOptionPane.showInputDialog("Enter you age"));
        JOptionPane.showMessageDialog(null,"Hello "+age);
    }
}