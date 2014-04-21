package DLogger.GUI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class DataBasesWindow {

	private JFrame frmIngresoDeBase;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;

	/**
	 * Launch the application.
	 */
	/*
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DataBasesWindow window = new DataBasesWindow();
					window.frmIngresoDeBase.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	*/
	/**
	 * Create the application.
	 */
	public DataBasesWindow() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmIngresoDeBase = new JFrame();
		frmIngresoDeBase.setTitle("Ingreso de base de datos");
		frmIngresoDeBase.setBounds(100, 100, 450, 300);
		frmIngresoDeBase.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmIngresoDeBase.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nombre:");
		lblNewLabel.setBounds(49, 26, 70, 15);
		frmIngresoDeBase.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("IP:");
		lblNewLabel_1.setBounds(49, 61, 70, 15);
		frmIngresoDeBase.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Puerto:");
		lblNewLabel_2.setBounds(49, 102, 70, 15);
		frmIngresoDeBase.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Base de datos (SID):");
		lblNewLabel_3.setBounds(49, 139, 164, 15);
		frmIngresoDeBase.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Usuario:");
		lblNewLabel_4.setBounds(49, 183, 70, 15);
		frmIngresoDeBase.getContentPane().add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Password:");
		lblNewLabel_5.setBounds(49, 224, 103, 15);
		frmIngresoDeBase.getContentPane().add(lblNewLabel_5);
		
		textField = new JTextField();
		textField.setBounds(224, 24, 167, 19);
		frmIngresoDeBase.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(224, 59, 167, 19);
		frmIngresoDeBase.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(224, 100, 167, 19);
		frmIngresoDeBase.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(224, 137, 167, 19);
		frmIngresoDeBase.getContentPane().add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBounds(224, 181, 167, 19);
		frmIngresoDeBase.getContentPane().add(textField_4);
		textField_4.setColumns(10);
		
		textField_5 = new JTextField();
		textField_5.setBounds(224, 222, 167, 19);
		frmIngresoDeBase.getContentPane().add(textField_5);
		textField_5.setColumns(10);
		
		try {
			//DataBasesWindow window = new DataBasesWindow();
			frmIngresoDeBase.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
