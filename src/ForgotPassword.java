import java.awt.EventQueue;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.sql.*;

public class ForgotPassword extends JFrame {

    private JPanel contentPane;
    private JTextField textField;
    private JTextField textField_1;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    ForgotPassword frame = new ForgotPassword();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }
    public ForgotPassword() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 703, 413);
        setResizable(false);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

        setContentPane(contentPane);
        contentPane.setLayout(null);

        JPanel panel = new JPanel();
        panel.setBackground(Color.BLACK);
        panel.setBounds(10, 11, 667, 352);
        contentPane.add(panel);
        panel.setLayout(null);

        JLabel lblNewLabel = new JLabel("Enter First Name:");
        lblNewLabel.setForeground(Color.WHITE);
        lblNewLabel.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 30));
        lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel.setBounds(48, 68, 319, 45);
        panel.add(lblNewLabel);

        JLabel lblEnterNumber = new JLabel("Enter User Number:");
        lblEnterNumber.setForeground(Color.WHITE);
        lblEnterNumber.setHorizontalAlignment(SwingConstants.CENTER);
        lblEnterNumber.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 30));
        lblEnterNumber.setBounds(10, 144, 350, 45);
        panel.add(lblEnterNumber);

        textField = new JTextField();
        textField.setBounds(377, 77, 240, 48);
        panel.add(textField);
        textField.setColumns(10);

        textField_1 = new JTextField();
        textField_1.setColumns(10);
        textField_1.setBounds(377, 149, 240, 48);
        panel.add(textField_1);

        JLabel lblEnterUserName = new JLabel("Password Recovery");
        lblEnterUserName.setForeground(Color.WHITE);
        lblEnterUserName.setBackground(Color.WHITE);
        lblEnterUserName.setHorizontalAlignment(SwingConstants.CENTER);
        lblEnterUserName.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 30));
        lblEnterUserName.setBounds(125, 12, 435, 45);
        panel.add(lblEnterUserName);

        JButton btnNewButton = new JButton("CLICK");

        btnNewButton.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 30));
        btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    String url = "jdbc:mysql://localhost:3306/OnWay";
                    String name = "root";
                    String pass = "";

                    try (Connection con = DriverManager.getConnection(url,name,pass)) {
                        String name_1 =textField.getText();
                        String no =textField_1.getText();


                        String q = "SELECT * FROM data1 ";

                        PreparedStatement st = con.prepareStatement(q);
                        ResultSet r = st.executeQuery();
                        int check =0;
                        while (r.next()){
                            if(name_1.equals(r.getString(1))&&no.equals(r.getString(2))) {
                                String password =r.getString(4);
                                JOptionPane.showMessageDialog(null,"Password:"+password);
                                LogInPage obj = new LogInPage();
                                obj.setVisible(true);
                                dispose();
                                check++;
                            }}
                        if(check ==0){
                            JOptionPane.showMessageDialog(null,"Wrong Name or Number");
                        }
                    } catch (SQLException ex) {
                        ex.printStackTrace();
                    }
                }catch(Exception ex) {

                }



            }
        });
        btnNewButton.setBounds(272, 221, 181, 45);
        panel.add(btnNewButton);

        JButton btnNewButton_1 = new JButton("RETURN");
        btnNewButton_1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                LogInPage obj = new LogInPage();
                obj.setVisible(true);
                dispose();
            }
        });
        btnNewButton_1.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 20));
        btnNewButton_1.setBounds(22, 302, 137, 39);
        panel.add(btnNewButton_1);

        JSeparator separator = new JSeparator();
        separator.setForeground(Color.WHITE);
        separator.setBounds(105, 54, 475, 39);
        panel.add(separator);
    }

}

