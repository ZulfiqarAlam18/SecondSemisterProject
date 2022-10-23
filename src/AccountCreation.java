import  java.awt.*;
import  java.awt.event.*;
import  java.sql.*;
import  javax.swing.*;
import java.awt.EventQueue;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import  java.util.*;



public class AccountCreation extends JFrame {

    private JPanel contentPane;
    private JTextField textField;
    private JTextField textField_1;
    private JTextField textField_2;
    private JTextField textField_3;
    private JTextField textField_4;
    private JTextField textField_5;
    private JTextField textField_6;
    private JTextField textField_7;

    private  JPasswordField pass;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    AccountCreation frame = new AccountCreation();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }
    public AccountCreation() {
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

        JLabel lblNewLabel = new JLabel("Enter First Name");
        lblNewLabel.setForeground(Color.WHITE);
        lblNewLabel.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 15));
        lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel.setBounds(157, 35, 161, 24);
        panel.add(lblNewLabel);

        JLabel lblEnterLastName = new JLabel("Enter Last Name");
        lblEnterLastName.setForeground(Color.WHITE);
        lblEnterLastName.setHorizontalAlignment(SwingConstants.CENTER);
        lblEnterLastName.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 15));
        lblEnterLastName.setBounds(157, 70, 161, 24);
        panel.add(lblEnterLastName);

        JLabel lblEnterPhoneNo = new JLabel("Enter Phone No:");
        lblEnterPhoneNo.setForeground(Color.WHITE);
        lblEnterPhoneNo.setHorizontalAlignment(SwingConstants.CENTER);
        lblEnterPhoneNo.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 15));
        lblEnterPhoneNo.setBounds(157, 104, 161, 24);
        panel.add(lblEnterPhoneNo);

        JLabel lblEnterUserEmail = new JLabel("Enter User Email");
        lblEnterUserEmail.setForeground(Color.WHITE);
        lblEnterUserEmail.setHorizontalAlignment(SwingConstants.CENTER);
        lblEnterUserEmail.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 15));
        lblEnterUserEmail.setBounds(157, 142, 161, 24);
        panel.add(lblEnterUserEmail);

        JLabel lblEnterNicNo = new JLabel("Enter NIC NO:");
        lblEnterNicNo.setForeground(Color.WHITE);
        lblEnterNicNo.setHorizontalAlignment(SwingConstants.CENTER);
        lblEnterNicNo.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 15));
        lblEnterNicNo.setBounds(167, 175, 161, 24);
        panel.add(lblEnterNicNo);

        JLabel lblDateOfBirth = new JLabel("Date Of Birth");
        lblDateOfBirth.setForeground(Color.WHITE);
        lblDateOfBirth.setHorizontalAlignment(SwingConstants.CENTER);
        lblDateOfBirth.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 15));
        lblDateOfBirth.setBounds(177, 214, 161, 24);
        panel.add(lblDateOfBirth);

        JLabel lblGender = new JLabel("Gender");
        lblGender.setForeground(Color.WHITE);
        lblGender.setHorizontalAlignment(SwingConstants.CENTER);
        lblGender.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 15));
        lblGender.setBounds(187, 251, 161, 24);
        panel.add(lblGender);

        JLabel lblNewLabel_7 = new JLabel("Create Password");
        lblNewLabel_7.setForeground(Color.WHITE);
        lblNewLabel_7.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_7.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 15));
        lblNewLabel_7.setBounds(167, 275, 161, 24);
        panel.add(lblNewLabel_7);

        textField = new JTextField();
        textField.setBounds(338, 39, 152, 20);
        panel.add(textField);
        textField.setColumns(10);

        textField_1 = new JTextField();
        textField_1.setBounds(338, 71, 152, 20);
        panel.add(textField_1);
        textField_1.setColumns(10);

        textField_2 = new JTextField();
        textField_2.setColumns(10);
        textField_2.setBounds(338, 108, 152, 20);
        panel.add(textField_2);

        textField_3 = new JTextField();
        textField_3.setColumns(10);
        textField_3.setBounds(338, 146, 152, 20);
        panel.add(textField_3);

        textField_4 = new JTextField();
        textField_4.setColumns(10);
        textField_4.setBounds(338, 179, 152, 20);
        panel.add(textField_4);

        textField_5 = new JTextField();
        textField_5.setColumns(10);
        textField_5.setBounds(338, 218, 152, 20);
        panel.add(textField_5);

        textField_6 = new JTextField();
        textField_6.setColumns(10);
        textField_6.setBounds(338, 255, 152, 20);
        panel.add(textField_6);

        pass = new JPasswordField();
        pass.setColumns(10);
        pass.setEchoChar('*');
        pass.setBounds(338, 279, 152, 20);
        panel.add(pass);


        JLabel lblNewLabel_1 = new JLabel("Account Creation");
        lblNewLabel_1.setForeground(Color.WHITE);
        lblNewLabel_1.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 25));
        lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_1.setBounds(85, 0, 509, 34);
        panel.add(lblNewLabel_1);

        JButton btnNewButton = new JButton("Submit");
        btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    String url = "jdbc:mysql://localhost:3306/OnWay";
                    String name = "root";
                    String pass_1 = "";
                    String firstName = textField.getText();
                    String mobNumber = textField_2.getText();
                    String email = textField_3.getText();
                    String password = pass.getText();

                    if (textField.getText().length() == 0 || textField_1.getText().length() == 0
                            || textField_2.getText().length() == 0 || textField_3.getText().length() == 0
                            || textField_4.getText().length() == 0 || textField_5.getText().length() == 0
                            || textField_6.getText().length() == 0 || pass.getText().length() == 0) {
                        JOptionPane.showMessageDialog(null, "Please Fill All fields");
                    } else {
                        if ((email.contains(".net") || email.equals(".org") || email.equals(".com") )   &&(email.equals("@"))) {
                            try (Connection con_1 = DriverManager.getConnection(url, name, pass_1)) {
                                String q = "Select * from data1";
                                PreparedStatement pt = con_1.prepareStatement(q);
                                ResultSet r = pt.executeQuery();
                                int check_1 = 0;
                                while (r.next()) {

                                    if (email.equals(r.getString(3))) {
                                        JOptionPane.showMessageDialog(null, "Account with this Email Already Exists");
                                        check_1++;
                                        break;
                                    }
                                }
                                if (check_1 == 0) {
                                    try (Connection con = DriverManager.getConnection(url, name, pass_1)) {
                                        //Data Insertion
                                        String query = "INSERT INTO data1 (fname,mobNo,email,pass) VALUES(?,?,?,?) ";
                                        PreparedStatement st = con.prepareStatement(query);
                                        st.setString(1, firstName);
                                        st.setString(2, mobNumber);
                                        st.setString(3, email);
                                        st.setString(4, password);
                                        int check = st.executeUpdate();
                                        if (check > 0) {
                                            JOptionPane.showMessageDialog(null, "Your Account is Created");
                                            LogInPage obj = new LogInPage();
                                            obj.setVisible(true);
                                            dispose();
                                        } else {
                                            JOptionPane.showMessageDialog(null, "Error!!! Try Again");
                                        }
                                    } catch (Exception ex) {
                                        JOptionPane.showMessageDialog(null, ex);
                                    }
                                }
                            } catch (Exception a) {
                                JOptionPane.showMessageDialog(null, a);
                            }
                        } else {
                            JOptionPane.showMessageDialog(null, "Wrong Email format");
                        }
                    }
                }catch (Exception i){
                    JOptionPane.showMessageDialog(null,i);
                }
                }});
        btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 20));
        btnNewButton.setBounds(258, 310, 136, 34);
        panel.add(btnNewButton);

        JButton btnNewButton_1 = new JButton("RETURN");
        btnNewButton_1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                SecondPage obj = new SecondPage();
                obj.setVisible(true);
                dispose();
            }
        });
        btnNewButton_1.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 20));
        btnNewButton_1.setBounds(10, 310, 141, 31);
        panel.add(btnNewButton_1);

        JSeparator separator = new JSeparator();
        separator.setForeground(Color.WHITE);
        separator.setBounds(152, 35, 380, -7);
        panel.add(separator);
    }

}
