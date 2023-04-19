package Zoologico;

import java.util.ArrayList;
import java.util.Scanner;

public class PrincipalZoo {
//añadimos el scanner de manera static para que podamos acceder a el en todos los metodos de la clase
	public static Scanner src = new Scanner(System.in);
//creamos las listas de Animales, Habitats y Cuidadores de manera estatica, para poder usarlo en todas las opciones
	public static ArrayList<String> Animales = new ArrayList<String>();
	public static ArrayList<String> Habitats = new ArrayList<String>();
	public static ArrayList<String> Cuidadores = new ArrayList<String>();

	// en el main, añadimos la funcion de nuestro menú, y le pedimos al usuario que
	// elija una de sus opciones, tambien dentro de las funciones
	public static void main(String[] args) {
		MenuZoo();
		opciones();

	}

	// creamos para cada opcion, una funcion en la que dentro de dichas funciones,
	// encontramos los metodos del menu
	private static void opciones() {
		int opcion = src.nextInt();

		if (opcion == 1) {
			Boolean continua = true;
			do {
				try {
					opcion1();
					continua = false;
				} catch (AnimalExistenteException A) {
					System.out.println(A.toString());
				}
			} while (continua);
			System.out.println("Finalización del programa");

		} else if (opcion == 2) {
			Boolean continua = true;
			do {
				try {
					opcion2();
					continua = false;
				} catch (HabitatExistenceException H) {
					System.out.println(H.toString());
				}
			} while (continua);
			System.out.println("Finalización del programa");
		} else if (opcion == 3) {
			Boolean continua = true;
			do {
				try {
					opcion3();
					continua = false;
				} catch (CuidadorExistenceException C) {
					System.out.println(C.toString());
				}
			} while (continua);
			System.out.println("Finalización del programa");

		} else if (opcion == 4) {
			opcion4();
		} else if (opcion == 5) {
			opcion5();

		} else if (opcion == 6) {
			opcion6();
		} else if (opcion == 7) {
			opcion7();
		} else if (opcion < 7) {
			System.out.println("Introduce un numero válido");
			MenuZoo();
		}
	}

