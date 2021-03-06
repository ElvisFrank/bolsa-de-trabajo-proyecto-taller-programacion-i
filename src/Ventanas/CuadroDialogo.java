/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Ventanas;

import static Ventanas.inicio.prin;

/**
 *
 * @author Frank
 */
public class CuadroDialogo extends javax.swing.JFrame {

    /**
     * Creates new form CuadroDialogo
     */
    public CuadroDialogo() {
        initComponents();
        this.setBounds(500, 300, 270, 193);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jButtonBEmpleo = new javax.swing.JButton();
        jButtonBrindEmpleo = new javax.swing.JButton();
        jButtonCancelar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Crear cuenta");
        setBackground(new java.awt.Color(20, 155, 225));
        setResizable(false);
        getContentPane().setLayout(null);

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("♦ Elija de acuerdo a su estado laboral, Ud:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(0, 40, 250, 14);

        jButtonBEmpleo.setBackground(new java.awt.Color(0, 0, 204));
        jButtonBEmpleo.setForeground(new java.awt.Color(204, 255, 204));
        jButtonBEmpleo.setText("Busca empleo");
        jButtonBEmpleo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBEmpleoActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonBEmpleo);
        jButtonBEmpleo.setBounds(140, 63, 110, 30);

        jButtonBrindEmpleo.setBackground(new java.awt.Color(0, 0, 204));
        jButtonBrindEmpleo.setForeground(new java.awt.Color(204, 255, 204));
        jButtonBrindEmpleo.setText("Brinda empleo");
        jButtonBrindEmpleo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBrindEmpleoActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonBrindEmpleo);
        jButtonBrindEmpleo.setBounds(10, 63, 120, 30);

        jButtonCancelar.setBackground(new java.awt.Color(0, 0, 204));
        jButtonCancelar.setForeground(new java.awt.Color(255, 255, 255));
        jButtonCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Regresar_ico_25p.png"))); // NOI18N
        jButtonCancelar.setText("Regresar");
        jButtonCancelar.setPreferredSize(new java.awt.Dimension(110, 33));
        jButtonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonCancelar);
        jButtonCancelar.setBounds(140, 125, 110, 30);

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 255, 204));
        jLabel1.setText("HOLA CREEMOS UNA NUEVA CUENTA...");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(20, 10, 240, 20);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Fondos/CuadroDialogo_165p.jpg"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 0, 264, 165);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarActionPerformed
        this.setVisible(false);
        this.dispose();
        prin.getVentInicio().setVisible(true);
    }//GEN-LAST:event_jButtonCancelarActionPerformed

    private void jButtonBEmpleoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBEmpleoActionPerformed
        this.setVisible(false);
        this.dispose();
        new RegistroEmpleado().show();
    }//GEN-LAST:event_jButtonBEmpleoActionPerformed

    private void jButtonBrindEmpleoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBrindEmpleoActionPerformed
        this.setVisible(false);
        this.dispose();
        new RegistroEmpleador().show();
    }//GEN-LAST:event_jButtonBrindEmpleoActionPerformed
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonBEmpleo;
    private javax.swing.JButton jButtonBrindEmpleo;
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}
