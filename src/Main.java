import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        JFrame frame = new JFrame("Hello swing");
        JButton button = new JButton("Click me");

        button.addActionListener(e -> JOptionPane.showMessageDialog(null, "Hello, Word!"));

        frame.add(button);
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        }
    }
