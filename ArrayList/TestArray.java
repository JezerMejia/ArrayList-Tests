import java.util.ArrayList;
import java.util.HashMap;

public class TestArray {
	public TestArray() {}

	public static void main(String[] argv) {
		System.out.println("------ Arrays sencillos ------");

		int arra[];
		arra = new int[30];
		int array[] = new int[10];

		for (int i = 0; i < array.length; i++) {
			array[i] = i;
		}

		for (int i = 0; i < array.length; i++) {
			System.out.printf("%d\n", array[i]);
		}

		System.out.printf("Array: Longitud - %d\n", array.length);
		System.out.printf("Arra: Longitud - %d\n", arra.length);

		System.out.println("------ ArrayList -------");

		ArrayList<Integer> aList = new ArrayList<>();
		aList.add(30);
		aList.add(50);
		System.out.println(aList);

		aList.remove(0);
		aList.clear();

		for (int i = 0; i < aList.size(); i++) {
			Integer value = aList.get(i);
			System.out.println(value);
		}
		for (Integer value : aList) {
			System.out.println(value);
		}

		HashMap<Integer, String> hasmap = new HashMap<>();

		Integer arregloList[] = (Integer[]) aList.toArray();

		System.out.println(aList);
	}
}
