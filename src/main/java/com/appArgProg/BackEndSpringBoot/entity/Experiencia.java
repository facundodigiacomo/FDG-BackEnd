
package com.appArgProg.BackEndSpringBoot.entity;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Experiencia{
    @Id
    @GeneratedValue(strategy  = GenerationType.IDENTITY)
    private int id;
    private String nombreE;
    private String descripcionE;
    private String mesE;
    private String anoE;
    private String lugarE;
    
    //Contructors
    public Experiencia() {
    }

    public Experiencia(String nombreE,
            String descripcionE,
            String mesE,
            String anoE,
            String lugarE) {
        this.nombreE = nombreE;
        this.descripcionE = descripcionE;
        this.mesE = mesE;
        this.anoE = anoE;
        this.lugarE = lugarE;
    }


  
    
    //Getters & Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombreE() {
        return nombreE;
    }

    public void setNombreE(String nombreE) {
        this.nombreE = nombreE;
    }

    public String getDescripcionE() {
        return descripcionE;
    }

    public void setDescripcionE(String descripcionE) {
        this.descripcionE = descripcionE;
    }

    public String getLugarE() {
        return lugarE;
    }

    public void setLugarE(String lugarE) {
        this.lugarE = lugarE;
    }

    public String getMesE() {
        return mesE;
    }

    public void setMesE(String mesE) {
        this.mesE = mesE;
    }

    public String getAnoE() {
        return anoE;
    }

    public void setAnoE(String anoE) {
        this.anoE = anoE;
    }
   
    
}
