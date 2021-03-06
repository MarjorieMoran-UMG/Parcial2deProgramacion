/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Formularios;

import Vendedor.ClsUsuarioUsuario;
import Vendedor.ClsVendedorVendedor;
import java.sql.*;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Marjorie
 */
public class Principal extends javax.swing.JFrame {

    /**
     * Creates new form Principal
     */
    public Principal() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Vendedores = new javax.swing.JLabel();
        Usuarios = new javax.swing.JLabel();
        botonVerVendedores = new javax.swing.JButton();
        botonInsertarVendedor = new javax.swing.JButton();
        botonActualizarVendedor = new javax.swing.JButton();
        botonEliminarVendedor = new javax.swing.JButton();
        botonVerListadeUsuarios = new javax.swing.JButton();
        botonAgregarunNuevoUsuario = new javax.swing.JButton();
        botonActualizarUnUsuario = new javax.swing.JButton();
        botonEliminarUnUsuario = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tb_vendedores = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tb_usuarios = new javax.swing.JTable();
        users = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Vendedores.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Vendedores.setText("VENDEDORES");

        Usuarios.setFont(new java.awt.Font("Tw Cen MT", 0, 24)); // NOI18N
        Usuarios.setText("USUARIOS");

        botonVerVendedores.setText("Ver Vendedores");
        botonVerVendedores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonVerVendedoresActionPerformed(evt);
            }
        });

        botonInsertarVendedor.setText("Insetar Vendedor");
        botonInsertarVendedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonInsertarVendedorActionPerformed(evt);
            }
        });

        botonActualizarVendedor.setText("Actializar Vendedor");
        botonActualizarVendedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonActualizarVendedorActionPerformed(evt);
            }
        });

        botonEliminarVendedor.setText("Eliminar Vendedor");
        botonEliminarVendedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEliminarVendedorActionPerformed(evt);
            }
        });

        botonVerListadeUsuarios.setText("Ver Lista de Usuarios");
        botonVerListadeUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonVerListadeUsuariosActionPerformed(evt);
            }
        });

        botonAgregarunNuevoUsuario.setText("Agregar Usuario Nuevo");
        botonAgregarunNuevoUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAgregarunNuevoUsuarioActionPerformed(evt);
            }
        });

        botonActualizarUnUsuario.setText("Actualizar un Usuario");
        botonActualizarUnUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonActualizarUnUsuarioActionPerformed(evt);
            }
        });

        botonEliminarUnUsuario.setText("Eliminar un Usuario");
        botonEliminarUnUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEliminarUnUsuarioActionPerformed(evt);
            }
        });

        tb_vendedores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5"
            }
        ));
        jScrollPane1.setViewportView(tb_vendedores);

        tb_usuarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3"
            }
        ));
        jScrollPane2.setViewportView(tb_usuarios);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(188, 188, 188)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(botonEliminarVendedor, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botonActualizarVendedor, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(botonInsertarVendedor, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botonVerVendedores, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(197, 197, 197)
                        .addComponent(Vendedores, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(Usuarios, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(botonAgregarunNuevoUsuario)
                            .addComponent(botonVerListadeUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botonActualizarUnUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botonEliminarUnUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(62, 62, 62))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 516, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 85, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(users, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(users)
                        .addGap(36, 36, 36)
                        .addComponent(Usuarios, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(Vendedores, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(botonAgregarunNuevoUsuario)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botonActualizarUnUsuario)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botonEliminarUnUsuario))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(botonVerVendedores)
                            .addComponent(botonVerListadeUsuarios))
                        .addGap(12, 12, 12)
                        .addComponent(botonInsertarVendedor)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(botonActualizarVendedor)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(botonEliminarVendedor)))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap(299, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
        ClsUsuarioUsuario usuario = new ClsUsuarioUsuario();
    private void botonAgregarunNuevoUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAgregarunNuevoUsuarioActionPerformed

        usuario.Insertar();
        verUsuarios();
        // TODO add your handling code here:
    }//GEN-LAST:event_botonAgregarunNuevoUsuarioActionPerformed

    private void botonActualizarUnUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonActualizarUnUsuarioActionPerformed
        usuario.Actualizar();
        verUsuarios();
        // TODO add your handling code here:
    }//GEN-LAST:event_botonActualizarUnUsuarioActionPerformed

    private void botonEliminarUnUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEliminarUnUsuarioActionPerformed
        usuario.Borrar();
        verUsuarios();
