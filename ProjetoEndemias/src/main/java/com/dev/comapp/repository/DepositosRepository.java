package com.dev.comapp.repository;



import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.dev.comapp.models.Amostra;
import com.dev.comapp.models.Depositos;
import com.dev.comapp.models.Enderecos;

public interface DepositosRepository extends JpaRepository<Depositos, Long>{
	
		@Query("select e from Depositos e where e.enderecos.id = ?1")
		List<Depositos>buscarPorIdEnderecos(long id);
	
}