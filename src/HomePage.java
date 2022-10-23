import  java.awt.*;
import  java.awt.event.*;
import  java.sql.*;
import  javax.swing.*;
import java.awt.EventQueue;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import  java.util.*;
import java.awt.EventQueue;



public class HomePage extends JFrame {

    private JPanel contentPane;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    HomePage frame = new HomePage();
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
    public HomePage() {
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

        JButton btnNewButton = new JButton("RESERVE SEAT");
        btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                ReserveSeat obj = new ReserveSeat();
                obj.setVisible(true);
                dispose();
            }
        });
        btnNewButton.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 30));
        btnNewButton.setBounds(140, 11, 411, 43);
        panel.add(btnNewButton);

        JButton btnHelpLine = new JButton("HELP LINE");
        btnHelpLine.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                HelpLine obj = new HelpLine();
                obj.setVisible(true);
                dispose();
            }
        });
        btnHelpLine.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 30));
        btnHelpLine.setBounds(140, 136, 411, 43);
        panel.add(btnHelpLine);

        JButton btnCompainBox = new JButton("COMPAIN BOX");
        btnCompainBox.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                ComplainBox obj = new ComplainBox();
                obj.setVisible(true);
                dispose();
            }
        });
        btnCompainBox.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 30));
        btnCompainBox.setBounds(140, 190, 411, 43);
        panel.add(btnCompainBox);

        JButton btnTermsconditions = new JButton("TERMS&CONDITIONS");
        btnTermsconditions.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                TermsAndConditions obj = new TermsAndConditions();
                obj.setVisible(true);
                dispose();
            }
        });
        btnTermsconditions.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 30));
        btnTermsconditions.setBounds(140, 244, 411, 43);
        panel.add(btnTermsconditions);

        JButton btnNewButton_3_1 = new JButton("ABOUT US");
        btnNewButton_3_1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                AboutUs obj = new AboutUs();
                obj.setVisible(true);
                dispose();
            }
        });
        btnNewButton_3_1.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 30));
        btnNewButton_3_1.setBounds(140, 298, 411, 43);
        panel.add(btnNewButton_3_1);

        JButton btnCancelTicket = new JButton("CANCEL TICKET");
        btnCancelTicket.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                CancelTicket obj = new CancelTicket();
                obj.setVisible(true);
                dispose();
            }
        });
        btnCancelTicket.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 30));
        btnCancelTicket.setBounds(140, 75, 411, 43);
        panel.add(btnCancelTicket);

        JButton btnNewButton_1 = new JButton("RETURN");
        btnNewButton_1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                FirstPage1 obj = new FirstPage1();
                obj.setVisible(true);
                dispose();

            }
        });
        btnNewButton_1.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 15));
        btnNewButton_1.setBounds(10, 298, 107, 43);
        panel.add(btnNewButton_1);
    }

}

