import java.awt.*;
import java.awt.event.*;

public class AWTCounter extends Frame implements ActionListener {
    Label num_label, message;
    TextField num_text;
    Button count;

    AWTCounter() {
        num_label = new Label();
        num_label.setText("Number:");
        num_text = new TextField();
        num_label.setBounds(100, 30, 80, 40);
        num_text.setBounds(180, 30, 120, 40);

        count = new Button("Count");
        count.setBounds(140, 70, 120, 40);

        message = new Label();
        message.setText("");
        message.setBounds(140, 100, 120, 40);

        add(num_label);
        add(num_text);
        add(count);
        add(message);
        count.addActionListener(this);
        setTitle("Counting Number");
        setSize(450, 350);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        int n = Integer.parseInt(num_text.getText());
        int m = n + 1;
        message.setText(String.valueOf(m));
        num_text.setText(String.valueOf(m));
    }

    public static void main(String[] args) {
        new AWTCounter();
    }

}
