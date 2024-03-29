/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import javax.swing.JDialog;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author Samantha
 Toolkit.getDefaultToolkit().getImage(VentanaPrincipal.class.getResource("/Recursos/ImagenesGUI/Logo Adrian.png"))
 
 ImageIcon portada = new ImageIcon(VentanaPrincipal.class.getResource("/Recursos/ImagenesGUI/Logo Adrian.png"));
   lblNewLabel_1.setIcon(new ImageIcon(portada.getImage().getScaledInstance(lblNewLabel_1.getWidth(), lblNewLabel_1.getHeight(), Image.SCALE_SMOOTH)));
        
 */
public class VentanaPrincipal extends javax.swing.JFrame {

    private static VentanaPrincipal miVentanaPrincipal;
    /**
     * Creates new form ventanaPrincipal
     */
    private VentanaPrincipal() {
        initComponents();
        try {
            setDefaultLookAndFeelDecorated(true);
            JDialog.setDefaultLookAndFeelDecorated(true);
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (InstantiationException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (UnsupportedLookAndFeelException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        escritorio.add(VentanaAcercade.getInstance());
        escritorio.add(VentanaAdministrarDonaciones.getInstance());
        escritorio.add(VentanaAsignarAdministradores.getInstance());
        escritorio.add(VentanaBuscarCasaCuna.getInstance());
        escritorio.add(VentanaBuscarMascota.getInstance());
        escritorio.add(VentanaBuscarPersona.getInstance());
        escritorio.add(VentanaCrearUsuario.getInstance());
        escritorio.add(VentanaDonar.getInstance());
        escritorio.add(VentanaIngresarCuenta.getInstance());
        escritorio.add(VentanaReportarMascota.getInstance());
        escritorio.add(VentanaReportarPersona.getInstance());
        
        setVisible(true);
    }
    
    public static VentanaPrincipal getInstance()
    {
        if (miVentanaPrincipal == null)
        {
            miVentanaPrincipal = new VentanaPrincipal();
        }
        return miVentanaPrincipal;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        escritorio = new javax.swing.JDesktopPane();
        lblLogo1 = new javax.swing.JLabel();
        barraMenu = new javax.swing.JMenuBar();
        menuUsuario = new javax.swing.JMenu();
        crearUsuario = new javax.swing.JMenuItem();
        ingresarCuenta = new javax.swing.JMenuItem();
        crearAdministrador = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        menuBusqueda = new javax.swing.JMenu();
        buscarMascota = new javax.swing.JMenuItem();
        buscarPersona = new javax.swing.JMenuItem();
        buscarCasaCuna = new javax.swing.JMenuItem();
        menuReportar = new javax.swing.JMenu();
        reportarMascota = new javax.swing.JMenuItem();
        reportarPersona = new javax.swing.JMenuItem();
        menuDonar = new javax.swing.JMenu();
        Donar = new javax.swing.JMenuItem();
        AdministrarDonaciones = new javax.swing.JMenuItem();
        acercade = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Estimação");

        escritorio.setBackground(new java.awt.Color(190, 160, 100));
        escritorio.setName(""); // NOI18N

        lblLogo1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/logoE.png"))); // NOI18N
        escritorio.add(lblLogo1);
        lblLogo1.setBounds(260, 60, 334, 294);

        barraMenu.setBackground(new java.awt.Color(153, 255, 153));

        menuUsuario.setForeground(new java.awt.Color(170, 80, 0));
        menuUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/usuarioM.png"))); // NOI18N
        menuUsuario.setText("Usuario");
        menuUsuario.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N

        crearUsuario.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        crearUsuario.setForeground(new java.awt.Color(170, 80, 0));
        crearUsuario.setText("Crear Usuario Nuevo");
        crearUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crearUsuarioActionPerformed(evt);
            }
        });
        menuUsuario.add(crearUsuario);

        ingresarCuenta.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        ingresarCuenta.setForeground(new java.awt.Color(170, 80, 0));
        ingresarCuenta.setText("Ingresar a mi Cuenta");
        ingresarCuenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ingresarCuentaActionPerformed(evt);
            }
        });
        menuUsuario.add(ingresarCuenta);

        crearAdministrador.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        crearAdministrador.setForeground(new java.awt.Color(170, 80, 0));
        crearAdministrador.setText("Asignar Administradores");
        crearAdministrador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crearAdministradorActionPerformed(evt);
            }
        });
        menuUsuario.add(crearAdministrador);

        jMenuItem1.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jMenuItem1.setForeground(new java.awt.Color(170, 80, 0));
        jMenuItem1.setText("Salir de mi Cuenta");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        menuUsuario.add(jMenuItem1);

        barraMenu.add(menuUsuario);

        menuBusqueda.setForeground(new java.awt.Color(170, 80, 0));
        menuBusqueda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/buscar.png"))); // NOI18N
        menuBusqueda.setText("Búsqueda");
        menuBusqueda.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N

        buscarMascota.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        buscarMascota.setForeground(new java.awt.Color(170, 80, 0));
        buscarMascota.setText("Buscar Mascota");
        buscarMascota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarMascotaActionPerformed(evt);
            }
        });
        menuBusqueda.add(buscarMascota);

        buscarPersona.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        buscarPersona.setForeground(new java.awt.Color(170, 80, 0));
        buscarPersona.setText("Buscar Persona");
        buscarPersona.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarPersonaActionPerformed(evt);
            }
        });
        menuBusqueda.add(buscarPersona);

        buscarCasaCuna.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        buscarCasaCuna.setForeground(new java.awt.Color(170, 80, 0));
        buscarCasaCuna.setText("Buscar Casa Cuna");
        buscarCasaCuna.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarCasaCunaActionPerformed(evt);
            }
        });
        menuBusqueda.add(buscarCasaCuna);

        barraMenu.add(menuBusqueda);

        menuReportar.setForeground(new java.awt.Color(170, 80, 0));
        menuReportar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/alerta.png"))); // NOI18N
        menuReportar.setText("Reportar");
        menuReportar.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N

        reportarMascota.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        reportarMascota.setForeground(new java.awt.Color(170, 80, 0));
        reportarMascota.setText("Reportar Mascota");
        reportarMascota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reportarMascotaActionPerformed(evt);
            }
        });
        menuReportar.add(reportarMascota);

        reportarPersona.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        reportarPersona.setForeground(new java.awt.Color(170, 80, 0));
        reportarPersona.setText("Reportar Persona");
        reportarPersona.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reportarPersonaActionPerformed(evt);
            }
        });
        menuReportar.add(reportarPersona);

        barraMenu.add(menuReportar);

        menuDonar.setForeground(new java.awt.Color(170, 80, 0));
        menuDonar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/donar.png"))); // NOI18N
        menuDonar.setText("Donaciones");
        menuDonar.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N

        Donar.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        Donar.setForeground(new java.awt.Color(170, 80, 0));
        Donar.setText("Donar");
        Donar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DonarActionPerformed(evt);
            }
        });
        menuDonar.add(Donar);

        AdministrarDonaciones.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        AdministrarDonaciones.setForeground(new java.awt.Color(170, 80, 0));
        AdministrarDonaciones.setText("Administrar Donaciones");
        AdministrarDonaciones.setToolTipText("");
        AdministrarDonaciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AdministrarDonacionesActionPerformed(evt);
            }
        });
        menuDonar.add(AdministrarDonaciones);

        barraMenu.add(menuDonar);

        acercade.setForeground(new java.awt.Color(170, 80, 0));
        acercade.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/acerca.png"))); // NOI18N
        acercade.setText("Acerca de");
        acercade.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        acercade.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                acercadeMouseClicked(evt);
            }
        });
        barraMenu.add(acercade);

        setJMenuBar(barraMenu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio, javax.swing.GroupLayout.DEFAULT_SIZE, 923, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio, javax.swing.GroupLayout.DEFAULT_SIZE, 373, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void crearAdministradorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crearAdministradorActionPerformed
        VentanaAsignarAdministradores.getInstance().setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_crearAdministradorActionPerformed

    private void acercadeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_acercadeMouseClicked
      VentanaAcercade.getInstance().setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_acercadeMouseClicked

    private void crearUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crearUsuarioActionPerformed
        VentanaCrearUsuario.getInstance().setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_crearUsuarioActionPerformed

    private void ingresarCuentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ingresarCuentaActionPerformed
        VentanaIngresarCuenta.getInstance().setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_ingresarCuentaActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        //////SALIR DE LA CUENTA
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void buscarMascotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarMascotaActionPerformed
        VentanaBuscarMascota.getInstance().setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_buscarMascotaActionPerformed

    private void buscarPersonaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarPersonaActionPerformed
        VentanaBuscarPersona.getInstance().setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_buscarPersonaActionPerformed

    private void buscarCasaCunaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarCasaCunaActionPerformed
        VentanaBuscarCasaCuna.getInstance().setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_buscarCasaCunaActionPerformed

    private void reportarMascotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reportarMascotaActionPerformed
        VentanaReportarMascota.getInstance().setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_reportarMascotaActionPerformed

    private void reportarPersonaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reportarPersonaActionPerformed
        VentanaReportarPersona.getInstance().setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_reportarPersonaActionPerformed

    private void DonarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DonarActionPerformed
        // TODO add your handling code here:
        VentanaDonar.getInstance().setVisible(true);
    }//GEN-LAST:event_DonarActionPerformed

    private void AdministrarDonacionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AdministrarDonacionesActionPerformed
        // TODO add your handling code here:
        VentanaAdministrarDonaciones.getInstance().setVisible(true);
    }//GEN-LAST:event_AdministrarDonacionesActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem AdministrarDonaciones;
    private javax.swing.JMenuItem Donar;
    private javax.swing.JMenu acercade;
    private javax.swing.JMenuBar barraMenu;
    private javax.swing.JMenuItem buscarCasaCuna;
    private javax.swing.JMenuItem buscarMascota;
    private javax.swing.JMenuItem buscarPersona;
    private javax.swing.JMenuItem crearAdministrador;
    private javax.swing.JMenuItem crearUsuario;
    private javax.swing.JDesktopPane escritorio;
    private javax.swing.JMenuItem ingresarCuenta;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JLabel lblLogo1;
    private javax.swing.JMenu menuBusqueda;
    private javax.swing.JMenu menuDonar;
    private javax.swing.JMenu menuReportar;
    private javax.swing.JMenu menuUsuario;
    private javax.swing.JMenuItem reportarMascota;
    private javax.swing.JMenuItem reportarPersona;
    // End of variables declaration//GEN-END:variables
}