	private static void MenuZoo() {
		System.out.println("******Escoge una opcion******");
		System.out.println("1. Agregar o eliminar animales del Zoológico");
		System.out.println("2. Agregar o eliminar hábitats del Zoológico");
		System.out.println("3. Agregar o eliminar cuidadores del Zoológico");
		System.out.println("4. Asignar animales a hábitats especificos");
		System.out.println("5. Asignar cuidadores a animales especificos");
		System.out.println("6. Mostrar información de cada animal, hábitat y cuidador");
		System.out.println("7. Mostrar los animales del Zoo ordenados por edad");
	}
// pedimos al usuario, que nos diga si hay que agregar o eliminar el animal, y a su vez, le pedimos que nos diga el tipo de animal que va a agregar
	private static void opcion1() throws AnimalExistenteException {
		System.out.println("Agregar o Eliminar?");
		src.nextLine();
		String opcion = src.nextLine();
		System.out.println("Introduce la variedad del animal (mamifero,ave o reptil)");
		String variedad = src.nextLine();
		if (opcion.equalsIgnoreCase("Agregar") & variedad.equalsIgnoreCase("mamifero")) {
			System.out.println("Introduce el nombre del animal a agregar");
			String nombre = src.nextLine();
			System.out.println("Introduce el genero del animal");
			String genero = src.nextLine();
			System.out.println("Introduce la especie del animal");
			String especie = src.nextLine();
			System.out.println("Introduce la edad del animal");
			int edad = src.nextInt();
			src.nextLine();
			System.out.println("Introduce el tipo de desplazamiento del animal (tierra, mar o aire)");
			String tipo = src.nextLine();
			mamifero animalmamifero = new mamifero(nombre, genero, especie, edad, tipo);
			System.out.println("Animal agregado : " + animalmamifero);
			Animales.add(especie);
			System.out.println("Animales en el Zoo : " + Animales.toString());
		}
		else if (opcion.equalsIgnoreCase("Agregar") & variedad.equalsIgnoreCase("ave")) {
			System.out.println("Introduce el nombre del animal a agregar");
			String nombre = src.nextLine();
			System.out.println("Introduce el genero del animal");
			String genero = src.nextLine();
			System.out.println("Introduce la especie del animal");
			String especie = src.nextLine();
			System.out.println("Introduce la edad del animal");
			int edad = src.nextInt();
			src.nextLine();
			System.out.println("Introduce el tipo de desplazamiento del animal (tierra, mar o aire)");
			String tipo = src.nextLine();
			System.out.println("Introduce la longitud del pico");
			int longitudpico = src.nextInt();
			src.nextLine();
			System.out.println("¿Es un ave rapaz?");
			String rapaz = src.nextLine();
			aves animalaves = new aves(nombre, genero, especie, tipo, edad, longitudpico, rapaz);
			System.out.println("Animal agregado : " + animalaves);
			Animales.add(especie);
			System.out.println("Animales en el Zoo : " + Animales.toString());
		}
		 else if (opcion.equalsIgnoreCase("Agregar") & variedad.equalsIgnoreCase("reptil")) {
			System.out.println("Introduce el nombre del animal a agregar");
			String nombre = src.nextLine();
			System.out.println("Introduce el genero del animal");
			String genero = src.nextLine();
			System.out.println("Introduce la especie del animal");
			String especie = src.nextLine();
			System.out.println("Introduce la edad del animal");
			int edad = src.nextInt();
			src.nextLine();
			System.out.println("Introduce el tipo de desplazamiento del animal (tierra, mar o aire)");
			String tipo = src.nextLine();
			System.out.println("Introduce el color de las escamas");
			String colorescamas = src.nextLine();
			reptiles animalreptiles = new reptiles(nombre, genero, especie, edad, colorescamas);
			System.out.println("Animal agregado : " + animalreptiles);
			Animales.add(especie);
			System.out.println("Animales en el Zoo : " + Animales.toString());

		} else if (opcion.equalsIgnoreCase("Eliminar")) {
			System.out.println("Introduce la especir que quieres eliminar");
			String especie = src.nextLine();
			System.out.println(especie + " eliminado");
			Animales.remove(especie);
			System.out.println("Animales en el Zoo : " + Animales.toString());
		}
		if (Animales.contains(Animales)) {
			AnimalExistenteException excepcionanimales = new AnimalExistenteException();
		}

		MenuZoo();

		opciones();

	}
// en este funcion pedimos al usuario que agregue o elimine un habitat
	private static void opcion2() throws HabitatExistenceException {
		System.out.println("Agregar o Eliminar?");
		src.nextLine();
		String opcion = src.nextLine();
		if (opcion.equalsIgnoreCase("Agregar")) {
			System.out.println("Introduce el hábitat a agregar");
			String habitat = src.nextLine();
			System.out.println(habitat + " agregado");
			Habitats.add(habitat);
			System.out.println("Habitats en el Zoo : " + Habitats.toString());
		} else if (opcion.equalsIgnoreCase("Eliminar")) {
			System.out.println("Introduce el hábitat a eliminar");
			String elimina = src.nextLine();
			Habitats.remove(elimina);
			System.out.println(elimina + " eliminado");
			System.out.println("Habitats en el Zoo : " + Habitats.toString());
		}
		MenuZoo();
		opciones();
	}
// en esta funcion le pedimos si quiere agregar o eliminar un cuidador 
	private static void opcion3() throws CuidadorExistenceException {
		System.out.println("Agregar o Eliminar?");
		src.nextLine();
		String opcion = src.nextLine();
		if (opcion.equalsIgnoreCase("Agregar")) {
			System.out.println("Introduce el nombre del cuidador a agregar");
			String agrega = src.nextLine();
			System.out.println(agrega + " agregado");
			Cuidadores.add(agrega);
			System.out.println("Cuidadores en el Zoo : " + Cuidadores.toString());
		} else if (opcion.equalsIgnoreCase("Eliminar")) {
			System.out.println("Introduce el nombre del cuidador a eliminar");
			String elimina = src.nextLine();
			System.out.println(elimina + " eliminado");
			Cuidadores.remove(elimina);
			System.out.println("Cuidadores en el Zoo : " + Cuidadores.toString());
		}
		MenuZoo();
		opciones();
	}
// en esta funcion le decimos que nos de un animal y que lo agregue en el habitat deseado
	private static void opcion4() {
		src.nextLine();
		System.out.println("Introduce el nombre del animal");
		String animal = src.nextLine();
		System.out.println("Introduce el hábitat");
		String habitat = src.nextLine();
		System.out.println(animal + " agregado en " + habitat);
		MenuZoo();
		opciones();
	}
// en esta funcion le decimos que nos de un cuidador y lo agregue a un animal
	private static void opcion5() {
		src.nextLine();
		System.out.println("Introduce el nombre del cuidador");
		String cuidador = src.nextLine();
		System.out.println("Introduce el animal");
		String animal = src.nextLine();
		System.out.println(cuidador + " agregado a " + animal);
		MenuZoo();
		opciones();
	}
// en esta funcion imprimimos la informacion del zoo
	private static void opcion6() {
		System.out.println("Información del Zoo --> Animales = " + Animales.toString() + ", Hábitats = "
				+ Habitats.toString() + " y Cuidadores = " + Cuidadores.toString());
		MenuZoo();
		opciones();
	}
// en esta funcion introducimos la informacion de los animales pero ordenados por edad
	private static void opcion7() {
		System.out.println("Animales ordenados por edad --> ");
		MenuZoo();
		opciones();
	}

}
