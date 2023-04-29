package clase3_p;

public class punto_3_2 {

	public static void main(String[] args) {
		// Ejercicio numero 2, separar una lista de 10 nombres.
		
		 String nombres = "1-Juan Perez,2-Jose Carrera,3-Jose Campagna,4-Ignacio Campagna,5-Alario Segundo,6-Maria Mendoza,7-Rosario del Carmen,8-Sofia Kaw,9-Elena Mayor,10-Argentino Vera";
	        String nombresSplit[] = nombres.split(",");

	        System.out.println("Los diez nombres son: ");
	        for (String elemento : nombresSplit) {
	            System.out.println(elemento);
	    }
	}

}
