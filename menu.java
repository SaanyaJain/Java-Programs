import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class menu extends JFrame implements ActionListener {
    JLabel message;
    JRadioButton rb1, rb2, rb3, rb4, rb5;
    JButton btn;

    menu() {
        message = new JLabel("Choose the given option to perform the respective task in the database:");
        message.setBounds(50, 50, 300, 20);
        rb1 = new JRadioButton("Insert new values into Employee Table:");
        rb1.setBounds(100, 100, 150, 20);

        rb2 = new JRadioButton("Delete row from Employee Table");
        rb2.setBounds(100, 150, 150, 20);

        rb3 = new JRadioButton("Update row values of Employee Table");
        rb3.setBounds(100, 200, 150, 20);

        rb4 = new JRadioButton("Display a particular Employee Details");
        rb4.setBounds(100, 250, 150, 20);

        btn = new JButton("next");
        btn.setBounds(100, 300, 80, 30);
        btn.addActionListener(this);

        add(message);
        add(rb1);
        add(rb2);
        add(rb3);
        add(rb4);
        add(btn);

        setSize(800, 800);
        setLayout(null);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent e) {
        if (rb1.isSelected()) {
            insert i = new insert();
        }
        if (rb2.isSelected()) {
            acpt_dlt dlt = new acpt_dlt();
        }
        if (rb3.isSelected()) {
            age_upd upd = new age_upd();
        }
        if (rb4.isSelected()) {
            acpt_disp dis = new acpt_disp();
        }
    }

    public static void main(String[] args) {
        new menu();
    }
}