package br.com.adminfo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.adminfo.model.Grupo;

public interface Grupos extends JpaRepository<Grupo, Long>{

}