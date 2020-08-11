
public class Libro {
	
	private int codigo, cantidadexistente;
	private String titulo, autor;
	private double precio;
	
	public Libro(int codigo, int cantidadexistente, String titulo, String autor, double precio) {
		super();
		this.codigo = codigo;
		this.cantidadexistente = cantidadexistente;
		this.titulo = titulo;
		this.autor = autor;
		this.precio = precio;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public int getCantidadexistente() {
		return cantidadexistente;
	}

	public void setCantidadexistente(int cantidadexistente) {
		this.cantidadexistente = cantidadexistente;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	@Override
	public String toString() {
		String a = "CODIGO: "+codigo +" CANTIDAD EXISTENTE: "+cantidadexistente+" TITULO: "+titulo+ " AUTOR: "+ autor+" PRECIO: "+precio;
		return a;
	}
	
	
	
	
	
	
}
