package Zoologico;

import java.util.ArrayList;

public class Habitat {

	// añadimos los atributos exclusivos de habitat

	private String nombre;
	private ArrayList animales;

	// creamos el constructor

	public Habitat(String nombre, ArrayList animales) {
		this.nombre = nombre;
		this.animales = animales;

	}

	// añadimos los getters y setters

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public ArrayList getAnimales() {
		return animales;
	}

	public void setAnimales(ArrayList animales) {
		this.animales = animales;
	}

}
