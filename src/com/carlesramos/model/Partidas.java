package com.carlesramos.model;
// Generated 12 feb. 2020 13:14:37 by Hibernate Tools 5.2.12.Final

/**
 * Partidas generated by hbm2java
 */
public class Partidas implements java.io.Serializable {

	private static final long serialVersionUID = 1L;
	private Integer idPartida;
	private String jugadorA;
	private String jugadorB;
	private String ganador;

	public Partidas() {
	}

	public Partidas(String jugadorA, String jugadorB, String ganador) {
		this.jugadorA = jugadorA;
		this.jugadorB = jugadorB;
		this.ganador = ganador;
	}

	public Integer getIdPartida() {
		return this.idPartida;
	}

	public void setIdPartida(Integer idPartida) {
		this.idPartida = idPartida;
	}

	public String getJugadorA() {
		return this.jugadorA;
	}

	public void setJugadorA(String jugadorA) {
		this.jugadorA = jugadorA;
	}

	public String getJugadorB() {
		return this.jugadorB;
	}

	public void setJugadorB(String jugadorB) {
		this.jugadorB = jugadorB;
	}

	public String getGanador() {
		return this.ganador;
	}

	public void setGanador(String ganador) {
		this.ganador = ganador;
	}

}
