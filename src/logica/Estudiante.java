package logica;

import java.io.Serializable;

@SuppressWarnings("serial")
public class Estudiante implements Serializable {
	private String nombre;
	private String apellido;
	private String codigo;
	private double nota1;
	private double nota2;
	private double nota3;
	private double notaDefinitiva;

	public Estudiante(String nombre, String apellido, String codigo, double nota1, double nota2, double nota3) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.codigo = codigo;
		this.nota1 = nota1;
		this.nota2 = nota2;
		this.nota3 = nota3;
	}
	
	public  void calcularNotaDefinitiva() {
		notaDefinitiva = (nota1 * 0.35) + (nota2 * 0.35) + (nota3 * 0.3);
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public double getNota1() {
		return nota1;
	}

	public void setNota1(double nota1) {
		this.nota1 = nota1;
	}

	public double getNota2() {
		return nota2;
	}

	public void setNota2(double nota2) {
		this.nota2 = nota2;
	}

	public double getNota3() {
		return nota3;
	}

	public void setNota3(double nota3) {
		this.nota3 = nota3;
	}

	public double getNotaDefinitiva() {
		return notaDefinitiva;
	}

	public void setNotaDefinitiva(double notaDefinitiva) {
		this.notaDefinitiva = notaDefinitiva;
	}
	

}
