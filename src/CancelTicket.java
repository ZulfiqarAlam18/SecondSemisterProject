import  java.awt.*;
import  java.awt.event.*;
import  java.sql.*;
import  javax.swing.*;
import java.awt.EventQueue;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import  java.util.*;


public class CancelTicket extends JFrame {
    private JPanel contentPane;
    String url = "jdbc:mysql://localhost:3306/OnWay";
    String name = "root";
    String pass = "";
    String  query;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    CancelTicket frame = new CancelTicket();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }


    public CancelTicket() {
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

        JLabel lblNewLabel = new JLabel("TICKET CANCELLATION");
        lblNewLabel.setForeground(Color.WHITE);
        lblNewLabel.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 30));
        lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel.setBounds(127, 11, 431, 38);
        panel.add(lblNewLabel);

        JSeparator separator = new JSeparator();
        separator.setBackground(SystemColor.menuText);
        separator.setForeground(SystemColor.controlText);
        separator.setBounds(152, 47, 431, 12);
        panel.add(separator);

        JComboBox comboBox_2 = new JComboBox();
        comboBox_2.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 20));
        comboBox_2.setBounds(167, 87, 345, 38);
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

        JLabel lblNewLabel_1 = new JLabel("COUCH NUMBER:");
        lblNewLabel_1.setForeground(Color.WHITE);
        lblNewLabel_1.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 15));
        lblNewLabel_1.setBounds(167, 60, 149, 27);
        panel.add(lblNewLabel_1);

        JLabel lblNewLabel_1_1 = new JLabel("NO.OF BOOKED TICKETS");
        lblNewLabel_1_1.setForeground(Color.WHITE);
        lblNewLabel_1_1.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 15));
        lblNewLabel_1_1.setBounds(167, 127, 281, 27);
        panel.add(lblNewLabel_1_1);

        JSpinner spinner = new JSpinner();
        spinner.setBounds(167, 151, 345, 38);
        panel.add(spinner);

        JButton btnNewButton = new JButton("CANCEL");
        btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                try{

                    try (Connection con = DriverManager.getConnection(url, name, pass)) {
                        String cNo =comboBox_2.getSelectedItem().toString();
                        query = "Select * from data2";
                        PreparedStatement  pt = con.prepareStatement(query);

                        ResultSet  r = pt.executeQuery();
                        int  check_1 =0;
                        int check_2;
                        while (r.next()){
                            if(cNo.equals(r.getString(6))){
                                String no_of_tickets =r.getString(5);
                                int no_of_ticket_1 =Integer.parseInt(r.getString(5));
                                String store = spinner.getValue().toString();
                                int no_of_ticket_2 =Integer.parseInt(store);


                                if(no_of_ticket_2>0){
                                    query ="Select * from data4";
                                    pt =con.prepareStatement(query);
                                    r =pt.executeQuery();
                                    int seats=0;
                                    while (r.next()){
                                        String store_1 =r.getString(2);
                                        seats =Integer.parseInt(store_1);

                                    }
                                    if(seats>=no_of_ticket_2){
                                        no_of_ticket_1  +=no_of_ticket_2;
                                        store =Integer.toString(no_of_ticket_1);

                                        String query_2 = "update data2 Set tot_no_seats='"+store+"' where couch_no =?";
                                        pt = con.prepareStatement(query_2);
                                        pt.setString(1,cNo);
                                        check_1++;
                                        check_2=    JOptionPane.showConfirmDialog(null,"Sure To Cancel Tickets???");
                                        if(check_2==0){
                                            pt.executeUpdate();
                                            JOptionPane.showMessageDialog(null,"Done....Tickets Are Canceled");
                                            HomePage obj = new HomePage();
                                            obj.setVisible(true);
                                            dispose();

                                        }
                                    }
                                    else {
                                        JOptionPane.showMessageDialog(null,"You Didn't Booked "+no_of_ticket_2+" Seats");
                                        check_1++;
                                    }

                                }
                                else {
                                    JOptionPane.showMessageDialog(null,"Error!!!");
                                    check_1++;
                                }

                            }
                        }
                        if(check_1==0){
                            JOptionPane.showMessageDialog(null,"Select a Right Couch Number");
                        }
                    } catch (SQLException ex) {
                        JOptionPane.showMessageDialog(null,ex);
                    }

                }catch (Exception exp){
                    JOptionPane.showMessageDialog(null,exp);
                }












            }});
        btnNewButton.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 20));
        btnNewButton.setBounds(273, 200, 136, 38);
        panel.add(btnNewButton);

        JButton btnReturn = new JButton("RETURN");
        btnReturn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                HomePage obj = new HomePage();
                obj.setVisible(true);
                dispose();
            }
        });
        btnReturn.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 20));
        btnReturn.setBounds(10, 303, 136, 38);
        panel.add(btnReturn);

        JSeparator separator_1 = new JSeparator();
        separator_1.setForeground(Color.WHITE);
        separator_1.setBackground(Color.WHITE);
        separator_1.setBounds(138, 54, 415, 22);
        panel.add(separator_1);
    }

}

