package ventana;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import logica.Estudiante;

public class buscarEstudiante extends JFrame {

	private JPanel contentPane;
	private JTextField textCodigo;
	
	
	public JTextField getTextCodigo() {
		return textCodigo;
	}

	public void setTextCodigo(JTextField textCodigo) {
		this.textCodigo = textCodigo;
	}

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					buscarEstudiante frame = new buscarEstudiante();
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
	public buscarEstudiante() {
		setTitle("Gestor Estudiantil");

		setIconImage(Toolkit.getDefaultToolkit().getImage(ventana.class.getResource("/imagenes/simbolo.png")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 206);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(238, 232, 170));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Buscar Estudiante");
		lblNewLabel.setForeground(new Color(255, 0, 0));
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 16));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(5, 5, 424, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("codigo:");
		lblNewLabel_1.setForeground(new Color(255, 0, 0));
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 14));
		lblNewLabel_1.setBounds(20, 45, 61, 14);
		contentPane.add(lblNewLabel_1);
		
		textCodigo = new JTextField();
		textCodigo.setBounds(91, 43, 86, 20);
		contentPane.add(textCodigo);
		textCodigo.setColumns(10);
		
		JButton btnNewButton = new JButton("Volver");
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 13));
		btnNewButton.setForeground(new Color(255, 0, 0));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ventana principal = new ventana();
				principal.setVisible(true);
				dispose();
			}
		});
		btnNewButton.setBounds(177, 133, 89, 23);
		contentPane.add(btnNewButton);
		
		JButton btnBuscar = new JButton("Buscar");
		btnBuscar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					ArrayList<Estudiante> estudiantes = new ArrayList<>();
					String codigo = textCodigo.getText();
					Scanner scanner = new Scanner(new File("estudiantes.ser"));
			        while (scanner.hasNextLine()) {
			            String linea = scanner.nextLine();
			            if (linea.equals("")) {
			            	continue;
			            }
			            String [] datos = linea.split(",");
			            if (codigo.equals(datos[2]) ) {
			            	String nombre = datos[0];
			            	String apellido = datos[1];

			            	double nota1 = Double.parseDouble(datos[3]);
				            double nota2 = Double.parseDouble(datos[4]);
				            double nota3 = Double.parseDouble(datos[5]);
				            double notaDefinitiva = Double.parseDouble(datos[6]);


				            
				            Estudiante estudiante = new Estudiante(nombre, apellido, codigo, nota1, nota2, nota3);
				            estudiante.setNotaDefinitiva(notaDefinitiva);
				            estudiantes.add(estudiante);
			            }
			        }
			         if (estudiantes.size() == 1) {
			        	 editarEstudiante nuevaVentana = new editarEstudiante(estudiantes.get(0).getNotaDefinitiva(),estudiantes.get(0).getCodigo() );
			        	 nuevaVentana.setVisible(true);
			        	 nuevaVentana.getTextNombre().setText(estudiantes.get(0).getNombre());
			        	 nuevaVentana.getTextApellido().setText(estudiantes.get(0).getApellido());
			        	 nuevaVentana.getTextCodigo().setText(estudiantes.get(0).getCodigo());
			        	 nuevaVentana.getTextNota1().setText(Double.toString(estudiantes.get(0).getNota1()));
			        	 nuevaVentana.getTextNota2().setText(Double.toString(estudiantes.get(0).getNota2()));
			        	 nuevaVentana.getTextNota3().setText(Double.toString(estudiantes.get(0).getNota3()));
			        	 
			        	 dispose();
			         }
			         else {
			        	 JOptionPane.showMessageDialog(null, "El estudiante de codigo " + codigo + " no existe.");
			         }
			            
			        
			        
			        scanner.close();
				}
				catch (FileNotFoundException ex) {
	                JOptionPane.showMessageDialog(null, "Error al cargar los estudiantes.");
	            }
			}
		});
		btnBuscar.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 13));
		btnBuscar.setForeground(new Color(255, 0, 0));
		btnBuscar.setBounds(177, 97, 89, 23);
		contentPane.add(btnBuscar);
		
		JLabel lblFondo = new JLabel("");
		lblFondo.setIcon(new ImageIcon(new ImageIcon(ventana.class.getResource("/imagenes/fondo.png")).getImage().getScaledInstance(434, 167, Image.SCALE_DEFAULT)));

		lblFondo.setBounds(0, 0, 434, 167);
		contentPane.add(lblFondo);
	}

}
