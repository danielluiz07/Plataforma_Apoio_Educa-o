/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.poo.projeto;

/**
 *
 * @author danie
 */
public class Usuario {
    
    private final String nome;
    private final String email;
    private final String idade;
    private final String sexo;

    public Usuario(String nome, String email, String idade, String sexo) {
        this.nome = nome;
        this.email = email;
        this.idade = idade;
        this.sexo = sexo;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public String getIdade() {
        return idade;
    }

    public String getSexo() {
        return sexo;
    }
}
