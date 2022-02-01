import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.plaf.FontUIResource;
import java.awt.*;  
import java.awt.event.*;  

public class Calculator  implements ActionListener {
    JFrame jf;
    JLabel displayLabel;
    JButton sevenButton; 
    JButton eightButton;
    JButton ninetButton;
    JButton fourButton;
    JButton fiveButton;
    JButton sixButton;
    JButton oneButton;
    JButton twoButton;
    JButton threeButton;
    JButton dotButton;
    JButton zeroButton;
    JButton equalButton;
    JButton divButton;
    JButton multiButton;
    JButton minusButton;
    JButton addButton;
    JButton clearButton;


    public Calculator(){
        jf = new JFrame("Calculator");  //This will create a jframe (create a window with top heading 'Calculator')
        jf.setLayout(null);
        jf.setSize(600,600);
        jf.setLocation(920, 80);

        displayLabel = new JLabel();
        displayLabel.setBounds(30, 50, 540, 40);
        displayLabel.setBackground(Color.GRAY);
        displayLabel.setOpaque(true);
        displayLabel.setHorizontalAlignment(SwingConstants.RIGHT);
        displayLabel.setForeground(Color.WHITE);
        jf.add(displayLabel);
         
        //first row
        sevenButton = new JButton("7");
        sevenButton.setBounds(30, 130, 80, 80);
        sevenButton.setFont(new FontUIResource("Arial", 7, 40));
        sevenButton.addActionListener(this);
        jf.add(sevenButton);

        eightButton = new JButton("8");
        eightButton.setBounds(130, 130, 80, 80);
        eightButton.setFont(new FontUIResource("Arial", 7, 40));
        eightButton.addActionListener(this);
        jf.add(eightButton);

        ninetButton = new JButton("9");
        ninetButton.setBounds(230, 130, 80, 80);
        ninetButton.setFont(new FontUIResource("Arial", 7, 40));
        ninetButton.addActionListener(this);
        jf.add(ninetButton);

        //second row

        fourButton = new JButton("4");
        fourButton.setBounds(30, 230, 80, 80);
        fourButton.setFont(new FontUIResource("Arial", 7, 40));
        fourButton.addActionListener(this);

        jf.add(fourButton);

        fiveButton = new JButton("5");
        fiveButton.setBounds(130, 230, 80, 80);
        fiveButton.setFont(new FontUIResource("Arial", 7, 40));
        fiveButton.addActionListener(this);

        jf.add(fiveButton);

        sixButton = new JButton("6");
        sixButton.setBounds(230, 230, 80, 80);
        sixButton.setFont(new FontUIResource("Arial", 7, 40));
        sixButton.addActionListener(this);

        jf.add(sixButton);

        //Third row

        oneButton = new JButton("1");
        oneButton.setBounds(30, 330, 80, 80);
        oneButton.setFont(new FontUIResource("Arial", 7, 40));
        oneButton.addActionListener(this);

        jf.add(oneButton);

        twoButton = new JButton("2");
        twoButton.setBounds(130, 330, 80, 80);
        twoButton.setFont(new FontUIResource("Arial", 7, 40));
        twoButton.addActionListener(this);

        jf.add(twoButton);

        threeButton = new JButton("3");
        threeButton.setBounds(230, 330, 80, 80);
        threeButton.setFont(new FontUIResource("Arial", 7, 40));
        threeButton.addActionListener(this);

        jf.add(threeButton);

        //last row

        dotButton = new JButton(".");
        dotButton.setBounds(30, 430, 80, 80);
        dotButton.setFont(new FontUIResource("Arial", 7, 40));
        dotButton.addActionListener(this);

        jf.add(dotButton);

        zeroButton = new JButton("0");
        zeroButton.setBounds(130, 430, 80, 80);
        zeroButton.setFont(new FontUIResource("Arial", 7, 40));
        zeroButton.addActionListener(this);

        jf.add(zeroButton);

        equalButton = new JButton("=");
        equalButton.setBounds(230, 430, 80, 80);
        equalButton.setFont(new FontUIResource("Arial", 7, 40));
        equalButton.addActionListener(this);

        jf.add(equalButton);

        //Right side operators (/,-,+)

        divButton = new JButton("/");
        divButton.setBounds(330, 130, 80, 80);
        divButton.setFont(new FontUIResource("Arial", 7, 40));
        divButton.addActionListener(this);

        jf.add(divButton);

        multiButton = new JButton("x");
        multiButton.setBounds(330, 230, 80, 80);
        multiButton.setFont(new FontUIResource("Arial", 7, 40));
        multiButton.addActionListener(this);

        jf.add(multiButton);

        minusButton = new JButton("-");
        minusButton.setBounds(330, 330, 80, 80);
        minusButton.setFont(new FontUIResource("Arial", 7, 40));
        minusButton.addActionListener(this);

        jf.add(minusButton);

        addButton = new JButton("+");
        addButton.setBounds(330, 430, 80, 80);
        addButton.setFont(new FontUIResource("Arial", 7, 40));
        addButton.addActionListener(this);

        jf.add(addButton);

        clearButton = new JButton("clear");
        clearButton.setBounds(430, 430, 80, 80);
        clearButton.setFont(new FontUIResource("Arial", 7, 15));
        clearButton.addActionListener(this);

        jf.add(clearButton);



        jf.setVisible(true);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
    

public static void main(String[] args) {
    new Calculator();
}


@Override
public void actionPerformed(ActionEvent e) {
    // jf.getContentPane().setBackground(Color.GREEN);
    // displayLabel.setText("7");

    if(e.getSource() == sevenButton){
        displayLabel.setText( displayLabel.getText()+"7");

    }else if(e.getSource() == eightButton){
        displayLabel.setText( displayLabel.getText()+"8");
    }else if(e.getSource() == ninetButton){
        displayLabel.setText( displayLabel.getText()+"9");
    }else if(e.getSource() == fourButton){
        displayLabel.setText( displayLabel.getText()+"4");
    }else if(e.getSource() == fiveButton){
        displayLabel.setText( displayLabel.getText()+"5");
    }else if(e.getSource() == sixButton){
        displayLabel.setText( displayLabel.getText()+"6");
    }else if(e.getSource() == oneButton){
        displayLabel.setText( displayLabel.getText()+"1");
    }else if(e.getSource() == twoButton){
        displayLabel.setText( displayLabel.getText()+"2");
    }else if(e.getSource() == threeButton){
        displayLabel.setText( displayLabel.getText()+"3");
    }else if(e.getSource() == dotButton){
        displayLabel.setText( displayLabel.getText()+".");
    }else if(e.getSource() == zeroButton){
        displayLabel.setText( displayLabel.getText()+"0");

    }else if(e.getSource() == equalButton){
        displayLabel.setText("=");
    }else if(e.getSource() == divButton){
        displayLabel.setText("/");
    }else if(e.getSource() == multiButton){
        displayLabel.setText("x");
    }else if(e.getSource() == minusButton){
        displayLabel.setText("-");
    }else if(e.getSource() == addButton){
        displayLabel.setText("+");
    }
    else if(e.getSource() == clearButton){
        displayLabel.setText("");
    }
    
}

}

//--------------------1:03---------------