// TODO add your handling code here:
    }//GEN-LAST:event_botonEliminarUnUsuarioActionPerformed
        ClsVendedorVendedor vende = new ClsVendedorVendedor();
    private void botonInsertarVendedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonInsertarVendedorActionPerformed

        vende.Insertar();
        verVendedores();
        // TODO add your handling code here:
    }//GEN-LAST:event_botonInsertarVendedorActionPerformed

    private void botonActualizarVendedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonActualizarVendedorActionPerformed

        vende.Actualizar();
        verVendedores();
        // TODO add your handling code here:
    }//GEN-LAST:event_botonActualizarVendedorActionPerformed

    private void botonEliminarVendedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEliminarVendedorActionPerformed

        vende.Borrar();
        verVendedores();
        // TODO add your handling code here:
    }//GEN-LAST:event_botonEliminarVendedorActionPerformed
    private void verUsuarios() {
        String url = "jdbc:mysql://localhost:3306/dbt1progra2mamn?zeroDateTimeBehavior=CONVERT_TO_NULL";
        try {
            Connection conexion = DriverManager.getConnection(url, "root", "");
            Statement sentencia = conexion.createStatement();
            String sql = "SELECT * FROM dbt1progra2mamn.tb_usuarios;";
            ResultSet resultado = sentencia.executeQuery(sql);
            String[] datos = new String[4];
            DefaultTableModel colum = new DefaultTableModel();
            colum.addColumn("IdUsuario");
            colum.addColumn("Usuario");
            colum.addColumn("Clave");
            tb_usuarios.setModel(colum);
            while (resultado.next()) {
                datos[0] = Integer.toString(resultado.getInt("idUsuario"));
                datos[1] = resultado.getString("usuario");
                datos[2] = resultado.getString("clave");
                colum.addRow(datos);

            }
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        }

    }

    private void verVendedores() {
        String url = "jdbc:mysql://localhost:3306/dbt1progra2mamn?zeroDateTimeBehavior=CONVERT_TO_NULL";
        try {
            Connection conexion = DriverManager.getConnection(url, "root", "");
            Statement sentencia = conexion.createStatement();
            String sql = "SELECT * FROM dbt1progra2mamn.tb_vendedores;";
            ResultSet resultado = sentencia.executeQuery(sql);
            String[] datos = new String[6];
            DefaultTableModel colum = new DefaultTableModel();
            colum.addColumn("Codigo");
            colum.addColumn("Nombre del vendedor");
            colum.addColumn("Venta de enero");
            colum.addColumn("Venta de febrero");
            colum.addColumn("Venta de marzo");
            tb_vendedores.setModel(colum);
            while (resultado.next()) {
                int contador = 0;
                contador++;

                datos[0] = Integer.toString(resultado.getInt("CodigoVendedor"));
                datos[1] = (resultado.getString("NombreVendedor"));
                datos[2] = Integer.toString(resultado.getInt("VentasEnero"));
                datos[3] = Integer.toString(resultado.getInt("VentasFebrero"));
                datos[4] = Integer.toString(resultado.getInt("VentasMarzo"));

                colum.addRow(datos);
            }
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        }
    }
    private void botonVerVendedoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonVerVendedoresActionPerformed
        verVendedores();
// TODO add your handling code here:
    }//GEN-LAST:event_botonVerVendedoresActionPerformed

    private void botonVerListadeUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonVerListadeUsuariosActionPerformed
        verUsuarios();
        // TODO add your handling code here:
    }//GEN-LAST:event_botonVerListadeUsuariosActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Usuarios;
    private javax.swing.JLabel Vendedores;
    private javax.swing.JButton botonActualizarUnUsuario;
    private javax.swing.JButton botonActualizarVendedor;
    private javax.swing.JButton botonAgregarunNuevoUsuario;
    private javax.swing.JButton botonEliminarUnUsuario;
    private javax.swing.JButton botonEliminarVendedor;
    private javax.swing.JButton botonInsertarVendedor;
    private javax.swing.JButton botonVerListadeUsuarios;
    private javax.swing.JButton botonVerVendedores;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tb_usuarios;
    private javax.swing.JTable tb_vendedores;
    private javax.swing.JLabel users;
    // End of variables declaration//GEN-END:variables
}
