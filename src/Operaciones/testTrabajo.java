/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Operaciones;

import Modelos.Trabajo;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Frank
 */
public class testTrabajo {

    public void optenerTrabajo(ArrayList<Trabajo> trabajos, File dir) {
        FileReader fr = null;
        try {
            fr = new FileReader(dir);
            Scanner leer = new Scanner(fr);
            while (leer.hasNextLine()) {
                String linea = leer.nextLine();
                //System.out.println("linea: " + linea);
                String datos[] = linea.split(";");
                trabajos.add(new Trabajo(datos[0], datos[1], Integer.parseInt(datos[2]), datos[3], datos[4], datos[5]));
            }

            try {
                leer.close();
                fr.close();
            } catch (IOException e) {
            }

        } catch (FileNotFoundException e) {
        }
    }

    public void guardarTrabajo(ArrayList<Trabajo> trabajos, File dir) {
        FileWriter fw = null;
        try {
            fw = new FileWriter(dir);
            PrintWriter escribir = new PrintWriter(dir);
            for (Trabajo trab : trabajos) {
                escribir.println(trab.getPublicador() + ";" + trab.getPersonal() + ";" + trab.getCantidad() + ";" + trab.getAreaLaboral() + ";" + trab.getEmpresa() + ";" + trab.getRequisitos());
            }
            try {
                escribir.close();
                fw.close();
            } catch (Exception e) {
            }
        } catch (Exception e) {
        }
    }
}
