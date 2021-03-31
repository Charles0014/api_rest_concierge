package br.com.mr.jack.concierge.resources;

import java.time.LocalDateTime;
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

import br.com.mr.jack.concierge.models.Morador;
import br.com.mr.jack.concierge.service.MoradorService;

@CrossOrigin(origins = "http://localhost:8081")
@RestController
@RequestMapping(value = "/mrjack/api")
public class MoradorResources {
	
	@Autowired
	MoradorService moradorService;
	
	@GetMapping("/moradores")
	public List<Morador> listarMoradores(){
		return moradorService.findAll();
	}
	
	@GetMapping("/morador/{id}")
	public Morador buscarMoradorUnico(@PathVariable(value = "id")long id){
		return moradorService.findById(id);
	}
	
	@PostMapping("/morador")
	public Morador salvarMorador(@RequestBody Morador Morador) {
		return moradorService.save(Morador);
	}
	
	@DeleteMapping("/morador")
	public void deletarMorador(@RequestBody Morador Morador) {
		moradorService.delete(Morador);
	}
	
	@PutMapping("/morador")
	public Morador editarMorador(@RequestBody Morador Morador) {
		Morador.setDataAtualizacao(LocalDateTime.now());
		return moradorService.save(Morador);
	}
}
