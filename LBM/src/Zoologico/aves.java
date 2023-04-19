package Zoologico;

public class aves extends PrincipalZoo{
	// creamos los atributos añadiendo los exclusivos de la clase aves
	private String nombre;
	private String genero;
	private String especie;
	private int edad;
	private String tipo;
	private String cuidador;
	private String habitat;
	private int longitudpico;
	private String rapaz;

	// creamos el constructor

	public aves(String nombre, String genero, String especie, String tipo, int edad,int longitudpico, String rapaz) {
		this.nombre = nombre;
		this.genero = genero;
		this.especie = especie;
		this.tipo= tipo;
		this.edad = edad;
		this.longitudpico = longitudpico;
		this.rapaz = rapaz;

	}
	public aves (String cuidador, String habitat) {
		this.cuidador = cuidador;
		this.habitat = habitat;
		
	}
	// añadimos los getters y setters

	public String getNombre() {
		return nombre;
	}

	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
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

	public int getLongitudpico() {
		return longitudpico;
	}

	public void setLongitudpico(int longitudpico) {
		this.longitudpico = longitudpico;
	}

	public String getRapaz() {
		return rapaz;
	}

	public void setRapaz(String rapaz) {
		this.rapaz = rapaz;
	}
//añadimos el ToString 

	@Override
	public String toString() {
		return "aves [nombre=" + nombre + ", genero=" + genero + ", especie=" + especie + ", edad=" + edad
				+ ", longitudpico=" + longitudpico + ", rapaz="
				+ rapaz + "]";
	}

}
