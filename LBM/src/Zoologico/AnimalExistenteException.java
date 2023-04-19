package Zoologico;

public class AnimalExistenteException extends Exception {
	
	public AnimalExistenteException() {
		System.out.println("Este Animal ya existe en el Zoo");
	}
}
