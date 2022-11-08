package com.ever.everlog.domain.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ever.everlog.domain.model.Cliente;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long>{

	
	List<Cliente> findByNome(String nome);
	List<Cliente> findByNomeContaining(String nome);
}
