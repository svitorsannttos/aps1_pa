package br.unit.web.api;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController {

	@GetMapping("/")
	public String home() {
		return "helloworld API!!";
	}
	
	@PostMapping("/")
	public String umMetodoComVerboPost() {
		return "O verbo http utilizado foi POST.";
	}
	
	@PutMapping("/")
	public String umMetodoComVerboPut() {
		return "O verbo http utilizado foi PUT";
	}
	
	
	@PostMapping("/{nome}")
	public String umMetodoComDadoNaURL(@PathVariable("nome") String nome) {
		return "O verbo http utilizado foi POST."+"O nome é "+nome +" {url}";
	}
	
	@PutMapping("/estudante")
	public String umMetodoComDadoNoCorpo(@RequestBody String nome) {
		return "O verbo http utilizado foi POST."+"O nome é "+nome+" {corpo}";
	}
	
	@DeleteMapping("/")
	public String umMetodoComVerboDelete() {
		return "O verbo http utilizado foi deletado";
	}
	
}
