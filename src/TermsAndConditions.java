import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.SystemColor;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.JSeparator;

public class TermsAndConditions extends JFrame {

    private JPanel contentPane;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    TermsAndConditions frame = new TermsAndConditions();
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
    public TermsAndConditions() {
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

        JLabel lblNewLabel = new JLabel("TERMS AND CONDITIONS");
        lblNewLabel.setForeground(Color.WHITE);
        lblNewLabel.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 30));
        lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel.setBounds(106, 26, 453, 37);
        panel.add(lblNewLabel);

        JLabel lblNewLabel_1 = new JLabel("=>TICKETS CAN ONLY BE CANCELED WITHIN 10 MINTS");
        lblNewLabel_1.setForeground(Color.WHITE);
        lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_1.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 15));
        lblNewLabel_1.setBounds(10, 84, 473, 47);
        panel.add(lblNewLabel_1);

        JLabel lblNewLabel_1_1 = new JLabel("=>IF NOT THAN USER HAS TO PAY 10% OF PRICE OF 1 TICKET\r\n");
        lblNewLabel_1_1.setForeground(Color.WHITE);
        lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_1_1.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 15));
        lblNewLabel_1_1.setBounds(-56, 120, 657, 47);
        panel.add(lblNewLabel_1_1);

        JLabel lblNewLabel_1_2 = new JLabel("=>PRICE SHULD BE PAID WITHIN 30 MINTS ELSE USER WILL BE FINED 10%");
        lblNewLabel_1_2.setForeground(Color.WHITE);
        lblNewLabel_1_2.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_1_2.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 15));
        lblNewLabel_1_2.setBounds(10, 153, 647, 47);
        panel.add(lblNewLabel_1_2);

        JLabel lblNewLabel_1_3 = new JLabel("=>IN CASE OF COMPLETE ABSENCE 50% OF PRICE WILL BE RETURNED");
        lblNewLabel_1_3.setForeground(Color.WHITE);
        lblNewLabel_1_3.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_1_3.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 15));
        lblNewLabel_1_3.setBounds(0, 191, 624, 47);
        panel.add(lblNewLabel_1_3);

        JLabel lblNewLabel_1_4 = new JLabel("=>ANY TYPE OF MISBEHAIVIOUR OR UNCAUSAL LATE CAN BE REPORT IN COMPALIN BOX");
        lblNewLabel_1_4.setForeground(Color.WHITE);
        lblNewLabel_1_4.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_1_4.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 12));
        lblNewLabel_1_4.setBounds(10, 224, 618, 47);
        panel.add(lblNewLabel_1_4);

        JLabel lblNewLabel_1_3_1 = new JLabel("=>ANY SUGGESTIONS REGARDING OUR SERVICE WILL BE HIGHLY APPRECIATED");
        lblNewLabel_1_3_1.setForeground(Color.WHITE);
        lblNewLabel_1_3_1.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_1_3_1.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 13));
        lblNewLabel_1_3_1.setBounds(0, 259, 624, 47);
        panel.add(lblNewLabel_1_3_1);

        JButton btnNewButton = new JButton("RETURN");
        btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                HomePage obj = new HomePage();
                obj.setVisible(true);
                dispose();
            }
        });
        btnNewButton.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 20));
        btnNewButton.setBounds(10, 302, 146, 39);
        panel.add(btnNewButton);

        JSeparator separator = new JSeparator();
        separator.setForeground(Color.WHITE);
        separator.setBounds(85, 63, 493, 15);
        panel.add(separator);
    }

}

