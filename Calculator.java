import javax.swing.JFrame;

public class Calculator{
    public Calculator(){
        JFrame jf = new JFrame("Calculator");  //This will create a jframe (create a window with top heading 'Calculator')
        jf.setLayout(null);
        jf.setSize(600,600);

        jf.setVisible(true);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }


public static void main(String[] args) {
    new Calculator();
}
}