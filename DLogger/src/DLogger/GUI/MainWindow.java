package DLogger.GUI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.GridBagLayout;
import javax.swing.BoxLayout;
import java.awt.FlowLayout;
import javax.swing.JPanel;
import javax.swing.JList;
import javax.swing.JButton;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JMenu;
import javax.swing.AbstractListModel;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.List;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MainWindow {

	private JFrame frmDloggerPrincipal;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainWindow window = new MainWindow();
					window.frmDloggerPrincipal.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MainWindow() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmDloggerPrincipal = new JFrame();
		frmDloggerPrincipal.setTitle("DLogger - Principal");
		frmDloggerPrincipal.setResizable(false);
		frmDloggerPrincipal.setBounds(100, 100, 560, 380);
		frmDloggerPrincipal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmDloggerPrincipal.getContentPane().setLayout(null);
		
		JList jl_plantas = new JList();
		jl_plantas.setFont(new Font("Monospaced", Font.BOLD, 12));
		jl_plantas.setModel(new AbstractListModel() {
			String[] values = new String[] {"Planta 1     Panasonic     OK", "Planta 2     Avaya         OK", "Planta 3     Alcatel       OK"};
			public int getSize() {
				return values.length;
			}
			public Object getElementAt(int index) {
				return values[index];
			}
		});
		jl_plantas.setBounds(23, 147, 211, 134);
		frmDloggerPrincipal.getContentPane().add(jl_plantas);

		JList jl_bds = new JList();
		jl_bds.setFont(new Font("Monospaced", Font.BOLD, 12));
		jl_bds.setModel(new AbstractListModel() {
			String[] values = new String[] {"BDTarif 1           192.168.1.2      OK", "BDTarificador 2     10.243.25.12     OK", "Bd 3                172.17.2.245     NC", "Base Des            92.165.34.7      OK"};
			public int getSize() {
				return values.length;
			}
			public Object getElementAt(int index) {
				return values[index];
			}
		});
		jl_bds.setBounds(246, 147, 285, 134);
		frmDloggerPrincipal.getContentPane().add(jl_bds);
		
		JLabel lblLogo = new JLabel("");
		lblLogo.setIcon(new ImageIcon("/home/wjblanco/workspace2/DLogger/Resources/Images/CallReg.png"));
		lblLogo.setBounds(23, 12, 150, 123);
		frmDloggerPrincipal.getContentPane().add(lblLogo);
		
		JMenuBar menuBar = new JMenuBar();
		frmDloggerPrincipal.setJMenuBar(menuBar);
		
		JMenu mnArchivo = new JMenu("Ventana");
		menuBar.add(mnArchivo);
		
		JMenuItem mntmMinimizar = new JMenuItem("Minimizar");
		mnArchivo.add(mntmMinimizar);
		
		JMenuItem mntmMinimizarATask = new JMenuItem("Minimizar a task");
		mnArchivo.add(mntmMinimizarATask);
		
		JMenuItem mntmCerrar = new JMenuItem("Cerrar");
		mnArchivo.add(mntmCerrar);
		
		JMenu mnEdicin = new JMenu("Edición");
		menuBar.add(mnEdicin);
		
		JMenuItem mntmTarificadores = new JMenuItem("Bases de datos");
		mntmTarificadores.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				new DLogger.GUI.DataBasesWindow();
			}
		});
		
		/*
		mntmTarificadores.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
			}
		});
		*/
		
		mnEdicin.add(mntmTarificadores);
		
		JMenuItem mntmPlantas = new JMenuItem("Plantas Telefónicas");
		mnEdicin.add(mntmPlantas);
		
		JMenuItem mntmConexiones = new JMenuItem("Conexiones");
		mnEdicin.add(mntmConexiones);
		
		JMenu mnHerramientas = new JMenu("Herramientas");
		menuBar.add(mnHerramientas);
		
		JMenuItem mntmOpciones = new JMenuItem("Opciones...");
		mnHerramientas.add(mntmOpciones);
		
		JMenu mnAyuda = new JMenu("Ayuda");
		menuBar.add(mnAyuda);
		
		JMenuItem mntmAcercaDe = new JMenuItem("Acerca de...");
		mnAyuda.add(mntmAcercaDe);
	}
}
