
public class Electrodomestico {
	
	//Usamos protected para indicar que se pueden heredar
	protected double precioBase;
	protected String color;
	protected char consumo;
	protected double peso;
	
	/**
	 * Constructor por defecto
	 */
	public Electrodomestico() {
		color="Blanco";
		consumo='F';
		precioBase=100;
		peso=5;
	}
	
	/**
	 * Constructor con color y consumo por defecto. Precio base y peso por parámetro
	 * @param precioBase
	 * @param peso
	 */
	public Electrodomestico(double precioBase, double peso) {
		this.precioBase=precioBase;
		this.peso=peso;
		color="Blanco";
		consumo='F';
	}
	
	/**
	 * Constructor con variables por parámetro
	 * @param precioBase
	 * @param peso
	 * @param consu
	 * @param color
	 */
	public Electrodomestico(double precioBase, double peso, char consu, String color) {
		this.precioBase=precioBase;
		this.peso=peso;
		//Comprobamos que consumo este entre la A y la F
		if((consu>='A')&&(consu<='F')) {
			consumo=consu;
		}
		//Si el color no es ninguno de los indicados color sera nula
		String[] c= {"negro", "blanco", "rojo", "azul", "gris"};
		boolean trobat=false;
		int i=0;
		while((i<5)&&(trobat==false)) {
			if(color.equalsIgnoreCase(c[i])==true) {
				trobat=true;
			}
			i++;
		}
		if(trobat==true) {
			color=c[i-1];
		}
		else {
			color=null;
		}
	}
	

}
