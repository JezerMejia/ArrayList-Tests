import java.util.Scanner;

public class Leer {
	
	public static void main(String[] argv) {
		Scanner scanner = new Scanner(System.in);

		int arreglo[] = new int[10];

		System.out.println("----- Leer 10 números y comprobar si está ordenado -----");

		for (int i = 0; i < arreglo.length; i++) {
			System.out.print("Escribe un número: ");
			int num = scanner.nextInt();
			arreglo[i] = num;
		}

		int estado = 0; // Desordenado

		for (int i = 0; i < arreglo.length - 1; i++) {
			if (arreglo[i] > arreglo[i+1]) { // Descendente
				if (estado == 2) {
					estado = 0; // Desordenado
					break;
				}
				estado = 1; // Descendente
			} else if (arreglo[i] < arreglo[i+1]) { // Ascendente
				if (estado == 1) {
					estado = 0; // Desordenado
					break;
				}
				estado = 2; // Ascendente
			}
		}

		if (estado == 0) {
			System.out.printf("El arreglo está desordenado\n");
		} else if (estado == 1) {
			System.out.printf("El arreglo está ordenado en forma descendente\n");
		} else if (estado == 2) {
			System.out.printf("El arreglo está ordenado en forma ascendente\n");
		}
	}
}
