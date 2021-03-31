package br.com.mr.jack.concierge.service;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import br.com.mr.jack.concierge.models.Morador;
import br.com.mr.jack.concierge.repository.MoradorRepository;

@Service
public class MoradorService {

	@Autowired
	private MoradorRepository moradorRepository;

	public List<Morador> findAll() {
		return moradorRepository.findAll();
	}

	public Morador findById(long id) {
		return moradorRepository.findById(id);
	}

	public Morador save(Morador Morador) {
		Morador.setDataCriacao(LocalDateTime.now());
		return moradorRepository.save(Morador);
	}

	public void delete(Morador Morador) {
		moradorRepository.delete(Morador);
	}

	public Morador update(@RequestBody Morador Morador) {
		Morador.setDataAtualizacao(LocalDateTime.now());
		return moradorRepository.save(Morador);
	}

}
