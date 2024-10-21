package com.example.demo.entities;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class Servico {
	
	@Id
	@GeneratedValue
	(strategy = GenerationType.IDENTITY)
	private int valor;
	private String procedimentos;
	private String materiais;
	
	public int valor() {
        return valor;
    }
    public void setId(int valor) {
        this.valor = valor;
	
    }
    public String getProcedimentos() {
            return procedimentos;
        }
    public void setProcedimentos(String procedimentos) {
            this.procedimentos = procedimentos;
        }
    
    public String getMateriais() {
        return materiais;
    }
    public void setMateriais(String materiais) {
        this.materiais=materiais;
    }
}


}
