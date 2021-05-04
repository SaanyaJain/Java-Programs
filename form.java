import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

class form extends JFrame implements ActionListener {
    // frame
    // JFrame f;

    JLabel l1, l2, l3, l4, l5, l6, l7, l8;
    JTextField tf1, tf2, tf3, tf4, tf5, tf6, tf7, tf8;
    JButton btn1, btn2;
    JPasswordField p1, p2;

    form() {

        setVisible(true);
        setSize(800, 800);
        setLayout(null);

        l1 = new JLabel("ERP number:");
        l2 = new JLabel("Name:");
        l3 = new JLabel("Email-ID:");
        l4 = new JLabel("Create Passowrd:");
        l5 = new JLabel("Confirm Passowrd:");
        l6 = new JLabel("Country:");
        l7 = new JLabel("State:");
        l8 = new JLabel("Phone No:");

        l1.setBounds(80, 70, 200, 30);
        l2.setBounds(80, 110, 200, 30);
        l3.setBounds(80, 150, 200, 30);
        l4.setBounds(80, 190, 200, 30);
        l5.setBounds(80, 230, 200, 30);
        l6.setBounds(80, 270, 200, 30);
        l7.setBounds(80, 310, 200, 30);
        l8.setBounds(80, 350, 200, 30);

        tf1 = new JTextField();
        tf2 = new JTextField();
        tf3 = new JTextField();
        p1 = new JPasswordField();
        p2 = new JPasswordField();
        tf6 = new JTextField();
        tf7 = new JTextField();
        tf8 = new JTextField();

        tf1.setBounds(300, 70, 200, 30);
        tf2.setBounds(300, 110, 200, 30);
        tf3.setBounds(300, 150, 200, 30);
        p1.setBounds(300, 190, 200, 30);
        p2.setBounds(300, 230, 200, 30);
        tf6.setBounds(300, 270, 200, 30);
        tf7.setBounds(300, 310, 200, 30);
        tf8.setBounds(300, 350, 200, 30);

        btn1 = new JButton("Register");
        btn2 = new JButton("Clear");

        btn1.setBounds(50, 390, 100, 30);
        btn2.setBounds(170, 390, 100, 30);

        add(l1);
        add(l2);
        add(l3);
        add(l4);
        add(l5);
        add(l6);
        add(l7);
        add(l8);

        add(tf1);
        add(tf2);
        add(tf3);
        add(p1);
        add(p2);
        add(tf6);
        add(tf7);
        add(tf8);
        add(tf8);
        add(btn1);
        add(btn2);

        btn1.addActionListener(this);
        btn2.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btn1) {
            char[] password = p1.getPassword();
            char[] cpassword = p2.getPassword();
            if (Arrays.equals(password, cpassword)) {
                // create a dialog Box
                JDialog d = new JDialog(this, "Message");
                // create a label
                JLabel l = new JLabel("Registration Successfull");
                d.add(l);
                // setsize of dialog
                d.setSize(400, 400);
                // set visibility of dialog
                d.setVisible(true);
            } else {
                // create a dialog Box
                JDialog d = new JDialog(this, "Message");
                // create a label
                JLabel l = new JLabel("Registration Failed, password are not same");
                d.add(l);
                // setsize of dialog
                d.setSize(400, 400);
                // set visibility of dialog
                d.setVisible(true);
            }
        } else if (e.getSource() == btn2) {
            tf1.setText("");
            tf2.setText("");
            tf3.setText("");
            p1.setText("");
            p2.setText("");
            tf6.setText("");
            tf7.setText("");
            tf8.setText("");
        }
    }

    public static void main(String[] args) {
        form f = new form();
    }
}
