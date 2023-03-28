/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller.Helper;

import Modelo.Usuario;
import Views.Login;

/**
 *
 * @author MANHICA
 */
public class LoginHelper {
    private final Login view;

    public LoginHelper(Login view) {
        this.view = view;
    }
    
    public Usuario obterModelo(){
         String nome = view.getTxtUsuario().getText();
        String senha = view.getPasSenha().getText();
        
        Usuario modelo = new Usuario(nome, senha);
        return modelo;
    }
    
    public void setarModelo(Usuario modelo){
       String nome = modelo.getNome();
       String senha = modelo.getSenha();
       
       view.getTxtUsuario().setText(nome);
       view.getPasSenha().setText(senha);
    }
}
