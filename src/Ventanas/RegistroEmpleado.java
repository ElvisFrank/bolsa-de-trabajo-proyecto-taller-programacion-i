package Ventanas;

import Limitadores.LimitInresoDatos;
import Modelos.Empleado;
import Modelos.Empleador;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

import static Ventanas.inicio.prin;

public class RegistroEmpleado extends javax.swing.JFrame {

    public RegistroEmpleado() {
        initComponents();
        this.setBounds(400, 40, 415, 670);
        this.CodigoGenerado.setText(prin.Capcha());
        this.Correo.setDocument(new LimitInresoDatos(25));
        this.Nombres.setDocument(new LimitInresoDatos(50));
        this.Nick.setDocument(new LimitInresoDatos(10));
        this.Contraseña.setDocument(new LimitInresoDatos(15));
        this.ContraseñaVerif.setDocument(new LimitInresoDatos(15));
        this.Ocupacion.setDocument(new LimitInresoDatos(30));
        this.CodigoCap.setDocument(new LimitInresoDatos(10));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jLabelMensageInicial = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        Nombres = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        Ocupacion = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        Sexo = new javax.swing.JComboBox();
        jLabel7 = new javax.swing.JLabel();
        Mes = new javax.swing.JComboBox();
        Año = new javax.swing.JComboBox();
        Dia = new javax.swing.JComboBox();
        jLabel8 = new javax.swing.JLabel();
        GradIntelectual = new javax.swing.JComboBox();
        jButtonGenerearCod = new javax.swing.JButton();
        CodigoCap = new javax.swing.JTextField();
        CrearUsuario = new javax.swing.JButton();
        jButtonCancelar = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        Nick = new javax.swing.JTextField();
        CodigoGenerado = new javax.swing.JLabel();
        jLabelVerificarContra = new javax.swing.JLabel();
        ContraseñaVerif = new javax.swing.JPasswordField();
        Contraseña = new javax.swing.JPasswordField();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Correo = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        AreaLaboral = new javax.swing.JComboBox();
        jLabelMenNombres = new javax.swing.JLabel();
        jLabelMenCorreo = new javax.swing.JLabel();
        jLabelMenNick = new javax.swing.JLabel();
        jLabelMenContraseña = new javax.swing.JLabel();
        jLabelMenOcupacion = new javax.swing.JLabel();
        jLabelMenCodigoCapcha = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        jTextField1.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("REGISTRO");
        setMinimumSize(new java.awt.Dimension(350, 650));
        setName("registro trabajador"); // NOI18N
        setResizable(false);
        getContentPane().setLayout(null);

        jLabelMensageInicial.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jLabelMensageInicial.setForeground(new java.awt.Color(249, 10, 12));
        jLabelMensageInicial.setText("Bienvenido ,por favor rellena esta ficha");
        getContentPane().add(jLabelMensageInicial);
        jLabelMensageInicial.setBounds(90, 10, 280, 26);

        jLabel1.setForeground(new java.awt.Color(204, 255, 204));
        jLabel1.setText("Nombres y apellidos:");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(20, 60, 120, 21);

        Nombres.setForeground(new java.awt.Color(0, 0, 204));
        Nombres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NombresActionPerformed(evt);
            }
        });
        getContentPane().add(Nombres);
        Nombres.setBounds(160, 60, 230, 30);

        jLabel4.setForeground(new java.awt.Color(204, 255, 204));
        jLabel4.setText("Ocupacion(cargo):");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(20, 310, 130, 25);

        Ocupacion.setForeground(new java.awt.Color(0, 0, 204));
        Ocupacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OcupacionActionPerformed(evt);
            }
        });
        getContentPane().add(Ocupacion);
        Ocupacion.setBounds(160, 310, 200, 30);

        jLabel6.setForeground(new java.awt.Color(204, 255, 204));
        jLabel6.setText("Sexo:");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(300, 350, 70, 20);

        Sexo.setForeground(new java.awt.Color(0, 0, 204));
        Sexo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Masculino", "Femenino" }));
        Sexo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SexoActionPerformed(evt);
            }
        });
        getContentPane().add(Sexo);
        Sexo.setBounds(300, 370, 90, 30);

        jLabel7.setForeground(new java.awt.Color(204, 255, 204));
        jLabel7.setText("Fecha De Nacimiento");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(20, 410, 130, 20);

        Mes.setForeground(new java.awt.Color(0, 0, 204));
        Mes.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre" }));
        Mes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MesActionPerformed(evt);
            }
        });
        getContentPane().add(Mes);
        Mes.setBounds(90, 430, 80, 30);

        Año.setForeground(new java.awt.Color(0, 0, 204));
        Año.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1955", "1956", "1957", "1958", "1959", "1960", "1961", "1962", "1963", "1964", "1965", "1966", "1967", "1968", "1969", "1970", "1971", "1972", "1973", "1974", "1975", "1976", "1977", "1978", "1979", "1980", "1981", "1982", "1983", "1984", "1985", "1986", "1987", "1988", "1989", "1990", "1991", "1992", "1993", "1994", "1995" }));
        getContentPane().add(Año);
        Año.setBounds(20, 430, 70, 30);

        Dia.setForeground(new java.awt.Color(0, 0, 204));
        Dia.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        Dia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DiaActionPerformed(evt);
            }
        });
        getContentPane().add(Dia);
        Dia.setBounds(170, 430, 50, 30);

        jLabel8.setForeground(new java.awt.Color(204, 255, 204));
        jLabel8.setText("Grado Intelectual:");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(300, 410, 120, 20);

        GradIntelectual.setForeground(new java.awt.Color(0, 0, 204));
        GradIntelectual.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Estudiante", "Egresado", "Titulado", "Doctor" }));
        GradIntelectual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GradIntelectualActionPerformed(evt);
            }
        });
        getContentPane().add(GradIntelectual);
        GradIntelectual.setBounds(300, 430, 90, 30);

        jButtonGenerearCod.setForeground(new java.awt.Color(0, 0, 204));
        jButtonGenerearCod.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/GenerarAleatorio_25p.png"))); // NOI18N
        jButtonGenerearCod.setText("Generar Codigo");
        jButtonGenerearCod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGenerearCodActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonGenerearCod);
        jButtonGenerearCod.setBounds(20, 480, 150, 30);

        CodigoCap.setForeground(new java.awt.Color(0, 0, 204));
        CodigoCap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CodigoCapActionPerformed(evt);
            }
        });
        getContentPane().add(CodigoCap);
        CodigoCap.setBounds(230, 530, 120, 30);

        CrearUsuario.setBackground(new java.awt.Color(0, 0, 255));
        CrearUsuario.setForeground(new java.awt.Color(204, 255, 204));
        CrearUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Nuevo_23p.png"))); // NOI18N
        CrearUsuario.setText("Crear");
        CrearUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CrearUsuarioActionPerformed(evt);
            }
        });
        getContentPane().add(CrearUsuario);
        CrearUsuario.setBounds(260, 590, 130, 40);

        jButtonCancelar.setBackground(new java.awt.Color(0, 0, 255));
        jButtonCancelar.setForeground(new java.awt.Color(204, 255, 204));
        jButtonCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Regresar_ico_25p.png"))); // NOI18N
        jButtonCancelar.setText("Cancelar");
        jButtonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonCancelar);
        jButtonCancelar.setBounds(20, 590, 110, 40);

        jLabel9.setForeground(new java.awt.Color(204, 255, 204));
        jLabel9.setText("Contraseña");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(20, 230, 80, 23);

        jLabel10.setForeground(new java.awt.Color(204, 255, 204));
        jLabel10.setText(" Nick");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(20, 170, 60, 20);

        Nick.setForeground(new java.awt.Color(11, 60, 244));
        Nick.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NickActionPerformed(evt);
            }
        });
        getContentPane().add(Nick);
        Nick.setBounds(160, 160, 130, 30);

        CodigoGenerado.setBackground(new java.awt.Color(51, 51, 255));
        CodigoGenerado.setForeground(new java.awt.Color(255, 0, 0));
        getContentPane().add(CodigoGenerado);
        CodigoGenerado.setBounds(230, 480, 119, 23);

        jLabelVerificarContra.setForeground(new java.awt.Color(204, 255, 204));
        jLabelVerificarContra.setText("Verificar contraceña:");
        getContentPane().add(jLabelVerificarContra);
        jLabelVerificarContra.setBounds(20, 270, 120, 20);

        ContraseñaVerif.setForeground(new java.awt.Color(0, 0, 204));
        getContentPane().add(ContraseñaVerif);
        ContraseñaVerif.setBounds(160, 260, 170, 30);

        Contraseña.setForeground(new java.awt.Color(0, 0, 204));
        getContentPane().add(Contraseña);
        Contraseña.setBounds(160, 220, 170, 30);

        jLabel3.setForeground(new java.awt.Color(204, 255, 204));
        jLabel3.setText("Correo a crear:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(20, 110, 110, 20);

        jLabel2.setForeground(new java.awt.Color(204, 255, 204));
        jLabel2.setText("Escriba el codigo:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(20, 530, 130, 20);

        Correo.setForeground(new java.awt.Color(11, 60, 244));
        getContentPane().add(Correo);
        Correo.setBounds(160, 110, 230, 30);

        jLabel11.setForeground(new java.awt.Color(204, 255, 204));
        jLabel11.setText("Area laboral a la que perteneces o te interesa:");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(20, 350, 260, 20);

        AreaLaboral.setForeground(new java.awt.Color(0, 0, 204));
        AreaLaboral.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Administración", "Call Center", "Comercio Exterior", "Comunicación", "Construcción", "Diseño", "Educación", "Finanzas", "Gastronomía y Turismo", "Gerencia", "Ingeniería", "Legales", "Logística", "Marketing", "Medicina", "Minería", "Oficios", "Producción", "RRHH", "Secretaria", "Seguros", "Tecnología", "Ventas" }));
        getContentPane().add(AreaLaboral);
        AreaLaboral.setBounds(20, 370, 150, 30);

        jLabelMenNombres.setForeground(new java.awt.Color(255, 0, 0));
        getContentPane().add(jLabelMenNombres);
        jLabelMenNombres.setBounds(160, 40, 240, 20);

        jLabelMenCorreo.setForeground(new java.awt.Color(255, 0, 0));
        getContentPane().add(jLabelMenCorreo);
        jLabelMenCorreo.setBounds(160, 90, 240, 20);

        jLabelMenNick.setForeground(new java.awt.Color(255, 0, 0));
        getContentPane().add(jLabelMenNick);
        jLabelMenNick.setBounds(160, 140, 240, 20);

        jLabelMenContraseña.setForeground(new java.awt.Color(255, 0, 0));
        getContentPane().add(jLabelMenContraseña);
        jLabelMenContraseña.setBounds(160, 200, 240, 20);

        jLabelMenOcupacion.setForeground(new java.awt.Color(255, 0, 51));
        getContentPane().add(jLabelMenOcupacion);
        jLabelMenOcupacion.setBounds(160, 290, 240, 20);

        jLabelMenCodigoCapcha.setForeground(new java.awt.Color(255, 0, 51));
        getContentPane().add(jLabelMenCodigoCapcha);
        jLabelMenCodigoCapcha.setBounds(230, 510, 170, 20);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Fondos/CrearUs_650p.jpg"))); // NOI18N
        jLabel5.setText("jLabel5");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(0, 0, 420, 650);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    private void NombresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NombresActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NombresActionPerformed
    private void jButtonGenerearCodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGenerearCodActionPerformed
        this.CodigoGenerado.setText(prin.Capcha());
    }//GEN-LAST:event_jButtonGenerearCodActionPerformed

    private void OcupacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OcupacionActionPerformed

    }//GEN-LAST:event_OcupacionActionPerformed

    private void reiniciarMensajes() {
        jLabelMenCodigoCapcha.setText("");
        jLabelMenContraseña.setText("");
        jLabelMenCorreo.setText("");
        jLabelMenNick.setText("");
        jLabelMenNombres.setText("");
        jLabelMenOcupacion.setText("");
    }

    private void CrearUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CrearUsuarioActionPerformed
        String Nomb = Nombres.getText(), Corre = Correo.getText(), Nic = Nick.getText(), Contra = Contraseña.getText(), ContraVer = ContraseñaVerif.getText();
        String Ocupac = Ocupacion.getText(), CodCap = CodigoCap.getText();
        String FDia = String.valueOf(Dia.getSelectedItem()), Sex = String.valueOf(Sexo.getSelectedItem()), FMes = String.valueOf(Mes.getSelectedItem()), FAño = String.valueOf(Año.getSelectedItem());
        //System.out.println("año: " + FAño + " mes: " + FMes + " Dia: " + FDia + " sexo: " + Sex);
        reiniciarMensajes();
        if (Nomb.equalsIgnoreCase("")) {
            jLabelMenNombres.setText("Introdusca su Nombre");
            return;
        } else {
            if (Nomb.length() <= 7) {//Ana diaz
                jLabelMenNombres.setText("Nombre y apellido");
                return;
            } else {
                if (Corre.equalsIgnoreCase("")) {
                    jLabelMenCorreo.setText("Ingrese su Nuev Correo");
                    return;
                } else {//ab@gmail.com
                    if (Corre.length() <= 10) {
                        jLabelMenCorreo.setText("Muy corto");
                        Correo.setText("---@gmail.com");
                        return;
                    } else {
                        if (Nic.equalsIgnoreCase("")) {
                            jLabelMenNick.setText("Ingrese un Nick");
                            return;
                        } else {
                            if (Nic.length() < 2) {
                                jLabelMenNick.setText("Nick muy corto");
                                return;
                            } else {
                                if (Contra.equalsIgnoreCase("")) {
                                    jLabelMenContraseña.setText("Ingrese una Contraseña");
                                    return;
                                } else {
                                    if (Contra.length() <= 4) {
                                        jLabelMenContraseña.setText("Contraseña muy corta");
                                        return;
                                    } else {
                                        if (!Contra.equals(ContraVer)) {
                                            jLabelMenContraseña.setText("No Coinciden las cont.");
                                            return;
                                        } else {
                                            if (Ocupac.equalsIgnoreCase("")) {
                                                jLabelMenOcupacion.setText("Ingrese su ocupación");
                                                return;
                                            } else {//contador,
                                                if (Ocupac.length() <= 3) {
                                                    jLabelMenOcupacion.setText("Muy corta para ser valida");
                                                    return;
                                                } else {
                                                    if (CodCap.equalsIgnoreCase("")) {
                                                        jLabelMenCodigoCapcha.setText("Falta cod de verificacion");
                                                        return;
                                                    } else {
                                                        if (!CodCap.equals(CodigoGenerado.getText())) {
                                                            jLabelMenCodigoCapcha.setText("No coinciden");
                                                            return;
                                                        } else {
                                                            for (Empleado emp : prin.getEmpleado()) {
                                                                if (emp.getNick().equals(Nic)) {
                                                                    jLabelMenNick.setText("Nick ya registrado");
                                                                    return;
                                                                }
                                                                if (emp.getCorreo().equalsIgnoreCase(Corre)) {
                                                                    jLabelMenCorreo.setText("Correo ya registrado");
                                                                    return;
                                                                }
                                                            }

                                                            for (Empleador emp : prin.getEmpleador()) {
                                                                if (emp.getNick().equals(Nic)) {
                                                                    jLabelMenNick.setText("Nick ya registrado");
                                                                    return;
                                                                }
                                                                if (emp.getCorreo().equalsIgnoreCase(Corre)) {
                                                                    jLabelMenCorreo.setText("Correo ya registrado");
                                                                    return;
                                                                }
                                                            }
                                                            String AreaLab=String.valueOf(AreaLaboral.getSelectedItem()),GradoIntelect=  String.valueOf(GradIntelectual.getSelectedItem());
                                                            prin.getEmpleado().add(new Empleado(Nomb, Corre, ContraVer, Nic, Ocupac,AreaLab,GradoIntelect, FDia, FMes, FAño, Sex));
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
    }//GEN-LAST:event_CrearUsuarioActionPerformed
    private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarActionPerformed
        int b = Integer.valueOf(JOptionPane.showConfirmDialog(null, "Estas Seguro De cancelar", "Mensaje", 1));
        if (b == 0) {
            this.setVisible(false);
            this.dispose();
            prin.getVentInicio().setVisible(true);
        }
    }//GEN-LAST:event_jButtonCancelarActionPerformed

    private void NickActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NickActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NickActionPerformed

    private void MesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MesActionPerformed

    private void GradIntelectualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GradIntelectualActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_GradIntelectualActionPerformed

    private void CodigoCapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CodigoCapActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CodigoCapActionPerformed

    private void DiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DiaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DiaActionPerformed

    private void SexoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SexoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SexoActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox AreaLaboral;
    private javax.swing.JComboBox Año;
    private javax.swing.JTextField CodigoCap;
    private javax.swing.JLabel CodigoGenerado;
    private javax.swing.JPasswordField Contraseña;
    private javax.swing.JPasswordField ContraseñaVerif;
    private javax.swing.JTextField Correo;
    private javax.swing.JButton CrearUsuario;
    private javax.swing.JComboBox Dia;
    private javax.swing.JComboBox GradIntelectual;
    private javax.swing.JComboBox Mes;
    private javax.swing.JTextField Nick;
    private javax.swing.JTextField Nombres;
    private javax.swing.JTextField Ocupacion;
    private javax.swing.JComboBox Sexo;
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JButton jButtonGenerearCod;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelMenCodigoCapcha;
    private javax.swing.JLabel jLabelMenContraseña;
    private javax.swing.JLabel jLabelMenCorreo;
    private javax.swing.JLabel jLabelMenNick;
    private javax.swing.JLabel jLabelMenNombres;
    private javax.swing.JLabel jLabelMenOcupacion;
    private javax.swing.JLabel jLabelMensageInicial;
    private javax.swing.JLabel jLabelVerificarContra;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
