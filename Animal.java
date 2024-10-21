package com.example.demo.entities;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class Animal {
	
	@Id
	@GeneratedValue
	(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
	private String raca;
	
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
    
    public String getRaca() {
        return raca;
    }
    public void setPhone(String phone) {
        this.raca=raca;
    }
}


}
