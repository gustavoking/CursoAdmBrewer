package br.com.adminfo.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.adminfo.model.Cidade;
import br.com.adminfo.model.Estado;
import br.com.adminfo.repository.helper.cidades.CidadesQueries;

public interface Cidades extends JpaRepository<Cidade, Long>, CidadesQueries {

	List<Cidade> findByEstadoCodigo(Long codigoEstado);

	Optional<Cidade> findByNomeAndEstado(String nome, Estado estado);

}
