import  java.awt.*;
import  java.awt.event.*;
import  java.sql.*;
import  javax.swing.*;
import java.awt.EventQueue;
import javax.swing.border.EmptyBorder;

public class AddSavariPage extends JFrame {

    private JPanel contentPane;
    private JTextField textField;
    private JTextField textField_1;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    AddSavariPage frame = new AddSavariPage();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public AddSavariPage() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 703, 413);
        setResizable(false);
        setTitle("Add Savari Page");
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

        setContentPane(contentPane);
        contentPane.setLayout(null);

        JPanel panel = new JPanel();
        panel.setBackground(Color.BLACK);
        panel.setBounds(10, 11, 667, 352);
        contentPane.add(panel);
        panel.setLayout(null);

        JComboBox comboBox = new JComboBox();
        comboBox.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 20));
        comboBox.setBounds(111, 35, 391, 31);
        comboBox.addItem("Karachi");
        comboBox.addItem("HyderBad");
        comboBox.addItem("Dadu");
        comboBox.addItem("Lahore");
        comboBox.addItem("Multan");
        comboBox.addItem("RawalPandi");
        panel.add(comboBox);

        JComboBox comboBox_1 = new JComboBox();
        comboBox_1.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 20));
        comboBox_1.setBounds(111, 89, 391, 31);
        comboBox_1.addItem("Karachi");
        comboBox_1.addItem("HyderBad");
        comboBox_1.addItem("Dadu");
        comboBox_1.addItem("Lahore");
        comboBox_1.addItem("Multan");
        comboBox_1.addItem("RawalPandi");
        panel.add(comboBox_1);

        JComboBox comboBox_2 = new JComboBox();
        comboBox_2.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 20));
        comboBox_2.setBounds(111, 143, 391, 31);
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

        JComboBox comboBox_3 = new JComboBox();
        comboBox_3.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 20));
        comboBox_3.addItem("12 AM");
        comboBox_3.addItem("3 AM");
        comboBox_3.addItem("6 AM");
        comboBox_3.addItem("9 AM");
        comboBox_3.addItem("12 PM");
        comboBox_3.addItem("3 PM");
        comboBox_3.addItem("6 PM");
        comboBox_3.addItem("9 PM");
        comboBox_3.setBounds(111, 199, 391, 31);
        panel.add(comboBox_3);

        JLabel lblNewLabel = new JLabel("Travel From");
        lblNewLabel.setForeground(Color.WHITE);
        lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 11));
        lblNewLabel.setBounds(111, 11, 123, 31);
        panel.add(lblNewLabel);

        JLabel lblTravellingTo = new JLabel("To");
        lblTravellingTo.setForeground(Color.WHITE);
        lblTravellingTo.setFont(new Font("Tahoma", Font.BOLD, 11));
        lblTravellingTo.setBounds(111, 65, 123, 31);
        panel.add(lblTravellingTo);

        JLabel lblCouchNumber = new JLabel("Couch Number");
        lblCouchNumber.setForeground(Color.WHITE);
        lblCouchNumber.setFont(new Font("Tahoma", Font.BOLD, 11));
        lblCouchNumber.setBounds(111, 120, 123, 31);
        panel.add(lblCouchNumber);

        JLabel lblDepartureTime = new JLabel("Departure Time");
        lblDepartureTime.setForeground(Color.WHITE);
        lblDepartureTime.setFont(new Font("Tahoma", Font.BOLD, 11));
        lblDepartureTime.setBounds(111, 173, 123, 31);
        panel.add(lblDepartureTime);

        JLabel lblNewLabel_1 = new JLabel("Vacant Seats:");
        lblNewLabel_1.setForeground(Color.WHITE);
        lblNewLabel_1.setFont(new Font("Rockwell Extra Bold", Font.BOLD, 20));
        lblNewLabel_1.setBounds(111, 241, 168, 31);
        panel.add(lblNewLabel_1);

        JLabel lblNewLabel_1_1 = new JLabel("Rs: of 1 Ticket");
        lblNewLabel_1_1.setForeground(Color.WHITE);
        lblNewLabel_1_1.setFont(new Font("Rockwell Extra Bold", Font.BOLD, 20));
        lblNewLabel_1_1.setBounds(111, 280, 180, 31);
        panel.add(lblNewLabel_1_1);

        textField = new JTextField();
        textField.setBounds(320, 241, 182, 31);
        panel.add(textField);
        textField.setColumns(10);

        textField_1 = new JTextField();
        textField_1.setColumns(10);
        textField_1.setBounds(320, 283, 182, 31);
        panel.add(textField_1);

        JButton btnNewButton = new JButton("Save Info?");
        btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {   //Mysql Connectivity
                    String url = "jdbc:mysql://localhost:3306/OnWay";
                    String name = "root";
                    String pass = "";

                    //Data Insertion
                    String trvFrom=comboBox.getSelectedItem().toString();

                    String trvTo=comboBox_1.getSelectedItem().toString();
                    System.out.println(trvTo);
                    String time=comboBox_3.getSelectedItem().toString();
                    String tot_no_seats =textField.getText();
                    String price =textField_1.getText();
                    String cNo =comboBox_2.getSelectedItem().toString();


                    try(Connection con = DriverManager.getConnection(url, name, pass)){

                        if(trvFrom.length()==0 || trvTo.length()==0 || time.length()==0 || cNo.length() ==0 ||price.length()==0 ||tot_no_seats.length()==0){
                            JOptionPane.showMessageDialog(null,"Please Put Complete Information");

                        }
                        else{

                            if(trvFrom.equals(trvTo)){
                                JOptionPane.showMessageDialog(null,"WithIn The City, Service is Not AvailAble");
                            }
                            else {
                                String  query_1 = "Select * from data2";
                                PreparedStatement  pt = con.prepareStatement(query_1);

                                ResultSet  r = pt.executeQuery();
                                int  check =0;
                                int check_1=0;

                                while (r.next()){
                                    if(cNo.equals(r.getString(6))){
                                        JOptionPane.showMessageDialog(null, "Ths Number "+cNo+ " is Taken Already");
                                        check++;

                                    }
                                }
                                if(check==0){
                                    String query = "INSERT INTO data2(t_from,t_to,time,price,tot_no_seats,couch_no) VALUES(?,?,?,?,?,?) ";
                                    System.out.println("Query Executed");
                                    PreparedStatement st = con.prepareStatement(query);
                                    st.setString(1, trvFrom);
                                    st.setString(2,  trvTo);
                                    st.setString(3, time);
                                    st.setString(4, price);
                                    st.setString(5, tot_no_seats);
                                    st.setString(6, cNo);
                                    check_1 = st.executeUpdate();
                                    if (check_1 > 0) {
                                        JOptionPane.showMessageDialog(null, "Data Added Successfully");
                                    }
                                    else {
                                        JOptionPane.showMessageDialog(null,"Error!!! Try Again");
                                    }
                                }
                            }}
                    }
                    catch (Exception exp){
                        JOptionPane.showMessageDialog(null,exp);
                    }}catch(Exception ex) {
                    JOptionPane.showMessageDialog(null,ex);}
            }});
        btnNewButton.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 20));
        btnNewButton.setBounds(193, 322, 219, 23);
        panel.add(btnNewButton);

        JButton btnReturn = new JButton("RETURN");
        btnReturn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Admin obj = new Admin();
                obj.setVisible(true);
                dispose();
            }
        });
        btnReturn.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 15));
        btnReturn.setBounds(10, 318, 123, 23);
        panel.add(btnReturn);
    }

}
