import java.util.Scanner;
import java.util.ArrayList;

public class LeerArrList {
	
	public static void main(String[] argv) {
		Scanner scanner = new Scanner(System.in);

		ArrayList<Integer> arreglo = new ArrayList<>();

		System.out.println("----- Leer 10 números y comprobar si está ordenado -----");

		for (int i = 0; i < 10; i++) {
			System.out.print("Escribe un número: ");
			int num = scanner.nextInt();
			arreglo.add(num);
		}

		int estado = 0; // Desordenado

		for (int i = 0; i < arreglo.size() - 1; i++) {
			if (arreglo.get(i) > arreglo.get(i+1)) { // Descendente
				if (estado == 2) {
					estado = 0; // Desordenado
					break;
				}
				estado = 1; // Descendente
			} else if (arreglo.get(i) < arreglo.get(i+1)) { // Ascendente
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

		scanner.close();
	}
}
