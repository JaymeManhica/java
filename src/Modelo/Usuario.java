/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author MANHICA
 */
public class Usuario {
    private String senha;
    private String confirSenha;
    private String Usuario;
    private String nome;
    private String apelido;
    private String email;

    public Usuario(String senha, String confirSenha, String Usuario, String nome, String apelido, String email) {
        this.senha = senha;
        this.confirSenha = confirSenha;
        this.Usuario = Usuario;
        this.nome = nome;
        this.apelido = apelido;
        this.email = email;
    }

    public Usuario(String senha, String Usuario) {
        this.senha = senha;
        this.Usuario = Usuario;
    }

   
    
    

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getConfirSenha() {
        return confirSenha;
    }

    public void setConfirSenha(String confirSenha) {
        this.confirSenha = confirSenha;
    }

    public String getUsuario() {
        return Usuario;
    }

    public void setUsuario(String Usuario) {
        this.Usuario = Usuario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getApelido() {
        return apelido;
    }

    public void setApelido(String apelido) {
        this.apelido = apelido;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    
    
}
