import  javax.swing.*;
import  java.awt.*;
import java.awt.event.*;
import javax.swing.border.EmptyBorder;


public class ComplainBox extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private  JTextArea textArea;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ComplainBox frame = new ComplainBox();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public ComplainBox() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 703,413);
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
		
		JLabel lblNewLabel = new JLabel("EXPLAIN YOUR ISSUE HERE:");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 15));
		lblNewLabel.setBounds(103, 62, 360, 23);
		panel.add(lblNewLabel);


		textArea = new JTextArea();
		textArea.setBounds(102, 83, 446, 163);
		panel.add(textArea);

		
		JButton btnNewButton = new JButton("SUBMIT");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
						if(textArea.getText().length()==0){
							JOptionPane.showMessageDialog(null,"Please Write Something");
						}
						else{
							JOptionPane.showMessageDialog(null,"MESSAGE  IS SENT TO HIGHER AUTHORITIES");
							HomePage  obj = new HomePage();
							obj.setVisible(true);
							dispose();
						}
				

				
				
				 
			}
		});
		btnNewButton.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 15));
		btnNewButton.setBounds(265, 257, 112, 32);
		panel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("RETURN");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				HomePage obj = new HomePage();
				obj.setVisible(true);
				dispose();
			}
		});
		btnNewButton_1.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 20));
		btnNewButton_1.setBounds(10, 302, 137, 39);
		panel.add(btnNewButton_1);
		
		JSeparator separator = new JSeparator();
		separator.setForeground(Color.WHITE);
		separator.setBounds(103, 59, 446, 39);
		panel.add(separator);
		
		JLabel lblNewLabel_1 = new JLabel("COMPAIN BOX");
		lblNewLabel_1.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 30));
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setBounds(180, 11, 292, 40);
		panel.add(lblNewLabel_1);
	}
}
