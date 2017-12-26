/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ventanas;

import Modelos.Trabajo;
import Ventanas.SubVentanas.MostrarTrabajo;
import java.util.ArrayList;
import java.util.Iterator;
import static Ventanas.inicio.prin;

/**
 *
 * @author Frank
 */
public class PrincipalVent extends javax.swing.JFrame {

    public PrincipalVent() {
        System.out.println("princi Ventan: " + prin.getActivo());
        System.out.println("princi Ventan: " + prin.getPosActiv());
        initComponents();
        this.setBounds(250, 50, 953, 617);
        ActualizarInfoUsuario();
        System.out.println("paso el actualizar informacion");
        this.jLabelMenBuscar.setText("Ingrese el codigo de trabajo a buscar");
        MostrarTodasLasAreasLaborales();
        llenarEmpresaContraDis();
    }

    public void ActualizarInfoUsuario() {
        if (prin.getActivo()) {
            this.jLabelNickUsuario.setText(prin.getEmpleador().get(prin.getPosActiv()).getNick());
            this.jLabelOcupacionMesage.setText("Empresa:");
            this.jLabelOcupacion.setText(prin.getEmpleador().get(prin.getPosActiv()).getEmpresa());
            prin.setVentCuentEmp(new CuentaEmpleador());
            return;
        } else {
            this.jLabelNickUsuario.setText(prin.getEmpleado().get(prin.getPosActiv()).getNick());
            this.jLabelOcupacionMesage.setText("Ocupacion:");
            this.jLabelOcupacion.setText(prin.getEmpleado().get(prin.getPosActiv()).getOcupacion());
            System.out.println("llego al actualizar informacion");
            prin.setVentaCuentaBuscEmpleo(new CuentaBuscEmpleo());
        }
    }

