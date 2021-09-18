/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dato;

import DominioVendedor.ClsUsuarioDominio;
import Vendedor.ClsUsuarioUsuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;

/**
 *
 * @author Marjorie
 */
public class ClsUsuario {
    
    private static final String SQL_SELECT = "SELECT * FROM tb_usuarios";
    private static final String SQL_INSERT = "INSERT INTO tb_usuarios(usuario, clave) VALUES(?, ?)";
    private static final String SQL_UPDATE = "UPDATE tb_usuarios SET usuario=?, clave=? WHERE idUsuario = ?";
    private static final String SQL_DELETE = "DELETE FROM tb_usuarios WHERE idUsuario=?";

    public List<ClsUsuarioDominio> select() {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        ClsUsuarioDominio usuario = null;
        List<ClsUsuarioDominio> usuarios = new ArrayList<ClsUsuarioDominio>();
        try {
            conn = ClsConectar.getConnection();
            stmt = conn.prepareStatement(SQL_SELECT);
            rs = stmt.executeQuery();
            while (rs.next()) {
                int idUsuario = rs.getInt("idUsuario");
                String username = rs.getString("usuario");
                String password = rs.getString("clave");

                usuario = new ClsUsuarioDominio();
                usuario.setIdUsuario(idUsuario);
                usuario.setUsuario(username);
                usuario.setClave(password);

                usuarios.add(usuario);
            }

        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            ClsConectar.close(rs);
            ClsConectar.close(stmt);
            ClsConectar.close(conn);
        }

        return usuarios;
    }

    public int insert(ClsUsuarioDominio usuario) {
        Connection conn = null;
        PreparedStatement stmt = null;
        int rows = 0;
        try {
            conn = ClsConectar.getConnection();
            stmt = conn.prepareStatement(SQL_INSERT);
            stmt.setString(1, usuario.getUsuario());
            stmt.setString(2, usuario.getClave());

            System.out.println("ejecutando query:" + SQL_INSERT);
            rows = stmt.executeUpdate();
            System.out.println("Registros afectados:" + rows);
            if (rows >= 1) {
                System.out.println("Registros Afectados " + rows);
            } else {
                System.out.println("Lo siento, Hubo un error");
            }
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            ClsConectar.close(stmt);
            ClsConectar.close(conn);
        }

        return rows;
    }

    public int update(ClsUsuarioDominio usuario) {
        Connection conn = null;
        PreparedStatement stmt = null;
        int rows = 0;
        try {
            conn = ClsConectar.getConnection();
            System.out.println("ejecutando query: " + SQL_UPDATE);
            stmt = conn.prepareStatement(SQL_UPDATE);
            stmt.setString(1, usuario.getUsuario());
            stmt.setString(2, usuario.getClave());
            stmt.setInt(3, usuario.getIdUsuario());

            rows = stmt.executeUpdate();
            if (rows >= 1) {
                System.out.println("Registros Afectados " + rows);
            } else {
                System.out.println("Lo siento, Hubo un error");
            }

        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            ClsConectar.close(stmt);
            ClsConectar.close(conn);
        }

        return rows;
    }

    public int delete(ClsUsuarioDominio usuario) {
        Connection conn = null;
        PreparedStatement stmt = null;
        int rows = 0;

        try {
            conn = ClsConectar.getConnection();
            System.out.println("Ejecutando query:" + SQL_DELETE);
            stmt = conn.prepareStatement(SQL_DELETE);
            stmt.setInt(1, usuario.getIdUsuario());
            rows = stmt.executeUpdate();
            if (rows >= 1) {
                System.out.println("Registros Afectados " + rows);
            } else {
                System.out.println("Lo siento, Hubo un error");
            }
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            ClsConectar.close(stmt);
            ClsConectar.close(conn);
        }

        return rows;
    }
}
