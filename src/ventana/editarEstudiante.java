package ventana;

import java.awt.Color;
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
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import logica.Estudiante;

public class editarEstudiante extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private JPanel contentPane;

	private JTextField textCodigo;
	private JTextField textApellido;
	private JTextField textNombre;
	private JTextField textNota1;
	private JTextField textNota2;
	private JTextField textNota3;

	public JTextField getTextCodigo() {
		return textCodigo;
	}

	public void setTextCodigo(JTextField textCodigo) {
		this.textCodigo = textCodigo;
	}

	public JTextField getTextApellido() {
		return textApellido;
	}

	public void setTextApellido(JTextField textApellido) {
		this.textApellido = textApellido;
	}

	public JTextField getTextNombre() {
		return textNombre;
	}

	public void setTextNombre(JTextField textNombre) {
		this.textNombre = textNombre;
	}

	public JTextField getTextNota1() {
		return textNota1;
	}

	public void setTextNota1(JTextField textNota1) {
		this.textNota1 = textNota1;
	}

	public JTextField getTextNota2() {
		return textNota2;
	}

	public void setTextNota2(JTextField textNota2) {
		this.textNota2 = textNota2;
	}

	public JTextField getTextNota3() {
		return textNota3;
	}

	public void setTextNota3(JTextField textNota3) {
		this.textNota3 = textNota3;
	}

	/**
	 * Launch the application.
	 */
	/**
	 * Create the frame.
	 */
	public editarEstudiante(final double NotaDefinitiva, final String codigoInicial) {
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

		JLabel lblNewLabel = new JLabel("Editor");
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
		lblNewLabel_4.setBounds(63, 146, 46, 14);
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
		textNota1.setBounds(45, 171, 86, 20);
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

		JButton btnSalir = new JButton("Volver");
		btnSalir.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 13));
		btnSalir.setForeground(new Color(255, 0, 0));
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				buscarEstudiante volverBuscar = new buscarEstudiante();
				volverBuscar.setVisible(true);
				volverBuscar.getTextCodigo().setText(textCodigo.getText());
				dispose();
			}
		});
		btnSalir.setBounds(213, 264, 89, 23);
		contentPane.add(btnSalir);

		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(0, 245, 500, 8);
		contentPane.add(separator_1);
		JLabel lblNewLabel_5_1 = new JLabel("nota definitiva");
		lblNewLabel_5_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5_1.setForeground(new Color(255, 0, 0));
		lblNewLabel_5_1.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 14));
		lblNewLabel_5_1.setBounds(10, 201, 500, 14);
		contentPane.add(lblNewLabel_5_1);

		JLabel lblNewLabel_7 = new JLabel(String.format("%.2f", NotaDefinitiva));
		lblNewLabel_7.setForeground(new Color(0, 128, 192));
		lblNewLabel_7.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_7.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblNewLabel_7.setBounds(216, 220, 82, 14);
		contentPane.add(lblNewLabel_7);

		JButton btnSalir_1 = new JButton("Eliminar");
		btnSalir_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					// genero una ventana emergente para confirmar la desicion del usuario:
					int respuesta = JOptionPane.showConfirmDialog(null,
							"¿Seguro que desea eliminar al estudiante de codigo " + codigoInicial + "?", "Eliminar",
							JOptionPane.OK_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE);
					// si el usuario decide seguir adelante con la eliminacion sigo con el proceso:
					if (respuesta == 0) {
						// guardo en una lista los objetos del archivo sin contar al objeto que el
						// usuario desea borrar:
						ArrayList<Estudiante> estudiantes = new ArrayList<>();
						Scanner scanner = new Scanner(new File("estudiantes.ser"));

						while (scanner.hasNextLine()) {
							String linea = scanner.nextLine();
							String[] datos = linea.split(",");

							String nombre = datos[0];
							String apellido = datos[1];
							String codigo = datos[2];
							if (!codigo.equals(codigoInicial)) {
								double nota1 = Double.parseDouble(datos[3]);
								double nota2 = Double.parseDouble(datos[4]);
								double nota3 = Double.parseDouble(datos[5]);
								double notaDefinitiva = Double.parseDouble(datos[6]);

								Estudiante estudiante = new Estudiante(nombre, apellido, codigo, nota1, nota2, nota3);
								estudiante.setNotaDefinitiva(notaDefinitiva);
								estudiantes.add(estudiante);
							}

						}

						scanner.close();
						// si no existen mas objetos a parte del que el usuario desea eliminar reescrivo
						// el archivo con un caracter vacio:
						if (estudiantes.size() == 0) {
							PrintWriter printWriter;
							printWriter = new PrintWriter(new FileOutputStream("estudiantes.ser"));

							printWriter.println("");
							printWriter.close();
							ventana volverInicio = new ventana();
							volverInicio.setVisible(true);
							dispose();

							JOptionPane.showMessageDialog(null,
									"El estudiante de codigo " + codigoInicial + " se ha eliminado correctamente.");

						} else {
							try {
								int contador = 0;
								PrintWriter printWriter;
								for (int i = 0; i < estudiantes.size(); i++) {
									// si es el primer ciclo del for reescrivo el archivo por completo
									if (contador == 0) {
										printWriter = new PrintWriter(new FileOutputStream("estudiantes.ser"));

									}
									// si ya no es el primer ciclo del for escribo los objetos de la lista en las
									// siguientes lineas:
									else {
										printWriter = new PrintWriter(new FileOutputStream("estudiantes.ser", true));
									}
									estudiantes.get(i).calcularNotaDefinitiva();
									printWriter.println(estudiantes.get(i).getNombre() + ","
											+ estudiantes.get(i).getApellido() + "," + estudiantes.get(i).getCodigo()
											+ "," + estudiantes.get(i).getNota1() + "," + estudiantes.get(i).getNota2()
											+ "," + estudiantes.get(i).getNota3() + ","
											+ estudiantes.get(i).getNotaDefinitiva());
									printWriter.close();
									contador += 1;
								}
								// una vez finalizada la eliminacion redirecciono a la ventana principal:
								ventana volverInicio = new ventana();
								volverInicio.setVisible(true);
								dispose();

								JOptionPane.showMessageDialog(null,
										"El estudiante de codigo " + codigoInicial + " se ha eliminado correctamente.");

							} catch (IOException er) {
								er.printStackTrace();
							}
						}

					}
				} catch (FileNotFoundException ex) {
					JOptionPane.showMessageDialog(null, "Error al cargar los estudiantes.");
				}
			}
		});
		btnSalir_1.setForeground(Color.RED);
		btnSalir_1.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 13));
		btnSalir_1.setBounds(377, 264, 89, 23);
		contentPane.add(btnSalir_1);

		JButton btnSalir_2 = new JButton("Guardar");
		btnSalir_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// valido que el usuario digite datos validos:
				try {
					if (textNombre.getText().isEmpty() | textApellido.getText().isEmpty()
							| textCodigo.getText().isEmpty()) {
						throw new Exception();
					}
					if (Double.parseDouble(textNota1.getText()) < 0 | Double.parseDouble(textNota1.getText()) > 5.0
							| Double.parseDouble(textNota2.getText()) < 0
							| Double.parseDouble(textNota2.getText()) > 5.0
							| Double.parseDouble(textNota3.getText()) < 0
							| Double.parseDouble(textNota3.getText()) > 5.0) {
						throw new Exception();
					}

					try {
						// creo una lista para guardar los objetos del archivo:

						ArrayList<Estudiante> estudiantes = new ArrayList<>();
						Scanner scanner = new Scanner(new File("estudiantes.ser"));
						// utilizando un scanner leo y guardo los objetos del archivo:

						while (scanner.hasNextLine()) {
							String linea = scanner.nextLine();
							// valido que el scanner no tome lineas vacias:

							if (linea.equals("")) {
								continue;
							}
							String[] datos = linea.split(",");

							String nombre = datos[0];
							String apellido = datos[1];
							String codigo = datos[2];
							// valido que el nuevo codigo no coincida con el codigo de otro estudiante y
							// ademas evito registrar la version del objeto anterior:
							if (!codigo.equals(codigoInicial)) {
								if (codigo.equals(textCodigo.getText())) {

									throw new IllegalAccessError();

								}
								double nota1 = Double.parseDouble(datos[3]);
								double nota2 = Double.parseDouble(datos[4]);
								double nota3 = Double.parseDouble(datos[5]);
								double notaDefinitiva = Double.parseDouble(datos[6]);
								// creo el objeto y lo guardo en la lista:

								Estudiante estudiante = new Estudiante(nombre, apellido, codigo, nota1, nota2, nota3);
								estudiante.setNotaDefinitiva(notaDefinitiva);
								estudiantes.add(estudiante);
							}

						}

						scanner.close();

						try {
							PrintWriter printWriter;
							// sobreescribo al archivo por completo guardando al objeto actualizado:
							printWriter = new PrintWriter(new FileOutputStream("estudiantes.ser"));

							Estudiante estudianteActualizado = new Estudiante(textNombre.getText(),
									textApellido.getText(), textCodigo.getText(),
									Double.parseDouble(textNota1.getText()), Double.parseDouble(textNota2.getText()),
									Double.parseDouble(textNota3.getText()));
							estudianteActualizado.calcularNotaDefinitiva();

							printWriter.println(textNombre.getText() + "," + textApellido.getText() + ","
									+ textCodigo.getText() + "," + textNota1.getText() + "," + textNota2.getText() + ","
									+ textNota3.getText() + "," + estudianteActualizado.getNotaDefinitiva());
							printWriter.close();
							// una vez se ha guardado al estudiante actualizado escribo a los demas
							// estudiantes del archivo guardados en la lista:
							for (int i = 0; i < estudiantes.size(); i++) {

								printWriter = new PrintWriter(new FileOutputStream("estudiantes.ser", true));

								estudiantes.get(i).calcularNotaDefinitiva();
								printWriter.println(estudiantes.get(i).getNombre() + ","
										+ estudiantes.get(i).getApellido() + "," + estudiantes.get(i).getCodigo() + ","
										+ estudiantes.get(i).getNota1() + "," + estudiantes.get(i).getNota2() + ","
										+ estudiantes.get(i).getNota3() + "," + estudiantes.get(i).getNotaDefinitiva());
								printWriter.close();

							}
							// una vez finalizada la actualizacion redirecciono a la ventana principal:

							ventana volverInicio = new ventana();
							volverInicio.setVisible(true);
							dispose();

							JOptionPane.showMessageDialog(null,
									"El estudiante de codigo " + codigoInicial + " se ha actualizado correctamente.");

						} catch (IOException er) {
							er.printStackTrace();
						}
					}

					catch (FileNotFoundException ex) {
						JOptionPane.showMessageDialog(null, "Error al cargar los estudiantes.");
					}
				} catch (IllegalAccessError erro) {
					JOptionPane.showMessageDialog(null,
							"Ya existe otro estudiante de codigo " + textCodigo.getText() + ".");

				} catch (Exception err) {
					JOptionPane.showMessageDialog(null, "Porfavor digita datos validos");
				}
			}

		});
		btnSalir_2.setForeground(Color.RED);
		btnSalir_2.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 13));
		btnSalir_2.setBounds(42, 264, 89, 23);
		contentPane.add(btnSalir_2);

		JLabel lblFondo = new JLabel("");
		lblFondo.setForeground(Color.BLACK);
		lblFondo.setIcon(new ImageIcon(new ImageIcon(ventana.class.getResource("/imagenes/fondo.png")).getImage()
				.getScaledInstance(500, 315, Image.SCALE_DEFAULT)));

		lblFondo.setBounds(0, 0, 500, 315);
		contentPane.add(lblFondo);

	}
}
