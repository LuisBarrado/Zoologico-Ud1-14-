package Zoologico;

public class reptiles extends PrincipalZoo{

	// creamos los atributos añadiendo los exclusivos de la clase reptiles

	private String nombre;
	private String genero;
	private String especie;
	private int edad;
	private String cuidador;
	private String habitat;
	private String colorescamas;

	// creamos el constructor de reptiles
	public reptiles(String nombre, String genero, String especie, int edad, String colorescamas) {
		this.nombre = nombre;
		this.genero = genero;
		this.especie = especie;
		this.edad = edad;
		this.colorescamas = colorescamas;
	}
	public reptiles (String cuidador, String habitat) {
		this.cuidador = cuidador;
		this.habitat = habitat;
	}

	// añadimos los getters y setter
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

	public String getColorescamas() {
		return colorescamas;
	}

	public void setColorescamas(String colorescamas) {
		this.colorescamas = colorescamas;
	}
	// añadimos el ToString

	@Override
	public String toString() {
		return "reptiles [nombre=" + nombre + ", genero=" + genero + ", especie=" + especie + ", edad=" + edad
				+ ", colorescamas=" + colorescamas + "]";
	}

}
