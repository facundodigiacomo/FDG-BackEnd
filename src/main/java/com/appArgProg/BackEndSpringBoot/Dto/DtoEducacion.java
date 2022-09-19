
package com.appArgProg.BackEndSpringBoot.Dto;

import javax.validation.constraints.NotBlank;

public class DtoEducacion {
    @NotBlank
    private String nombreE;
    @NotBlank
    private String descripcionE;
    @NotBlank
    private String mesE;
    @NotBlank
    private String anoE;
    @NotBlank
    private String lugarE;
    
    //Constructors
    public DtoEducacion() {
    }

    public DtoEducacion(String nombreE,
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

    public String getLugarE() {
        return lugarE;
    }

    public void setLugarE(String lugarE) {
        this.lugarE = lugarE;
    }
    
}
