/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import javax.swing.JOptionPane;
import Controladores.ControladorDonaciones;
import Estructuras.Donacion;

/**
 *
 * @author Samantha
 */
public class VentanaAdministrarDonaciones extends javax.swing.JInternalFrame{
    private static VentanaAdministrarDonaciones miVentanaDonar;
    private VentanaAdministrarDonaciones() {
        initComponents();
    }
    
    public static VentanaAdministrarDonaciones getInstance(){
        if(miVentanaDonar == null)
        {
            miVentanaDonar = new VentanaAdministrarDonaciones();
        }
        return miVentanaDonar;
    }
    
       
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblTítulo = new javax.swing.JLabel();
        btnCerrar = new javax.swing.JButton();
        btnEntregarDonaciones = new javax.swing.JButton();
        btnVerDonaciones = new javax.swing.JButton();
        btnRevisarCaducidadDonaciones = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaDonaciones = new javax.swing.JTable();

        setIconifiable(true);
        setTitle("Administrar Donaciones - Estimação");

        jPanel1.setBackground(new java.awt.Color(190, 160, 100));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTítulo.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        lblTítulo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/donar.png"))); // NOI18N
        lblTítulo.setText("Admistrar Donaciones Recibidas");
        jPanel1.add(lblTítulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 30, -1, -1));

        btnCerrar.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        btnCerrar.setForeground(new java.awt.Color(170, 80, 0));
        btnCerrar.setText("Cerrar");
        btnCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarActionPerformed(evt);
            }
        });
        jPanel1.add(btnCerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 150, 40));

        btnEntregarDonaciones.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        btnEntregarDonaciones.setForeground(new java.awt.Color(170, 80, 0));
        btnEntregarDonaciones.setText("Entregar Donación");
        btnEntregarDonaciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEntregarDonacionesActionPerformed(evt);
            }
        });
        jPanel1.add(btnEntregarDonaciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 150, 40));

        btnVerDonaciones.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        btnVerDonaciones.setForeground(new java.awt.Color(170, 80, 0));
        btnVerDonaciones.setText("Ver Donaciones");
        btnVerDonaciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerDonacionesActionPerformed(evt);
            }
        });
        jPanel1.add(btnVerDonaciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 150, 40));

        btnRevisarCaducidadDonaciones.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        btnRevisarCaducidadDonaciones.setForeground(new java.awt.Color(170, 80, 0));
        btnRevisarCaducidadDonaciones.setText("Revisar Caducidad");
        btnRevisarCaducidadDonaciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRevisarCaducidadDonacionesActionPerformed(evt);
            }
        });
        jPanel1.add(btnRevisarCaducidadDonaciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 150, 40));

        tablaDonaciones.setFont(new java.awt.Font("Courier New", 0, 11)); // NOI18N
        tablaDonaciones.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Caducidad", "ID Donador", "Donación", "Cantidad", "Medida"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tablaDonaciones);
        if (tablaDonaciones.getColumnModel().getColumnCount() > 0) {
            tablaDonaciones.getColumnModel().getColumn(0).setResizable(false);
            tablaDonaciones.getColumnModel().getColumn(1).setResizable(false);
            tablaDonaciones.getColumnModel().getColumn(2).setResizable(false);
            tablaDonaciones.getColumnModel().getColumn(3).setResizable(false);
            tablaDonaciones.getColumnModel().getColumn(4).setResizable(false);
        }

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 60, -1, 220));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 641, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEntregarDonacionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEntregarDonacionesActionPerformed
    }//GEN-LAST:event_btnEntregarDonacionesActionPerformed

    private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_btnCerrarActionPerformed

    private void btnVerDonacionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerDonacionesActionPerformed
        // TODO add your handling code here:
        // if donacion marcada con check se entrega
        // for donaciones en tabla
        ControladorDonaciones.getInstance().entregarDonacion(miDonacionEntregada);
    }//GEN-LAST:event_btnVerDonacionesActionPerformed

    private void btnRevisarCaducidadDonacionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRevisarCaducidadDonacionesActionPerformed
        // TODO add your handling code here:
        boolean revisarCaducidadDonacion = ControladorDonaciones.getInstance().revisarCaducidadDonacion();
        if (revisarCaducidadDonacion){
            // actualiza el cuadro con las donaciones que quedaron en contenedorDonaciones
            JOptionPane.showMessageDialog(null, "Datos de Donaciones\nActualizados");
        }
        else{
            JOptionPane.showMessageDialog(null, "Error: No se actualizaron los datos.\n Error en sistema, espere unos segundo e intente nuevamente");
        }
    }//GEN-LAST:event_btnRevisarCaducidadDonacionesActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCerrar;
    private javax.swing.JButton btnEntregarDonaciones;
    private javax.swing.JButton btnRevisarCaducidadDonaciones;
    private javax.swing.JButton btnVerDonaciones;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblTítulo;
    private javax.swing.JTable tablaDonaciones;
    // End of variables declaration//GEN-END:variables
}
