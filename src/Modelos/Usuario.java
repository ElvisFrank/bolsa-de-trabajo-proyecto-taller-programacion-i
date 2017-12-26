/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelos;

import java.util.Date;

/**
 *
 * @author Frank
 */
public class Usuario {

    private String Nombre, Correo, Contraceña, Nick,Dia, Mes, Año, Sexo;

    public Usuario(String Nombre, String Correo, String Contraceña, String Nick, String Dia, String Mes, String Año, String Sexo) {
        this.Dia = Dia;
        this.Sexo = Sexo;
        this.Mes = Mes;
        this.Año = Año;
        this.Nombre = Nombre;
        this.Correo = Correo;
        this.Contraceña = Contraceña;
        this.Nick = Nick;
    }

    public String getNombre() {
        return this.Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getCorreo() {
        return this.Correo;
    }

    public void setCorreo(String Correo) {
        this.Correo = Correo;
    }

    public String getContraceña() {
        return this.Contraceña;
    }

    public void setContraceña(String Contraceña) {
        this.Contraceña = Contraceña;
    }

    public String getNick() {
        return this.Nick;
    }

    public void setNick(String Nick) {
        this.Nick = Nick;
    }

    public String getAño() {
        return this.Año;
    }

    public String getDia() {
        return this.Dia;
    }

    public String getMes() {
        return this.Mes;
    }

    public String getSexo() {
        return this.Sexo;
    }

    public void setAño(String Año) {
        this.Año = Año;
    }

    public void setDia(String Dia) {
        this.Dia = Dia;
    }

    public void setMes(String Mes) {
        this.Mes = Mes;
    }

    public void setSexo(String Sexo) {
        this.Sexo = Sexo;
    }

}
