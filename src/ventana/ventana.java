
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
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSeparator;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import logica.Estudiante;

public class ventana extends JFrame {

	private JPanel contentPane;
	private JTextField textCodigo;
	private JTextField textApellido;
	private JTextField textNombre;
	private JTextField textNota1;
	private JTextField textNota2;
	private JTextField textNota3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ventana frame = new ventana();
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
	public ventana() {
		setTitle("Gestor Estudiantil");

		setIconImage(Toolkit.getDefaultToolkit().getImage(ventana.class.getResource("/imagenes/simbolo.png")));

		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 516, 354);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(245, 222, 179));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Bienvenido al gestor de estudiantes");
		lblNewLabel.setForeground(new Color(255, 0, 0));
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 16));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(111, 11, 296, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("nombre");
		lblNewLabel_1.setForeground(new Color(255, 0, 0));
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 14));
		lblNewLabel_1.setBounds(22, 51, 61, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("apellido");
		lblNewLabel_2.setForeground(new Color(255, 0, 0));
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 14));
		lblNewLabel_2.setBounds(22, 76, 61, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("codigo");
		lblNewLabel_3.setForeground(new Color(255, 0, 0));
		lblNewLabel_3.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 14));
		lblNewLabel_3.setBounds(22, 101, 61, 14);
		contentPane.add(lblNewLabel_3);
		
		textCodigo = new JTextField();
		textCodigo.setBounds(93, 98, 86, 20);
		contentPane.add(textCodigo);
		textCodigo.setColumns(10);
		
		textApellido = new JTextField();
		textApellido.setBounds(93, 73, 86, 20);
		contentPane.add(textApellido);
		textApellido.setColumns(10);
		
		textNombre = new JTextField();
		textNombre.setBounds(93, 48, 86, 20);
		contentPane.add(textNombre);
		textNombre.setColumns(10);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(0, 134, 500, 14);
		contentPane.add(separator);
		
		JLabel lblNewLabel_4 = new JLabel("nota1");
		lblNewLabel_4.setForeground(new Color(255, 0, 0));
		lblNewLabel_4.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 14));
		lblNewLabel_4.setBounds(53, 146, 46, 14);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("nota2");
		lblNewLabel_5.setForeground(new Color(255, 0, 0));
		lblNewLabel_5.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 14));
		lblNewLabel_5.setBounds(229, 146, 46, 14);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("nota3");
		lblNewLabel_6.setForeground(new Color(255, 0, 0));
		lblNewLabel_6.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 14));
		lblNewLabel_6.setBounds(392, 146, 46, 14);
		contentPane.add(lblNewLabel_6);
		
		textNota1 = new JTextField();
		textNota1.setBounds(33, 170, 86, 20);
		contentPane.add(textNota1);
		textNota1.setColumns(10);
		
		textNota2 = new JTextField();
		textNota2.setBounds(216, 171, 86, 20);
		contentPane.add(textNota2);
		textNota2.setColumns(10);
		
		textNota3 = new JTextField();
		textNota3.setBounds(377, 170, 86, 20);
		contentPane.add(textNota3);
		textNota3.setColumns(10);
		
		JButton btnSalir = new JButton("Salir");
		btnSalir.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 13));
		btnSalir.setForeground(new Color(255, 0, 0));
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnSalir.setBounds(213, 264, 89, 23);
		contentPane.add(btnSalir);
		
		JButton btnGuardar = new JButton("Guardar");
		btnGuardar.setForeground(new Color(255, 0, 0));
		btnGuardar.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 13));
		btnGuardar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					if (textNombre.getText().isEmpty() | textApellido.getText().isEmpty() | textCodigo.getText().isEmpty()) {
						throw new Exception();
					}
					if (Double.parseDouble(textNota1.getText()) < 0 | Double.parseDouble(textNota1.getText()) > 5.0
							| Double.parseDouble(textNota2.getText()) < 0 | Double.parseDouble(textNota2.getText()) > 5.0
							| Double.parseDouble(textNota3.getText()) < 0 | Double.parseDouble(textNota3.getText()) > 5.0) {
						throw new Exception();
					}
		        Estudiante persona = new Estudiante(textNombre.getText(), textApellido.getText(), textCodigo.getText(), 
		        		Double.parseDouble(textNota1.getText()),Double.parseDouble(textNota2.getText()), Double.parseDouble(textNota3.getText()) );
		       
		        // Guardamos la lista de personas en un archivo serializable
		        try {
		            
		            PrintWriter printWriter = new PrintWriter(new FileOutputStream("estudiantes.ser",true));
		            persona.calcularNotaDefinitiva();
		            printWriter.println(persona.getNombre() + "," + persona.getApellido()  + "," + persona.getCodigo() 
		            + "," + persona.getNota1() + "," + persona.getNota2() + "," + persona.getNota3() + "," + persona.getNotaDefinitiva());
		            printWriter.close();
		    
		            JOptionPane.showMessageDialog(null,"Su registro se ha guardado en el archivo estudiantes.ser");
		        } catch (IOException er) {
		            er.printStackTrace();
		        }

			}
				catch (Exception err) {
					JOptionPane.showMessageDialog(null, "porfavor digita datos validos");
				
			}
			}
			});
		btnGuardar.setBounds(213, 230, 89, 23);
		contentPane.add(btnGuardar);
		
		JButton btnCargar = new JButton("Cargar");
		btnCargar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 // Leemos el archivo serializable y mostramos los atributos de los objetos guardados
				try{
					ArrayList<Estudiante> estudiantes = new ArrayList<>();
			        Scanner scanner = new Scanner(new File("estudiantes.ser"));
			        
			        while (scanner.hasNextLine()) {
			            String linea = scanner.nextLine();
			            if (linea.equals("")) {
			            	continue;
			            }
			            String[] datos = linea.split(",");
			            
			            String nombre = datos[0];
			            String apellido = datos[1];
			            String codigo = datos[2];
			            double nota1 = Double.parseDouble(datos[3]);
			            double nota2 = Double.parseDouble(datos[4]);
			            double nota3 = Double.parseDouble(datos[5]);
			            double notaDefinitiva = Double.parseDouble(datos[6]);


			            
			            Estudiante estudiante = new Estudiante(nombre, apellido, codigo, nota1, nota2, nota3);
			            estudiante.setNotaDefinitiva(notaDefinitiva);
			            estudiantes.add(estudiante);
			        }
			        
			        scanner.close();
					
				   
				String[] columnas = {"Nombre", "Apellido","Codigo", "Nota1 (35%)", "Nota2 (35%)", "Nota3 (30%)" , "Nota Definitiva"};
                String[][] datos = new String[estudiantes.size()][7];
                
                for (int i = 0; i < estudiantes.size(); i++) {
                    Estudiante estudiante = estudiantes.get(i);
                    datos[i][0] = estudiante.getNombre();
                    datos[i][1] = estudiante.getApellido();
                    datos[i][2] = estudiante.getCodigo();
                    datos[i][3] = Double.toString(estudiante.getNota1());
                    datos[i][4] = Double.toString(estudiante.getNota2());
                    datos[i][5] = Double.toString(estudiante.getNota3());
                    datos[i][6] = String.format("%.2f", estudiante.getNotaDefinitiva());



                }
                
                JTable tabla = new JTable(datos, columnas);
                JOptionPane.showMessageDialog(null, new JScrollPane(tabla));
            } catch (FileNotFoundException ex) {
                JOptionPane.showMessageDialog(null, "Error al cargar los estudiantes.");
            }
			}
		});
		btnCargar.setForeground(Color.RED);
		btnCargar.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 13));
		btnCargar.setBounds(33, 230, 89, 23);
		contentPane.add(btnCargar);
		
		JSeparator separator_1 = 
				new JSeparator();
		separator_1.setBounds(0, 205, 500, 8);
		contentPane.add(separator_1);
		JButton btnNewButton = new JButton("Buscar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				buscarEstudiante buscar = new buscarEstudiante();
				buscar.setVisible(true);
				dispose();
			}
		});
		btnNewButton.setForeground(new Color(255, 0, 0));
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 13));
		btnNewButton.setBounds(377, 230, 89, 23);
		contentPane.add(btnNewButton);
		
		JLabel lblFondo = new JLabel("");
		lblFondo.setForeground(Color.BLACK);
		lblFondo.setIcon(new ImageIcon(new ImageIcon(ventana.class.getResource("/imagenes/fondo.png")).getImage().getScaledInstance(500, 315, Image.SCALE_DEFAULT)));

		lblFondo.setBounds(0, 0, 500, 315);
		contentPane.add(lblFondo);
		
		
	}
}
