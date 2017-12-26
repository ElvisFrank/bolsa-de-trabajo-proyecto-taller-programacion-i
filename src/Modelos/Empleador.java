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
public class Empleador extends Usuario {
    
    private String Empresa;
    
    public Empleador(String Nombre, String Correo, String Contraceña, String Nick, String Empresa, String Dia, String Mes, String Año, String Sexo) {
        super(Nombre, Correo, Contraceña, Nick, Dia, Mes, Año, Sexo);
        this.Empresa = Empresa;
    }
    
    public String getEmpresa() {
        return Empresa;
    }
    
    public void setEmpresa(String Empresa) {
        this.Empresa = Empresa;
    }
    
}
