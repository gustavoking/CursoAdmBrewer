package br.com.adminfo.service.event;

import br.com.adminfo.model.Venda;

public class VendaEvent {

	private Venda venda;
	
	public VendaEvent(Venda venda) {
		this.venda = venda;
	}
	
	public Venda getVenda() {
		return venda;
	}
}
