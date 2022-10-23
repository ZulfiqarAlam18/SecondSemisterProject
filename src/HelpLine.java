import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.SystemColor;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JSeparator;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class HelpLine extends JFrame {

    private JPanel contentPane;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    HelpLine frame = new HelpLine();
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
    public HelpLine() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 703, 413);
        setResizable(false);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

        setContentPane(contentPane);
        contentPane.setLayout(null);

        JPanel panel = new JPanel();
        panel.setForeground(SystemColor.desktop);
        panel.setBackground(Color.BLACK);
        panel.setBounds(10, 11, 667, 352);
        contentPane.add(panel);
        panel.setLayout(null);

        JLabel lblNewLabel = new JLabel("HELP LINE");
        lblNewLabel.setForeground(SystemColor.text);
        lblNewLabel.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 30));
        lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel.setBounds(168, 26, 350, 37);
        panel.add(lblNewLabel);

        JComboBox comboBox = new JComboBox();
        comboBox.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 20));
        comboBox.addItem("03053079686");
        comboBox.addItem("03149807774");
        comboBox.addItem("03074312651");

        comboBox.setBounds(203, 109, 296, 37);
        panel.add(comboBox);

        JButton btnNewButton = new JButton("CALL");
        btnNewButton.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 20));
        btnNewButton.setBounds(203, 157, 144, 28);
        panel.add(btnNewButton);

        JButton btnMessage = new JButton("MESSAGE");
        btnMessage.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 20));
        btnMessage.setBounds(355, 157, 144, 28);
        panel.add(btnMessage);

        JButton btnReturn = new JButton("RETURN");
        btnReturn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                HomePage obj = new HomePage();
                obj.setVisible(true);
                dispose();
            }
        });
        btnReturn.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 20));
        btnReturn.setBounds(10, 304, 144, 37);
        panel.add(btnReturn);

        JSeparator separator = new JSeparator();
        separator.setBackground(SystemColor.text);
        separator.setForeground(SystemColor.text);
        separator.setBounds(168, 75, 357, 12);
        panel.add(separator);
    }
}

