/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.back.demo.Dto;

/**
 *
 * @author Usuario
 */
public class dtoExperiencia {
    
    //@NotBlank
    private String NombreE;
    //@NotBlank
    private String descripcionE;

    public dtoExperiencia() {
    }

    public dtoExperiencia(String NombreE, String descripcionE) {
        this.NombreE = NombreE;
        this.descripcionE = descripcionE;
    }

    public String getNombreE() {
        return NombreE;
    }

    public void setNombreE(String NombreE) {
        this.NombreE = NombreE;
    }

    public String getDescripcionE() {
        return descripcionE;
    }

    public void setDescripcionE(String descripcionE) {
        this.descripcionE = descripcionE;
    }
    
    
}
