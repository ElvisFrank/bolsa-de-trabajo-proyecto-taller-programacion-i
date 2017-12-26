/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Operaciones;

import Modelos.Empleado;
import Modelos.Empleador;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Frank
 */
public class testUsuarios {

    public void optenerEmpleados(ArrayList<Empleado> empl, File dir) {
        FileReader fr = null;
        try {
            fr = new FileReader(dir);
            Scanner leer = new Scanner(fr);
            while (leer.hasNextLine()) {
                String linea = leer.nextLine();
                String datos[] = linea.split(";");
                String Fecha[] = datos[7].split(":");
                //System.out.println(datos[0] + "  " + datos[1] + "  " + datos[2] + "  " + datos[3] + "  " + datos[4] + "  " + datos[5] + "  " + datos[6] + "  " + Fecha[0] + "  " + Fecha[1] + "  " + Fecha[2] + "  " + Fecha[3]);
                empl.add(new Empleado(datos[0], datos[1], datos[2], datos[3], datos[4], datos[5], datos[6], Fecha[0], Fecha[1], Fecha[2], Fecha[3]));
            }
            leer.close();
            fr.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "error el cargar datos Buscadores de empleo");
        }
    }

    public void optenerEmpleadores(ArrayList<Empleador> empl, File dir) {
        FileReader fr = null;
        try {
            fr = new FileReader(dir);
            Scanner leer = new Scanner(fr);
            while (leer.hasNextLine()) {
                String linea = leer.nextLine();
                String datos[] = linea.split(";");
                String Fecha[] = datos[5].split(":");
                //System.out.println(datos[0] + "  " + datos[1] + "  " + datos[2] + "  " + datos[3] + "  " + datos[4] + "  " + Fecha[0] + "  " + Fecha[1] + "  " + Fecha[2] + "  " + Fecha[3]);
                empl.add(new Empleador(datos[0], datos[1], datos[2], datos[3], datos[4], Fecha[0], Fecha[1], Fecha[2], Fecha[3]));
            }
            leer.close();
            fr.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "error el cargar datos Empresarios");
        }
    }

    public void guardarEmpleados(ArrayList<Empleado> empleado, File dir) {
        FileWriter fw = null;
        try {
            fw = new FileWriter(dir);
            PrintWriter escribir = new PrintWriter(dir);
            //Nombre,Correo,Contraceña,Nick,Empresa,Dia, Mes, Año, Sexo
            for (Empleado emp : empleado) {
                /*System.out.println(emp.getNombre() + ";" + emp.getCorreo() + ";" + emp.getContraceña() + ";" + emp.getNick() + ";"
                        + emp.getOcupacion() + ";" + emp.getAreaLaboral() + ";" + emp.getGradoInstruccion() + ";"
                        + emp.getDia() + "|" + emp.getMes() + "|" + emp.getAño() + "|" + emp.getSexo());*/
                escribir.println(emp.getNombre() + ";" + emp.getCorreo() + ";" + emp.getContraceña() + ";" + emp.getNick() + ";"
                        + emp.getOcupacion() + ";" + emp.getAreaLaboral() + ";" + emp.getGradoInstruccion() + ";"
                        + emp.getDia() + ":" + emp.getMes() + ":" + emp.getAño() + ":" + emp.getSexo());
            }
            escribir.close();
            fw.close();
        } catch (Exception e) {
        }
    }

    public void guardarEmpleadores(ArrayList<Empleador> empleador, File dir) {
        FileWriter fw = null;
        try {
            fw = new FileWriter(dir);
            PrintWriter escribir = new PrintWriter(dir);
            for (Empleador emp : empleador) {
                /*System.out.println(emp.getNombre() + ";" + emp.getCorreo() + ";" + emp.getContraceña() + ";" + emp.getNick()
                        + ";" + emp.getEmpresa() + ";" + emp.getDia() + "|" + emp.getMes() + "|" + emp.getAño() + "|"
                        + emp.getSexo());*/
                escribir.println(emp.getNombre() + ";" + emp.getCorreo() + ";" + emp.getContraceña() + ";" + emp.getNick()
                        + ";" + emp.getEmpresa() + ";" + emp.getDia() + ":" + emp.getMes() + ":" + emp.getAño() + ":"
                        + emp.getSexo());
            }
            escribir.close();
            fw.close();
        } catch (Exception e) {
        }
    }
}
