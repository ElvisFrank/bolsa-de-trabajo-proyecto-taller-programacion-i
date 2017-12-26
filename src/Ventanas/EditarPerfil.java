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
public class EditarPerfil extends javax.swing.JFrame {

    private static int ventanaP = 0;

    public EditarPerfil() {
        System.out.println("llego a editar perfil");
        initComponents();
        System.out.println("llego a editar perfil");
        ventanaP = 0;
        this.setBounds(400, 150, 350, 428);
    }

    public EditarPerfil(int ventaProve) {
        initComponents();
        ventanaP = ventaProve;
        this.setBounds(400, 150, 350, 428);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelNuevoNick = new javax.swing.JLabel();
        jLabelContraActual = new javax.swing.JLabel();
        jLabelNuevaContra = new javax.swing.JLabel();
        jButtonCancelar = new javax.swing.JButton();
        jButtonGuardar = new javax.swing.JButton();
        jTextFieldNick = new javax.swing.JTextField();
        jLabelTexto = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPasswordFieldContraActual = new javax.swing.JPasswordField();
        jPasswordFieldNuevaContra = new javax.swing.JPasswordField();
        jPasswordFieldVerificarContra = new javax.swing.JPasswordField();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("EDITANDO");
        setResizable(false);
        getContentPane().setLayout(null);

        jLabelNuevoNick.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabelNuevoNick.setForeground(new java.awt.Color(255, 255, 255));
        jLabelNuevoNick.setText("Nuevo nick:");
        getContentPane().add(jLabelNuevoNick);
        jLabelNuevoNick.setBounds(20, 50, 80, 14);

        jLabelContraActual.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabelContraActual.setForeground(new java.awt.Color(255, 255, 255));
        jLabelContraActual.setText("Contraseña actual:");
        getContentPane().add(jLabelContraActual);
        jLabelContraActual.setBounds(20, 130, 110, 14);

        jLabelNuevaContra.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabelNuevaContra.setForeground(new java.awt.Color(255, 255, 255));
        jLabelNuevaContra.setText("Nueva contraseña:");
        getContentPane().add(jLabelNuevaContra);
        jLabelNuevaContra.setBounds(20, 200, 110, 14);

        jButtonCancelar.setBackground(new java.awt.Color(51, 51, 255));
        jButtonCancelar.setForeground(new java.awt.Color(255, 255, 255));
        jButtonCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Regresar_ico_25p.png"))); // NOI18N
        jButtonCancelar.setText("Cancelar");
        jButtonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonCancelar);
        jButtonCancelar.setBounds(20, 350, 110, 30);

        jButtonGuardar.setBackground(new java.awt.Color(51, 51, 255));
        jButtonGuardar.setForeground(new java.awt.Color(255, 255, 255));
        jButtonGuardar.setText("Guardar");
        jButtonGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGuardarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonGuardar);
        jButtonGuardar.setBounds(220, 350, 110, 30);

        jTextFieldNick.setForeground(new java.awt.Color(0, 0, 204));
        getContentPane().add(jTextFieldNick);
        jTextFieldNick.setBounds(100, 80, 180, 30);

        jLabelTexto.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabelTexto.setForeground(new java.awt.Color(242, 81, 42));
        jLabelTexto.setText("Modificando su informacion");
        getContentPane().add(jLabelTexto);
        jLabelTexto.setBounds(90, 10, 180, 17);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Verificar nueva contraceña:");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(20, 270, 160, 15);

        jPasswordFieldContraActual.setForeground(new java.awt.Color(0, 0, 204));
        getContentPane().add(jPasswordFieldContraActual);
        jPasswordFieldContraActual.setBounds(100, 160, 180, 30);

        jPasswordFieldNuevaContra.setForeground(new java.awt.Color(0, 0, 204));
        getContentPane().add(jPasswordFieldNuevaContra);
        jPasswordFieldNuevaContra.setBounds(100, 230, 180, 30);

        jPasswordFieldVerificarContra.setForeground(new java.awt.Color(0, 0, 204));
        getContentPane().add(jPasswordFieldVerificarContra);
        jPasswordFieldVerificarContra.setBounds(100, 300, 180, 30);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Fondos/EditarDatos_400p.jpg"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 0, 360, 400);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGuardarActionPerformed

        String Nick = jTextFieldNick.getText(), ContA = jPasswordFieldContraActual.getText(), ContN = jPasswordFieldNuevaContra.getText(), contVer = jPasswordFieldVerificarContra.getText();
        if (Nick.equalsIgnoreCase("") || ContA.equalsIgnoreCase("") || ContN.equalsIgnoreCase("") || !contVer.equals(ContN)) {
            return;
        }
        if (prin.getActivo()) {
            if (ContA.equals(prin.getEmpleador().get(prin.getPosActiv()).getContraceña())) {
                prin.getEmpleador().get(prin.getPosActiv()).setNick(Nick);
                prin.getEmpleador().get(prin.getPosActiv()).setContraceña(contVer);
                prin.getVentPrinci().ActualizarInfoUsuario();
                this.setVisible(false);
                if (ventanaP == 1) {
                    prin.getVentCuentEmp().setVisible(true);
                    return;
                } else {
                    if (ventanaP == 2) {
                        prin.getVentaCuentaBuscEmpleo().setVisible(true);
                        return;
                    }
                }
                prin.getVentPrinci().setVisible(true);
            }
        } else {
            if (ContA.equals(prin.getEmpleado().get(prin.getPosActiv()).getContraceña())) {
                prin.getEmpleado().get(prin.getPosActiv()).setNick(Nick);
                prin.getEmpleado().get(prin.getPosActiv()).setContraceña(contVer);
                prin.getVentPrinci().ActualizarInfoUsuario();
                this.setVisible(false);
                if (ventanaP == 1) {
                    prin.getVentCuentEmp().setVisible(true);
                    return;
                } else {
                    if (ventanaP == 2) {
                        prin.getVentaCuentaBuscEmpleo().setVisible(true);
                        return;
                    }
                }
                prin.getVentPrinci().setVisible(true);
            }
        }
    }//GEN-LAST:event_jButtonGuardarActionPerformed

    private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarActionPerformed
        this.setVisible(false);
        if (ventanaP == 1) {
            prin.getVentCuentEmp().setVisible(true);
            return;
        } else {
            if (ventanaP == 2) {
                prin.getVentaCuentaBuscEmpleo().setVisible(true);
                return;
            }
        }
        prin.getVentPrinci().setVisible(true);
    }//GEN-LAST:event_jButtonCancelarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JButton jButtonGuardar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabelContraActual;
    private javax.swing.JLabel jLabelNuevaContra;
    private javax.swing.JLabel jLabelNuevoNick;
    private javax.swing.JLabel jLabelTexto;
    private javax.swing.JPasswordField jPasswordFieldContraActual;
    private javax.swing.JPasswordField jPasswordFieldNuevaContra;
    private javax.swing.JPasswordField jPasswordFieldVerificarContra;
    private javax.swing.JTextField jTextFieldNick;
    // End of variables declaration//GEN-END:variables
}
