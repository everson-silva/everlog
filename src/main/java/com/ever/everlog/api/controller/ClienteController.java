package com.ever.everlog.api.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ever.everlog.domain.model.Cliente;

@RestController
public class ClienteController {
	
	@GetMapping("/clientes")
	public List<Cliente> listar() {
		Cliente cliente1 = new Cliente();
		cliente1.setId(1L);
		cliente1.setNome("Everson");
		cliente1.setTelefone("38 9999999");
		cliente1.setEmail("everson@gmail.com");
		
		Cliente cliente2 = new Cliente();
		cliente2.setId(2L);
		cliente2.setNome("Ellen");
		cliente2.setTelefone("88 8888888");
		cliente2.setEmail("ellen@gmail.com");
		
		return Arrays.asList(cliente1, cliente2);
	}

}
