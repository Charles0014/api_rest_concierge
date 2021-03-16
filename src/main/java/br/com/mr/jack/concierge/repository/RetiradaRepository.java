package br.com.mr.jack.concierge.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.mr.jack.concierge.models.Retirada;

public interface RetiradaRepository extends JpaRepository<Retirada, Long> {
	Retirada findById(long id);
}
