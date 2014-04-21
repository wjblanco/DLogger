package DLogger.GUI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTabbedPane;
import javax.swing.border.TitledBorder;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JFormattedTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class PBXsWindow {

	private JFrame frmIngresoDePlanta;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_6;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PBXsWindow window = new PBXsWindow();
					window.frmIngresoDePlanta.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public PBXsWindow() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmIngresoDePlanta = new JFrame();
		frmIngresoDePlanta.setTitle("Ingreso de Planta telefónica");
		frmIngresoDePlanta.setBounds(100, 100, 450, 300);
		frmIngresoDePlanta.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmIngresoDePlanta.getContentPane().setLayout(null);
		
		JTabbedPane tab_ConType = new JTabbedPane(JTabbedPane.TOP);
		tab_ConType.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		tab_ConType.setBounds(12, 99, 424, 160);
		frmIngresoDePlanta.getContentPane().add(tab_ConType);
		
		JPanel tp_tcpip = new JPanel();
		tab_ConType.addTab("TCP/IP", null, tp_tcpip, null);
		tp_tcpip.setLayout(null);
		
		JLabel lblIp = new JLabel("IP:");
		lblIp.setBounds(12, 29, 25, 15);
		tp_tcpip.add(lblIp);
		
		JFormattedTextField formattedTextField = new JFormattedTextField();
		formattedTextField.setText("###.###.###.###");
		formattedTextField.setBounds(64, 27, 150, 19);
		tp_tcpip.add(formattedTextField);
		
		JLabel lblPuerto = new JLabel("Puerto");
		lblPuerto.setBounds(234, 29, 59, 15);
		tp_tcpip.add(lblPuerto);
		
		textField_1 = new JTextField();
		textField_1.setBounds(291, 27, 114, 19);
		tp_tcpip.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblUsuario = new JLabel("Usuario:");
		lblUsuario.setBounds(12, 58, 70, 15);
		tp_tcpip.add(lblUsuario);
		
		JLabel lblPassword = new JLabel("Password:");
		lblPassword.setBounds(12, 87, 85, 15);
		tp_tcpip.add(lblPassword);
		
		textField_2 = new JTextField();
		textField_2.setBounds(100, 56, 114, 19);
		tp_tcpip.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(100, 85, 114, 19);
		tp_tcpip.add(textField_3);
		textField_3.setColumns(10);
		
		JPanel tp_serial = new JPanel();
		tab_ConType.addTab("Serial", null, tp_serial, null);
		tp_serial.setLayout(null);
		
		JLabel lblPuertoCom = new JLabel("Puerto COM:");
		lblPuertoCom.setBounds(12, 12, 100, 15);
		tp_serial.add(lblPuertoCom);
		
		JLabel lblBaudios = new JLabel("Baudios:");
		lblBaudios.setBounds(12, 38, 70, 15);
		tp_serial.add(lblBaudios);
		
		JLabel lblBitsDeParada = new JLabel("Bits de parada:");
		lblBitsDeParada.setBounds(12, 65, 128, 15);
		tp_serial.add(lblBitsDeParada);
		
		JLabel lblControl = new JLabel("Control:");
		lblControl.setBounds(12, 92, 70, 15);
		tp_serial.add(lblControl);
		
		textField_4 = new JTextField();
		textField_4.setBounds(136, 10, 114, 19);
		tp_serial.add(textField_4);
		textField_4.setColumns(10);
		
		textField_6 = new JTextField();
		textField_6.setBounds(136, 63, 114, 19);
		tp_serial.add(textField_6);
		textField_6.setColumns(10);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"9600", "19200"}));
		comboBox.setBounds(136, 33, 114, 24);
		tp_serial.add(comboBox);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"none", "Xon/Xoff"}));
		comboBox_1.setBounds(136, 87, 114, 24);
		tp_serial.add(comboBox_1);
		
		JLabel lblNombre = new JLabel("Nombre: ");
		lblNombre.setBounds(12, 24, 70, 15);
		frmIngresoDePlanta.getContentPane().add(lblNombre);
		
		textField = new JTextField();
		textField.setBounds(80, 22, 340, 19);
		frmIngresoDePlanta.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblTipoDeConexin = new JLabel("Tipo de conexión: ");
		lblTipoDeConexin.setBounds(12, 51, 135, 15);
		frmIngresoDePlanta.getContentPane().add(lblTipoDeConexin);
	}
}
