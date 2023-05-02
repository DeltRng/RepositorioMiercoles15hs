package clase_4_pack;

import java.nio.file.Paths;

public class clase4_ejercicio_3_ {

	public static void main(String[] args) {
		String nombres = "1-Juan Perez,2-Jose Carrera,3-Jose Campagna,4-Ignacio Campagna,5-Alario Segundo,6-Maria Mendoza,7-Rosario del Carmen,8-Sofia Kaw,9-Elena Mayor,10-Argentino Vera";
		String[] nombre = nombres.split(" ");
		Path archivo = Paths.get("C:\\Users\\DESKTOP\\eclipse-workspace\\clase_4\\src\\clase_4_pack\\nombres.txt");
		for( String nomb : nombre)
			try {
				Files.writestring(archivo,nomb.concat("\r\n"),StandardOpenOption.APPEND);
			} catch (IOException e) {
				System.out.println("No hay archivo");
			}

		
	}

}
