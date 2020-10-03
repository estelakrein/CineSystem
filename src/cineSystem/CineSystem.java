/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cineSystem;

import apoio.ConexaoBD;
import entidades.Usuario;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import telas.FrmLogin;
import telas.FrmPrincipal;

/**
 *
 * @author estel
 */
public class CineSystem {

    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
            //SwingUtilities.updateComponentTreeUI(this);
        } catch (Exception e) {
            System.out.println("Erro: " + e);
        }
        Usuario usuarios = new Usuario();
        new FrmLogin(usuarios).setVisible(true);

    }

    public static void login(Usuario usuario) {
        new FrmPrincipal(usuario).setVisible(true);
    }
}
