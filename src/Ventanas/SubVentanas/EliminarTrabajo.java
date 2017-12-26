/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ventanas.SubVentanas;

import Modelos.Trabajo;
import Operaciones.testTrabajo;
import static Ventanas.inicio.prin;

/**
 *
 * @author Frank
 */
public class EliminarTrabajo extends javax.swing.JFrame {

    /**
     * Creates new form EliminarTrabajo
     */
    private static String Codigo = "";

    public EliminarTrabajo() {
        initComponents();
        this.setBounds(400, 200, 501, 380);
        jTextFieldCodigo.setText(Codigo);
        MostrarPublicaciones();
    }

    private void MostrarPublicaciones() {
        String Mensage = "";
        boolean con = true;
        int cod = 0;
        for (Trabajo T : prin.getTrabajo()) {
            if (T.getPublicador().equalsIgnoreCase(prin.getEmpleador().get(prin.getPosActiv()).getNombre())) {
                Mensage += ("Personal: " + T.getPersonal() + "\t[" + T.getCantidad() + "]" + "\nPara la empresa: " + T.getEmpresa() + "\tCod:\t" + cod + "\n\n");
                con = false;
            }
            cod++;
        }
        if (con) {
            this.jTextAreaTrabajosPublicados.setText("Usted no a publicado ningun trabajo todabia");
            return;
        } else {
            this.jTextAreaTrabajosPublicados.setText(Mensage);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaTrabajosPublicados = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldCodigo = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButtonRegresar = new javax.swing.JButton();
        jButtonVerTrabajo = new javax.swing.JButton();
        jLabelMenVer = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setText("Lista de trabajos publicados");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(161, 11, 218, 20);

        jTextAreaTrabajosPublicados.setEditable(false);
        jTextAreaTrabajosPublicados.setColumns(20);
        jTextAreaTrabajosPublicados.setRows(5);
        jScrollPane1.setViewportView(jTextAreaTrabajosPublicados);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(10, 49, 467, 180);

        jLabel2.setForeground(new java.awt.Color(0, 0, 255));
        jLabel2.setText("Ingrese el codigo del trabajo a eliminar");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(20, 241, 228, 20);
        getContentPane().add(jTextFieldCodigo);
        jTextFieldCodigo.setBounds(271, 235, 131, 32);

        jButton1.setText("Eliminar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(399, 299, 78, 32);

        jButtonRegresar.setText("Regresar");
        jButtonRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRegresarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonRegresar);
        jButtonRegresar.setBounds(10, 299, 85, 32);

        jButtonVerTrabajo.setText("Ver");
        jButtonVerTrabajo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVerTrabajoActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonVerTrabajo);
        jButtonVerTrabajo.setBounds(428, 235, 49, 23);

        jLabelMenVer.setForeground(new java.awt.Color(255, 0, 0));
        getContentPane().add(jLabelMenVer);
        jLabelMenVer.setBounds(271, 273, 206, 15);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Fondos/EliminarTrab_500p.jpg"))); // NOI18N
        getContentPane().add(jLabel3);
        jLabel3.setBounds(0, 0, 500, 360);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonVerTrabajoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVerTrabajoActionPerformed
        Codigo = "" + jTextFieldCodigo.getText();
        if (Codigo.equalsIgnoreCase("")) {
            jLabelMenVer.setText("Primero ingrese el Cod. a buscar");
            return;
        } else {
            int n = 0;
            try {
                n = Integer.parseInt(Codigo);
            } catch (Exception e) {
                jLabelMenVer.setText("Codigo Incorrecto");
                return;
            }
            if (prin.getTrabajo().size() <= n || (n<0)) {
                jLabelMenVer.setText("Codigo Incorrecto");
                return;
            }
            this.setVisible(false);
            jLabelMenVer.setText("");
            new MostrarTrabajo(n, 3).show(true);
        }
    }//GEN-LAST:event_jButtonVerTrabajoActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Codigo = "" + jTextFieldCodigo.getText();
        if (Codigo.equalsIgnoreCase("")) {
            jLabelMenVer.setText("Primero ingrese el Cod. a buscar");
            return;
        } else {
            int n = 0;
            try {
                n = Integer.parseInt(Codigo);
            } catch (Exception e) {
                jLabelMenVer.setText("Codigo Incorrecto");
                return;
            }
            if (prin.getTrabajo().size() <= n || n < 0) {
                jLabelMenVer.setText("Codigo Incorrecto");
                return;
            }
            if (prin.getTrabajo().get(n).getPublicador().equals(prin.getEmpleador().get(prin.getPosActiv()).getNombre())) {
                prin.getTrabajo().remove(n);
                jLabelMenVer.setText("ELIMINADO CORRECTAMENTE");
                new testTrabajo().guardarTrabajo(prin.getTrabajo(), prin.getDirtTrabajos());
                prin.getTrabajo().clear();
                new testTrabajo().optenerTrabajo(prin.getTrabajo(), prin.getDirtTrabajos());
                MostrarPublicaciones();
                return;
            }
            jLabelMenVer.setText("NO SE PUDO ELIMINAR");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButtonRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRegresarActionPerformed
        this.setVisible(false);
        this.dispose();
        prin.getVentCuentEmp().setVisible(true);
    }//GEN-LAST:event_jButtonRegresarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonRegresar;
    private javax.swing.JButton jButtonVerTrabajo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabelMenVer;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextAreaTrabajosPublicados;
    private javax.swing.JTextField jTextFieldCodigo;
    // End of variables declaration//GEN-END:variables
}
