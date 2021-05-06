/**
 * Creamos otr clase extendida de empleados, repartidor
 * @author Alumno_T
 *
 */
public class repartidor extends empleados {
	private String zona;
	
	/**
	 * 
	 * @param nombre - Obtiene el nombre del comercial de la clase empleados
     * @param edad - Obtiene la edad del comercial de la clase empleados
     * @param salario - Obtiene el salario del comercial de la clase empleados
	 * @param zona - Añadimos el parametro zona, para el repartidor
	 */
	//constructor
	public repartidor(String nombre, int edad, double salario,String zona) {
		super(nombre,edad,salario);
		this.zona=zona;
		
		
	}
	
	//geters y seters

	/**
	 * @return Creamos el set y get que nos permita manejar el dato de zona
	 */
	public String getZona() {
		return zona;
	}

	public void setZona(String zona) {
		this.zona = zona;
	}
	
//método to string
	/**
	 * Creamos el metodo toString heredado de empleados para sobreescribirlo y añadir el dato
	 * zona, cuando el empleado sea un repartidor
	 */
	@Override
	public String toString() {
		
		return super.toString() + " zona= " + zona  ;
	}
	// método plus
	
	/**
	 * Creamos el método plus, dondecalculamos el plus de salario del repartidor
	 */
	public boolean plus() {
		
		/**
		 * En este caso añadimos un if para comprobar si la edad y la zona son las necesarias
		 * para obtener el plus
		 */
		if(super.getEdad()<25 && zona.equalsIgnoreCase("zona 3")) {
			
			//Si tiene menos de 25 y está en la zona 3 recibe el plus
			//hay que modificar el salario
			double nuevoSalario=super.getSalario()+super.PLUS;
			super.setSalario(nuevoSalario);
			System.out.println("El repartidor "+super.getNombre()+" recibe el plus");
			return true;
		}
		else
			return false;
		
	}

}

