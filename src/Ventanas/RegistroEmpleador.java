/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ventanas;

import Limitadores.LimitInresoDatos;
import Modelos.Empleado;
import Modelos.Empleador;
import java.io.IOException;
import javax.swing.JOptionPane;
import static Ventanas.inicio.prin;

/**
 *
 * @author Frank
 */
public class RegistroEmpleador extends javax.swing.JFrame {

    /**
     * Creates new form RegistroEmpleador
     */
    public RegistroEmpleador() {
        initComponents();
        this.jLabelCodigoCapchGenerado.setText(prin.Capcha());
        this.setBounds(400, 50, 406, 650);
        this.jTextFieldCorreo.setDocument(new LimitInresoDatos(25));
        this.jTextFieldNombres.setDocument(new LimitInresoDatos(50));
        this.jTextFieldNick.setDocument(new LimitInresoDatos(10));
        this.jPasswordFieldContra.setDocument(new LimitInresoDatos(15));
        this.jPasswordFieldContVerf.setDocument(new LimitInresoDatos(15));
        this.jTextFieldEmpresa.setDocument(new LimitInresoDatos(50));
        this.jTextFieldCadigoCap.setDocument(new LimitInresoDatos(10));
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
        jTextFieldNombres = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldCorreo = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextFieldNick = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jComboBoxSexo = new javax.swing.JComboBox();
        jLabel9 = new javax.swing.JLabel();
        jComboBoxAño = new javax.swing.JComboBox();
        jComboBoxMes = new javax.swing.JComboBox();
        jComboBoxDia = new javax.swing.JComboBox();
        jButtonGenerarCodigo = new javax.swing.JButton();
        jLabelCodigoCapchGenerado = new javax.swing.JLabel();
        jTextFieldCadigoCap = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jButtonCrear = new javax.swing.JButton();
        jButtonCancelar = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jTextFieldEmpresa = new javax.swing.JTextField();
        jPasswordFieldContra = new javax.swing.JPasswordField();
        jPasswordFieldContVerf = new javax.swing.JPasswordField();
        jLabelMenNomb = new javax.swing.JLabel();
        jLabelMenCorreo = new javax.swing.JLabel();
        jLabelMenNick = new javax.swing.JLabel();
        jLabelMenContra = new javax.swing.JLabel();
        jLabelMenEmpresa = new javax.swing.JLabel();
        jLabelMenCodigoCapcha = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Sylfaen", 3, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 204, 102));
        jLabel1.setText("Bienvenido ,por favor rellena esta ficha");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(70, 10, 300, 19);

        jLabel2.setForeground(new java.awt.Color(204, 255, 204));
        jLabel2.setText("Nombres y apellidos:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(30, 60, 120, 14);

        jTextFieldNombres.setForeground(new java.awt.Color(51, 0, 255));
        getContentPane().add(jTextFieldNombres);
        jTextFieldNombres.setBounds(150, 50, 210, 30);

        jLabel4.setForeground(new java.awt.Color(204, 255, 204));
        jLabel4.setText("Correo a  crear:");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(30, 110, 110, 14);

        jTextFieldCorreo.setForeground(new java.awt.Color(51, 0, 255));
        getContentPane().add(jTextFieldCorreo);
        jTextFieldCorreo.setBounds(150, 100, 210, 30);

        jLabel5.setForeground(new java.awt.Color(204, 255, 204));
        jLabel5.setText("Nick:");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(30, 160, 40, 14);

        jTextFieldNick.setForeground(new java.awt.Color(51, 0, 255));
        getContentPane().add(jTextFieldNick);
        jTextFieldNick.setBounds(150, 150, 100, 30);

        jLabel6.setForeground(new java.awt.Color(204, 255, 204));
        jLabel6.setText("Contraceña:");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(30, 210, 90, 14);

        jLabel7.setForeground(new java.awt.Color(204, 255, 204));
        jLabel7.setText("Verificar contraceña:");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(30, 250, 120, 14);

        jLabel8.setForeground(new java.awt.Color(204, 255, 204));
        jLabel8.setText("Sexo:");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(40, 300, 70, 14);

        jComboBoxSexo.setForeground(new java.awt.Color(51, 0, 255));
        jComboBoxSexo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Masculino", "Femenino" }));
        getContentPane().add(jComboBoxSexo);
        jComboBoxSexo.setBounds(150, 290, 100, 30);

        jLabel9.setForeground(new java.awt.Color(204, 255, 204));
        jLabel9.setText("Fecha de nacimiento:");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(30, 340, 130, 14);

        jComboBoxAño.setForeground(new java.awt.Color(51, 0, 255));
        jComboBoxAño.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1955", "1956", "1957", "1958", "1959", "1960", "1961", "1962", "1963", "1964", "1965", "1966", "1967", "1968", "1969", "1970", "1971", "1972", "1973", "1974", "1975", "1976", "1977", "1978", "1979", "1980", "1981", "1982", "1983", "1984", "1985", "1986", "1987", "1988", "1989", "1990", "1991", "1992", "1993", "1994", "1995" }));
        getContentPane().add(jComboBoxAño);
        jComboBoxAño.setBounds(60, 360, 100, 30);

        jComboBoxMes.setForeground(new java.awt.Color(51, 0, 255));
        jComboBoxMes.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Enero", "febrero", "Marzo", "Abril", "Mayo", "junio", "Julio", "Agosto", "Setiembre", "Octubre", "Noviembre", "Diciembre" }));
        getContentPane().add(jComboBoxMes);
        jComboBoxMes.setBounds(160, 360, 110, 30);

        jComboBoxDia.setForeground(new java.awt.Color(51, 0, 255));
        jComboBoxDia.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        jComboBoxDia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxDiaActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBoxDia);
        jComboBoxDia.setBounds(270, 360, 60, 30);

        jButtonGenerarCodigo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/GenerarAleatorio_25p.png"))); // NOI18N
        jButtonGenerarCodigo.setText("Generar Codigo");
        jButtonGenerarCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGenerarCodigoActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonGenerarCodigo);
        jButtonGenerarCodigo.setBounds(30, 460, 150, 30);

