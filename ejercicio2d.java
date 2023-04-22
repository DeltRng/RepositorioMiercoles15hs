package EntregaTP1;

public class ejercicio2d {

	public static void main(String[] args) {
		//2.d cuales son las variables de entrada
		/*pueden cambiar estas variables para ir probando*/
		// uso del operador OR  || en ves del &&.
		
		float ingresos_mensuales = 199000;
		int vehiculos = 4;
		int inmuebles = 1;
		int embarcacion = 0;
		int aeronave = 0;
		int activosSocietarios = 0;
		
		
		if (ingresos_mensuales >= 489083 || vehiculos>3 || embarcacion>=1 || aeronave>=1 ||activosSocietarios>=1) 
				{
				System.out.println("Ingresos Altos");
				
			} else if(ingresos_mensuales <= 489083  || vehiculos<3 || embarcacion<=1 || aeronave<=1 ||activosSocietarios<=1) 
				{
					
				System.out.println("No pertenece al segmento de ingresos altos");
				
				}
		
			}

}
