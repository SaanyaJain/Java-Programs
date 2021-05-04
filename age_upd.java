import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class age_upd extends Frame implements ActionListener {
    Label num_label, data;
    TextField num_text;
    Button count;

    age_upd() {
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
        setSize(800, 800);
        setVisible(true);

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                dispose();
            }
        });
    }

    public void actionPerformed(ActionEvent ae) {
        int n = Integer.parseInt(num_text.getText());
        int sly, urs;
        double usly;
        String sql;
        PreparedStatement ps;
        num_text.setText(String.valueOf(n));
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Driver ok");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/example", "root", "1608");
            if (n > 40) {
                sql = "select * from emp1 where eid = ?";
                ps = con.prepareStatement(sql);
                ps.setInt(1, n);
                ResultSet rs = ps.executeQuery();
                rs.next();
                sly = rs.getInt(7);
                usly = sly + (sly * 0.2);
                sql = "UPDATE emp1 SET salary = ? WHERE emp1.eid = ?";
                ps = con.prepareStatement(sql);
                ps.setDouble(1, usly);
                ps.setInt(2, n);
                urs = ps.executeUpdate();
                if (urs == 1)
                    data.setText(
                            "Employee's age is greater than 40, therefore the salary of Employeee increased by 20%");
            } else if (n < 40) {
                sql = "select * from emp1 where eid = ?";
                ps = con.prepareStatement(sql);
                ps.setInt(1, n);
                ResultSet rs = ps.executeQuery();
                rs.next();
                sly = rs.getInt(7);
                usly = sly + (sly * 0.1);
                sql = "UPDATE emp1 SET salary = ? WHERE emp1.eid = ?";
                ps = con.prepareStatement(sql);
                ps.setDouble(1, usly);
                ps.setInt(2, n);
                urs = ps.executeUpdate();
                if (urs == 1)
                    data.setText("Employee's age is less than 40, therefore the salary of Employeee increased by 10%");
            }

            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

}