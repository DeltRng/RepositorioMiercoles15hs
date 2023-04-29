package clase3_p;

public class punto_3_1_c {

	public static void main(String[] args) {
		
		 int vectNume[] = new int[4];
	        vectNume[0] = 4;
	        vectNume[1] = 33;
	        vectNume[2] = 52;
	        vectNume[3] = 66;

	        int numero_X = 40;
	        int suma=0;

	        for (int i = 0; i < vectNume.length; i++) {
	            if (vectNume[i] > numero_X) 
	            {
	                suma += vectNume[i];
	            }
	            
	        }
	        System.out.println("La suma de los numeros > a X es: " + suma);
	        
	}

}
