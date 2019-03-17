package it.polito.tdp.libretto;

import java.time.*;

public class Voto {
	private int punti;
	private String corso;
	private LocalDate data;
	public Voto(int voto, String corso, LocalDate data) {
		super();
		this.punti = voto;
		this.corso = corso;
		this.data = data;
	}
	public int getVoto() {
		return punti;
	}
	public void setVoto(int voto) {
		this.punti = voto;
	}
	public String getCorso() {
		return corso;
	}
	public void setCorso(String corso) {
		this.corso = corso;
	}
	public LocalDate getData() {
		return data;
	}
	public void setData(LocalDate data) {
		this.data = data;
	}
	
	@Override
	public String toString() {
		return "Voto [voto=" + punti + ", corso=" + corso + ", data=" + data + "]";
	}
	
	
}
