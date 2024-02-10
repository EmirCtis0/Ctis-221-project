package proje;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JRadioButton;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JTextArea;
import javax.swing.JButton;
import javax.swing.DefaultComboBoxModel;

public class ProteinFrame extends JFrame {

	private JPanel contentPane;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private final ButtonGroup buttonGroup_1 = new ButtonGroup();
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ProteinFrame frame = new ProteinFrame();
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
	public ProteinFrame() {
		setTitle("Protein");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 572, 298);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Select flavour type");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel.setBounds(18, 39, 114, 13);
		contentPane.add(lblNewLabel);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Chocolate");
		rdbtnNewRadioButton.setFont(new Font("Tahoma", Font.PLAIN, 12));
		buttonGroup_1.add(rdbtnNewRadioButton);
		rdbtnNewRadioButton.setBounds(138, 6, 103, 21);
		contentPane.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnBanana = new JRadioButton("Banana");
		rdbtnBanana.setFont(new Font("Tahoma", Font.PLAIN, 12));
		buttonGroup_1.add(rdbtnBanana);
		rdbtnBanana.setBounds(138, 36, 103, 21);
		contentPane.add(rdbtnBanana);
		
		JRadioButton rdbtnStrawberry = new JRadioButton("Strawberry");
		rdbtnStrawberry.setFont(new Font("Tahoma", Font.PLAIN, 12));
		buttonGroup_1.add(rdbtnStrawberry);
		rdbtnStrawberry.setBounds(138, 67, 85, 21);
		contentPane.add(rdbtnStrawberry);
		
		JLabel lblNewLabel_1 = new JLabel("Price");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1.setBounds(271, 21, 61, 27);
		contentPane.add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(321, 25, 158, 23);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("TL");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_2.setBounds(483, 27, 45, 13);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Select Brand:");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_3.setBounds(18, 167, 85, 21);
		contentPane.add(lblNewLabel_3);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Hiq", "Protein Ocean", "HardLine"}));
		comboBox.setBounds(98, 168, 103, 21);
		contentPane.add(comboBox);
		
		JLabel lblNewLabel_4 = new JLabel("Expiration Date:");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_4.setBounds(286, 165, 114, 27);
		contentPane.add(lblNewLabel_4);
		
		textField_1 = new JTextField();
		textField_1.setBounds(383, 168, 121, 21);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnNewButton = new JButton("Buy Protein Powder");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnNewButton.setBounds(98, 212, 152, 39);
		contentPane.add(btnNewButton);
		
		JButton btnReturnProductPage = new JButton("Return Product Page");
		btnReturnProductPage.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MainFrame mainFrame = new MainFrame();
				mainFrame.setVisible(true);
				dispose();
			}
		});
		btnReturnProductPage.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnReturnProductPage.setBounds(298, 212, 152, 39);
		contentPane.add(btnReturnProductPage);
	}
}
