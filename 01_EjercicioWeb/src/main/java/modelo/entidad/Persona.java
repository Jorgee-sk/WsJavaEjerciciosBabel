package modelo.entidad;

public class Persona {

	private String nombre;
	private String apellido;
	private int peso;
	
	public Persona() {
		super();
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre_) {
		this.nombre = nombre_;
	}
	
	public String getApellido() {
		return apellido;
	}
	
	public void setApellido(String apellido_) {
		this.apellido = apellido_;
	}
	
	public int getPeso() {
		return peso;
	}
	
	public void setPeso(int peso_) {
		this.peso = peso_;
	}
	
	
}
