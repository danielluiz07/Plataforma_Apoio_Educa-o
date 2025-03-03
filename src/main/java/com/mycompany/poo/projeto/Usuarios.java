/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.poo.projeto;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Daniel e Elias
 */
public class Usuarios {
    private static List<Usuario> usuarios = new ArrayList<>(); 

    public static void adicionarUsuario(String nome, String email, String idade, String sexo) {
        usuarios.add(new Usuario(nome, email, idade, sexo)); 
    }

    public static List<Usuario> getUsuarios() {
        return usuarios;
    }
}
