/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ventanas.SubVentanas;

import javax.swing.JFrame;
import static Ventanas.inicio.prin;
/**
 *
 * @author Frank
 */
public class MostrarTrabajo extends javax.swing.JFrame {

    /**
     * Creates new form MostrarTrabajo
     */
    private int vent = 0;

    public MostrarTrabajo(int pos) {
        initComponents();
        this.jTextAreaRequisitos.setEditable(false);
        this.setBounds(500, 150, 510, 349);
        llenar(pos);
        vent=0;
    }

    public MostrarTrabajo(int pos, int venta) {
        initComponents();
        vent = venta;
        this.jTextAreaRequisitos.setEditable(false);
        this.setBounds(500, 150, 510, 349);
        llenar(pos);
    }

    private void llenar(int pos) {
        this.jLabelAreaLaboral.setText(prin.getTrabajo().get(pos).getAreaLaboral());
        this.jLabelCantidadPersonal.setText(String.valueOf(prin.getTrabajo().get(pos).getCantidad()));
        this.jLabelEmpresa.setText(prin.getTrabajo().get(pos).getEmpresa());
        this.jLabelPersonal.setText(prin.getTrabajo().get(pos).getPersonal());
        String mensag = prin.getTrabajo().get(pos).getRequisitos().replace("/:", "\n");
        this.jTextAreaRequisitos.setText(mensag);
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
        jLabel2 = new javax.swing.JLabel();
        jLabelPersonal = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabelAreaLaboral = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabelEmpresa = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaRequisitos = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        jLabelCantidadPersonal = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Sylfaen", 3, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(217, 12, 29));
        jLabel1.setText("Datos del la oportunidad de trabajo");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(141, 11, 310, 23);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(6, 186, 52));
        jLabel2.setText("Personal:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(10, 39, 70, 20);

        jLabelPersonal.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabelPersonal.setForeground(new java.awt.Color(9, 19, 195));
        getContentPane().add(jLabelPersonal);
        jLabelPersonal.setBounds(91, 39, 230, 20);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(6, 186, 52));
        jLabel4.setText("Cantidad:");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(330, 39, 80, 20);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(6, 186, 52));
        jLabel5.setText("Area Laboral:");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(10, 64, 80, 20);

        jLabelAreaLaboral.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabelAreaLaboral.setForeground(new java.awt.Color(9, 19, 195));
        getContentPane().add(jLabelAreaLaboral);
        jLabelAreaLaboral.setBounds(93, 64, 390, 20);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(6, 186, 52));
        jLabel7.setText("Empresa u Organizacion:");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(10, 86, 148, 20);

        jLabelEmpresa.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabelEmpresa.setForeground(new java.awt.Color(9, 19, 195));
        getContentPane().add(jLabelEmpresa);
        jLabelEmpresa.setBounds(176, 86, 225, 20);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(6, 186, 52));
        jLabel9.setText("Requisitos:");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(10, 108, 90, 20);

        jTextAreaRequisitos.setEditable(false);
        jTextAreaRequisitos.setColumns(20);
        jTextAreaRequisitos.setForeground(new java.awt.Color(0, 0, 255));
        jTextAreaRequisitos.setRows(5);
        jScrollPane1.setViewportView(jTextAreaRequisitos);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(60, 129, 410, 140);

        jButton1.setBackground(new java.awt.Color(28, 132, 255));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("OK");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(440, 280, 50, 30);

        jLabelCantidadPersonal.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabelCantidadPersonal.setForeground(new java.awt.Color(9, 19, 195));
        getContentPane().add(jLabelCantidadPersonal);
        jLabelCantidadPersonal.setBounds(424, 39, 50, 20);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Fondos/Abstracto_320pA.jpg"))); // NOI18N
        getContentPane().add(jLabel3);
        jLabel3.setBounds(0, 0, 510, 320);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.setVisible(false);
        this.dispose();
        if (vent == 0) {
            prin.getVentPrinci().setVisible(true);
        } else {
            if (vent == 1) {
                prin.getVentCuentEmp().setVisible(true);
            }else{
                if(vent==2){
                    prin.getVentaCuentaBuscEmpleo().setVisible(true);
                }else{
                    if(vent==3){
                        new EliminarTrabajo().show(true);
                    }
                }
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelAreaLaboral;
    private javax.swing.JLabel jLabelCantidadPersonal;
    private javax.swing.JLabel jLabelEmpresa;
    private javax.swing.JLabel jLabelPersonal;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextAreaRequisitos;
    // End of variables declaration//GEN-END:variables
}
