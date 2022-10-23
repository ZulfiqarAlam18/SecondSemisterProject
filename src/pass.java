import java.awt.EventQueue;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.Font;
        import java.awt.event.ActionListener;
        import java.awt.event.ActionEvent;

public class pass extends JFrame {

    private JPanel contentPane;
    private JPasswordField passwordField;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    pass frame = new pass();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Create the frame.
     */
    public pass() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 450, 300);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

        setContentPane(contentPane);
        contentPane.setLayout(null);

        JLabel lblNewLabel = new JLabel("Enter Password");
        lblNewLabel.setBounds(55, 61, 94, 26);
        contentPane.add(lblNewLabel);

        passwordField = new JPasswordField();
        passwordField.setBounds(171, 64, 138, 23);
        contentPane.add(passwordField);

        JCheckBox jCheckBox = new JCheckBox("Show Password");
        jCheckBox.setBounds(150,150,150,150);
        System.out.println(jCheckBox.isSelected());
      //  jCheckBox.ac
        if(jCheckBox.isSelected()){
            passwordField.setEchoChar((char)0 );
        }



        contentPane.add(jCheckBox);
        JButton btnNewButton = new JButton("Okay");
        btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String pass =passwordField.getText();

                char[] p = passwordField.getPassword();
                String s =new String(p);
                System.out.println(p);
                passwordField.setEchoChar('*');







            }
        });
        btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 20));
        btnNewButton.setBounds(89, 98, 138, 52);
        contentPane.add(btnNewButton);
    }
}

