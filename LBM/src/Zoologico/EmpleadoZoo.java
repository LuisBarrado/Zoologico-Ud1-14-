package Zoologico;

// creamos la clase, implementando la interfaz de cuidador dentro de ella
public class EmpleadoZoo implements cuidador {

	// creamos los atributos para el empleado

	private int numeroempleado;
	private String nombre;
	private String apellidos;
	private double salario;

	// creamos el constructor para el empleado del Zoo

	public EmpleadoZoo(int numeroempleado, String nombre, String apellidos, double salario) {
		this.numeroempleado = numeroempleado;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.salario = salario;
	}

	// añadimos los getters y setters

	@Override
	public int alimentar() {

		return 0;
	}

	public int getNumeroempleado() {
		return numeroempleado;
	}

	public void setNumeroempleado(int numeroempleado) {
		this.numeroempleado = numeroempleado;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

}
