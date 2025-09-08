package br.com.adminfo.service.event;

import org.springframework.util.StringUtils;

import br.com.adminfo.model.Cerveja;

public class CervejaSalvaEvent {

	private Cerveja cerveja;
	
	public CervejaSalvaEvent(Cerveja cerveja) {
		this.cerveja = cerveja;
	}
	
	public Cerveja getCerveja() {
		return cerveja;
	}
	
	public boolean temFoto() {
		return !StringUtils.isEmpty(cerveja.getFoto());
	}
}