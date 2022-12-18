package p3_pv_mcpb_312;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class frmListaBúsqueda extends javax.swing.JDialog {
     DefaultTableModel model;
     String nombreP;
     String descripciónP;
     double precioP;
     int cantidadP;

    public frmListaBúsqueda(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        tCoinci.getTableHeader().setReorderingAllowed(false); 
    }

    frmListaBúsqueda(frmVentas aThis, boolean b, String búsqueda, frmVentas aThis0) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pFondoB2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        pFondoB = new javax.swing.JPanel();
        txtBarra = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tCoinci = new javax.swing.JTable();
        btnAgregarB = new javax.swing.JButton();
        lblCantidad = new javax.swing.JLabel();
        lblBúsquedaTít = new javax.swing.JLabel();
        lblProductoB = new javax.swing.JLabel();
        lblÍconoB = new javax.swing.JLabel();
        lblBúsquda = new javax.swing.JLabel();
        mBúsqueda = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jMenuItem2 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        pFondoB2.setBackground(new java.awt.Color(74, 78, 126));
        pFondoB2.setForeground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        pFondoB.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.pressedBackground"));

        tCoinci.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Descripción", "Precio", "Cantidad"
            }
        ));
        jScrollPane1.setViewportView(tCoinci);

        btnAgregarB.setBackground(new java.awt.Color(0, 204, 0));
        btnAgregarB.setFont(new java.awt.Font("Montserrat", 1, 12)); // NOI18N
        btnAgregarB.setForeground(new java.awt.Color(255, 255, 255));
        btnAgregarB.setText("Agregar");
        btnAgregarB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarBActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pFondoBLayout = new javax.swing.GroupLayout(pFondoB);
        pFondoB.setLayout(pFondoBLayout);
        pFondoBLayout.setHorizontalGroup(
            pFondoBLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pFondoBLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(pFondoBLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pFondoBLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(btnAgregarB, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(pFondoBLayout.createSequentialGroup()
                            .addComponent(txtBarra, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(133, 133, 133))))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        pFondoBLayout.setVerticalGroup(
            pFondoBLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pFondoBLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtBarra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnAgregarB)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        lblCantidad.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblCantidad.setForeground(new java.awt.Color(51, 51, 51));
        lblCantidad.setText("Cantidad:");

        lblBúsquedaTít.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblBúsquedaTít.setForeground(new java.awt.Color(51, 51, 51));
        lblBúsquedaTít.setText("Búsqueda:");

        lblProductoB.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblProductoB.setForeground(new java.awt.Color(51, 51, 51));
        lblProductoB.setText("Producto");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pFondoB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblBúsquedaTít, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblProductoB, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 406, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(45, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblBúsquedaTít)
                    .addComponent(lblProductoB))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblCantidad)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, 16, Short.MAX_VALUE)
                .addComponent(pFondoB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(74, 74, 74))
        );

        lblÍconoB.setIcon(new javax.swing.ImageIcon(getClass().getResource("/brújula1.png"))); // NOI18N

        lblBúsquda.setFont(new java.awt.Font("Segoe UI Black", 1, 48)); // NOI18N
        lblBúsquda.setForeground(new java.awt.Color(255, 255, 255));
        lblBúsquda.setText("BÚSQUEDA");

        javax.swing.GroupLayout pFondoB2Layout = new javax.swing.GroupLayout(pFondoB2);
        pFondoB2.setLayout(pFondoB2Layout);
        pFondoB2Layout.setHorizontalGroup(
            pFondoB2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pFondoB2Layout.createSequentialGroup()
                .addGroup(pFondoB2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pFondoB2Layout.createSequentialGroup()
                        .addGap(130, 130, 130)
                        .addComponent(lblÍconoB)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblBúsquda, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pFondoB2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        pFondoB2Layout.setVerticalGroup(
            pFondoB2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pFondoB2Layout.createSequentialGroup()
                .addGroup(pFondoB2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pFondoB2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblBúsquda)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE))
                    .addGroup(pFondoB2Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblÍconoB)
                        .addGap(18, 18, 18)))
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
        );

        jMenu1.setText("Menú");

        jMenuItem3.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.ALT_DOWN_MASK));
        jMenuItem3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/venta.png"))); // NOI18N
        jMenuItem3.setText("Ventas");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem3);

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_T, java.awt.event.InputEvent.ALT_DOWN_MASK));
        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/catálogo.png"))); // NOI18N
        jMenuItem1.setText("Catálogo");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);
        jMenu1.add(jSeparator1);

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_J, java.awt.event.InputEvent.ALT_DOWN_MASK));
        jMenuItem2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/salir.png"))); // NOI18N
        jMenuItem2.setText("Salir");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        mBúsqueda.add(jMenu1);

        setJMenuBar(mBúsqueda);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pFondoB2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pFondoB2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarBActionPerformed

        if (tCoinci.getSelectedRow() >= 0)
        {
            int row = tCoinci.getSelectedRow();
            if (txtBarra.getText().length() != 0)
            {
                int posición = -1;
                int cantidad = Integer.parseInt(txtBarra.getText());
                for (int i=0;i<Negocio.NegocioProducto.lstProductos.size();i++) {
                    if(Negocio.NegocioProducto.lstProductos.get(i).getNombreProducto().equals(tCoinci.getValueAt(row, 0)))
                    {
                        posición = i;
                    }
                }
                if (cantidad <= Negocio.NegocioProducto.lstProductos.get(posición).getCantidadProducto())
                {
                    Negocio.NegocioProducto.lstProductos.get(posición).setCantidadProducto(Negocio.NegocioProducto.lstProductos.get(posición).getCantidadProducto()-cantidad);
                    double precio;
                    if (cantidad >= 10)
                    {
                        precio = Negocio.NegocioProducto.lstProductos.get(posición).getPrecioMayoreo();
                    }
                    else
                    {
                        precio = Negocio.NegocioProducto.lstProductos.get(posición).getPrecioUnitario();
                    }
                   
                    double precioTotal = precio*cantidad;
                  
                    model = (DefaultTableModel) frmVentas.tPres.getModel();
                    model.addRow(new Object[]
                    {
                        Negocio.NegocioProducto.lstProductos.get(posición).getNombreProducto(),
                        cantidad,
                        precio,
                        precioTotal
                    });
                    frmVentas.tPres.setModel(model);
                    
                      double columnaP =  Double.parseDouble(frmVentas.tPres.getValueAt(0, 3).toString());
                      for (int i=1;i<frmVentas.tPres.getRowCount();i++) {
                        columnaP += Double.parseDouble(frmVentas.tPres.getValueAt(i, 3).toString());
                    }
                    double redondeo= Math.round(columnaP * 100.0) / 100.0;
                    double redondeoIVA = Math.round(columnaP * 116.0) / 100.0;
                    frmVentas.lblSubDinero.setText("$"+(redondeo));
                    frmVentas.lblTotDinero.setText("$"+(redondeoIVA));
                    
                    JOptionPane.showMessageDialog(null, "El producto ha sido agregado. Puede regresar a la pantalla principal.");  
                }
                else 
                {
                    JOptionPane.showMessageDialog(null, "No se puede añadir más cantidad. Operación fallida.");   
                }
            }
            else
                {
                    JOptionPane.showMessageDialog(null, "Seleccione una cantidad.");  
                }
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Seleccione un producto.");  
        }
    }//GEN-LAST:event_btnAgregarBActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        frmProducto formulario = new frmProducto(new javax.swing.JFrame(), true);
        formulario.setLocationRelativeTo(null);
        formulario.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        System.exit(0);
        setDefaultCloseOperation(frmVentas.EXIT_ON_CLOSE);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        frmVentas formulario = new frmVentas();
        formulario.setLocationRelativeTo(null);
        formulario.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    
    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                frmListaBúsqueda dialog = new frmListaBúsqueda(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregarB;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JLabel lblBúsquda;
    private javax.swing.JLabel lblBúsquedaTít;
    private javax.swing.JLabel lblCantidad;
    public static javax.swing.JLabel lblProductoB;
    private javax.swing.JLabel lblÍconoB;
    private javax.swing.JMenuBar mBúsqueda;
    private javax.swing.JPanel pFondoB;
    private javax.swing.JPanel pFondoB2;
    public static javax.swing.JTable tCoinci;
    private javax.swing.JTextField txtBarra;
    // End of variables declaration//GEN-END:variables
}
