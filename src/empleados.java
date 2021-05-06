/**
 * Para empezar creamos la clase abstracta empleados
 * @author Alumno_T
 *
 */
public abstract class empleados {
	private String nombre;
	private int edad;
	private double salario;
	protected final double PLUS=300;
	
	/**
	 * Aquí creamos cada constructor, por defecto, por parametros y el copia
	 */
	// constructores
	
	//Constructor por defecto
	
	public empleados() 
	{
		
	};
	
	//Constructor con parámetros
	
	/**
	 * 
 	 * @param nombre - Guarda el nombre del comercial
	 * @param edad - Guarda la edad del comercial
	 * @param salario - Guarda el salario del comercial
	 */
	public empleados(String nombre,int edad,double salario) {
		this.nombre=nombre;
		this.edad=edad;
		this.salario=salario;
	}
	
	//Constructor copia
	
	public empleados(final  empleados e) {
		nombre=e.nombre;
		edad=e.edad;
		salario=e.salario;
	}
	
	
	//Getters y setters
	
	/**
	 * @return Creamos los getters y el setters para poder tratar los datos del constructor.
	 * El set guarda el dato y el get lo devuelve cuando lo llamemos.
	 */
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	//método toString
	/**
	 * Creamos un toString que muestre cada dato del empleado y se pueda usar en otras 
	 * clases sobreescribiendolo
	 */
	@Override
	public String toString() {
		return "Empleado nombre=" + nombre + ", edad=" + edad + ", salario=" + salario + ", PLUS=" + PLUS ;
	}
	
	//metodo plus, es abstarcto, obliga a la clases hijas a implementar este método
	/**
	 * @return Creamos el método plus abstracto, para obligar a las clases hijas a implementar 
	 * este método
	 */
	public abstract boolean plus();

}
