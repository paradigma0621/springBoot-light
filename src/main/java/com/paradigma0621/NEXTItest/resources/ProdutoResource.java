package com.paradigma0621.NEXTItest.resources; //Pacote de controladores REST

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.paradigma0621.NEXTItest.domain.Produto;
import com.paradigma0621.NEXTItest.services.ProdutoService;

@RestController
@RequestMapping(value = "/produtos")
public class ProdutoResource {

	@Autowired // Para instanciar automaticamente o objeto
	private ProdutoService service; // O controlador REST vai acessar o serviço

	@RequestMapping(value = "/{id}", method = RequestMethod.GET) // Para dizer que o endpoint agora é: /produtos/{id}
	public ResponseEntity<?> find(@PathVariable Integer id) { // Para o Spring saber que esse id informado nessa linha é
																// o "id" da linha de cima colocamos o @PathVariable
		// Esse 'ReponseEntity' é um tipo especial do Spring que encapsula e armazena
		// várias informações de uma resposta http para um serviço REST. Foi colocado
		// esse "?" porque poderá ser de qualquer tipo, pois pode tanto encontrar como
		// não encontrar um 'Produto' com o 'id' especificado

		Produto obj = service.find(id);
		return ResponseEntity.ok().body(obj); // ok() para dizer que a operação ocorreu com sucesso,
		// e a resposta terá como corpo o objeto 'obj'
	}
}
