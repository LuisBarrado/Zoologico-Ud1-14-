package Zoologico;

import java.util.ArrayList;

public class Zoo {

	// creamos los atributos exclusivos de la clase Zoo

	private ArrayList habitat;

	// creamos el constructor

	public Zoo(ArrayList habitat) {
		this.habitat = habitat;
	}

	// añadimos los getters y setters

	public ArrayList getHabitat() {
		return habitat;
	}

	public void setHabitat(ArrayList habitat) {
		this.habitat = habitat;
	}

	// creamos los metodos para añadir habitats, para eliminarlos; Y para añadir y
	// eliminar animales de los habitats

	public int añadehabitat() {
		int habitat = 0;
		habitat++;
		return habitat;
	}

	public int eliminahabitat() {
		int habitat = añadehabitat();
		habitat--;
		return habitat;
	}

	public int añadeanimalhabitat() {
		int animalhabitat = 0;
		animalhabitat++;
		return animalhabitat;
	}

	public int eliminaanimalhabitat() {
		int animalhabitat = añadeanimalhabitat();
		animalhabitat--;
		return animalhabitat;

	}
}
