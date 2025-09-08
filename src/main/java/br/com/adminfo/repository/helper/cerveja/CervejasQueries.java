package br.com.adminfo.repository.helper.cerveja;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import br.com.adminfo.dto.CervejaDTO;
import br.com.adminfo.dto.ValorItensEstoque;
import br.com.adminfo.model.Cerveja;
import br.com.adminfo.repository.filter.CervejaFilter;

public interface CervejasQueries {
	
	public Page<Cerveja> filtrar(CervejaFilter cervejaFilter, Pageable pageable);
	
	public List<CervejaDTO> porSkuOuNome(String skuOuNome);
	
	public ValorItensEstoque valorItensEstoque();

}