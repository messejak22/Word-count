import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Main extends JFrame {

    JPanel panel = new JPanel();
    JLabel label = new JLabel();
    JLabel label2 = new JLabel();
    JTextField textField = new JTextField(30);
    JButton button = new JButton("Enter");
    public static String input;
    public static LinkedList<String> l1;

    public Main(){
        setTitle("Tutorial");
        setVisible(true);
        setSize(400, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        panel.add(textField);


        textField.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                input = textField.getText();
                label.setText(input); 
            } // end action performed 
        }); // end action listener

        panel.add(button);
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String input = textField.getText();
                l1.addToFront(input);
                String finalInput = input + " " + String.valueOf(l1.getSize());
                label.setText(finalInput);
            } // end actionPerformed
        }); // end action listener 
              
        panel.add(label);
        add(panel);
        

    } // end constructor 

    public static void main(String[] args) {
        Main m = new Main();
        l1 = new LinkedList<String>();
    }
}