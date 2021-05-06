/**
 * Creamos una clase extendida de empleados
 * @author Alumno_T
 *
 */
public class comercial extends empleados{
	private double comision;
/**
 * 
 * @param nombre - Obtiene el nombre del comercial de la clase empleados
 * @param edad - Obtiene la edad del comercial de la clase empleados
 * @param salario - Obtiene el salario del comercial de la clase empleados
 * @param comision - Guarda la comision del comercial
 */
	//Contructor
	public comercial(String nombre, int edad, double salario,double comision) {
		super(nombre,edad,salario);
		this.comision=comision;
		
	}
	
	//getters y setters
	
	/**
	 * 
	 * @return Creamos el get y el set para poder tratar los datos de la comision.
	 * El set calcula el dato y lo guarda, y el get lo devuelve cuando lo llamemos.
	 */
	public double getComision() {
		return comision;
	}

	public void setComision(double comision) {
		this.comision = comision;
	}

	/**
	 * Creamos un toString sobreescrito para mostrar el dato de la comision del comercial
	 */
	@Override
	public String toString() {
		return super.toString() + "comision=" + comision ;
	}
	
	//método plus
	
	/**
	 * Creamos un método llamdo plus para calcular el plus de salario del comercial
	 */
	public boolean plus() {
		
		/**
		 * Hacemos un if para comprobar que el comercial pueda cobrarlo o no
		 */
		if (super.getEdad()>30 && this.comision>200) {
			
			//si cumple las características hay que modificar el salario 
			//añadiendole el PLUS
			double nuevoSalario=super.getSalario()+super.PLUS;
			super.setSalario(nuevoSalario);
			System.out.println("El comercial "+super.getNombre()+" recibe el Plus");
			return true;
		}
		else
			return false;
	}
	

	
	

}