package taller3.televisores;

public class TV {
	private Marca marca;
	private int canal = 1;
	private int precio = 500;
	private boolean estado;
	private int volumen = 1;
	private Control control;
	private static int numTV = 0;
	
	public TV(Marca marca, boolean estado) {
		this.marca = marca;
		this.estado = estado;
		this.numTV += 1;
	}
	
	public int getCanal() {
		return canal;
	}
	
	public Marca getMarca() {
		return marca;
	}
	
	public int getPrecio() {
		return precio;
	}
	
	
	public int getVolumen() {
		return volumen;
	}
	
	public Control getControl() {
		return control;
	}
	
	static public int getNumTV() {
		return numTV;
	}
	
	static public void setNumTV(int num) {
		numTV = num;
	}
	
	public void setCanal(int canal) {
		this.canal = canal;
	}
	
	public void setMarca(Marca marca) {
		this.marca = marca;
	}
	
	public void setPrecio(int precio) {
		this.precio = precio;
	}
	
	public void setVolumen(int volumen) {
		this.volumen = volumen;
	}
	
	public void setControl(Control control) {
		this.control = control;
	}
	
	public void turnOn() {
		this.estado = true;
	}
	
	public void turnOff() {
		this.estado = false;
	}
	
	public boolean getEstado() {
		return this.estado;
	}
	
	public void canalUp() {
		if (this.canal <= 120 && this.estado == true) {
			this.canal++;
		}
	}

	public void canalDown() {
		if (this.canal >= 0 && this.estado == true) {
			this.canal--;
		}
	}
	
	public void volumenUp() {
		if(this.volumen <8 && this.estado == true) { //condiciones para
			this.volumen ++;						 //subir volumen
		}
		else {
			return;
		}
	}
	
	public void volumenDown() {
		if(this.volumen >=0 && this.estado == true) { //Condiciones para
			this.volumen --;						  //bajar volumen

		}
		else {
			return;
		}
	}
}

