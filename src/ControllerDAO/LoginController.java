/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ControllerDAO;

import Controller.Helper.LoginHelper;
import Modelo.Usuario;
import Views.Login;

/**
 *
 * @author MANHICA
 */
public class LoginController {

    private final Login view;
    private LoginHelper helper;

    public LoginController(Login view) {
        this.view = view;
        this.helper = new LoginHelper(view);
    }
    public void  entrarNoSistema(){
     Usuario usuario =  helper.obterModelo();
    }
    
    public void fizTarefa(){
        this.view.exibeMensagem("Bem Vindo");
        
    }
    
}
