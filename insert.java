import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class insert extends Frame implements ActionListener {
    Label lb1, lb2, lb3, lb4, lb5, lb6, lb7, data;
    TextField tf1, tf2, tf3, tf4, tf5, tf6, tf7;
    Button count;

    insert() {
        lb1 = new Label();
        lb1.setText("Enter Employee ID:");
        tf1 = new TextField();
        lb1.setBounds(100, 100, 180, 40);
        tf1.setBounds(300, 100, 180, 40);

        lb2 = new Label();
        lb2.setText("Enter Employee Name:");
        tf2 = new TextField();
        lb2.setBounds(100, 200, 180, 40);
        tf2.setBounds(300, 200, 180, 40);

	lb3 = new Label();
        lb3.setText("Enter Department ID:");
        tf3 = new TextField();
        lb3.setBounds(100, 150, 180, 40);
        tf3.setBounds(300, 150, 180, 40);

        lb4 = new Label();
        lb4.setText("Enter Employee Age:");
        tf4 = new TextField();
        lb4.setBounds(100, 250, 180, 40);
        tf4.setBounds(300, 250, 180, 40);

        lb5 = new Label();
        lb5.setText("Enter Employee Address:");
        tf5 = new TextField();
        lb5.setBounds(100, 300, 180, 40);
        tf5.setBounds(300, 300, 180, 40);

        lb6 = new Label();
        lb6.setText("Enter Employee Mobile Number:");
        tf6 = new TextField();
        lb6.setBounds(100, 350, 180, 40);
        tf6.setBounds(300, 350, 180, 40);

        lb7 = new Label();
        lb7.setText("Enter Employee Salary:");
        tf7 = new TextField();
        lb7.setBounds(100, 400, 180, 40);
        tf7.setBounds(300, 400, 180, 40);

        count = new Button("SHOW");
        count.setBounds(150, 450, 120, 40);

        data = new Label();
        data.setText("");
        data.setBounds(140, 100, 120, 40);

        add(lb1);
        add(tf1);
        add(lb2);
        add(tf2);
        add(lb3);
        add(tf3);
        add(lb4);
        add(tf4);
        add(lb5);
        add(tf5);
        add(lb6);
        add(tf6);
        add(lb7);
        add(tf7);

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
        int eid = Integer.parseInt(tf1.getText());
        String ename = tf2.getText();
	int dno = Integer.parseInt(tf3.getText());
        int age = Integer.parseInt(tf4.getText());
        String adr = tf5.getText();
        Long phno = Long.parseLong(tf6.getText());
        Double sal = Double.parseDouble(tf7.getText());
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Driver ok");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/example", "root", "1608");
            String sql = "INSERT INTO emp1(eid, ename, dept_id, age, address, mobile_no, salary) VALUES (?,?,?,?,?,?,?)";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, eid);
	    ps.setString(2, ename);
            ps.setInt(3, dno);
            ps.setInt(4, age);
            ps.setString(5, adr);
            ps.setLong(6, phno);
            ps.setDouble(7, sal);
            int rs = ps.executeUpdate();
            if (rs == 1) {
                data.setText("Inserted new Employee details into the database Successfully");
            }
            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}