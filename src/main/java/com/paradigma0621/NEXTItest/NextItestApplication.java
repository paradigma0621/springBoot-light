package com.paradigma0621.NEXTItest;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.paradigma0621.NEXTItest.domain.Produto;
import com.paradigma0621.NEXTItest.repositories.ProdutoRepository;

@SpringBootApplication
public class NextItestApplication implements CommandLineRunner {

	@Autowired
	private ProdutoRepository produtoRepository;

	public static void main(String[] args) {
		SpringApplication.run(NextItestApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Produto p1 = new Produto(null, "Computador",
				"Notebook Samsung Galaxy Book S - Intel®Core™ i5 -8GB - 256GB SSD -Tela 13.3\" Full HD -Touch",	6479.10d, 3);
		Produto p2 = new Produto(null, "Impressora", "Impressora multifuncional HP DeskJet Ink Advantage 2774", 449.11d, 2);
		Produto p3 = new Produto(null, "Mouse", "Mouse com fio USB Logitech M90 - Cinza", 34.90d, 4);
		Produto p4 = new Produto(null, "Teclado", "Teclado com fio USB Logitech K120 Resistente à Respingos e Layout ABNT2", 59.99d, 1);
		Produto p5 = new Produto(null, "Luminária", "Luminária Articulada De Mesa Abajur Tipo Pixar", 121.00d, 1);

		produtoRepository.saveAll(Arrays.asList(p1, p2, p3, p4, p5));
	}
}
