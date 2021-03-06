package com.carlesramos.model;
// Generated 12 feb. 2020 15:47:26 by Hibernate Tools 5.2.12.Final

/**
 * RankingJugadores generated by hbm2java
 */
public class RankingJugadores implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String jugador;
	private Jugadores jugadores;
	private Integer partidasGanadas;
	private Integer partidasPerdidas;
	private Integer partidasEmpatadas;

	public RankingJugadores() {
	}

	public RankingJugadores(Jugadores jugadores) {
		this.jugadores = jugadores;
	}

	public RankingJugadores(Jugadores jugadores, Integer partidasGanadas, Integer partidasPerdidas,
			Integer partidasEmpatadas) {
		this.jugadores = jugadores;
		this.partidasGanadas = partidasGanadas;
		this.partidasPerdidas = partidasPerdidas;
		this.partidasEmpatadas = partidasEmpatadas;
	}

	public String getJugador() {
		return this.jugador;
	}

	public void setJugador(String jugador) {
		this.jugador = jugador;
	}

	public Jugadores getJugadores() {
		return this.jugadores;
	}

	public void setJugadores(Jugadores jugadores) {
		this.jugadores = jugadores;
	}

	public Integer getPartidasGanadas() {
		return this.partidasGanadas;
	}

	public void setPartidasGanadas(Integer partidasGanadas) {
		this.partidasGanadas = partidasGanadas;
	}

	public Integer getPartidasPerdidas() {
		return this.partidasPerdidas;
	}

	public void setPartidasPerdidas(Integer partidasPerdidas) {
		this.partidasPerdidas = partidasPerdidas;
	}

	public Integer getPartidasEmpatadas() {
		return this.partidasEmpatadas;
	}

	public void setPartidasEmpatadas(Integer partidasEmpatadas) {
		this.partidasEmpatadas = partidasEmpatadas;
	}

}
