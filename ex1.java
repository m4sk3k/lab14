import org.jetbrains.uast.values.UBooleanConstant;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.awt.event.ActionListener;

public class ex1 extends JFrame{

    private JTextField txt1;
    private JTextField txt2;
    private JTextField txt3;
    private JButton btn1;
    private JButton btn2;


    public ex1(){
        super("Sum of two digits");
        setSize(380,350);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setLayout(null);

        JLabel label1 = new JLabel("a");
        label1.setBounds(75,75,25,25);

        txt1 = new JTextField();
        txt1.setBounds(105,75,175,25);

        JLabel label2 = new JLabel("b");
        label2.setBounds(75,100,25,25);

        txt2 = new JTextField();
        txt2.setBounds(105,100,175,25);

        JLabel label3 = new JLabel("sum");
        label3.setBounds(75,125,25,25);

        txt3 = new JTextField();
        txt3.setEditable(false);
        txt3.setBounds(105,125,175,25);

        btn1 = new JButton("Calculate");
        btn1.setBounds(105,150,175,25);

        btn2 = new JButton("Clear");
        btn2.setBounds(105,175,175,25);

        btn1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                float num1, num2, result;
                num1 = Float.parseFloat(txt1.getText());
                num2 = Float.parseFloat(txt2.getText());
                result = num1+num2;
                txt3.setText(String.valueOf(result));
            }
        });
        btn2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                txt1.setText("");
                txt2.setText("");
                txt3.setText("");
            }
        });

        add(label1);
        add(txt1);
        add(label2);
        add(txt2);
        add(label3);
        add(txt3);
        add(btn1);
        add(btn2);

        setVisible(true);
    }
    public static void main(String[] args) {
        new ex1 ();
    }
}