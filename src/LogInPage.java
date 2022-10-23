import  java.awt.*;
import  java.awt.event.*;
import  java.sql.*;
import  javax.swing.*;
import java.awt.EventQueue;
import javax.swing.border.EmptyBorder;

public class LogInPage extends JFrame {

    private JPanel contentPane;
    private JTextField text1;
    private JTextField text2;
    private  JPasswordField pass_1;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    LogInPage frame = new LogInPage();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }
    public LogInPage() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 703, 413);
        setResizable(false);
        setTitle("Log In Page");
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

        setContentPane(contentPane);
        contentPane.setLayout(null);

        JPanel panel = new JPanel();
        panel.setBackground(Color.BLACK);
        panel.setBounds(10, 11, 667, 352);
        contentPane.add(panel);
        panel.setLayout(null);

        JLabel lblNewLabel = new JLabel("Enter User Email:");
        lblNewLabel.setForeground(Color.WHITE);
        lblNewLabel.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 30));
        lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel.setBounds(52, 54, 327, 50);
        panel.add(lblNewLabel);

        JButton btnNewButton = new JButton("LogIn");
        btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    String url = "jdbc:mysql://localhost:3306/OnWay";
                    String name = "root";
                    String pass = "";

                    try (Connection con = DriverManager.getConnection(url,name,pass)) {
                        String email =text1.getText();
                       // String password =text2.getText();
                        String password =pass_1.getText();




                        String q = "SELECT * FROM data1 ";

                        PreparedStatement st = con.prepareStatement(q);
                        ResultSet r = st.executeQuery();
                        int check =0;
                        while (r.next()){
                            if(email.equals(r.getString(3))&&password.equals(r.getString(4))) {
                                HomePage obj = new HomePage();
                                obj.setVisible(true);
                                dispose();
                                check++;
                            }}
                        if(check ==0){
                            JOptionPane.showMessageDialog(null,"Wrong Email or Password");
                        }
                    } catch (SQLException ex) {
                        ex.printStackTrace();
                    }
                }catch(Exception ex) {

                }



            }
        });
        btnNewButton.setFocusable(false);
        btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 30));
        btnNewButton.setBounds(245, 174, 127, 50);
        panel.add(btnNewButton);

        text1 = new JTextField();
        text1.setBounds(386, 67, 201, 39);
        panel.add(text1);
        text1.setColumns(10);

        JLabel lblEnterUserPassword = new JLabel("Enter  Password:");
        lblEnterUserPassword.setForeground(Color.WHITE);
        lblEnterUserPassword.setHorizontalAlignment(SwingConstants.CENTER);
        lblEnterUserPassword.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 30));
        lblEnterUserPassword.setBounds(52, 113, 337, 50);
        panel.add(lblEnterUserPassword);


        pass_1 = new JPasswordField();
        pass_1.setEchoChar('*');
        pass_1.setBounds(386, 126, 199, 39);
        panel.add(pass_1);

        JButton btnForgotPassword = new JButton("forgot  Password");
        btnForgotPassword.setFocusable(false);
        btnForgotPassword.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                ForgotPassword obj = new ForgotPassword();
                obj.setVisible(true);
                dispose();
            }
        });
        btnForgotPassword.setBounds(454, 164, 133, 23);
        panel.add(btnForgotPassword);

        JButton btnNewButton_1 = new JButton("RETURN");
        btnNewButton_1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                SecondPage obj = new SecondPage();
                obj.setVisible(true);
                dispose();
            }
        });
        btnNewButton_1.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 20));
        btnNewButton_1.setBounds(10, 308, 145, 33);
        panel.add(btnNewButton_1);
    }
}
