package br.com.adminfo.dto;

import java.time.LocalDate;

public class PeriodoRelatorio {
	
	private LocalDate dataInicio;
	private LocalDate dataTermino;
	
	public LocalDate getDataInicio() {
		return dataInicio;
	}
	
	public void setDataInicio(LocalDate dataInicio) {
		this.dataInicio = dataInicio;
	}
	
	public LocalDate getDataTermino() {
		return dataTermino;
	}
	
	public void setDataTermino(LocalDate dataTermino) {
		this.dataTermino = dataTermino;
	}

}