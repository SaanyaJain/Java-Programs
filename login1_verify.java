//AWT 7
import java.awt.*;
import java.awt.event.*;

public class login1_verify extends Frame implements ActionListener {
    Panel panel;
    Label user_label, password_label, message;
    TextField user_text, password_text;
    Button submit;

    login1_verify() {
        user_label = new Label();
        user_label.setText("User Name:");
        user_text = new TextField();

        password_label = new Label();
        password_label.setText("Password:");
        password_text = new TextField();
        password_text.setEchoChar('*');
        submit = new Button("SUBMIT");
        panel = new Panel(new GridLayout(3, 1));
        panel.add(user_label);
        panel.add(user_text);
        panel.add(password_label);
        panel.add(password_text);
        panel.add(submit);
        submit.addActionListener(this);
        add(panel, BorderLayout.CENTER);
        setTitle("Please Login Here!");
        setSize(450, 350);
        setVisible(true);
    }

    public static void main(String[] args) {
        new login1_verify();
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        String username = user_text.getText();
        String password = password_text.getText();
        if (username.trim().equals("admin") && password.trim().equals("admin")) {
            success s = new success();
        } else {
            fail f = new fail();
        }
    }
}
