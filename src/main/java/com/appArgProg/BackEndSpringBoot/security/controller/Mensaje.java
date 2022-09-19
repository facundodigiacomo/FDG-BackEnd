
package com.appArgProg.BackEndSpringBoot.security.controller;


public class Mensaje {
    private String mensaje;
    
    //Constructor
    public Mensaje() {
    }

    public Mensaje(String mensaje) {
        this.mensaje = mensaje;
    }
    
    //Getter & Setter
    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }
    
}
