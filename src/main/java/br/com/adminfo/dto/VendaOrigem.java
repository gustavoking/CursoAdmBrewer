package br.com.adminfo.dto;

public class VendaOrigem {
	
	private String mes;
	private Integer totalNacional;
	private Integer totalInternacional;
	
	public VendaOrigem() {
		super();
	}
	
	public VendaOrigem(String mes, Integer totalNacional, Integer totalInternacional) {
		super();
		this.mes = mes;
		this.totalNacional = totalNacional;
		this.totalInternacional = totalInternacional;
	}

	public String getMes() {
		return mes;
	}

	public void setMes(String mes) {
		this.mes = mes;
	}

	public Integer getTotalNacional() {
		return totalNacional;
	}

	public void setTotalNacional(Integer totalNacional) {
		this.totalNacional = totalNacional;
	}

	public Integer getTotalInternacional() {
		return totalInternacional;
	}

	public void setTotalInternacional(Integer totalInternacional) {
		this.totalInternacional = totalInternacional;
	}

}