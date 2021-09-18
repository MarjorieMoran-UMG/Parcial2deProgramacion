/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vendedor;

import Dato.ClsVendedor;
import DominioVendedor.ClsVendedorDominio;
import java.sql.*;
import java.util.*;
import javax.swing.JOptionPane;

/**
 *
 * @author Marjorie
 */
public class ClsVendedorVendedor {

    public void Seleccionar() {
        String url = "jdbc:mysql://localhost:3306/dbt1progra2mamn?zeroDateTimeBehavior=CONVERT_TO_NULL";
        try {
            Connection conexion = DriverManager.getConnection(url, "root", "");
            Statement sentencia = conexion.createStatement();
            String sql = "SELECT * FROM dbt1progra2mamn.tb_vendedores;";
            ResultSet resultado = sentencia.executeQuery(sql);
            while (resultado.next()) {
                System.out.println("Codigo Vendedor = " + resultado.getInt("CodigoVendedor"));
                System.out.println("Nombre Vendedor = " + resultado.getString("NombreVendedor"));
                System.out.println("Ventas Enero = " + resultado.getInt("VentasEnero"));
                System.out.println("Ventas Febrero = " + resultado.getInt("VentasFebrero"));
                System.out.println("Ventas Marzo = " + resultado.getInt("VentasMarzo"));
            }
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        }
    }

    public void Insertar() {
        ClsVendedor v = new ClsVendedor();
        ClsVendedorDominio vs = new ClsVendedorDominio();
        String NombreVendedor = JOptionPane.showInputDialog("Ingrese Nombre de Vendedor");
        int VentaEnero = Integer.parseInt(JOptionPane.showInputDialog("Venta de Enero"));
        int VentaFebrero = Integer.parseInt(JOptionPane.showInputDialog("Ventad de Febrero"));
        int VentaMarzo = Integer.parseInt(JOptionPane.showInputDialog("Venta de Marzo"));
        vs.setNombreVendedor(NombreVendedor);
        vs.setVentasEnero(VentaEnero);
        vs.setVentasFebrero(VentaFebrero);
        vs.setVentasMarzo(VentaMarzo);
        v.Insertar(vs);

        List<ClsVendedorDominio> todos = v.Seleccionar();

        for (ClsVendedorDominio Vendedor : todos) {
            System.out.println("Vendedor = " + Vendedor);
        }

    }

    public void Actualizar() {
        ClsVendedor Vendedorr = new ClsVendedor();
        ClsVendedorDominio CantVende = new ClsVendedorDominio();
        String nombre = JOptionPane.showInputDialog("Ingrese Nombre de Vendedor");
        int enero = Integer.parseInt(JOptionPane.showInputDialog("Venta de Enero"));
        int febrero = Integer.parseInt(JOptionPane.showInputDialog("Ventad de Febrero"));
        int marzo = Integer.parseInt(JOptionPane.showInputDialog("Venta de Marzo"));
        int idVendedor = Integer.parseInt(JOptionPane.showInputDialog("Codigo de Vendedor"));

        CantVende.setNombreVendedor(nombre);
        CantVende.setVentasEnero(enero);
        CantVende.setVentasFebrero(febrero);
        CantVende.setVentasMarzo(marzo);
        CantVende.setCodigoVendedor(idVendedor);
        Vendedorr.Actualizar(CantVende);

        List<ClsVendedorDominio> todos = Vendedorr.Seleccionar();

        for (ClsVendedorDominio Vendedor : todos) {
            System.out.println("Vendedor = " + Vendedor);
        }
    }

    public void Borrar() {
        ClsVendedor Vendedor = new ClsVendedor();
        ClsVendedorDominio CantVende = new ClsVendedorDominio();
        int Codigo = Integer.parseInt(JOptionPane.showInputDialog("Codigo de Vendedor"));

        CantVende.setCodigoVendedor(Codigo);
        Vendedor.Eliminar(CantVende);

        List<ClsVendedorDominio> todos = Vendedor.Seleccionar();

        for (ClsVendedorDominio Vendedorrr : todos) {
            System.out.println("Vendedor = " + Vendedorrr);
        }
    }


}
