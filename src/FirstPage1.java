import  java.awt.*;
import  java.awt.event.*;
import  java.sql.*;
import  javax.swing.*;
import java.awt.EventQueue;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import  java.util.*;

public class FirstPage1 extends JFrame {

    private JPanel contentPane;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    FirstPage1 frame = new FirstPage1();
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
    public FirstPage1() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 703, 413);
        setResizable(false);
        setTitle("First Page");
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

        setContentPane(contentPane);
        contentPane.setLayout(null);

        JPanel panel = new JPanel();
        panel.setBackground(Color.BLACK);
        panel.setBounds(10, 11, 667, 352);
        contentPane.add(panel);
        panel.setLayout(null);

        JButton btnNewButton = new JButton("JOIN AS ADMIN");
        btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Admin obj = new Admin();
                obj.setVisible(true);
                dispose();
            }
        });
        btnNewButton.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 30));
        btnNewButton.setBounds(123, 96, 418, 60);
        panel.add(btnNewButton);

        JButton btnJoinAsUser = new JButton("JOIN AS USER");
        btnJoinAsUser.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                SecondPage obj = new SecondPage();
                obj.setVisible(true);
                dispose();
            }
        });
        btnJoinAsUser.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 30));
        btnJoinAsUser.setBounds(123, 180, 418, 60);
        panel.add(btnJoinAsUser);

        JSeparator separator = new JSeparator();
        separator.setBackground(Color.WHITE);
        separator.setForeground(Color.WHITE);
        separator.setBounds(103, 266, 460, 29);
        panel.add(separator);

        JSeparator separator_1 = new JSeparator();
        separator_1.setForeground(Color.WHITE);
        separator_1.setBounds(103, 52, 460, 29);
        panel.add(separator_1);
    }

}

