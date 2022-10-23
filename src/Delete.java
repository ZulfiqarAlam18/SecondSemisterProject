import  java.awt.*;
import  java.awt.event.*;
import  java.sql.*;
import  javax.swing.*;
import java.awt.EventQueue;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import  java.util.*;


public class Delete extends JFrame {

    private JPanel contentPane;


    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Delete frame = new Delete();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }
    public Delete() {
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

        JLabel lblNewLabel = new JLabel("Couch Number:");
        lblNewLabel.setForeground(SystemColor.text);
        lblNewLabel.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 11));
        lblNewLabel.setBounds(175, 106, 120, 25);
        panel.add(lblNewLabel);

        JComboBox comboBox_2 = new JComboBox();
        comboBox_2.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 20));
        comboBox_2.setBounds(175, 130, 324, 40);
        comboBox_2.addItem("KL01");
        comboBox_2.addItem("KL02");
        comboBox_2.addItem("KL03");
        comboBox_2.addItem("KL04");
        comboBox_2.addItem("KH01");
        comboBox_2.addItem("KH02");
        comboBox_2.addItem("KH03");
        comboBox_2.addItem("KH04");
        comboBox_2.addItem("KD01");
        comboBox_2.addItem("KD02");
        comboBox_2.addItem("KD03");
        comboBox_2.addItem("KD04");
        comboBox_2.addItem("KR01");
        comboBox_2.addItem("KR02");
        comboBox_2.addItem("KR03");
        comboBox_2.addItem("KR04");
        comboBox_2.addItem("KM01");
        comboBox_2.addItem("KM02");
        comboBox_2.addItem("KM03");
        comboBox_2.addItem("KM04");
        panel.add(comboBox_2);

        JLabel lblDeleteSavari = new JLabel("SAVARI DELETION");
        lblDeleteSavari.setForeground(SystemColor.textHighlightText);
        lblDeleteSavari.setHorizontalAlignment(SwingConstants.CENTER);
        lblDeleteSavari.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 30));
        lblDeleteSavari.setBounds(118, 0, 420, 54);
        panel.add(lblDeleteSavari);

        JButton btnNewButton = new JButton("DELETE");
        btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try{
                    String url ="jdbc:mysql://localhost:3306/OnWay";
                    String user_name="root";
                    String password ="";
                    String cNum =comboBox_2.getSelectedItem().toString();

                    try( Connection con =DriverManager.getConnection(url,user_name,password)){
                       String q ="Delete from data2 where couch_no=?";
                       PreparedStatement pt = con.prepareStatement(q);
                       pt.setString(1   ,comboBox_2.getSelectedItem().toString());
                       int check =pt.executeUpdate();
                       if(check>0){
                           JOptionPane.showMessageDialog(null,"Data Deleted");
                       }
                       else {
                           JOptionPane.showMessageDialog(null,"No Data Found");
                       }




                    }




                    catch(Exception ex){
                        ex.printStackTrace();
                    }

                }
                catch (Exception exp){
                    exp.printStackTrace();
                }


            }
        });
        btnNewButton.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 15));
        btnNewButton.setBounds(279, 181, 113, 23);
        panel.add(btnNewButton);

        JButton btnNewButton_1 = new JButton("RETURN");
        btnNewButton_1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Admin obj = new Admin();
                obj.setVisible(true);
                dispose();
            }
        });
        btnNewButton_1.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 20));
        btnNewButton_1.setBounds(10, 301, 141, 40);
        panel.add(btnNewButton_1);

        JSeparator separator = new JSeparator();
        separator.setBackground(SystemColor.text);
        separator.setForeground(SystemColor.text);
        separator.setBounds(161, 44, 348, 17);
        panel.add(separator);
    }

}
