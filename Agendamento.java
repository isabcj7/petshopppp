package com.example.demo.entities;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class Agendamento {
	
	@Id
	@GeneratedValue
	(strategy = GenerationType.IDENTITY)
	private Long id;
	private int horario;
	private int data;
	
	public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
	
    }
    public int gethorario() {
            return horario;
        }
    public void sethorario(String name) {
            this.horario = horario;
        }
    
    public int getdata() {
        return data;
    }
    public void setdata(String phone) {
        this.data=data;
    }
}


}
