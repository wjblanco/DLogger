package DLogger.GUI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.border.TitledBorder;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.border.MatteBorder;
import com.jgoodies.forms.factories.DefaultComponentFactory;
import javax.swing.JButton;

public class ConectionsWindow {

	private JFrame frmConfiguracinConexiones;
	private JTable table;
	private JTable table_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ConectionsWindow window = new ConectionsWindow();
					window.frmConfiguracinConexiones.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public ConectionsWindow() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmConfiguracinConexiones = new JFrame();
		frmConfiguracinConexiones.setTitle("Configuración - Conexiones");
		frmConfiguracinConexiones.setBounds(100, 100, 450, 300);
		frmConfiguracinConexiones.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmConfiguracinConexiones.getContentPane().setLayout(null);
		
		JLabel lblPlantas = new JLabel("Plantas");
		lblPlantas.setBounds(28, 12, 70, 15);
		frmConfiguracinConexiones.getContentPane().add(lblPlantas);
		
		JLabel lblBasesDeDatos = new JLabel("Bases de datos");
		lblBasesDeDatos.setBounds(250, 12, 134, 15);
		frmConfiguracinConexiones.getContentPane().add(lblBasesDeDatos);
		
		table = new JTable();
		table.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{new Integer(1), "Panasonic"},
				{new Integer(2), "Avaya"},
				{new Integer(3), "Siemens"},
			},
			new String[] {
				"ID", "Planta"
			}
		) {
			Class[] columnTypes = new Class[] {
				Integer.class, String.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
		});
		table.getColumnModel().getColumn(0).setPreferredWidth(20);
		table.getColumnModel().getColumn(1).setPreferredWidth(100);
		table.setBounds(28, 40, 167, 189);
		frmConfiguracinConexiones.getContentPane().add(table);
		
		table_1 = new JTable();
		table_1.setModel(new DefaultTableModel(
			new Object[][] {
				{new Integer(1), "BD1"},
				{new Integer(3), "Base El Salvador"},
				{new Integer(7), "DB Hon"},
				{new Integer(8), "DataBase 4"},
			},
			new String[] {
				"ID", "Base de datos"
			}
		) {
			Class[] columnTypes = new Class[] {
				Integer.class, String.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
		});
		table_1.getColumnModel().getColumn(0).setPreferredWidth(30);
		table_1.getColumnModel().getColumn(1).setPreferredWidth(90);
		table_1.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		table_1.setBounds(250, 40, 167, 189);
		frmConfiguracinConexiones.getContentPane().add(table_1);
		
		JButton btnAadir = new JButton("Añadir");
		btnAadir.setBounds(28, 234, 80, 25);
		frmConfiguracinConexiones.getContentPane().add(btnAadir);
		
		JButton btnBorrar = new JButton("Borrar");
		btnBorrar.setBounds(115, 234, 80, 25);
		frmConfiguracinConexiones.getContentPane().add(btnBorrar);
		
		JButton button = new JButton("Añadir");
		button.setBounds(250, 234, 80, 25);
		frmConfiguracinConexiones.getContentPane().add(button);
		
		JButton button_1 = new JButton("Borrar");
		button_1.setBounds(337, 234, 80, 25);
		frmConfiguracinConexiones.getContentPane().add(button_1);
	}
}
