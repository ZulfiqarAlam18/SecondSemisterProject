import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.SystemColor;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class SecondPage extends JFrame {

    private JPanel contentPane;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    SecondPage frame = new SecondPage();
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
    public SecondPage() {
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

        JButton btnNewButton = new JButton("Log In");
        btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                LogInPage obj = new LogInPage();
                obj.setVisible(true);
                dispose();
            }
        });
        btnNewButton.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 30));
        btnNewButton.setBounds(132, 75, 392, 55);
        panel.add(btnNewButton);

        JButton btnCreateAccount = new JButton("Create Account");
        btnCreateAccount.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                AccountCreation obj = new AccountCreation();
                obj.setVisible(true);
                dispose();
            }
        });
        btnCreateAccount.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 30));
        btnCreateAccount.setBounds(132, 169, 392, 55);
        panel.add(btnCreateAccount);

        JButton btnNewButton_1 = new JButton("RETURN");
        btnNewButton_1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                FirstPage1 obj = new FirstPage1();
                obj.setVisible(true);
                dispose();
            }
        });
        btnNewButton_1.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 20));
        btnNewButton_1.setBounds(10, 296, 140, 45);
        panel.add(btnNewButton_1);
    }

}