        jLabelCodigoCapchGenerado.setForeground(new java.awt.Color(51, 255, 51));
        getContentPane().add(jLabelCodigoCapchGenerado);
        jLabelCodigoCapchGenerado.setBounds(200, 460, 140, 30);

        jTextFieldCadigoCap.setForeground(new java.awt.Color(51, 0, 255));
        getContentPane().add(jTextFieldCadigoCap);
        jTextFieldCadigoCap.setBounds(200, 510, 140, 30);

        jLabel12.setForeground(new java.awt.Color(204, 255, 204));
        jLabel12.setText("Ingrese el codigo:");
        getContentPane().add(jLabel12);
        jLabel12.setBounds(30, 510, 110, 20);

        jButtonCrear.setBackground(java.awt.Color.blue);
        jButtonCrear.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButtonCrear.setForeground(new java.awt.Color(204, 255, 204));
        jButtonCrear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Nuevo_23p.png"))); // NOI18N
        jButtonCrear.setText("Crear");
        jButtonCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCrearActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonCrear);
        jButtonCrear.setBounds(270, 560, 100, 40);

        jButtonCancelar.setBackground(java.awt.Color.blue);
        jButtonCancelar.setForeground(new java.awt.Color(204, 255, 204));
        jButtonCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Regresar_ico_25p.png"))); // NOI18N
        jButtonCancelar.setText("Regresar");
        jButtonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonCancelar);
        jButtonCancelar.setBounds(20, 560, 110, 40);

        jLabel13.setForeground(new java.awt.Color(204, 255, 204));
        jLabel13.setText("Empresa u organizacion:");
        getContentPane().add(jLabel13);
        jLabel13.setBounds(30, 430, 130, 14);

        jTextFieldEmpresa.setForeground(new java.awt.Color(51, 0, 255));
        getContentPane().add(jTextFieldEmpresa);
        jTextFieldEmpresa.setBounds(160, 420, 200, 30);
        getContentPane().add(jPasswordFieldContra);
        jPasswordFieldContra.setBounds(150, 200, 160, 30);
        getContentPane().add(jPasswordFieldContVerf);
        jPasswordFieldContVerf.setBounds(150, 240, 160, 30);

        jLabelMenNomb.setForeground(new java.awt.Color(255, 0, 0));
        getContentPane().add(jLabelMenNomb);
        jLabelMenNomb.setBounds(150, 30, 220, 20);

        jLabelMenCorreo.setForeground(new java.awt.Color(255, 0, 0));
        getContentPane().add(jLabelMenCorreo);
        jLabelMenCorreo.setBounds(150, 80, 220, 20);

        jLabelMenNick.setForeground(new java.awt.Color(255, 0, 0));
        getContentPane().add(jLabelMenNick);
        jLabelMenNick.setBounds(150, 130, 220, 20);

        jLabelMenContra.setForeground(new java.awt.Color(255, 0, 0));
        getContentPane().add(jLabelMenContra);
        jLabelMenContra.setBounds(150, 180, 220, 20);

        jLabelMenEmpresa.setForeground(new java.awt.Color(255, 0, 0));
        getContentPane().add(jLabelMenEmpresa);
        jLabelMenEmpresa.setBounds(160, 400, 210, 20);

        jLabelMenCodigoCapcha.setForeground(new java.awt.Color(255, 0, 0));
        getContentPane().add(jLabelMenCodigoCapcha);
        jLabelMenCodigoCapcha.setBounds(200, 490, 170, 20);

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Fondos/CrearEmp_610p.jpg"))); // NOI18N
        getContentPane().add(jLabel14);
        jLabel14.setBounds(0, 0, 390, 620);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBoxDiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxDiaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxDiaActionPerformed

    private void jButtonGenerarCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGenerarCodigoActionPerformed
        jLabelCodigoCapchGenerado.setText(prin.Capcha());
    }//GEN-LAST:event_jButtonGenerarCodigoActionPerformed

    private void reiniciarMensajes() {
        this.jLabelMenCodigoCapcha.setText("");
        this.jLabelMenContra.setText("");
        this.jLabelMenCorreo.setText("");
        this.jLabelMenEmpresa.setText("");
        this.jLabelMenNick.setText("");
        this.jLabelMenNomb.setText("");
    }
    private void jButtonCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCrearActionPerformed
        String Nom = jTextFieldNombres.getText(), contr = jPasswordFieldContra.getText(), contVer = jPasswordFieldContVerf.getText();
        String Correo = jTextFieldCorreo.getText(), Nick = jTextFieldNick.getText(), Emp = jTextFieldEmpresa.getText(), CodCap = jTextFieldCadigoCap.getText();
        String FAño = String.valueOf(jComboBoxAño.getSelectedItem()), FMes = String.valueOf(jComboBoxMes.getSelectedItem()), FDia = String.valueOf(jComboBoxDia.getSelectedItem());
        String Sexo = String.valueOf(jComboBoxSexo.getSelectedItem());
        reiniciarMensajes();

        if (Nom.equalsIgnoreCase("")) {
            jLabelMenNomb.setText("Introdusca su Nombre");
            return;
        } else {
            if (Nom.length() <= 7) {//Ana diaz
                jLabelMenNomb.setText("Nombre y apellido");
                return;
            } else {
                if (Correo.equalsIgnoreCase("")) {
                    jLabelMenCorreo.setText("Ingrese su Nuev Correo");
                    return;
                } else {//ab@gmail.com
                    if (Correo.length() <= 10) {
                        jLabelMenCorreo.setText("Muy corto");
                        jTextFieldCorreo.setText("---@gmail.com");
                        return;
                    } else {
                        if (Nick.equalsIgnoreCase("")) {
                            jLabelMenNick.setText("Ingrese un Nick");
                            return;
                        } else {
                            if (Nick.length() < 2) {
                                jLabelMenNick.setText("Nick muy corto");
                                return;
                            } else {
                                if (contr.equalsIgnoreCase("")) {
                                    jLabelMenContra.setText("Ingrese una Contraseña");
                                    return;
                                } else {
                                    if (contr.length() <= 4) {
                                        jLabelMenContra.setText("Contraseña muy corta");
                                        return;
                                    } else {
                                        if (!contr.equals(contVer)) {
                                            jLabelMenContra.setText("No Coinciden las cont.");
                                            return;
                                        } else {
                                            if (Emp.equalsIgnoreCase("")) {
                                                jLabelMenEmpresa.setText("Ingrese una empresa");
                                                return;
                                            } else {//contador,
                                                if (Emp.length() <= 1) {
                                                    jLabelMenEmpresa.setText("Muy corta para ser valida");
                                                    return;
                                                } else {
                                                    if (CodCap.equalsIgnoreCase("")) {
                                                        jLabelMenCodigoCapcha.setText("Falta cod de verificacion");
                                                        return;
                                                    } else {
                                                        if (!CodCap.equals(jLabelCodigoCapchGenerado.getText())) {
                                                            jLabelMenCodigoCapcha.setText("No coinciden");
                                                            return;
                                                        } else {
                                                            for (Empleado emp : prin.getEmpleado()) {
                                                                if (emp.getNick().equals(Nick)) {
                                                                    jLabelMenNick.setText("Nick ya registrado");
                                                                    return;
                                                                }
                                                                if (emp.getCorreo().equalsIgnoreCase(Correo)) {
                                                                    jLabelMenCorreo.setText("Correo ya registrado");
                                                                    return;
                                                                }
                                                            }

                                                            for (Empleador emp : prin.getEmpleador()) {
                                                                if (emp.getNick().equals(Nick)) {
                                                                    jLabelMenNick.setText("Nick ya registrado");
                                                                    return;
                                                                }
                                                                if (emp.getCorreo().equalsIgnoreCase(Correo)) {
                                                                    jLabelMenCorreo.setText("Correo ya registrado");
                                                                    return;
                                                                }
                                                            }
                                                            prin.getEmpleador().add(new Empleador(Nom, Correo, contr, Nick, Emp, FDia, FMes, FAño, Sexo));
                                                            JOptionPane.showMessageDialog(null, "se registro correctamente", "Mensaje", 1);
                                                            prin.guardarDatos();
                                                            try {
                                                                prin.ReiniciarCargarDatos();
                                                            } catch (IOException ex) {
                                                                JOptionPane.showMessageDialog(null, "Error el cargar datos...");
                                                            }
                                                            this.setVisible(false);
                                                            this.dispose();
                                                            prin.getVentInicio().reiniciarContInicios();
                                                            prin.getVentInicio().setVisible(true);
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }//GEN-LAST:event_jButtonCrearActionPerformed

    private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarActionPerformed
        int num = JOptionPane.showConfirmDialog(null, "Desea cancelar la creacion de su cuenta", "Mensage", 1);
        if (num == 0) {
            this.setVisible(false);
            this.dispose();
            prin.getVentInicio().setVisible(true);
        }
    }//GEN-LAST:event_jButtonCancelarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JButton jButtonCrear;
    private javax.swing.JButton jButtonGenerarCodigo;
    private javax.swing.JComboBox jComboBoxAño;
    private javax.swing.JComboBox jComboBoxDia;
    private javax.swing.JComboBox jComboBoxMes;
    private javax.swing.JComboBox jComboBoxSexo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelCodigoCapchGenerado;
    private javax.swing.JLabel jLabelMenCodigoCapcha;
    private javax.swing.JLabel jLabelMenContra;
    private javax.swing.JLabel jLabelMenCorreo;
    private javax.swing.JLabel jLabelMenEmpresa;
    private javax.swing.JLabel jLabelMenNick;
    private javax.swing.JLabel jLabelMenNomb;
    private javax.swing.JPasswordField jPasswordFieldContVerf;
    private javax.swing.JPasswordField jPasswordFieldContra;
    private javax.swing.JTextField jTextFieldCadigoCap;
    private javax.swing.JTextField jTextFieldCorreo;
    private javax.swing.JTextField jTextFieldEmpresa;
    private javax.swing.JTextField jTextFieldNick;
    private javax.swing.JTextField jTextFieldNombres;
    // End of variables declaration//GEN-END:variables
}
