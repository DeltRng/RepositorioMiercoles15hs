package clase_4_pack;

import java.io.IOException;

public class clas4_ejercicio_2_a {

	public static void main(String[] args) {
		sumarNumerosArchivoYMostrar("C:\\Users\\DESKTOP\\eclipse-workspace\\clase_4\\src\\clase_4_pack\\numeros.txt");
		sumarOMultiplicarNumerosArchivoYMostrar("C:\\Users\\DESKTOP\\eclipse-workspace\\clase_4\\src\\clase_4_pack\\numeros.txt",'m');
	}
	
	private static void sumarNumerosArchivoYMostrar(String str) {
		int suma=0;
		Path archivo = Paths.get(str);
		try {
			for (String linea : Files.readAllLines(archivo)) {
				for (String num : linea.split(" ")) {
					suma += Integer.parseInt(num);
				}
			}
		} catch (IOException e) {
			System.out.println("No hay archivo");
		}
		System.out.println(suma);
	}
	
	private static void sumarOMultiplicarNumerosArchivoYMostrar(String str, char operacion) {
		int suma=0;
		if (operacion == 'm') suma=1;
		Path archivo = Paths.get(str);
		try {
			for (String linea : Files.readAllLines(archivo)) {
				for (String num : linea.split(" ")) {
					if (operacion == 's') suma += Integer.parseInt(num);
					else if (operacion == 'm') suma *= Integer.parseInt(num);
				}
			}
		} catch (IOException e) {
			System.out.println("No hay archivo");
		}
		System.out.println(suma);
	}

}