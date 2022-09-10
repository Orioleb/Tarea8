
public class Persona {
	private String nombre;
	private int edad;
	private String DNI;
	final char sexo;
	private double peso;
	private double altura;
	
	/**
	 * Constructor por defecto
	 */
	public Persona() {
		nombre="";
		edad=0;
		sexo='H'; //hombre por default
		peso=0;
		altura=0;
		DNI="";
	}
	/**
	 * Constructor con 3 variables por parametro(nombre, edad, sexo)
	 * @param nombre
	 * @param edad
	 * @param sexo
	 */
	public Persona(String nombre, int edad, char sexo) {
		this.nombre=nombre;
		this.edad=edad;
		this.sexo=sexo;
		peso=0;
		altura=0;
		DNI="";
	}
	/**
	 * Metodo constructor por parametro
	 * @param nom
	 * @param edad
	 * @param peso
	 * @param altura
	 * @param DNI
	 */
	public Persona(String nom, int edad, double peso,double altura, String DNI, final char sexo) {
		this.nombre=nom;
		this.edad=edad;
		this.peso=peso;
		this.altura=altura;
		this.DNI=DNI;
		this.sexo=sexo;
	}
	
	

}
