package Zoologico;

public class CuidadorExistenceException extends Exception {

	
	public CuidadorExistenceException() {
		System.out.println("Este cuidador ya se encuentra en el Zoo");
		
	}
}
