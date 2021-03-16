package br.com.mr.jack.concierge.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.mr.jack.concierge.models.Morador;

public interface MoradorRepository extends JpaRepository<Morador, Long>{
	Morador findById(long id);
}


