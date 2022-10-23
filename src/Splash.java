import  javax.swing.*;
import  java.awt.*;
import javax.swing.border.EmptyBorder;


public class Splash extends JFrame implements Runnable {

    JPanel contentPane;
    static JProgressBar progressBar;
    static JLabel l3;

    public Splash() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 703, 413);
        setResizable(false);

        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

        setContentPane(contentPane);
        contentPane.setLayout(null);

        JPanel panel = new JPanel();
        panel.setBackground(Color.BLACK);
        panel.setBounds(0, 0, 687, 374);
        contentPane.add(panel);
        panel.setLayout(null);

        progressBar = new JProgressBar();
        progressBar.setBackground(Color.GRAY);
        progressBar.setForeground(Color.WHITE);
        progressBar.setBounds(10, 335, 667, 28);
        panel.add(progressBar);

        ImageIcon icon = new ImageIcon("p.png");




        JLabel l1 = new JLabel("");
        l1.setForeground(Color.BLACK);
        l1.setBackground(Color.BLACK);
        l1.setIcon(icon);
        l1.setBounds(104, 59, 480, 244);
        panel.add(l1);

        l3 = new JLabel("0 %");
        l3.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 15));
        l3.setForeground(Color.WHITE);
        l3.setBounds(635, 296, 42, 28);
        panel.add(l3);

        JLabel l2 = new JLabel("Loading.....");
        l2.setForeground(Color.WHITE);
        l2.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 11));
        l2.setBounds(10, 296, 84, 28);
        panel.add(l2);

        JLabel lblNewLabel = new JLabel("Welcome To The OnWay Bus Service");
        lblNewLabel.setForeground(Color.WHITE);
        lblNewLabel.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 25));
        lblNewLabel.setBounds(76, 20, 535, 28);
        panel.add(lblNewLabel);
    }

    @Override
    public void run() {
        try {
            Splash frame = new Splash();
            frame.setVisible(true);
            for(int i =0;i<=100;i++){
                try{
                    Splash.progressBar.setValue(i);
                    l3.setText(Integer.toString(i)+" %");
                    Thread.sleep(60);
                    if(i==100){
                        FirstPage1 firstPage1 = new FirstPage1();
                        firstPage1.setVisible(true);
                        frame.dispose();}}
                catch (Exception e){
                }}
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
class DemoClass {
    public static void main(String[] args) {
        Splash splash =new Splash();
        Thread thread = new Thread(splash);

        thread.start();
    }


}