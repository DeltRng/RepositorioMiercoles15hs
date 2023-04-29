package clase3_p;

public class punto_3_1_a {

	public static void main(String[] args) {
		// contar la aparicion de una letra en un string.
		
	      String dadounString = "Hola Mundo de locos";
	      	       
	      char buscarLetra = 'o';
	      
	      int count = 0;
	      
	      for(int i=0; i < dadounString.length(); i++)
	      {
	        if(dadounString.charAt(i) == buscarLetra) 
	        {
	            count++;
	        }
	        
	      }
	      System.out.println("el caracter "+buscarLetra+" aparece repetidamente "+count+" veces");
	    }
	
	}


