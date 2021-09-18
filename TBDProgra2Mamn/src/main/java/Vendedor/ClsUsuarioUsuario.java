/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vendedor;

import Dato.ClsUsuario;
import DominioVendedor.ClsUsuarioDominio;
import Formularios.Ingresar;
import java.sql.*;
import java.util.*;
import javax.swing.JOptionPane;


/**
 *
 * @author Marjorie
 */
public class ClsUsuarioUsuario {

    /**
     * @param args the command line arguments
     */
  public void Seleccionar() {
        String url = "jdbc:mysql://localhost:3306/dbt1progra2mamn?zeroDateTimeBehavior=CONVERT_TO_NULL";
        try {
            Connection conexion = DriverManager.getConnection(url, "root", "");
            Statement sentencia = conexion.createStatement();
            String sql = "SELECT * FROM dbt1progra2mamn.tb_usuarios;";
            ResultSet resultado = sentencia.executeQuery(sql);
            while (resultado.next()) {
                System.out.println("idUsuario = " + resultado.getInt("idUsuario"));
                System.out.println("usuario = " + resultado.getString("usuario"));
                System.out.println("clave = " + resultado.getString("clave"));
            }
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        }
    }

    public void Insertar() {
        ClsUsuario usuarioJDBC = new ClsUsuario();
        ClsUsuarioDominio usuario = new ClsUsuarioDominio();
        String Usuario = JOptionPane.showInputDialog("Ingrese nombre de Usuario");
        String clave = JOptionPane.showInputDialog("Ingrese Clave");

        usuario.setUsuario(Usuario);
        usuario.setClave(clave);
        usuarioJDBC.insert(usuario);

        List<ClsUsuarioDominio> todos = usuarioJDBC.select();

        for (ClsUsuarioDominio usuarios : todos) {
            System.out.println("Usuario = " + usuarios);
        }
    }

    public void Actualizar() {
        ClsUsuario usuarioJDBC = new ClsUsuario();
        ClsUsuarioDominio usuario = new ClsUsuarioDominio();
        String Usuario =  JOptionPane.showInputDialog("Ingrese nuevo Nombre de Usuario");
        String Clave = JOptionPane.showInputDialog("Ingrese nueva Clave");
        int IdUsuario = Integer.parseInt(JOptionPane.showInputDialog("Ingrese Id de Usuario"));

        usuario.setUsuario(Usuario);
        usuario.setClave(Clave);
        usuario.setIdUsuario(IdUsuario);
        usuarioJDBC.update(usuario);

        List<ClsUsuarioDominio> todos = usuarioJDBC.select();

        for (ClsUsuarioDominio usuarios : todos) {
            System.out.println("Usuario = " + usuarios);
        }
    }

    public void Borrar() {
        ClsUsuario usuarioJDBC = new ClsUsuario();
        ClsUsuarioDominio usuario = new ClsUsuarioDominio();
        int IdUsuario = Integer.parseInt(JOptionPane.showInputDialog("Ingrese Id de Usuario"));

        usuario.setIdUsuario(IdUsuario);
        usuarioJDBC.delete(usuario);

        List<ClsUsuarioDominio> todos = usuarioJDBC.select();

        for (ClsUsuarioDominio usuarios : todos) {
            System.out.println("Usuario = " + usuarios);
        }
    }


    
    
}
