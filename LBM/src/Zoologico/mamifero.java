package Zoologico;

public class mamifero extends PrincipalZoo {

	// creamos los atributos, incluyendo los exclusivos de la clase mamifero
	private String nombre;
	private String genero;
	private String especie;
	private int edad;
	private String cuidador;
	private String habitat;
	private String desplazamiento;

	// creamos el constructor
	public mamifero(String nombre, String genero, String especie, int edad,String desplazamiento) {
		this.nombre = nombre;
		this.genero = genero;
		this.especie = especie;
		this.edad = edad;
		this.desplazamiento = desplazamiento;

	}
	public mamifero(String cuidador, String habitat) {
		this.cuidador = cuidador;
		this.habitat = habitat;
	}
	// Añadimos getters y setters

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getEspecie() {
		return especie;
	}

	public void setEspecie(String especie) {
		this.especie = especie;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getCuidador() {
		return cuidador;
	}

	public void setCuidador(String cuidador) {
		this.cuidador = cuidador;
	}

	public String getHabitat() {
		return habitat;
	}

	public void setHabitat(String habitat) {
		this.habitat = habitat;
	}

	public String getDesplazamiento() {
		return desplazamiento;
	}

	public void setDesplazamiento(String desplazamiento) {
		this.desplazamiento = desplazamiento;
	}
//añadimos el ToString 

	@Override
	public String toString() {
		return "mamifero [nombre=" + nombre + ", genero=" + genero + ", especie=" + especie + ", edad=" + edad
				+ ", desplazamiento=" + desplazamiento + "]";
	}

}
