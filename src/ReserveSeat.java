import  java.awt.*;
import  java.awt.event.*;
import  java.sql.*;
import  javax.swing.*;
import java.awt.EventQueue;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
public class ReserveSeat extends JFrame {

    private JPanel contentPane;
    private JTable table;
    private DefaultTableModel model;
    private JButton btnBook;
    private  JComboBox comboBox_2;
    private JSpinner spinner;
    private  JLabel lblNoOfSeats;
    private JLabel lblCouchNumber;
    private  Object[] rows=new Object[6];
    String url = "jdbc:mysql://localhost:3306/OnWay";
    String name = "root";
    String pass = "";
    private  Object[] colomn = {"Couch Number","Travel From","Travel To","Departure Time","Price Of 1 Ticket","Vacant Seats"};
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    ReserveSeat frame = new ReserveSeat();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }
    public ReserveSeat() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 703, 413);
        setResizable(false);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

        setContentPane(contentPane);
        contentPane.setLayout(null);

        JPanel panel = new JPanel();
        panel.setForeground(Color.BLACK);
        panel.setBackground(Color.BLACK);
        panel.setBounds(10, 11, 667, 352);
        contentPane.add(panel);
        panel.setLayout(null);

        JComboBox comboBox = new JComboBox();
        comboBox.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 20));
        comboBox.setBounds(23, 60, 280, 25);
        comboBox.addItem("Karachi");
        comboBox.addItem("HyderBad");
        comboBox.addItem("Dadu");
        comboBox.addItem("Lahore");
        comboBox.addItem("Multan");
        comboBox.addItem("RawalPandi");
        panel.add(comboBox);

        JComboBox comboBox_1 = new JComboBox();
        comboBox_1.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 20));
        comboBox_1.setBounds(23, 106, 280, 25);
        comboBox_1.addItem("Karachi");
        comboBox_1.addItem("HyderBad");
        comboBox_1.addItem("Dadu");
        comboBox_1.addItem("Lahore");
        comboBox_1.addItem("Multan");
        comboBox_1.addItem("RawalPandi");
        panel.add(comboBox_1);

        JLabel lblNewLabel = new JLabel("TRAVEL FROM");
        lblNewLabel.setForeground(Color.WHITE);
        lblNewLabel.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 11));
        lblNewLabel.setBounds(28, 39, 142, 25);
        panel.add(lblNewLabel);

        JLabel lblTravellingTo = new JLabel("TRAVEL TO");
        lblTravellingTo.setForeground(Color.WHITE);
        lblTravellingTo.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 11));
        lblTravellingTo.setBounds(23, 81, 142, 25);
        panel.add(lblTravellingTo);

        JButton btnNewButton = new JButton("OKAY?");
        btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try{

                    String trv_from =comboBox.getSelectedItem().toString();
                    String trv_to =comboBox_1.getSelectedItem().toString();

                    if(trv_from.equals(trv_to)){

                        JOptionPane.showMessageDialog(null,"With In the City Service Not AvailAble");
                    }
                    else {
//                        String URL = "jdbc:mysql://localhost:3306/OnWay";
//                        String name = "root";
//                        String pass = "";
                        try (Connection con = DriverManager.getConnection(url, name, pass)) {

                            String q = "SELECT * FROM data2 ";
                            PreparedStatement st = con.prepareStatement(q);
                            ResultSet r = st.executeQuery();
                            int check =0;
                            while (r.next()){
                                if(trv_from.equals(r.getString(1))&& trv_to.equals(r.getString(2))){
                                    //Visibility of components
                                    lblCouchNumber.setVisible(true);
                                    lblNoOfSeats.setVisible(true);
                                    btnBook.setVisible(true);
                                    comboBox_2.setVisible(true);
                                    spinner.setVisible(true);


                                    rows[1] =r.getString(1);
                                    rows[2] =r.getString(2);
                                    rows[3] =r.getString(3);
                                    rows[4] =r.getString(4);
                                    rows[5] =r.getString(5);
                                    rows[0] =r.getString(6);
                                    model.addRow(rows);
                                    check++;
                                }}
                            if(check==0){
                                JOptionPane.showMessageDialog(null,"Currently No Couch AvailAble from "+trv_from+" to "+trv_to );
                            }
                        }

                        catch (SQLException ex) {
                            ex.printStackTrace();
                        }}
                }catch (Exception exp){
                    exp.printStackTrace();
                }}});
        btnNewButton.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 15));
        btnNewButton.setBounds(97, 133, 102, 35);
        panel.add(btnNewButton);

        JLabel lblSeatReservation = new JLabel("SEAT RESERVATION");
        lblSeatReservation.setForeground(Color.WHITE);
        lblSeatReservation.setHorizontalAlignment(SwingConstants.CENTER);
        lblSeatReservation.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 20));
        lblSeatReservation.setBounds(148, 0, 370, 35);
        panel.add(lblSeatReservation);

        JButton btnNewButton_1 = new JButton("RETURN");
        btnNewButton_1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                HomePage obj = new HomePage();
                obj.setVisible(true);
                dispose();
            }
        });
        btnNewButton_1.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 15));
        btnNewButton_1.setBounds(10, 327, 110, 25);
        panel.add(btnNewButton_1);

        JSeparator separator = new JSeparator();
        separator.setForeground(Color.WHITE);
        separator.setBounds(108, 30, 475, 16);
        panel.add(separator);

        JSeparator separator_1 = new JSeparator();
        separator_1.setForeground(Color.WHITE);
        separator_1.setBounds(10, 168, 634, 16);
        panel.add(separator_1);

        comboBox_2 = new JComboBox();
        comboBox_2.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 20));
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
        comboBox_2.setVisible(false);
        comboBox_2.setBounds(343, 60, 280, 25);
        panel.add(comboBox_2);

        spinner = new JSpinner();
        spinner.setBounds(345, 106, 278, 25);
        panel.add(spinner);
        spinner.setVisible(false);

        lblCouchNumber = new JLabel("Couch Number");
        lblCouchNumber.setForeground(Color.WHITE);
        lblCouchNumber.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 11));
        lblCouchNumber.setBounds(341, 39, 142, 25);
        panel.add(lblCouchNumber);
        lblCouchNumber.setVisible(false);

        lblNoOfSeats = new JLabel("No of Seats");
        lblNoOfSeats.setForeground(Color.WHITE);
        lblNoOfSeats.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 11));
        lblNoOfSeats.setBounds(343, 86, 142, 25);
        panel.add(lblNoOfSeats);
        lblNoOfSeats.setVisible(false);

        btnBook = new JButton("Book");
        btnBook.setVisible(false);
        btnBook.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String store = spinner.getValue().toString();
                String store_1 = spinner.getValue().toString();
                try{

                    try (Connection con = DriverManager.getConnection(url, name, pass)) {
                        String cNo =comboBox_2.getSelectedItem().toString();
                       String  query_1 = "Select * from data2";
                       PreparedStatement  pt = con.prepareStatement(query_1);

                       ResultSet  r = pt.executeQuery();
                       int  check_1 =0;
                       int check_2;
                        while (r.next()){
                            if(cNo.equals(r.getString(6))){
                                String no_of_tickets =r.getString(5);
                                int no_of_ticket_1 =Integer.parseInt(r.getString(5));
                                int no_of_ticket_2 =Integer.parseInt(store);
                                if(no_of_ticket_2>0){
                                    if(no_of_ticket_1>no_of_ticket_2){
                                        no_of_ticket_1  -=no_of_ticket_2;
                                        store =Integer.toString(no_of_ticket_1);

                                        String query_2 = "update data2 Set tot_no_seats='"+store+"' where couch_no =?";
                                        pt = con.prepareStatement(query_2);
                                        pt.setString(1,cNo);

                                        check_1++;
                                        check_2=    JOptionPane.showConfirmDialog(null,"Sure To Book Seats???");
                                        if(check_2==0) {
                                            pt.executeUpdate();
                                            try (Connection con_1 = DriverManager.getConnection(url, name, pass)) {


                                                query_2 = "update data4 Set seats='"+store_1+"' where name ='Zulfi'";
                                             PreparedStatement    p = con.prepareStatement(query_2);
                                                //p.setString(1,"Zulfi");
                                                p.executeUpdate();
                                                JOptionPane.showMessageDialog(null,"Seats Booked......");






                                            }
                                         catch (SQLException s){
                                             JOptionPane.showMessageDialog(null,s);
                                         }

                          }
                                }
                                    else {
                                        JOptionPane.showMessageDialog(null,"Error!!!Not Enough Seats");
                                        check_1++;
                                    }}
                                else {
                                    JOptionPane.showMessageDialog(null,"Error!!!");
                                    check_1++;
                                }}}
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
        btnBook.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 15));
        btnBook.setBounds(436, 133, 102, 35);
        panel.add(btnBook);

        JScrollPane scrollPane = new JScrollPane();
        scrollPane.setBounds(10, 179, 647, 148);
        panel.add(scrollPane);

        table = new JTable();
        table.setBackground(Color.LIGHT_GRAY);
        model =  new DefaultTableModel();
        //colomn = {"Couch Number","Travelling From","Travelling To","Departure Time","Price Of 1 Ticket","Vacant Seats"};
        rows =new Object[6];
        model.setColumnIdentifiers(colomn);
        table.setModel(model);
        scrollPane.setViewportView(table);
    }


    int storeValue(){
             String store = spinner.getValue().toString();
             int no_of_ticket_2 =Integer.parseInt(store);
             return no_of_ticket_2;
    }

    public ReserveSeat(int a){

    }
}



