import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.SystemColor;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.*;

public class Admin extends JFrame {

    private JPanel contentPane;
    private JTextField textField;
    private  JPasswordField pass;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Admin frame = new Admin();
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
    public Admin() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 703, 413);
        setResizable(false);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        JFrame obj = new JFrame();



        setContentPane(contentPane);
        contentPane.setLayout(null);

        JPanel panel = new JPanel();
        panel.setBackground(SystemColor.activeCaptionText);
        panel.setBounds(10, 11, 667, 352);
        contentPane.add(panel);
        panel.setLayout(null);

        JButton btnNewButton = new JButton("Add Savari");
        btnNewButton.setBackground(SystemColor.inactiveCaption);
        btnNewButton.setForeground(SystemColor.menuText);
        btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                AddSavariPage obj = new AddSavariPage();
                obj.setVisible(true);
                dispose();
            }
        });
        btnNewButton.setFocusable(false);
        btnNewButton.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 30));
        btnNewButton.setBounds(134, 101, 385, 50);
        btnNewButton.setVisible(false);
        panel.add(btnNewButton);

        JButton btnDeleteSavari = new JButton("Delete Savari");
        btnDeleteSavari.setForeground(SystemColor.textText);
        btnDeleteSavari.setVisible(false);
        btnDeleteSavari.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Delete obj = new Delete();
                obj.setVisible(true);
                dispose();

            }
        });
        btnDeleteSavari.setFocusable(false);
        btnDeleteSavari.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 30));
        btnDeleteSavari.setBounds(134, 162, 385, 50);
        panel.add(btnDeleteSavari);

        JLabel lblNewLabel = new JLabel("Enter Admin id Password");
        lblNewLabel.setForeground(SystemColor.textHighlightText);
        lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel.setBounds(138, 36, 145, 26);
        panel.add(lblNewLabel);

        pass = new JPasswordField();
        pass.setBounds(134, 58, 324, 32);
        panel.add(pass);
        pass.setEchoChar('*');
        pass.setColumns(10);


        JButton btnNewButton_1 = new JButton("OK");
        btnNewButton_1.setForeground(SystemColor.menuText);
        btnNewButton_1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
               // String pass = textField.getText();
                if(pass.getText().equals("admin")) {

                    btnDeleteSavari.setVisible(true);
                    btnNewButton.setVisible(true);
                    lblNewLabel.setVisible(false);
                    btnNewButton_1.setVisible(false);
                    pass.setVisible(false);



                }
                else {
                    JOptionPane.showMessageDialog(null,"Wrong Password");

                }
            }
        });
        btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
        btnNewButton_1.setBounds(468, 58, 58, 32);
        panel.add(btnNewButton_1);

        JButton btnNewButton_2 = new JButton("RETURN");
        btnNewButton_2.setForeground(SystemColor.menuText);
        btnNewButton_2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                FirstPage1 obj = new FirstPage1();
                obj.setVisible(true);
                dispose();
            }
        });
        btnNewButton_2.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 15));
        btnNewButton_2.setBounds(10, 304, 127, 37);
        panel.add(btnNewButton_2);
    }

}

