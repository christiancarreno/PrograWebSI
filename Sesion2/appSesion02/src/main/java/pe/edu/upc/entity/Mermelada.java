package pe.edu.upc.entity;

public class Mermelada extends Fruta {
	
	protected int tiempoPreparacion;
	protected String tipoEnvase;
	
	public Mermelada(String color, String sabor, int tiempoPreparacion, String tipoEnvase) {
		super(color, sabor);
		// TODO Auto-generated constructor stub
		this.tiempoPreparacion=tiempoPreparacion;
		this.tipoEnvase=tipoEnvase;
	}

	public int getTiempoPreparacion() {
		return tiempoPreparacion;
	}

	public void setTiempoPreparacion(int tiempoPreparacion) {
		this.tiempoPreparacion = tiempoPreparacion;
	}

	public String getTipoEnvase() {
		return tipoEnvase;
	}

	public void setTipoEnvase(String tipoEnvase) {
		this.tipoEnvase = tipoEnvase;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}

}
