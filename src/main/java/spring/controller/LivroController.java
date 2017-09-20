package spring.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import spring.repositories.LivroRepository;
import spring.model.Livro;

@RestController //@RestController esta classe é responsavel por receber requisições http no padrão Rest, e retornar nossos arquivos json
@RequestMapping("/livro")
public class LivroController {
	@Autowired //injeção de dependencia LivroRepository
	LivroRepository livroRepository;
	
	@RequestMapping(value = "/all", method = RequestMethod.GET)
	//http processar ResponseEntity classe spring mvc
	//spring serializa lista livros para json e retorna a resposta dentro de ResponseEntity
	//serialização
	public ResponseEntity<Iterable<Livro>> get() {
		return new ResponseEntity<Iterable<Livro>>(livroRepository.findAll(), HttpStatus.OK);
	}
}
