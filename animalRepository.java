package com.example.demo.repository;
	
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.entities.Cliente;

public interface animalRepository extends JpaRepository<Cliente, Long>{


}