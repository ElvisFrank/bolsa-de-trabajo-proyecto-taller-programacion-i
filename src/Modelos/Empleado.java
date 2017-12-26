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
public class Empleado extends Usuario {

    private String Ocupacion, AreaLaboral, GradoInstruccion;

    public Empleado(String Nombre, String Correo, String Contraceña, String Nick, String Ocupacion, String AreaLaboral, String GradoInstruccion,String Dia,String Mes,String Año,String Sexo) {
        super(Nombre, Correo, Contraceña, Nick, Dia, Mes, Año, Sexo);
        this.Ocupacion = Ocupacion;
        this.AreaLaboral = AreaLaboral;
        this.GradoInstruccion = GradoInstruccion;
    }

    public String getOcupacion() {
        return Ocupacion;
    }

    public void setOcupacion(String Ocupacion) {
        this.Ocupacion = Ocupacion;
    }

    public String getAreaLaboral() {
        return AreaLaboral;
    }

    public void setAreaLaboral(String AreaLaboral) {
        this.AreaLaboral = AreaLaboral;
    }

    public String getGradoInstruccion() {
        return GradoInstruccion;
    }

    public void setGradoInstruccion(String GradoInstruccion) {
        this.GradoInstruccion = GradoInstruccion;
    }

}
