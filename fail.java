//AWT 7
import java.awt.*;

public class fail extends Frame {
    Label user_label;

    fail() {
        user_label = new Label();
        user_label.setText("Wrong username or password");
        add(user_label);
        setTitle("Error !");
        setSize(450, 350);
        setVisible(true);
    }
}
