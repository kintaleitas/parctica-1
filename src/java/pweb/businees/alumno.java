/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pweb.businees;

import java.io.Serializable;

/**
 *
 * @author alumno
 */
public class alumno implements Serializable{
   

    private String usuario;
    private String contraseña;
    
    

    public alumno() {
        usuario = "";
        contraseña = "";
    }

  
    public alumno(String usuario, String contraseña)
    {
        this.usuario = usuario;
        this.contraseña = contraseña;
        
    }
    
    public String getusuario()
    {
        return usuario;
    }
    
    public void setusuario(String usuario)
    {
        this.usuario=usuario;
    }
    

    public String getcontraseña() {
        return contraseña;
    }

    public void setcontraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    }



