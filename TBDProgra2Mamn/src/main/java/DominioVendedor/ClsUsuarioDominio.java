/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DominioVendedor;

/**
 *
 * @author Marjorie
 */
public class ClsUsuarioDominio {
 private int idUsuario;
    private String usuario;
    private String clave;
    
    public ClsUsuarioDominio() {
    }

    public ClsUsuarioDominio(int idUsuario) {
        this.idUsuario = idUsuario;
    }
    
    public ClsUsuarioDominio(int idUsuario, String usuario, String clave) {
        this.idUsuario = idUsuario;
        this.usuario = usuario;
        this.clave = clave;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {

           this.clave = clave; 
      
    }

    @Override
    public String toString() {
        return "ClsUsuario{" + "id_usuario=" + idUsuario + ", username=" + usuario + ", password=" + clave + '}';
    }
}
