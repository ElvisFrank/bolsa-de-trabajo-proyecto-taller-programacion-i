/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Principal;

import Modelos.Empleado;
import Modelos.Empleador;
import Modelos.Trabajo;
import Operaciones.testTrabajo;
import Operaciones.testUsuarios;
import Ventanas.CuentaBuscEmpleo;
import Ventanas.CuentaEmpleador;
import Ventanas.PrincipalVent;
import Ventanas.inicio;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author Frank
 */
public class Principal {

    //para manejar las operaciones
    private testUsuarios testus = new testUsuarios();
    private testTrabajo testtra = new testTrabajo();
    //instancias de las clases MODELOS
    private static ArrayList<Empleado> empleado = new ArrayList<Empleado>();
    private static ArrayList<Empleador> empleador = new ArrayList<Empleador>();
    private static ArrayList<Trabajo> trabajo = new ArrayList<Trabajo>();
    //direcciones de don guardo
    private static final File dirEmpleado = new File("D:/Proyecto/empleado.txt");
    private static final File dirEmpleador = new File("D:/Proyecto/empleador.txt");
    private static final File dirtTrabajos = new File("D:/Proyecto/trabajo.txt");
    //identificar la posicion y el tipo de usuario activo
    private static boolean activo = false; //true=empleador; false=empleado
    private static int posActiv = 0; //posicion del usuario activo

    public Principal() {
    }

    public void ReiniciarCargarDatos() throws IOException {
        reiniciarDatos();
        this.testtra.optenerTrabajo(this.trabajo, this.dirtTrabajos);
        this.testus.optenerEmpleadores(this.empleador, this.dirEmpleador);
        this.testus.optenerEmpleados(this.empleado, this.dirEmpleado);
    }

    public ArrayList<Empleado> getEmpleado() {
        return this.empleado;
    }

    public ArrayList<Empleador> getEmpleador() {
        return this.empleador;
    }

    /*
     buena el empleador se le toma como true. y el empleado se le toma como false
     */
    public void setActivo(boolean activo) {
        this.activo = activo;
        System.out.println("en cambio en el pricipal: "+this.activo);
    }

    public boolean getActivo() {
        return this.activo;
    }

    public ArrayList<Trabajo> getTrabajo() {
        return this.trabajo;
    }

    public void setTrabajo(ArrayList<Trabajo> trabajo) {
        this.trabajo = trabajo;
    }

    public void setPosActiv(int posActiv) {
        this.posActiv = posActiv;
    }

    public int getPosActiv() {
        return this.posActiv;
    }

    private void reiniciarDatos() {
        this.trabajo.clear();
        this.empleado.clear();
        this.empleador.clear();
        this.posActiv = 0;
    }

    public void guardarDatos() {
        this.testtra.guardarTrabajo(this.trabajo, this.dirtTrabajos);
        this.testus.guardarEmpleadores(this.empleador, this.dirEmpleador);
        this.testus.guardarEmpleados(this.empleado, this.dirEmpleado);
    }

    public String Capcha() {
        Random r = new Random();
        int tamExtr = r.nextInt(3);
        char cad[] = new char[5 + tamExtr];
        int val = 0;
        for (int i = 0; i < cad.length; i++) {
            do {
                val = r.nextInt(125);
                if ((val >= 48 && val <= 57) || (val >= 65 && val <= 90) || (val >= 97 && val <= 122)) {
                    break;
                }
            } while (true);
            cad[i] = (char) val;
        }
        return String.valueOf(cad);
    }

    private static inicio VentInicio = null;
    private static PrincipalVent VentPrinci = null;
    private static CuentaEmpleador VentCuentEmp = null;
    private static CuentaBuscEmpleo VentaCuentaBuscEmpleo = null;

    public void setVentInicio(inicio VentInicio) {
        this.VentInicio = VentInicio;
    }

    public void setVentPrinci(PrincipalVent VentPrinci) {
        this.VentPrinci = VentPrinci;
    }

    public void setVentCuentEmp(CuentaEmpleador VentCuentEmp) {
        this.VentCuentEmp = VentCuentEmp;
    }

    public void setVentaCuentaBuscEmpleo(CuentaBuscEmpleo VentaCuentaBuscEmpleo) {
        this.VentaCuentaBuscEmpleo = VentaCuentaBuscEmpleo;
    }

    public inicio getVentInicio() {
        return this.VentInicio;
    }

    public PrincipalVent getVentPrinci() {
        return this.VentPrinci;
    }

    public CuentaEmpleador getVentCuentEmp() {
        return this.VentCuentEmp;
    }

    public CuentaBuscEmpleo getVentaCuentaBuscEmpleo() {
        return this.VentaCuentaBuscEmpleo;
    }

    public void cerrarCesionVentanas() {
        this.guardarDatos();
        this.VentPrinci = null;
        this.VentCuentEmp = null;
        this.VentaCuentaBuscEmpleo = null;
        this.VentInicio.reiniciarContInicios();
        this.VentInicio.setVisible(true);
    }

    public File getDirtTrabajos() {
        return this.dirtTrabajos;
    }
}