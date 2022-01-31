import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

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
        displayLabel.setHorizontalAlignment(SwingConstants.RIGHT);
        displayLabel.setForeground(Color.WHITE);
        jf.add(displayLabel);
         
        //first row
        JButton sevenButton = new JButton("7");
        sevenButton.setBounds(30, 130, 80, 80);
        jf.add(sevenButton);

        JButton eightButton = new JButton("8");
        eightButton.setBounds(130, 130, 80, 80);
        jf.add(eightButton);

        JButton ninetButton = new JButton("9");
        ninetButton.setBounds(230, 130, 80, 80);
        jf.add(ninetButton);

        //second row

        JButton fourButton = new JButton("4");
        fourButton.setBounds(30, 230, 80, 80);
        jf.add(fourButton);

        JButton fiveButton = new JButton("5");
        fiveButton.setBounds(130, 230, 80, 80);
        jf.add(fiveButton);

        JButton sixButton = new JButton("6");
        sixButton.setBounds(230, 230, 80, 80);
        jf.add(sixButton);

        //Third row

        JButton oneButton = new JButton("1");
        oneButton.setBounds(30, 330, 80, 80);
        jf.add(oneButton);

        JButton twoButton = new JButton("2");
        twoButton.setBounds(130, 330, 80, 80);
        jf.add(twoButton);

        JButton threeButton = new JButton("3");
        threeButton.setBounds(230, 330, 80, 80);
        jf.add(threeButton);

        //last row

        JButton dotButton = new JButton(".");
        dotButton.setBounds(30, 430, 80, 80);
        jf.add(dotButton);

        JButton zeroButton = new JButton("0");
        zeroButton.setBounds(130, 430, 80, 80);
        jf.add(zeroButton);

        JButton equalButton = new JButton("=");
        equalButton.setBounds(230, 430, 80, 80);
        jf.add(equalButton);

        //Right side operators (/,-,+)

        JButton divButton = new JButton("/");
        divButton.setBounds(330, 130, 80, 80);
        jf.add(divButton);

        JButton multiButton = new JButton("x");
        multiButton.setBounds(330, 230, 80, 80);
        jf.add(multiButton);

        JButton addButton = new JButton("+");
        addButton.setBounds(330, 330, 80, 80);
        jf.add(addButton);



        jf.setVisible(true);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
    

public static void main(String[] args) {
    new Calculator();
}
}