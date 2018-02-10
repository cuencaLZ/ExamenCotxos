package org.mvpigs.Cortxos;

public class Carrera {
	private int tiempoCarrera=0;
	private int tiempoEsperado=0;
	private int costeTotal=0;
	private String conductor=null;
	private String TarjetaCredito;
	
	private Carrera(String tarjetaCredito) {
		return this.TarjetaCredito;
	}
	public int getTiempoCarrera() {
		return this.tiempoCarrera;
	}
	public void setTiempoCarrera(int tiempoCarrera) {
		this.tiempoCarrera = tiempoCarrera;
	}
	public int getTiempoEsperado() {
		return tiempoEsperado;
	}
	public void setTiempoEsperado(int tiempoEsperado) {
		this.tiempoEsperado = tiempoEsperado;
	}
	public int getCosteTotal() {
		return costeTotal;
	}
	public void setCosteTotal(int costeTotal) {
		this.costeTotal = costeTotal;
	}
	public String getConductor() {
		return conductor;
	}
	public void setConductor(String conductor) {
		this.conductor = conductor;
	}
}
