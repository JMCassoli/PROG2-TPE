package TPE;

import java.util.ArrayList;

public class Alumno {
	
	private String nombre, apellido;
	private int DNI, edad;
	private ArrayList<String> intereses;
	
	public Alumno(String nombre, String apellido, int dni, int edad) {
		this.nombre=nombre;
		this.apellido=apellido;
		this.DNI=dni;
		this.edad=edad;
		this.intereses = new ArrayList<>();
		}

	public void addInteres(String interes) {
		this.intereses.add(interes);
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

	public int getDNI() {
		return DNI;
	}

	public void setDNI(int dNI) {
		DNI = dNI;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public ArrayList<String> getIntereses() {
		return new ArrayList<String> (intereses);
	}
	
	public String toString() {
		String result = ("nombre: " + this.getNombre() + " apellido: " + this.getApellido() + " DNI:" + this.getDNI());
		return result;
	}
	
}
