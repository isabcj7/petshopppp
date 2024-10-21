package com.example.demo.entities;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class Produtos {
	
	@Id
	@GeneratedValue
	(strategy = GenerationType.IDENTITY)
	private String tipo;
	private int valor;
	
	public String gettipo() {
        return tipo;
    }
    public void settipo(String tipo) {
        this.tipo = tipo;
	
    }
    public int valor(){
            return valor;
        }
    public void setName(int valor) {
            this.valor = valor;
        }
}
