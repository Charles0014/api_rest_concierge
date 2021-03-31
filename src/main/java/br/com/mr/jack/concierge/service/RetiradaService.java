package br.com.mr.jack.concierge.service;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import br.com.mr.jack.concierge.models.Retirada;
import br.com.mr.jack.concierge.models.StatusRetirada;
import br.com.mr.jack.concierge.repository.RetiradaRepository;

@Service
public class RetiradaService {
	
	@Autowired
	private RetiradaRepository retiradaRepository;

	public List<Retirada> findAll() {
		return retiradaRepository.findAll();
	}

	public Retirada findById(long id) {
		return retiradaRepository.findById(id);
	}

	public Retirada save(Retirada retirada) {
		retirada.setStatus(StatusRetirada.AGUARDANDO);
		retirada.setRecebidoPor("Func 1");
		retirada.setEnvioMensagem(false);
		retirada.setDataCriacao(LocalDateTime.now());
		retirada.setCodigoRetirada("21210014"); 
		retirada.setDataCriacao(LocalDateTime.now());
		return retiradaRepository.save(retirada);
	}

	public void delete(Retirada retirada) {
		retiradaRepository.delete(retirada);
	}

	public Retirada update(@RequestBody Retirada retirada) {
		if(retirada.getStatus() == StatusRetirada.ENTREGUE) {
			retirada.setDataRetirada(LocalDateTime.now());
			retirada.setRetiraPor("Morador");
			return retiradaRepository.save(retirada);
		}else {
			retirada.setDataRetirada(null);
		}
		
		return retiradaRepository.save(retirada);
	}
}
