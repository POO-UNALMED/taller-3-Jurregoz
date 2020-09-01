package taller3.televisores;

public class Marca {
	private String nombre = new String();
	
	
	Marca(String nombre){
		this.nombre = nombre;
	}
	
	public void Set(String nuevoNombre){
		this.nombre= nuevoNombre;
	}
	public String getNombre() {
		return this.nombre;
	}
}
