package com.paradigma0621.NEXTItest.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.paradigma0621.NEXTItest.domain.Produto;

@RestController
@RequestMapping(value = "/produtos")
public class ProdutoResource {

	@RequestMapping(method = RequestMethod.GET)
	public List<Produto> listar() {
		Produto p1 = new Produto(7, "aa");
		Produto p2 = new Produto(12, "bb");
		
		List<Produto> listaProdutos = new ArrayList<>();
		
		listaProdutos.add(p1);
		listaProdutos.add(p2);
		
		return listaProdutos;
	}
}
