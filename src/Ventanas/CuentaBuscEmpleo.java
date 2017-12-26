/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ventanas;

import static Ventanas.inicio.prin;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import javax.swing.JOptionPane;

/**
 *
 * @author TONY
 */
public class CuentaBuscEmpleo extends javax.swing.JFrame {

    /**
     * CreateDirLeer new form CuentaBuDirLeercarDirEDirLeercrioTarbajo
     */
    File Direccion = new File("D:/Proyecto/Notas.txt");
    int h = 1;

    public CuentaBuscEmpleo() {
        initComponents();
        ActualizarInfoUsuario();
        setBounds(300, 100, 710, 443);
    }

    private void ActualizarInfoUsuario() {
        this.jLabelNickUsuario.setText(prin.getEmpleado().get(prin.getPosActiv()).getNick());
        this.jLabelOcupacionMesage.setText("Ocupacion:");
        this.jLabelOcupacion.setText(prin.getEmpleado().get(prin.getPosActiv()).getOcupacion());
    }

    /**
     * ThiDirLeer methoDirEDirLeercri iDirLeer calleDirEDirLeercri from within the conDirLeertructor to initialize the form.
     * WARNING: Do NOT moDirEDirLeercriify thiDirLeer coDirEDirLeercrie. The content of thiDirLeer methoDirEDirLeercri iDirLeer alwayDirLeer
 regenerateDirEDirLeercri by the Form EDirEDirLeercriitor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButtonEliminarNotas = new javax.swing.JButton();
        jButtonMostrarNOtas = new javax.swing.JButton();
        jButtonBuscar = new javax.swing.JButton();
        Busqueda = new javax.swing.JTextField();
        jButtonNuevaNota = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jButtonEditarPerfil = new javax.swing.JButton();
        jButtonGuardar = new javax.swing.JButton();
        jPanelUsuario = new javax.swing.JPanel();
        jLabelNickUsuario = new javax.swing.JLabel();
        jLabelOcupacionMesage = new javax.swing.JLabel();
        jLabelOcupacion = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jMenuBarPrincipal = new javax.swing.JMenuBar();
        jMenuopciones = new javax.swing.JMenu();
        jMenuItemOpcionesCerrarSesion = new javax.swing.JMenuItem();
        jMenuItemOpcionesEditarPerfil = new javax.swing.JMenuItem();
        jMenuIr = new javax.swing.JMenu();
        jMenuItemIrInicio = new javax.swing.JMenuItem();
        jMenuItemIrCuenta = new javax.swing.JMenuItem();
        jMenuVer = new javax.swing.JMenu();
        jMenuItemVerEmpresas = new javax.swing.JMenuItem();
        jMenuItemVerNotificaciones = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setFocusTraversalPolicyProvider(true);
        setMinimumSize(new java.awt.Dimension(650, 500));
        getContentPane().setLayout(null);

        jButtonEliminarNotas.setText("ELiminar Notas");
        jButtonEliminarNotas.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButtonEliminarNotas.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButtonEliminarNotas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEliminarNotasActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonEliminarNotas);
        jButtonEliminarNotas.setBounds(380, 140, 130, 88);

        jButtonMostrarNOtas.setText("Mostrar Notas");
        jButtonMostrarNOtas.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButtonMostrarNOtas.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jButtonMostrarNOtas.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButtonMostrarNOtas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMostrarNOtasActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonMostrarNOtas);
        jButtonMostrarNOtas.setBounds(530, 140, 130, 88);

        jButtonBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/buscar_32p.png"))); // NOI18N
        jButtonBuscar.setText("Buscar");
        jButtonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBuscarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonBuscar);
        jButtonBuscar.setBounds(540, 337, 120, 40);
        getContentPane().add(Busqueda);
        Busqueda.setBounds(442, 290, 220, 30);

        jButtonNuevaNota.setText("Nuevo Nota");
        jButtonNuevaNota.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButtonNuevaNota.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButtonNuevaNota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNuevaNotaActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonNuevaNota);
        jButtonNuevaNota.setBounds(530, 40, 130, 80);

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jTextArea1.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jTextArea1AncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jScrollPane2.setViewportView(jTextArea1);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(60, 140, 200, 240);

        jButtonEditarPerfil.setText("Editar perfil");
        jButtonEditarPerfil.setHideActionText(true);
        jButtonEditarPerfil.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        jButtonEditarPerfil.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jButtonEditarPerfil.setVerifyInputWhenFocusTarget(false);
        jButtonEditarPerfil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEditarPerfilActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonEditarPerfil);
        jButtonEditarPerfil.setBounds(380, 40, 130, 80);
        jButtonEditarPerfil.getAccessibleContext().setAccessibleDescription("lmk");

        jButtonGuardar.setText("Guardar ");
        jButtonGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGuardarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonGuardar);
        jButtonGuardar.setBounds(150, 390, 110, 40);

        jPanelUsuario.setBackground(new java.awt.Color(204, 204, 204));

        jLabelNickUsuario.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jLabelNickUsuario.setForeground(new java.awt.Color(0, 51, 255));
        jLabelNickUsuario.setText("rrrrrrr");

        jLabelOcupacionMesage.setForeground(new java.awt.Color(0, 0, 255));
        jLabelOcupacionMesage.setText("Ocupacion:");

        jLabelOcupacion.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabelOcupacion.setForeground(new java.awt.Color(0, 51, 255));
        jLabelOcupacion.setText("kkkkkk");

        javax.swing.GroupLayout jPanelUsuarioLayout = new javax.swing.GroupLayout(jPanelUsuario);
        jPanelUsuario.setLayout(jPanelUsuarioLayout);
        jPanelUsuarioLayout.setHorizontalGroup(
            jPanelUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelUsuarioLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelOcupacion, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelOcupacionMesage, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelNickUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        jPanelUsuarioLayout.setVerticalGroup(
            jPanelUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelUsuarioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelNickUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelOcupacionMesage, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelOcupacion, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
        );

        getContentPane().add(jPanelUsuario);
        jPanelUsuario.setBounds(60, 10, 180, 114);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Fondos/Busqueda.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 700, 520);

        jMenuBarPrincipal.setBackground(new java.awt.Color(1, 213, 255));

        jMenuopciones.setText("Opciones");

        jMenuItemOpcionesCerrarSesion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Out_25p.png"))); // NOI18N
        jMenuItemOpcionesCerrarSesion.setText("Cerrar sesion");
        jMenuItemOpcionesCerrarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemOpcionesCerrarSesionActionPerformed(evt);
            }
        });
        jMenuopciones.add(jMenuItemOpcionesCerrarSesion);

        jMenuItemOpcionesEditarPerfil.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Settings_25p.png"))); // NOI18N
        jMenuItemOpcionesEditarPerfil.setText("Editar perfil");
        jMenuItemOpcionesEditarPerfil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemOpcionesEditarPerfilActionPerformed(evt);
            }
        });
        jMenuopciones.add(jMenuItemOpcionesEditarPerfil);

        jMenuBarPrincipal.add(jMenuopciones);

        jMenuIr.setText("Ir");

        jMenuItemIrInicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/home_25p.png"))); // NOI18N
        jMenuItemIrInicio.setText("Inicio");
        jMenuItemIrInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemIrInicioActionPerformed(evt);
            }
        });
        jMenuIr.add(jMenuItemIrInicio);

        jMenuItemIrCuenta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/User-icon_25p.png"))); // NOI18N
        jMenuItemIrCuenta.setText("Cuenta");
        jMenuItemIrCuenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemIrCuentaActionPerformed(evt);
            }
        });
        jMenuIr.add(jMenuItemIrCuenta);

        jMenuBarPrincipal.add(jMenuIr);

        jMenuVer.setText("Ver");

        jMenuItemVerEmpresas.setText("Empresas");
        jMenuVer.add(jMenuItemVerEmpresas);

        jMenuItemVerNotificaciones.setText("Notificaciones");
        jMenuVer.add(jMenuItemVerNotificaciones);

        jMenuBarPrincipal.add(jMenuVer);

        setJMenuBar(jMenuBarPrincipal);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonNuevaNotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNuevaNotaActionPerformed
        jTextArea1.setText("");
    }//GEN-LAST:event_jButtonNuevaNotaActionPerformed

    private void jButtonEditarPerfilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditarPerfilActionPerformed
        prin.getVentaCuentaBuscEmpleo().setVisible(false);
        new EditarPerfil(2).show(true);

    }//GEN-LAST:event_jButtonEditarPerfilActionPerformed

    private void jButtonMostrarNOtasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMostrarNOtasActionPerformed
        FileReader lector = null;
        if (Direccion.length() == 0) {
            JOptionPane.showMessageDialog(null, "Aun no tiene Nota Guardada");
        } else {
            try {
                String most = "";
                // TODO add your handling code here:

                lector = new FileReader(Direccion);
                BufferedReader lectorua = new BufferedReader(lector);
                String s, f = "";
                while ((s = lectorua.readLine()) != null) {
                    f += s;
                    String m = f.replace(";", "\n");
                    jTextArea1.setText(m);
                    f = "";
                }
            } catch (Throwable ex) {
                JOptionPane.showMessageDialog(null, "No se encontro la ruta para la lectura de la nota");
            } finally {
                try {
                    lector.close();
                } catch (Throwable ex) {
                    JOptionPane.showMessageDialog(null, "La ruyta  no se encuentra");
                }
            }
        }
    }//GEN-LAST:event_jButtonMostrarNOtasActionPerformed

    private void jButtonGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGuardarActionPerformed
        // TODO add your handling code here:
        try {

            FileWriter DirEscri = new FileWriter(Direccion, true);
            PrintWriter Escritor = new PrintWriter(DirEscri);
            String[] linea = jTextArea1.getText().split("\n");
            for (int i = 0; i < linea.length; i++) {
                linea[i] += " " + "Codigo:" + h + ";";
                h++;
            }
            for (String t : linea) {
                Escritor.print(t);
            }
            Escritor.close();
            DirEscri.close();
        } catch (Throwable ex) {
            JOptionPane.showMessageDialog(null, "La Ruta de la nota no es valido");
        }
    }//GEN-LAST:event_jButtonGuardarActionPerformed

    private void jTextArea1AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jTextArea1AncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextArea1AncestorAdded

    private void jButtonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBuscarActionPerformed
        // TODO add your handling code here:
        try {
            int porsicion = 1;
            int l = Integer.parseInt(Busqueda.getText());
            FileReader DirLeer = new FileReader(Direccion);
            BufferedReader lector = new BufferedReader(DirLeer);
            String f;
            String g = "";
            while ((f = lector.readLine()) != null) {
                g += f;
                String v[] = g.split(";");
                for (int i = 0; i < v.length; i++) {
                    if (porsicion == l) {
                        jTextArea1.setText(v[i]);
                    }
                    porsicion++;
                }

            }
            lector.close();
            DirLeer.close();
        } catch (Throwable e) {
            JOptionPane.showMessageDialog(null, "La ruta del documneto no se encuentra");
        }
    }//GEN-LAST:event_jButtonBuscarActionPerformed

    private void jButtonEliminarNotasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEliminarNotasActionPerformed
        try {
            int porsicion = 1;
            int l = Integer.parseInt(Busqueda.getText());
            FileReader DirLeer = new FileReader(Direccion);
            BufferedReader lector = new BufferedReader(DirLeer);
            String f;
            String g = "";
            int codigo = 1;
            while ((f = lector.readLine()) != null) {
                g += f;
                String v[] = g.split(";");

                for (int i = 0; i < v.length; i++) {
                    if (porsicion == l) {
                        v[i] = "";
                        FileWriter ec = new FileWriter(Direccion);
                        PrintWriter escritor = new PrintWriter(ec);
                        for (int j = 0; j < v.length; j++) {
                            if (v[j] == "") {
                                continue;
                            }
                            v[j] += codigo + ";";
                            codigo++;
                            escritor.print(v[j]);
                        }
                        escritor.close();
                        ec.close();
                    }
                    porsicion++;
                }

            }
            lector.close();
            DirLeer.close();
        } catch (Throwable e) {
            JOptionPane.showMessageDialog(null, "La ruta del documneto no se encuentra");
        }
    }//GEN-LAST:event_jButtonEliminarNotasActionPerformed

    private void jMenuItemOpcionesCerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemOpcionesCerrarSesionActionPerformed
        prin.getVentPrinci().setVisible(false);
        prin.cerrarCesionVentanas();
    }//GEN-LAST:event_jMenuItemOpcionesCerrarSesionActionPerformed

    private void jMenuItemOpcionesEditarPerfilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemOpcionesEditarPerfilActionPerformed
        prin.getVentPrinci().setVisible(false);
        int op = 0;
        new EditarPerfil(op).show(true);
    }//GEN-LAST:event_jMenuItemOpcionesEditarPerfilActionPerformed

    private void jMenuItemIrInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemIrInicioActionPerformed
        prin.getVentaCuentaBuscEmpleo().setVisible(false);
        prin.getVentPrinci().setVisible(true);
    }//GEN-LAST:event_jMenuItemIrInicioActionPerformed

    private void jMenuItemIrCuentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemIrCuentaActionPerformed
        return;
    }//GEN-LAST:event_jMenuItemIrCuentaActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Busqueda;
    private javax.swing.JButton jButtonBuscar;
    private javax.swing.JButton jButtonEditarPerfil;
    private javax.swing.JButton jButtonEliminarNotas;
    private javax.swing.JButton jButtonGuardar;
    private javax.swing.JButton jButtonMostrarNOtas;
    private javax.swing.JButton jButtonNuevaNota;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelNickUsuario;
    private javax.swing.JLabel jLabelOcupacion;
    private javax.swing.JLabel jLabelOcupacionMesage;
    private javax.swing.JMenuBar jMenuBarPrincipal;
    private javax.swing.JMenu jMenuIr;
    private javax.swing.JMenuItem jMenuItemIrCuenta;
    private javax.swing.JMenuItem jMenuItemIrInicio;
    private javax.swing.JMenuItem jMenuItemOpcionesCerrarSesion;
    private javax.swing.JMenuItem jMenuItemOpcionesEditarPerfil;
    private javax.swing.JMenuItem jMenuItemVerEmpresas;
    private javax.swing.JMenuItem jMenuItemVerNotificaciones;
    private javax.swing.JMenu jMenuVer;
    private javax.swing.JMenu jMenuopciones;
    private javax.swing.JPanel jPanelUsuario;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}
