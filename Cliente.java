package com.example.demo.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;


@Entity
@Table(name = "clientes")
public class Cliente {
	
	@Id
	@GeneratedValue
	(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
	private String phone;
	
	public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
	
    }
    public String getName() {
            return name;
        }
    public void setName(String name) {
            this.name = name;
        }
    
    public String getPhone() {
        return phone;
    }
    public void setPhone(String phone) {
        this.phone=phone;
    }
}

