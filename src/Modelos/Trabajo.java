/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelos;

/**
 *
 * @author Frank
 */
public class Trabajo {

    private String Personal, AreaLaboral, Requisitos, Publicador, Empresa;
    int Cantidad;

    public Trabajo(String Publicador, String Personal, int Cantidad, String AreaLaboral, String Empresa, String Requisitos) {
        this.Publicador = Publicador;
        this.Personal = Personal;
        this.Cantidad = Cantidad;
        this.Empresa = Empresa;
        this.AreaLaboral = AreaLaboral;
        this.Requisitos = Requisitos;
    }

    public String getPersonal() {
        return Personal;
    }

    public String getEmpresa() {
        return Empresa;
    }

    public void setEmpresa(String Empresa) {
        this.Empresa = Empresa;
    }

    public void setPersonal(String Descripsion) {
        this.Personal = Descripsion;
    }

    public String getAreaLaboral() {
        return AreaLaboral;
    }

    public void setAreaLaboral(String AreaLaboral) {
        this.AreaLaboral = AreaLaboral;
    }

    public String getRequisitos() {
        return Requisitos;
    }

    public void setRequisitos(String Requisitos) {
        this.Requisitos = Requisitos;
    }

    public String getPublicador() {
        return Publicador;
    }

    public void setPublicador(String Publicador) {
        this.Publicador = Publicador;
    }

    public int getCantidad() {
        return Cantidad;
    }

    public void setCantidad(int Cantidad) {
        this.Cantidad = Cantidad;
    }

}
