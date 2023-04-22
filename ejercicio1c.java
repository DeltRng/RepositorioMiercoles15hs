package EntregaTP1;

public class ejercicio1c {

	public static void main(String[] args) {
		int numeroInicio=5;
		int numeroFin=14;

//variable booleana
		boolean pares=true;
		
		while(numeroInicio<numeroFin) {
			
			if(pares==true) {
				
						
			if(numeroInicio %2 == 0) {
				
				System.out.println(numeroInicio);
				System.out.println("Muestro los pares");
				
				}
			numeroInicio +=1;
			
			}
			else {
				
				
				if(numeroInicio %2 != 0) {
					
					System.out.println(numeroInicio);
					System.out.println("Muestro los impares");
				}
				numeroInicio +=1;
				
			}
						
		
		
			}		
		}

	}

