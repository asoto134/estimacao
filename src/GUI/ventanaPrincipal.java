/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

/**
 *
 * @author Samantha
 * Toolkit.getDefaultToolkit().getImage(ventanaPrincipal.class.getResource("/Recursos/ImagenesGUI/Logo Adrian.png"))
 * 
 * ImageIcon portada = new ImageIcon(ventanaPrincipal.class.getResource("/Recursos/ImagenesGUI/Logo Adrian.png"));
   lblNewLabel_1.setIcon(new ImageIcon(portada.getImage().getScaledInstance(lblNewLabel_1.getWidth(), lblNewLabel_1.getHeight(), Image.SCALE_SMOOTH)));
		
 */
public class ventanaPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form ventanaPrincipal
     */
    public ventanaPrincipal() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelPrincipal = new javax.swing.JPanel();
        lblLogo = new javax.swing.JLabel();
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
        reoprtarPersona = new javax.swing.JMenuItem();
        menuAyudar = new javax.swing.JMenu();
        acercade = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Estimação");

        panelPrincipal.setBackground(new java.awt.Color(190, 160, 100));
        panelPrincipal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/logoE.png"))); // NOI18N
        panelPrincipal.add(lblLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 20, -1, -1));

        barraMenu.setBackground(new java.awt.Color(153, 255, 153));

        menuUsuario.setForeground(new java.awt.Color(170, 80, 0));
        menuUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/usuarioM.png"))); // NOI18N
        menuUsuario.setText("Usuario");
        menuUsuario.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N

        crearUsuario.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        crearUsuario.setForeground(new java.awt.Color(170, 80, 0));
        crearUsuario.setText("Crear Usuario Nuevo");
        menuUsuario.add(crearUsuario);

        ingresarCuenta.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        ingresarCuenta.setForeground(new java.awt.Color(170, 80, 0));
        ingresarCuenta.setText("Ingresar a mi Cuenta");
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
        menuUsuario.add(jMenuItem1);

        barraMenu.add(menuUsuario);

        menuBusqueda.setForeground(new java.awt.Color(170, 80, 0));
        menuBusqueda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/buscar.png"))); // NOI18N
        menuBusqueda.setText("Búsqueda");
        menuBusqueda.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N

        buscarMascota.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        buscarMascota.setForeground(new java.awt.Color(170, 80, 0));
        buscarMascota.setText("Buscar Mascota");
        menuBusqueda.add(buscarMascota);

        buscarPersona.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        buscarPersona.setForeground(new java.awt.Color(170, 80, 0));
        buscarPersona.setText("Buscar Persona");
        menuBusqueda.add(buscarPersona);

        buscarCasaCuna.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        buscarCasaCuna.setForeground(new java.awt.Color(170, 80, 0));
        buscarCasaCuna.setText("Buscar Casa Cuna");
        menuBusqueda.add(buscarCasaCuna);

        barraMenu.add(menuBusqueda);

        menuReportar.setForeground(new java.awt.Color(170, 80, 0));
        menuReportar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/alerta.png"))); // NOI18N
        menuReportar.setText("Reportar");
        menuReportar.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N

        reportarMascota.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        reportarMascota.setForeground(new java.awt.Color(170, 80, 0));
        reportarMascota.setText("Reportar Mascota");
        menuReportar.add(reportarMascota);

        reoprtarPersona.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        reoprtarPersona.setForeground(new java.awt.Color(170, 80, 0));
        reoprtarPersona.setText("Reportar Persona");
        menuReportar.add(reoprtarPersona);

        barraMenu.add(menuReportar);

        menuAyudar.setForeground(new java.awt.Color(170, 80, 0));
        menuAyudar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/donar.png"))); // NOI18N
        menuAyudar.setText("Donar");
        menuAyudar.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        barraMenu.add(menuAyudar);

        acercade.setForeground(new java.awt.Color(170, 80, 0));
        acercade.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/acerca.png"))); // NOI18N
        acercade.setText("Acerca de");
        acercade.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        barraMenu.add(acercade);

        setJMenuBar(barraMenu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, 742, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, 373, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void crearAdministradorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crearAdministradorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_crearAdministradorActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ventanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ventanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ventanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ventanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ventanaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu acercade;
    private javax.swing.JMenuBar barraMenu;
    private javax.swing.JMenuItem buscarCasaCuna;
    private javax.swing.JMenuItem buscarMascota;
    private javax.swing.JMenuItem buscarPersona;
    private javax.swing.JMenuItem crearAdministrador;
    private javax.swing.JMenuItem crearUsuario;
    private javax.swing.JMenuItem ingresarCuenta;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JMenu menuAyudar;
    private javax.swing.JMenu menuBusqueda;
    private javax.swing.JMenu menuReportar;
    private javax.swing.JMenu menuUsuario;
    private javax.swing.JPanel panelPrincipal;
    private javax.swing.JMenuItem reoprtarPersona;
    private javax.swing.JMenuItem reportarMascota;
    // End of variables declaration//GEN-END:variables
}
