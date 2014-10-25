/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

/**
 *
 * @author Samantha
 */
public class VentanaBuscarMascota extends javax.swing.JInternalFrame {

    
    private static VentanaBuscarMascota miVentanaBuscarMascota;
    /**
     * Creates new form ventanaBuscarMascota
     */
    private VentanaBuscarMascota() {
        initComponents();
    }
    
    public static VentanaBuscarMascota getInstance()
    {
        if(miVentanaBuscarMascota == null)
        {
            miVentanaBuscarMascota = new VentanaBuscarMascota();
        }
        return miVentanaBuscarMascota;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelVentanaBuscar = new javax.swing.JPanel();
        lblTitulo2Ventana = new javax.swing.JLabel();
        lblImagenBuscar = new javax.swing.JLabel();
        lblImagenMascota = new javax.swing.JLabel();
        lblCaracteristicas = new javax.swing.JLabel();
        lblNombreMascota = new javax.swing.JLabel();
        fieldIdChip = new javax.swing.JTextField();
        lblEspecia = new javax.swing.JLabel();
        lblRaza = new javax.swing.JLabel();
        lblTamano = new javax.swing.JLabel();
        boxTamaño = new javax.swing.JComboBox();
        boxEspecie = new javax.swing.JComboBox();
        boxRaza = new javax.swing.JComboBox();
        lblOjos = new javax.swing.JLabel();
        fieldOjos = new javax.swing.JTextField();
        lblPelaje = new javax.swing.JLabel();
        fieldPelaje = new javax.swing.JTextField();
        lblidChip = new javax.swing.JLabel();
        fieldNombreMascota = new javax.swing.JTextField();
        lblUbicacion = new javax.swing.JLabel();
        fieldUbicacion = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        btnReportarEncontrada = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaBuscarMascota = new javax.swing.JTable();
        lblTituloVentana1 = new javax.swing.JLabel();
        btnCancelar1 = new javax.swing.JButton();

        setIconifiable(true);
        setResizable(true);
        setTitle("Buscar Mascota - Estimação");

        panelVentanaBuscar.setBackground(new java.awt.Color(190, 160, 100));
        panelVentanaBuscar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTitulo2Ventana.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        lblTitulo2Ventana.setText("Mascotas Encontradas");
        panelVentanaBuscar.add(lblTitulo2Ventana, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 80, -1, -1));

        lblImagenBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/buscar.png"))); // NOI18N
        panelVentanaBuscar.add(lblImagenBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 30, 30));

        lblImagenMascota.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/adoptar.png"))); // NOI18N
        panelVentanaBuscar.add(lblImagenMascota, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 120, -1, -1));

        lblCaracteristicas.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lblCaracteristicas.setText("Características de la Mascota");
        panelVentanaBuscar.add(lblCaracteristicas, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, -1, -1));

        lblNombreMascota.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        lblNombreMascota.setText("Nombre");
        panelVentanaBuscar.add(lblNombreMascota, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, -1, -1));
        panelVentanaBuscar.add(fieldIdChip, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 120, 130, -1));

        lblEspecia.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        lblEspecia.setText("Especie");
        panelVentanaBuscar.add(lblEspecia, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, -1, -1));

        lblRaza.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        lblRaza.setText("Raza");
        panelVentanaBuscar.add(lblRaza, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, -1, -1));

        lblTamano.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        lblTamano.setText("Tamaño");
        panelVentanaBuscar.add(lblTamano, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, -1, -1));

        boxTamaño.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        boxTamaño.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Menor a 20cm", "De 20cm a 50cm", "De 50cm a 80cm", "Mayor a 1m" }));
        panelVentanaBuscar.add(boxTamaño, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 210, 130, -1));

        boxEspecie.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        boxEspecie.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Perro", "Gato", "Pájaro", "Tortuga", "Roedor Pequeño", "Conejo" }));
        panelVentanaBuscar.add(boxEspecie, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 150, 130, -1));

        boxRaza.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        boxRaza.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccione Especie" }));
        panelVentanaBuscar.add(boxRaza, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 180, -1, -1));

        lblOjos.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        lblOjos.setText("Color de Ojos");
        panelVentanaBuscar.add(lblOjos, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, -1, -1));

        fieldOjos.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        panelVentanaBuscar.add(fieldOjos, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 270, 90, -1));

        lblPelaje.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        lblPelaje.setText("Color de Pelaje");
        panelVentanaBuscar.add(lblPelaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, -1, -1));

        fieldPelaje.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        panelVentanaBuscar.add(fieldPelaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 240, 90, -1));

        lblidChip.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        lblidChip.setText("ID Chip");
        panelVentanaBuscar.add(lblidChip, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, -1, -1));
        panelVentanaBuscar.add(fieldNombreMascota, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 90, 130, -1));

        lblUbicacion.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        lblUbicacion.setText("Ubicación donde se vió por última vez");
        panelVentanaBuscar.add(lblUbicacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, -1, -1));

        fieldUbicacion.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        fieldUbicacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldUbicacionActionPerformed(evt);
            }
        });
        panelVentanaBuscar.add(fieldUbicacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 350, 200, -1));

        jLabel1.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel1.setText("(Distrito, Cantón o Barrio)");
        panelVentanaBuscar.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 330, 160, -1));

        btnReportarEncontrada.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        btnReportarEncontrada.setForeground(new java.awt.Color(170, 80, 0));
        btnReportarEncontrada.setText("Reportar Mascota Encontrada");
        panelVentanaBuscar.add(btnReportarEncontrada, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 420, 210, 40));

        btnBuscar.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        btnBuscar.setForeground(new java.awt.Color(170, 80, 0));
        btnBuscar.setText("Buscar");
        panelVentanaBuscar.add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 410, 90, 40));

        tablaBuscarMascota.setBackground(new java.awt.Color(190, 160, 100));
        tablaBuscarMascota.setFont(new java.awt.Font("Courier New", 1, 12)); // NOI18N
        tablaBuscarMascota.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Nombre", "ID Chip", "Especie", "Raza", "Tamaño", "Pelaje", "Ojos", "Ubicación"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaBuscarMascota.addMouseWheelListener(new java.awt.event.MouseWheelListener() {
            public void mouseWheelMoved(java.awt.event.MouseWheelEvent evt) {
                tablaBuscarMascotaMouseWheelMoved(evt);
            }
        });
        jScrollPane1.setViewportView(tablaBuscarMascota);
        tablaBuscarMascota.getColumnModel().getColumn(0).setResizable(false);
        tablaBuscarMascota.getColumnModel().getColumn(1).setResizable(false);
        tablaBuscarMascota.getColumnModel().getColumn(2).setResizable(false);
        tablaBuscarMascota.getColumnModel().getColumn(3).setResizable(false);
        tablaBuscarMascota.getColumnModel().getColumn(4).setResizable(false);
        tablaBuscarMascota.getColumnModel().getColumn(5).setResizable(false);
        tablaBuscarMascota.getColumnModel().getColumn(6).setResizable(false);
        tablaBuscarMascota.getColumnModel().getColumn(7).setResizable(false);

        panelVentanaBuscar.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 120, 550, 280));

        lblTituloVentana1.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        lblTituloVentana1.setText("Buscar Mascota");
        panelVentanaBuscar.add(lblTituloVentana1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 20, -1, -1));

        btnCancelar1.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        btnCancelar1.setForeground(new java.awt.Color(170, 80, 0));
        btnCancelar1.setText("Cancelar");
        panelVentanaBuscar.add(btnCancelar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 410, 90, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelVentanaBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, 908, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelVentanaBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 488, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 8, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void fieldUbicacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldUbicacionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fieldUbicacionActionPerformed

    private void tablaBuscarMascotaMouseWheelMoved(java.awt.event.MouseWheelEvent evt) {//GEN-FIRST:event_tablaBuscarMascotaMouseWheelMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_tablaBuscarMascotaMouseWheelMoved


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox boxEspecie;
    private javax.swing.JComboBox boxRaza;
    private javax.swing.JComboBox boxTamaño;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCancelar1;
    private javax.swing.JButton btnReportarEncontrada;
    private javax.swing.JTextField fieldIdChip;
    private javax.swing.JTextField fieldNombreMascota;
    private javax.swing.JTextField fieldOjos;
    private javax.swing.JTextField fieldPelaje;
    private javax.swing.JTextField fieldUbicacion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCaracteristicas;
    private javax.swing.JLabel lblEspecia;
    private javax.swing.JLabel lblImagenBuscar;
    private javax.swing.JLabel lblImagenMascota;
    private javax.swing.JLabel lblNombreMascota;
    private javax.swing.JLabel lblOjos;
    private javax.swing.JLabel lblPelaje;
    private javax.swing.JLabel lblRaza;
    private javax.swing.JLabel lblTamano;
    private javax.swing.JLabel lblTitulo2Ventana;
    private javax.swing.JLabel lblTituloVentana1;
    private javax.swing.JLabel lblUbicacion;
    private javax.swing.JLabel lblidChip;
    private javax.swing.JPanel panelVentanaBuscar;
    private javax.swing.JTable tablaBuscarMascota;
    // End of variables declaration//GEN-END:variables
}
