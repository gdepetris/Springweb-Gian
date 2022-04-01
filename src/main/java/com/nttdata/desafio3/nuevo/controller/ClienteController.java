package com.nttdata.desafio3.nuevo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.nttdata.desafio3.nuevo.entity.Cliente;
import com.nttdata.desafio3.nuevo.service.ClienteService;

@Controller
public class ClienteController {

	@Autowired
	private ClienteService clienteservice;

	@GetMapping("/clientes")
	public String mostrarClientes(Model cliente) {

		List<Cliente> listarClientes = this.clienteservice.buscarTodos();

		cliente.addAttribute("clientesList", listarClientes);

		return "webClientes";

	}

	@GetMapping("/prueba")
	public @ResponseBody String pruebaTexto() {
		
		return "Esto es una prueba";
		
	}
	
}
