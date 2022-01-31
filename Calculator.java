import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Calculator{
    public Calculator(){
        JFrame jf = new JFrame("Calculator");  //This will create a jframe (create a window with top heading 'Calculator')
        jf.setLayout(null);
        jf.setSize(600,600);
        jf.setLocation(920, 80);
        JLabel displayLabel = new JLabel("Hello");
        displayLabel.setBounds(30, 50, 540, 40);
        displayLabel.setBackground(Color.GRAY);
        displayLabel.setOpaque(true);
        jf.add(displayLabel);


        jf.setVisible(true);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
    

public static void main(String[] args) {
    new Calculator();
}
}