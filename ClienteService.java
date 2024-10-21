package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import com.example.demo.entities.Cliente;
import com.example.demo.repository.ClienteRepository;

@Service
public class ClienteService {
	
	private final ClienteRepository customerrepository;
	   
	   @Autowired
	   public ClienteService (ClienteRepository clienterepository) {
	       this.clienterepository = clienterepository;
	   }
	   
	   public Cliente saveCliente(Cliente cliente) {
	       return clienterepository.save(cliente);
	   }
	   
	   public Cliente getClienteById(Long id) {
	       return clienterepository.findById(id).orElse(null);
	   }
	   
	   public List<Cliente> getAllCliente(){
	       return clienterepository.findAll();
	   }
	   
	   public void deleteCliente(Long id) {
		clienteepository.deleteById(id);
	   }

	public Cliente saveCustomer(Cliente cliente) {
		// TODO Auto-generated method stub
		return null;
	}
	   
		

}