    private void llenarEmpresaContraDis() {
        ArrayList<String> EmpresaConTrab = new ArrayList<String>();
        boolean Inter = true;
        for (Trabajo tra : prin.getTrabajo()) {
            Inter = true;
            for (String c : EmpresaConTrab) {
                if (c.equalsIgnoreCase(tra.getEmpresa())) {
                    Inter = false;
                    break;
                }
            }
            if (Inter) {
                EmpresaConTrab.add(tra.getEmpresa());
            }
        }
        Iterator<String> It = EmpresaConTrab.iterator();
        String cad = "";
        while (It.hasNext()) {
            cad += It.next() + "\n";
        }
        jTextPaneEmpresasConTrab.setText(cad);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelUsuario = new javax.swing.JPanel();
        jLabelNickUsuario = new javax.swing.JLabel();
        jLabelOcupacionMesage = new javax.swing.JLabel();
        jLabelOcupacion = new javax.swing.JLabel();
        jScrollPaneAreasLaborales = new javax.swing.JScrollPane();
        jListAreasLaborales = new javax.swing.JList();
        jButtonEditarPerfil = new javax.swing.JButton();
        jTextFieldNombreTrabBuscar = new javax.swing.JTextField();
        jButtonBuscar = new javax.swing.JButton();
        jButtonActualizar = new javax.swing.JButton();
        jLabelEmpresasConTrabajosVacates = new javax.swing.JLabel();
        jScrollPaneTrabajos = new javax.swing.JScrollPane();
        jTextPaneTrabajosAreas = new javax.swing.JTextPane();
        jLabelOfertasEmpleoMensage = new javax.swing.JLabel();
        jScrollPaneEmpresas = new javax.swing.JScrollPane();
        jTextPaneEmpresasConTrab = new javax.swing.JTextPane();
        jLabelMenBuscar = new javax.swing.JLabel();
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
        setTitle("Principal");
        setBackground(new java.awt.Color(51, 51, 255));
        setResizable(false);
        getContentPane().setLayout(null);

        jPanelUsuario.setBackground(new java.awt.Color(204, 204, 204));

        jLabelNickUsuario.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
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
                .addGroup(jPanelUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelUsuarioLayout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jLabelNickUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelUsuarioLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanelUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelUsuarioLayout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabelOcupacion, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabelOcupacionMesage, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))))
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
        jPanelUsuario.setBounds(110, 20, 180, 110);

        jListAreasLaborales.setBackground(new java.awt.Color(204, 255, 255));
        jListAreasLaborales.setForeground(new java.awt.Color(0, 0, 51));
        jListAreasLaborales.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Todas", "Administración", "Call Center", "Comercio Exterior", "Comunicación", "Construcción", "Diseño", "Educación", "Finanzas", "Gastronomía y Turismo", "Gerencia", "Ingeniería", "Legales", "Logística", "Marketing", "Medicina", "Minería", "Oficios", "Producción", "RRHH", "Secretaria", "Seguros", "Tecnología", "Ventas" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jListAreasLaborales.setToolTipText("");
        jListAreasLaborales.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jListAreasLaboralesMouseClicked(evt);
            }
        });
        jScrollPaneAreasLaborales.setViewportView(jListAreasLaborales);

        getContentPane().add(jScrollPaneAreasLaborales);
        jScrollPaneAreasLaborales.setBounds(108, 189, 190, 361);

        jButtonEditarPerfil.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Settings_25p.png"))); // NOI18N
        jButtonEditarPerfil.setText("Editar Perfil");
        jButtonEditarPerfil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEditarPerfilActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonEditarPerfil);
        jButtonEditarPerfil.setBounds(164, 142, 130, 33);

        jTextFieldNombreTrabBuscar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTextFieldNombreTrabBuscar.setForeground(new java.awt.Color(0, 0, 102));
        jTextFieldNombreTrabBuscar.setToolTipText("");
        jTextFieldNombreTrabBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNombreTrabBuscarActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldNombreTrabBuscar);
        jTextFieldNombreTrabBuscar.setBounds(351, 22, 427, 30);

        jButtonBuscar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButtonBuscar.setForeground(new java.awt.Color(0, 0, 255));
        jButtonBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/buscar_32p.png"))); // NOI18N
        jButtonBuscar.setText("Buscar");
        jButtonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBuscarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonBuscar);
        jButtonBuscar.setBounds(680, 60, 130, 37);

        jButtonActualizar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButtonActualizar.setForeground(new java.awt.Color(0, 0, 204));
        jButtonActualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/actualizar_38p.png"))); // NOI18N
        jButtonActualizar.setText("Actualizar");
        jButtonActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonActualizarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonActualizar);
        jButtonActualizar.setBounds(670, 350, 160, 47);

        jLabelEmpresasConTrabajosVacates.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabelEmpresasConTrabajosVacates.setForeground(new java.awt.Color(51, 51, 51));
        jLabelEmpresasConTrabajosVacates.setText("Algunas empresas con ofertas vacantes");
        getContentPane().add(jLabelEmpresasConTrabajosVacates);
        jLabelEmpresasConTrabajosVacates.setBounds(351, 377, 310, 20);

        jTextPaneTrabajosAreas.setEditable(false);
        jScrollPaneTrabajos.setViewportView(jTextPaneTrabajosAreas);

        getContentPane().add(jScrollPaneTrabajos);
        jScrollPaneTrabajos.setBounds(351, 106, 457, 231);

        jLabelOfertasEmpleoMensage.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabelOfertasEmpleoMensage.setForeground(new java.awt.Color(51, 51, 51));
        jLabelOfertasEmpleoMensage.setText("Ofertas de empleo:");
        getContentPane().add(jLabelOfertasEmpleoMensage);
        jLabelOfertasEmpleoMensage.setBounds(351, 80, 110, 20);

        jTextPaneEmpresasConTrab.setEditable(false);
        jScrollPaneEmpresas.setViewportView(jTextPaneEmpresasConTrab);

        getContentPane().add(jScrollPaneEmpresas);
        jScrollPaneEmpresas.setBounds(351, 404, 457, 150);

        jLabelMenBuscar.setForeground(new java.awt.Color(255, 0, 0));
        getContentPane().add(jLabelMenBuscar);
        jLabelMenBuscar.setBounds(350, 60, 320, 20);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Fondos/Anime-wallpapers-.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 950, 570);

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
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldNombreTrabBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNombreTrabBuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNombreTrabBuscarActionPerformed

    private void jMenuItemOpcionesCerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemOpcionesCerrarSesionActionPerformed
        prin.getVentPrinci().setVisible(false);
        prin.cerrarCesionVentanas();
    }//GEN-LAST:event_jMenuItemOpcionesCerrarSesionActionPerformed

    private void jMenuItemIrCuentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemIrCuentaActionPerformed
        prin.getVentPrinci().setVisible(false);
        if (prin.getActivo()) {
            prin.getVentCuentEmp().setVisible(true);
        } else {
            prin.getVentaCuentaBuscEmpleo().setVisible(true);
        }
    }//GEN-LAST:event_jMenuItemIrCuentaActionPerformed

    private void jButtonEditarPerfilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditarPerfilActionPerformed
        prin.getVentPrinci().setVisible(false);
        int op = 0;
        new EditarPerfil().show(true);
    }//GEN-LAST:event_jButtonEditarPerfilActionPerformed

    private void jMenuItemOpcionesEditarPerfilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemOpcionesEditarPerfilActionPerformed
        prin.getVentPrinci().setVisible(false);
        int op = 0;
        new EditarPerfil().show(true);
    }//GEN-LAST:event_jMenuItemOpcionesEditarPerfilActionPerformed

    private void jMenuItemIrInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemIrInicioActionPerformed

    }//GEN-LAST:event_jMenuItemIrInicioActionPerformed

    private void jListAreasLaboralesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jListAreasLaboralesMouseClicked
        MostrarListasTrabajo();
    }//GEN-LAST:event_jListAreasLaboralesMouseClicked

    private void MostrarListasTrabajo() {
        String AreaSeleccionada = String.valueOf(jListAreasLaborales.getSelectedValue()), Mensage = "";
        int con = 0;
        if (AreaSeleccionada.equalsIgnoreCase("Todas")) {
            MostrarTodasLasAreasLaborales();
            return;
        }
        for (Trabajo trab : prin.getTrabajo()) {
            if (trab.getAreaLaboral().equalsIgnoreCase(AreaSeleccionada)) {
                Mensage += ("Se necesita:\t[" + trab.getCantidad() + "] " + trab.getPersonal() + "\nPara trabajar en la empresa:\t" + trab.getEmpresa() + "\nCodigo:\t" + con + "\n\n");
            }
            con++;
        }
        if (Mensage.equalsIgnoreCase("")) {
            jTextPaneTrabajosAreas.setText("No se a publicado nada todavia");
            return;
        }
        jTextPaneTrabajosAreas.setText(Mensage);
    }

    private void MostrarTodasLasAreasLaborales() {
        String Mensage = "";
        int con = 0;
        for (Trabajo trab : prin.getTrabajo()) {
            Mensage += ("Se necesita:\t[" + trab.getCantidad() + "] " + trab.getPersonal() + "\nPara trabajar en la empresa:\t" + trab.getEmpresa() + "\nCodigo:\t" + con + "\n\n");
            con++;
        }
        jTextPaneTrabajosAreas.setText(Mensage);
    }
    private void jButtonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBuscarActionPerformed
        String Busca = "" + jTextFieldNombreTrabBuscar.getText();
        if (Busca.equalsIgnoreCase("")) {
            jLabelMenBuscar.setText("Primero ingrese el Cod. a buscar");
            return;
        } else {
            int n = 0;
            try {
                n = Integer.parseInt(Busca);
            } catch (Exception e) {
                jLabelMenBuscar.setText("Codigo Incorrecto");
                return;
            }
            if (prin.getTrabajo().size() <= n || (n < 0)) {
                jLabelMenBuscar.setText("Codigo Incorrecto");
                return;
            }
            prin.getVentPrinci().setVisible(false);
            jLabelMenBuscar.setText("Ingrese el codigo de trabajo a buscar");
            new MostrarTrabajo(n, 0).show();
        }
    }//GEN-LAST:event_jButtonBuscarActionPerformed

    private void jButtonActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonActualizarActionPerformed
        MostrarTodasLasAreasLaborales();
        llenarEmpresaContraDis();
    }//GEN-LAST:event_jButtonActualizarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonActualizar;
    private javax.swing.JButton jButtonBuscar;
    private javax.swing.JButton jButtonEditarPerfil;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelEmpresasConTrabajosVacates;
    private javax.swing.JLabel jLabelMenBuscar;
    private javax.swing.JLabel jLabelNickUsuario;
    private javax.swing.JLabel jLabelOcupacion;
    private javax.swing.JLabel jLabelOcupacionMesage;
    private javax.swing.JLabel jLabelOfertasEmpleoMensage;
    private javax.swing.JList jListAreasLaborales;
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
    private javax.swing.JScrollPane jScrollPaneAreasLaborales;
    private javax.swing.JScrollPane jScrollPaneEmpresas;
    private javax.swing.JScrollPane jScrollPaneTrabajos;
    private javax.swing.JTextField jTextFieldNombreTrabBuscar;
    private javax.swing.JTextPane jTextPaneEmpresasConTrab;
    private javax.swing.JTextPane jTextPaneTrabajosAreas;
    // End of variables declaration//GEN-END:variables
}
