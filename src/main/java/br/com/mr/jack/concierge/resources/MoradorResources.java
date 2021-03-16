package br.com.mr.jack.concierge.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.mr.jack.concierge.repository.MoradorRepository;
import br.com.mr.jack.concierge.models.Morador;

@CrossOrigin(origins = "http://localhost:8081")
@RestController
@RequestMapping(value = "/mrjack/api")
public class MoradorResources {
	
	@Autowired
	MoradorRepository moradorRepository;
	
	@GetMapping("/moradores")
	public List<Morador> listarMoradores(){
		return moradorRepository.findAll();
	}
	
	@GetMapping("/morador/{id}")
	public Morador buscarMoradorUnico(@PathVariable(value = "id")long id){
		return moradorRepository.findById(id);
	}
	
	@PostMapping("/morador")
	public Morador salvarMorador(@RequestBody Morador Morador) {
		return moradorRepository.save(Morador);
	}
	
	@DeleteMapping("/morador")
	public void deletarMorador(@RequestBody Morador Morador) {
		moradorRepository.delete(Morador);
	}
	
	@PutMapping("/morador")
	public Morador editarMorador(@RequestBody Morador Morador) {
		return moradorRepository.save(Morador);
	}
}
