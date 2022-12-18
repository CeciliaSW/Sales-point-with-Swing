package p3_pv_mcpb_312;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class frmVentas extends javax.swing.JFrame {
    boolean bandera;
    public frmVentas() {
        initComponents();
        tPres.getTableHeader().setReorderingAllowed(false); 
        tPres.setEnabled(false); 
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblTítulo = new javax.swing.JLabel();
        btnGuardar = new javax.swing.JButton();
        pFondo = new javax.swing.JPanel();
        pDivisión = new javax.swing.JPanel();
        lblSubT = new javax.swing.JLabel();
        lblIVA = new javax.swing.JLabel();
        lblTotal = new javax.swing.JLabel();
        btnFinalizar = new javax.swing.JButton();
        lblSubDinero = new javax.swing.JLabel();
        lblTotDinero = new javax.swing.JLabel();
        lblVentas = new javax.swing.JLabel();
        pFSec = new javax.swing.JPanel();
        btnBuscar = new javax.swing.JButton();
        txtBuscar = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tPres = new javax.swing.JTable();
        lblÍconoV = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jMenuItem2 = new javax.swing.JMenuItem();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        lblTítulo.setFont(new java.awt.Font("Segoe UI Black", 1, 48)); // NOI18N
        lblTítulo.setForeground(new java.awt.Color(255, 255, 255));
        lblTítulo.setText("PRODUCTOS");

        btnGuardar.setBackground(new java.awt.Color(0, 204, 0));
        btnGuardar.setFont(new java.awt.Font("Montserrat", 1, 12)); // NOI18N
        btnGuardar.setForeground(new java.awt.Color(255, 255, 255));
        btnGuardar.setText("Guardar");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Ventas");

        pFondo.setBackground(new java.awt.Color(74, 78, 126));
        pFondo.setForeground(new java.awt.Color(255, 255, 255));

        pDivisión.setBackground(new java.awt.Color(255, 255, 255));

        lblSubT.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblSubT.setForeground(new java.awt.Color(74, 78, 126));
        lblSubT.setText("Sub-Total:");

        lblIVA.setBackground(new java.awt.Color(255, 255, 255));
        lblIVA.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblIVA.setForeground(new java.awt.Color(74, 78, 126));
        lblIVA.setText("IVA: 16 %");

        lblTotal.setBackground(new java.awt.Color(255, 255, 255));
        lblTotal.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblTotal.setForeground(new java.awt.Color(74, 78, 126));
        lblTotal.setText("Total:");

        btnFinalizar.setBackground(new java.awt.Color(0, 204, 0));
        btnFinalizar.setFont(new java.awt.Font("Montserrat", 1, 12)); // NOI18N
        btnFinalizar.setForeground(new java.awt.Color(255, 255, 255));
        btnFinalizar.setText("Finalizar");
        btnFinalizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFinalizarActionPerformed(evt);
            }
        });

        lblSubDinero.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblSubDinero.setForeground(new java.awt.Color(74, 78, 126));
        lblSubDinero.setText("$0.00");

        lblTotDinero.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblTotDinero.setForeground(new java.awt.Color(74, 78, 126));
        lblTotDinero.setText("$0.00");

        javax.swing.GroupLayout pDivisiónLayout = new javax.swing.GroupLayout(pDivisión);
        pDivisión.setLayout(pDivisiónLayout);
        pDivisiónLayout.setHorizontalGroup(
            pDivisiónLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pDivisiónLayout.createSequentialGroup()
                .addGap(135, 135, 135)
                .addGroup(pDivisiónLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pDivisiónLayout.createSequentialGroup()
                        .addComponent(lblTotal)
                        .addGap(18, 18, 18)
                        .addComponent(lblTotDinero, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(pDivisiónLayout.createSequentialGroup()
                        .addGroup(pDivisiónLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblIVA, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(pDivisiónLayout.createSequentialGroup()
                                .addComponent(lblSubT)
                                .addGap(18, 18, 18)
                                .addComponent(lblSubDinero, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pDivisiónLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnFinalizar, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17))
        );
        pDivisiónLayout.setVerticalGroup(
            pDivisiónLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pDivisiónLayout.createSequentialGroup()
                .addContainerGap(55, Short.MAX_VALUE)
                .addGroup(pDivisiónLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSubT)
                    .addComponent(lblSubDinero, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblIVA, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pDivisiónLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTotal)
                    .addComponent(lblTotDinero, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnFinalizar)
                .addContainerGap())
        );

        lblVentas.setFont(new java.awt.Font("Segoe UI Black", 1, 48)); // NOI18N
        lblVentas.setForeground(new java.awt.Color(255, 255, 255));
        lblVentas.setText("VENTAS");

        pFSec.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.pressedBackground"));

        btnBuscar.setBackground(new java.awt.Color(255, 153, 102));
        btnBuscar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnBuscar.setForeground(new java.awt.Color(255, 255, 255));
        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        txtBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtBuscarKeyPressed(evt);
            }
        });

        tPres.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Producto", "Cantidad", "Precio", "Precio total"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tPres);

        javax.swing.GroupLayout pFSecLayout = new javax.swing.GroupLayout(pFSec);
        pFSec.setLayout(pFSecLayout);
        pFSecLayout.setHorizontalGroup(
            pFSecLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pFSecLayout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addGroup(pFSecLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pFSecLayout.createSequentialGroup()
                        .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(55, 55, 55)
                        .addComponent(btnBuscar)))
                .addGap(15, 15, 15))
        );
        pFSecLayout.setVerticalGroup(
            pFSecLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pFSecLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pFSecLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        lblÍconoV.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dinero.png"))); // NOI18N

        javax.swing.GroupLayout pFondoLayout = new javax.swing.GroupLayout(pFondo);
        pFondo.setLayout(pFondoLayout);
        pFondoLayout.setHorizontalGroup(
            pFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pFondoLayout.createSequentialGroup()
                .addGroup(pFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(pFondoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(pFSec, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pFondoLayout.createSequentialGroup()
                        .addGap(101, 101, 101)
                        .addComponent(lblÍconoV)
                        .addGap(18, 18, 18)
                        .addComponent(lblVentas, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(pDivisión, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pFondoLayout.setVerticalGroup(
            pFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pFondoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblVentas)
                    .addGroup(pFondoLayout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(lblÍconoV, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(pFSec, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(pDivisión, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );

        jMenu1.setText("Menú");

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

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pFondo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pFondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        System.exit(0);
        setDefaultCloseOperation(frmVentas.EXIT_ON_CLOSE);                                    
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
       frmProducto formulario = new frmProducto(new javax.swing.JFrame(), true);
       formulario.setLocationRelativeTo(null); 
       formulario.setVisible(true);
       this.setVisible(false);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void txtBuscarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarKeyPressed
        if(evt.getKeyChar() == KeyEvent.VK_ENTER)
        {
            llamarFormulario(txtBuscar.getText());
        }
    }//GEN-LAST:event_txtBuscarKeyPressed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        llamarFormulario(txtBuscar.getText());
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnFinalizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFinalizarActionPerformed
        JOptionPane.showMessageDialog(null, "Compra terminada. No hay cancelaciones. La modificación de inventario se realiza desde que se agrega el producto."); 
        lblSubDinero.setText("$0.00");
        lblTotDinero.setText("$0.00");
        txtBuscar.setText(null);
        
        DefaultTableModel model  = (DefaultTableModel) tPres.getModel();
            for (int i = 0; i < tPres.getRowCount(); i++) 
        {
//            model.removeRow(i);
            i-=1;
        }
    }//GEN-LAST:event_btnFinalizarActionPerformed
  
    private void llamarFormulario(String búsqueda){
        if(txtBuscar.getText().length() != 0)
        {
            if(Negocio.NegocioProducto.lstProductos.size() <= 0)
            {
                JOptionPane.showMessageDialog(null, "Ningún producto ha sido dado de alta."); 
            }
            else
            {
                frmListaBúsqueda formLista = new frmListaBúsqueda(this, true);
                llenarLista(formLista, búsqueda);
                
                if(bandera == false)
                {
                    JOptionPane.showMessageDialog(null, "Producto no encontrado."); 
                }
                else
                {
                        formLista.setLocationRelativeTo(null);
                        formLista.setVisible(true);
                }
            }
        }
        else 
        {
            JOptionPane.showMessageDialog(null, "No hay parámetro de búsqueda."); 
        }
    }
    
    private boolean llenarLista(frmListaBúsqueda formLista, String b){
        formLista.lblProductoB.setText(b);
        bandera = false;
        for (int i=0;i<Negocio.NegocioProducto.lstProductos.size();i++) {
              if(Negocio.NegocioProducto.lstProductos.get(i).getNombreProducto().contains(b))
              {
                    DefaultTableModel model = (DefaultTableModel) formLista.tCoinci.getModel();
                    model.addRow(new Object[]
                    {
                        Negocio.NegocioProducto.lstProductos.get(i).getNombreProducto(), 
                        Negocio.NegocioProducto.lstProductos.get(i).getDescripciónProducto(), 
                        Negocio.NegocioProducto.lstProductos.get(i).getPrecioUnitario(), 
                        Negocio.NegocioProducto.lstProductos.get(i).getCantidadProducto()
                    });
                    formLista.tCoinci.setModel(model);
                    bandera = true;
              }
        } 
        return bandera;
    }
    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmVentas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnFinalizar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JLabel lblIVA;
    public static javax.swing.JLabel lblSubDinero;
    private javax.swing.JLabel lblSubT;
    public static javax.swing.JLabel lblTotDinero;
    private javax.swing.JLabel lblTotal;
    private javax.swing.JLabel lblTítulo;
    private javax.swing.JLabel lblVentas;
    private javax.swing.JLabel lblÍconoV;
    private javax.swing.JPanel pDivisión;
    private javax.swing.JPanel pFSec;
    private javax.swing.JPanel pFondo;
    public static javax.swing.JTable tPres;
    private javax.swing.JTextField txtBuscar;
    // End of variables declaration//GEN-END:variables
}
