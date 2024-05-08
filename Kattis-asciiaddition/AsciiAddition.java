import java.util.HashMap;
import java.util.Scanner;

public class AsciiAddition {

	public static void main(String[] args) {
		String[][] cero = { { "x", "x", "x", "x", "x" }, { "x", ".", ".", ".", "x" }, { "x", ".", ".", ".", "x" },
				{ "x", ".", ".", ".", "x" }, { "x", ".", ".", ".", "x" }, { "x", ".", ".", ".", "x" },
				{ "x", "x", "x", "x", "x" } };
		String[][] uno = { { ".", ".", ".", ".", "x" }, { ".", ".", ".", ".", "x" }, { ".", ".", ".", ".", "x" },
				{ ".", ".", ".", ".", "x" }, { ".", ".", ".", ".", "x" }, { ".", ".", ".", ".", "x" },
				{ ".", ".", ".", ".", "x" } };
		String[][] dos = { { "x", "x", "x", "x", "x" }, { ".", ".", ".", ".", "x" }, { ".", ".", ".", ".", "x" },
				{ "x", "x", "x", "x", "x" }, { "x", ".", ".", ".", "." }, { "x", ".", ".", ".", "." },
				{ "x", "x", "x", "x", "x" } };
		String[][] tres = { { "x", "x", "x", "x", "x" }, { ".", ".", ".", ".", "x" }, { ".", ".", ".", ".", "x" },
				{ "x", "x", "x", "x", "x" }, { ".", ".", ".", ".", "x" }, { ".", ".", ".", ".", "x" },
				{ "x", "x", "x", "x", "x" } };
		String[][] cuatro = { { "x", ".", ".", ".", "x" }, { "x", ".", ".", ".", "x" }, { "x", ".", ".", ".", "x" },
				{ "x", "x", "x", "x", "x" }, { ".", ".", ".", ".", "x" }, { ".", ".", ".", ".", "x" },
				{ ".", ".", ".", ".", "x" } };
		String[][] cinco = { { "x", "x", "x", "x", "x" }, { "x", ".", ".", ".", "." }, { "x", ".", ".", ".", "." },
				{ "x", "x", "x", "x", "x" }, { ".", ".", ".", ".", "x" }, { ".", ".", ".", ".", "x" },
				{ "x", "x", "x", "x", "x" } };
		String[][] seis = { { "x", "x", "x", "x", "x" }, { "x", ".", ".", ".", "." }, { "x", ".", ".", ".", "." },
				{ "x", "x", "x", "x", "x" }, { "x", ".", ".", ".", "x" }, { "x", ".", ".", ".", "x" },
				{ "x", "x", "x", "x", "x" } };
		String[][] siete = { { "x", "x", "x", "x", "x" }, { ".", ".", ".", ".", "x" }, { ".", ".", ".", ".", "x" },
				{ ".", ".", ".", ".", "x" }, { ".", ".", ".", ".", "x" }, { ".", ".", ".", ".", "x" },
				{ ".", ".", ".", ".", "x" } };
		String[][] ocho = { { "x", "x", "x", "x", "x" }, { "x", ".", ".", ".", "x" }, { "x", ".", ".", ".", "x" },
				{ "x", "x", "x", "x", "x" }, { "x", ".", ".", ".", "x" }, { "x", ".", ".", ".", "x" },
				{ "x", "x", "x", "x", "x" } };
		String[][] nueve = { { "x", "x", "x", "x", "x" }, { "x", ".", ".", ".", "x" }, { "x", ".", ".", ".", "x" },
				{ "x", "x", "x", "x", "x" }, { ".", ".", ".", ".", "x" }, { ".", ".", ".", ".", "x" },
				{ "x", "x", "x", "x", "x" } };
		String[][] mas = { { ".", ".", ".", ".", "." }, { ".", ".", "x", ".", "." }, { ".", ".", "x", ".", "." },
				{ "x", "x", "x", "x", "x" }, { ".", ".", "x", ".", "." }, { ".", ".", "x", ".", "." },
				{ ".", ".", ".", ".", "." } };
		HashMap<Integer, String[][]> prueba2 = new HashMap<>();
		prueba2.put(0, cero);
		prueba2.put(1, uno);
		prueba2.put(2, dos);
		prueba2.put(3, tres);
		prueba2.put(4, cuatro);
		prueba2.put(5, cinco);
		prueba2.put(6, seis);
		prueba2.put(7, siete);
		prueba2.put(8, ocho);
		prueba2.put(9, nueve);
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			String[][] datosLeidos = { { sc.nextLine() }, { sc.nextLine() }, { sc.nextLine() }, { sc.nextLine() },
					{ sc.nextLine() }, { sc.nextLine() }, { sc.nextLine() } };
			System.out.println(datosLeidos.length);
			for (int i = 1; i < datosLeidos.length-1; i++) {
				for (int j = 0; j < 5; j++) {
					String [][]temp = new String[7][5];
					temp[i-1][j]=datosLeidos[i-1][j];
				}
				if(i%5==0) {
					
				}
			}
		}		

	}

}
