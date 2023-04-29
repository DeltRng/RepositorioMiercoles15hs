package clase3_p;

public class Punto_1_3 {

	public static void main(String[] args) {
		
		int vector2[] = {1,2,3,4,5 ,45,78,90, 21};
		int x = 40;
		int suma = 0;
		
		for (int i=0; i< vector2.length; i++) {
			if (vector2 [i] > x) {
				suma = suma + vector2[i];
			}
			
		}
		System.out.println("La suma es: "+ suma);
	}
}