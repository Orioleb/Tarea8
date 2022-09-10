
public class Serie {
	private String titulo;
	private int ntemporadas;
	private boolean entregado;
	private String creador;
	
	/**
	 * Constructor por defecto
	 */
	public Serie() {
		titulo="";
		ntemporadas=3;
		entregado=false;
		creador="";
	}
	/**
	 * Constructor por defecto menos titulo y creador
	 * @param titulo
	 * @param creador
	 */
	public Serie(String titulo, String creador) {
		this.titulo=titulo;
		ntemporadas=3;
		entregado=false;
		this.creador=creador;
	}
	/**
	 * Constructor por parámetro menos atributo entregado
	 * @param titulo
	 * @param ntemporadas
	 * @param creador
	 */
	public Serie(String titulo, int ntemporadas, String creador) {
		this.titulo=titulo;
		this.ntemporadas=ntemporadas;
		entregado=false;
		this.creador=creador;
	}

}
