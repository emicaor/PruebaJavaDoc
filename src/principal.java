/**
 * Creamos la clase principal para empezar a usar los datos
 * @author Alumno_T
 *
 */
public class principal {

	public static void main(String[] args) {
		
		// Creamos dos repartidores
		/**
		 * Introducimos dos repartidores añadiendo los parametros a mano
		 */
		repartidor r1=new repartidor("Pepe",25,2100,"zona 1");
		repartidor r2=new repartidor("Juan",20,2000,"zona 3"); //cumple las características para recibir un plus
		
		//llamamos al método plus
		System.out.println("\nRepartidores:");
		/**
		 * Comprobamos según los datos que hemos introducido, si pueden o no cobrar el plus
		 */
		r1.plus();
		r2.plus();
		
			
		//Mostramos los resultados
	
		/**
		 * Llamamos al método para mostar si reciben el plus o no
		 */
		System.out.println(r1);
		System.out.println(r2);
		
		//Creamos dos comerciales
		
		/**
		 * Introducimos dos comerciales añadiendo los parametros a mano
		 */
		comercial c1= new comercial ("Marta",25,2200,100);
		comercial c2= new comercial ("Paula",36,2500,300);
	
		
	//llamamos al método plus
		
		/**
		 * Comprobamos según los datos que hemos introducido, si pueden o no cobrar el plus
		 */
		System.out.println("\nComerciales:");
		c1.plus();
		c2.plus();
		
			
		//Mostramos los resultados

		/**
		 * Llamamos al método para mostar si reciben el plus o no
		 */
		System.out.println(c1);
		System.out.println(c2);
		
		

	}

}
