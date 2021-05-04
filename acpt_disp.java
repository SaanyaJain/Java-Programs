import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class acpt_disp extends Frame implements ActionListener {
    Label num_label, data;
    TextField num_text;
    Button count;

    acpt_disp() {
        num_label = new Label();
        num_label.setText("Enter Employee ID:");
        num_text = new TextField();
        num_label.setBounds(100, 100, 180, 40);
        num_text.setBounds(300, 100, 180, 40);

        count = new Button("SHOW");
        count.setBounds(150, 170, 120, 40);

        data = new Label();
        data.setText("");
        data.setBounds(140, 100, 120, 40);

        add(num_label);
        add(num_text);
        add(count);
        add(data);
        count.addActionListener(this);
        setSize(600, 600);
        setVisible(true);

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                dispose();
            }
        });
    }

    public void actionPerformed(ActionEvent ae) {
        int n = Integer.parseInt(num_text.getText());
        num_text.setText(String.valueOf(n));
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Driver ok");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/example", "root", "1608");
            String sql = "select * from emp1 where eid = ?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, n);
            ResultSet rs = ps.executeQuery();
            while (rs.next())
                data.setText("Employee ID: " + rs.getInt(1) + " \nEmployee Name: " + rs.getString(2) + " \nDepartment ID: "
                        + rs.getInt(3) + " \nAge: " + rs.getString(4) + " \nAddress: " + rs.getString(5) + " \nMobile Number: " + rs.getLong(6)
                        + " \nSalary: " + rs.getInt(7));
            rs.close();
            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}