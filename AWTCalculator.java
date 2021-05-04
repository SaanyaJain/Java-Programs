import java.awt.*;
import java.awt.event.*;

public class AWTCalculator extends Frame implements ActionListener {
    Label num1_label, num2_label, message;
    TextField num1_text, num2_text;
    Button addition, sub, mul, div;

    AWTCalculator() {
        num1_label = new Label();
        num1_label.setText("Number-1:");
        num1_text = new TextField();
        num1_label.setBounds(50, 30, 80, 40);
        num1_text.setBounds(130, 30, 120, 40);

        num2_label = new Label();
        num2_label.setText("Number-2:");
        num2_text = new TextField();
        num2_label.setBounds(50, 70, 80, 40);
        num2_text.setBounds(130, 70, 120, 40);

        addition = new Button("+");
        sub = new Button("-");
        mul = new Button("*");
        div = new Button("/");
        addition.setBounds(40, 115, 120, 40);
        sub.setBounds(240, 115, 120, 40);
        mul.setBounds(40, 160, 120, 40);
        div.setBounds(240, 160, 120, 40);

        message = new Label();
        message.setText("");
        message.setBounds(100, 200, 120, 40);

        add(num1_label);
        add(num1_text);
        add(num2_label);
        add(num2_text);
        add(addition);
        add(sub);
        add(mul);
        add(div);
        add(message);
        addition.addActionListener(this);
        sub.addActionListener(this);
        mul.addActionListener(this);
        div.addActionListener(this);
        setTitle("Calculator");
        setSize(450, 350);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        String str;
        str = ae.getActionCommand();
        int n1 = Integer.parseInt(num1_text.getText());
        int n2 = Integer.parseInt(num2_text.getText());

        if (str.equals("+")) {
            int m = n1 + n2;
            message.setText(String.valueOf(m));
        } else if (str.equals("-")) {
            int m = n1 - n2;
            message.setText(String.valueOf(m));
        } else if (str.equals("*")) {
            int m = n1 * n2;
            message.setText(String.valueOf(m));
        } else if (str.equals("/")) {
            float m = n1 / n2;
            message.setText(String.valueOf(m));
        }
    }

    public static void main(String[] args) {
        new AWTCalculator();
    }
}
