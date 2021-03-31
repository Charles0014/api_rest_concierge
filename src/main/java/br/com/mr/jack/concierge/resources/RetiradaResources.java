package br.com.mr.jack.concierge.resources;

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

import br.com.mr.jack.concierge.models.Retirada;
import br.com.mr.jack.concierge.service.RetiradaService;

@RestController
@RequestMapping(value = "/mrjack/api")
public class RetiradaResources {
	
	@Autowired
	RetiradaService retiradaService;
	
	@GetMapping("/retiradas")
	public List<Retirada> listarRetiradas(){
		return retiradaService.findAll();
	}
	
	@GetMapping("/retirada/{id}")
	public Retirada buscarRetiradaUnico(@PathVariable(value = "id")long id){
		return retiradaService.findById(id);
	}
	
	@PostMapping("/retirada")
	public Retirada salvarRetirada(@RequestBody Retirada Retirada) {
		return retiradaService.save(Retirada);
	}
	
	@DeleteMapping("/retirada")
	public void deletarRetirada(@RequestBody Retirada Retirada) {
		retiradaService.delete(Retirada);
	}
	
	@PutMapping("/retirada")
	public Retirada editarRetirada(@RequestBody Retirada Retirada) {
		return retiradaService.save(Retirada);
	}
}
