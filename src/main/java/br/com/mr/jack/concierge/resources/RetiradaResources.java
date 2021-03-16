package br.com.mr.jack.concierge.resources;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.mr.jack.concierge.repository.RetiradaRepository;
import br.com.mr.jack.concierge.models.Retirada;
import br.com.mr.jack.concierge.models.Status;

@RestController
@RequestMapping(value = "/mrjack/api")
public class RetiradaResources {
	
	@Autowired
	RetiradaRepository retiradaRepository;
	
	@GetMapping("/retiradas")
	public List<Retirada> listarRetiradas(){
		return retiradaRepository.findAll();
	}
	
	@GetMapping("/retirada/{id}")
	public Retirada buscarRetiradaUnico(@PathVariable(value = "id")long id){
		return retiradaRepository.findById(id);
	}
	
	@PostMapping("/retirada")
	public Retirada salvarRetirada(@RequestBody Retirada Retirada) {
		Retirada.setStatus(Status.AGUARDANDO);
		Retirada.setRecebidoPor("Func 1");
		Retirada.setEnvioMensagem(false);
		Retirada.setDataCriacao(LocalDateTime.now());
		Retirada.setCodigoRetirada("21210014");  //Adicionar metodo de gerar código 
		return retiradaRepository.save(Retirada);
	}
	
	@DeleteMapping("/retirada")
	public void deletarRetirada(@RequestBody Retirada Retirada) {
		retiradaRepository.delete(Retirada);
	}
	
	@PutMapping("/retirada")
	public Retirada editarRetirada(@RequestBody Retirada Retirada) {
		if(Retirada.getStatus() == Status.ENTREGUE) {
			Retirada.setDataRetirada(LocalDateTime.now());
			Retirada.setRetiraPor("Morador");
			return retiradaRepository.save(Retirada);
		}else {
			Retirada.setDataRetirada(null);
		}
		
		return retiradaRepository.save(Retirada);
	}
}
