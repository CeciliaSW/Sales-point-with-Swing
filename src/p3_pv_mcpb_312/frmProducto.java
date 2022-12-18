package p3_pv_mcpb_312;
import Modelos.Producto;
import java.awt.Color;
import java.awt.Component;
import java.awt.HeadlessException;
import java.awt.Image;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.ImageIcon;
import javax.swing.JColorChooser;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;

public class frmProducto extends javax.swing.JDialog {
    DefaultTableModel model;
    JFileChooser fc;
    JLabel imgLabel = new JLabel();
    int id, cantidad;
    String código, nombre, descripción, rutaArchivo;
    double unitario, mayoreo;
    boolean repetición = false;
    
    public frmProducto(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        tDatos.getTableHeader().setReorderingAllowed(false); 
        tDatos.setEnabled(false); 
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pFondo = new javax.swing.JPanel();
        lblImg = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        pDatos = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tDatos = new javax.swing.JTable();
        lblAltas = new javax.swing.JLabel();
        lblId = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        txtCódigo = new javax.swing.JTextField();
        lblCódigo = new javax.swing.JLabel();
        lblNom = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtDes = new javax.swing.JTextField();
        lblDes = new javax.swing.JLabel();
        lblCantidad = new javax.swing.JLabel();
        spCant = new javax.swing.JSpinner();
        spUni = new javax.swing.JSpinner();
        lblPrecioU = new javax.swing.JLabel();
        lblPrecioM = new javax.swing.JLabel();
        spMayo = new javax.swing.JSpinner();
        pImgInsert = new javax.swing.JPanel();
        imgFoto = new javax.swing.JLabel();
        btnSelecImg = new javax.swing.JButton();
        btnAgregar = new javax.swing.JButton();
        btnAbrir = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        lblTítulo = new javax.swing.JLabel();
        lblÍcono = new javax.swing.JLabel();
        btnColor = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Producto");

        pFondo.setBackground(new java.awt.Color(74, 78, 126));

        lblImg.setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        pDatos.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.default.pressedBackground"));

        tDatos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Cantidad", "Unitario", "Mayoreo", "Imagen"
            }
        ));
        tDatos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tDatosMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tDatos);

        javax.swing.GroupLayout pDatosLayout = new javax.swing.GroupLayout(pDatos);
        pDatos.setLayout(pDatosLayout);
        pDatosLayout.setHorizontalGroup(
            pDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pDatosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 524, Short.MAX_VALUE)
                .addContainerGap())
        );
        pDatosLayout.setVerticalGroup(
            pDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pDatosLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        lblAltas.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        lblAltas.setForeground(new java.awt.Color(51, 51, 51));
        lblAltas.setText("Altas");

        lblId.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        lblId.setText("Id:");

        txtId.setBackground(new java.awt.Color(225, 225, 225));
        txtId.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        txtId.setCaretColor(new java.awt.Color(51, 51, 51));

        txtCódigo.setBackground(new java.awt.Color(225, 225, 225));
        txtCódigo.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        txtCódigo.setCaretColor(new java.awt.Color(51, 51, 51));

        lblCódigo.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        lblCódigo.setText("Código:");

        lblNom.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        lblNom.setText("Nombre:");

        txtNombre.setBackground(new java.awt.Color(225, 225, 225));
        txtNombre.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N

        txtDes.setBackground(new java.awt.Color(225, 225, 225));
        txtDes.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N

        lblDes.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        lblDes.setText("Descripción:");

        lblCantidad.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        lblCantidad.setText("Cantidad:");

        spCant.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        spCant.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));

        spUni.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        spUni.setModel(new javax.swing.SpinnerNumberModel(0.0d, 0.0d, null, 1.0d));

        lblPrecioU.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        lblPrecioU.setText("Precio unitario:");

        lblPrecioM.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        lblPrecioM.setText("Precio mayoreo:");

        spMayo.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        spMayo.setModel(new javax.swing.SpinnerNumberModel(0.0d, 0.0d, null, 1.0d));

        pImgInsert.setBackground(new java.awt.Color(225, 225, 225));

        imgFoto.setBackground(new java.awt.Color(225, 225, 225));

        javax.swing.GroupLayout pImgInsertLayout = new javax.swing.GroupLayout(pImgInsert);
        pImgInsert.setLayout(pImgInsertLayout);
        pImgInsertLayout.setHorizontalGroup(
            pImgInsertLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pImgInsertLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(imgFoto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        pImgInsertLayout.setVerticalGroup(
            pImgInsertLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(imgFoto, javax.swing.GroupLayout.DEFAULT_SIZE, 106, Short.MAX_VALUE)
        );

        btnSelecImg.setBackground(new java.awt.Color(0, 204, 0));
        btnSelecImg.setFont(new java.awt.Font("Montserrat", 1, 12)); // NOI18N
        btnSelecImg.setForeground(new java.awt.Color(255, 255, 255));
        btnSelecImg.setText("Imagen");
        btnSelecImg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSelecImgActionPerformed(evt);
            }
        });

        btnAgregar.setBackground(new java.awt.Color(0, 204, 0));
        btnAgregar.setFont(new java.awt.Font("Montserrat", 1, 12)); // NOI18N
        btnAgregar.setForeground(new java.awt.Color(255, 255, 255));
        btnAgregar.setText("Agregar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        btnAbrir.setBackground(new java.awt.Color(0, 204, 0));
        btnAbrir.setFont(new java.awt.Font("Montserrat", 1, 12)); // NOI18N
        btnAbrir.setForeground(new java.awt.Color(255, 255, 255));
        btnAbrir.setText("Abrir");
        btnAbrir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAbrirActionPerformed(evt);
            }
        });

        btnGuardar.setBackground(new java.awt.Color(0, 204, 0));
        btnGuardar.setFont(new java.awt.Font("Montserrat", 1, 12)); // NOI18N
        btnGuardar.setForeground(new java.awt.Color(255, 255, 255));
        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(pImgInsert, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnSelecImg, javax.swing.GroupLayout.DEFAULT_SIZE, 142, Short.MAX_VALUE)))
                    .addComponent(lblDes, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNom, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblCódigo, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblPrecioM, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblId, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(3, 3, 3)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtDes, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCódigo, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(lblAltas)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblPrecioU, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(3, 3, 3)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(spUni)
                                .addComponent(spMayo)
                                .addComponent(spCant, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnAbrir, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addComponent(pDatos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblAltas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblId))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblCódigo)
                            .addComponent(txtCódigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblNom)
                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(23, 23, 23)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblDes)
                            .addComponent(txtDes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblCantidad)
                            .addComponent(spCant, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblPrecioU)
                            .addComponent(spUni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblPrecioM)
                            .addComponent(spMayo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(pImgInsert, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(pDatos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnSelecImg)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAgregar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAbrir)
                    .addComponent(btnGuardar))
                .addGap(28, 28, 28))
        );

        lblTítulo.setFont(new java.awt.Font("Segoe UI Black", 1, 48)); // NOI18N
        lblTítulo.setForeground(new java.awt.Color(255, 255, 255));
        lblTítulo.setText("PRODUCTOS");

        lblÍcono.setIcon(new javax.swing.ImageIcon(getClass().getResource("/product1.png"))); // NOI18N

        btnColor.setBackground(new java.awt.Color(252, 252, 252));
        btnColor.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnColor.setText("Cambiar color");
        btnColor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnColorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pFondoLayout = new javax.swing.GroupLayout(pFondo);
        pFondo.setLayout(pFondoLayout);
        pFondoLayout.setHorizontalGroup(
            pFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pFondoLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(390, 390, 390)
                .addComponent(lblImg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(33, 33, 33))
            .addGroup(pFondoLayout.createSequentialGroup()
                .addGroup(pFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pFondoLayout.createSequentialGroup()
                        .addGap(245, 245, 245)
                        .addComponent(lblÍcono)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblTítulo, javax.swing.GroupLayout.PREFERRED_SIZE, 368, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pFondoLayout.createSequentialGroup()
                        .addGap(374, 374, 374)
                        .addComponent(btnColor)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pFondoLayout.setVerticalGroup(
            pFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pFondoLayout.createSequentialGroup()
                .addGroup(pFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pFondoLayout.createSequentialGroup()
                        .addGap(591, 591, 591)
                        .addComponent(lblImg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(pFondoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(pFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblTítulo)
                            .addGroup(pFondoLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblÍcono)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnColor, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 12, Short.MAX_VALUE)))
                .addContainerGap())
        );

        jMenu1.setText("Menú");

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.ALT_DOWN_MASK));
        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/venta.png"))); // NOI18N
        jMenuItem1.setText("Ventas");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

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
            .addComponent(pFondo, javax.swing.GroupLayout.PREFERRED_SIZE, 904, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pFondo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        frmVentas formulario = new frmVentas();
        formulario.setLocationRelativeTo(null);
        formulario.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        System.exit(0);
        setDefaultCloseOperation(frmProducto.EXIT_ON_CLOSE);                                    
    }//GEN-LAST:event_jMenuItem2ActionPerformed
 
    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
    try
    {
        id = Integer.parseInt(txtId.getText());
        código = (txtCódigo.getText());
        nombre = (txtNombre.getText());
        descripción = (txtDes.getText());
        cantidad = Integer.parseInt(spCant.getModel().getValue().toString());
        unitario = Double.parseDouble(spUni.getModel().getValue().toString());
        mayoreo =  Double.parseDouble(spMayo.getModel().getValue().toString());
        
        JLabel imgLabel = new JLabel();
        Image img = new ImageIcon(rutaArchivo).getImage(); 
            Image newimg = img.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH); 
            ImageIcon imageIcon = new ImageIcon(newimg);
            imgLabel.setIcon(imageIcon);
            tDatos.getColumn("Imagen").setCellRenderer(new LabelRendar());
        
        if(txtId.getText().length() != 0  && txtCódigo.getText().length() != 0  && txtNombre.getText().length() != 0 && txtDes.getText().length() != 0  && cantidad != 0 && unitario != 0 && mayoreo != 0 && rutaArchivo != null)
         {
              repetición = false;
              for (int i = 0; i < Negocio.NegocioProducto.lstProductos.size(); i++) 
                    {
                    if (id == (Negocio.NegocioProducto.lstProductos.get(i).getIdProducto()) || código.equals(Negocio.NegocioProducto.lstProductos.get(i).getCódigoProducto()) || nombre.equals(Negocio.NegocioProducto.lstProductos.get(i).getNombreProducto()))
                    {
                        repetición = true;
                    }
                    }
       
            if(repetición == false)
             {
       Negocio.NegocioProducto.lstProductos.add(new Producto(id, código, nombre, descripción, cantidad, unitario, mayoreo, rutaArchivo));
       
        model = (DefaultTableModel) tDatos.getModel();
                    model.addRow(new Object[]{nombre, cantidad, unitario, mayoreo, imgLabel});
        tDatos.setModel(model);
        updateRowHeights();
        
        JOptionPane.showMessageDialog(null, "Datos registrados.");
        limpiar();
              }
             else
              {
                JOptionPane.showMessageDialog(null, "Este producto ya existe."); 
              }
         }
        else
        { 
           determinarVacíos();
        } 
        }
    catch (NumberFormatException e){ JOptionPane.showMessageDialog(null, "Error: "+e.getMessage());
    }//GEN-LAST:event_btnAgregarActionPerformed
    }
    
    private void btnSelecImgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSelecImgActionPerformed
        fc = new JFileChooser();
        fc.setDialogTitle("Buscar imagen");
        
        if (fc.showOpenDialog(this) == JFileChooser.APPROVE_OPTION)
            {     
            rutaArchivo = fc.getSelectedFile().toString();
            File archivo = new File(fc.getSelectedFile().toString()); 
            escalarImagen(rutaArchivo);
            }
    }//GEN-LAST:event_btnSelecImgActionPerformed

    private void tDatosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tDatosMouseClicked
        JTable source = (JTable)evt.getSource();
        int row = source.rowAtPoint(evt.getPoint());
        nombre = Negocio.NegocioProducto.lstProductos.get(row).getNombreProducto();
        JOptionPane.showMessageDialog(null, "Nombre: "+nombre);
    }//GEN-LAST:event_tDatosMouseClicked

    private void btnAbrirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAbrirActionPerformed
        try
        {
            JFileChooser file=new JFileChooser();
            file.showOpenDialog(this);
            File abre=file.getSelectedFile();
            
            if(abre!=null)
            {
                FileReader archivos=new FileReader(abre);
                BufferedReader lee=new BufferedReader(archivos);
          
                txtId.setText(lee.readLine());
                txtCódigo.setText(lee.readLine());
                txtNombre.setText(lee.readLine());
                txtDes.setText(lee.readLine());
                spCant.setValue(Integer.parseInt(lee.readLine()));
                spUni.setValue(Double.parseDouble(lee.readLine()));
                spMayo.setValue(Double.parseDouble(lee.readLine()));
                rutaArchivo = lee.readLine();
                escalarImagen(rutaArchivo);
                lee.close();
            }
            
        }
        catch(IOException ex)
        {
            JOptionPane.showMessageDialog(null, ex+"" + "\n No se ha encontrado el archivo.", "¡ADVERTENCIA!",JOptionPane.WARNING_MESSAGE);
        }
         catch(HeadlessException | NumberFormatException ex) //Error general.
        {
            JOptionPane.showMessageDialog(null, ex+"" + "", "¡ADVERTENCIA!",JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnAbrirActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        try
        {
            JFileChooser file=new JFileChooser();
            file.showSaveDialog(this);
            File guarda =file.getSelectedFile();

            if(guarda !=null)
            {
                try (FileWriter save = new FileWriter(guarda+".txt")) {
                    save.write(txtId.getText()+"\n");
                    save.write(txtCódigo.getText()+"\n");
                    save.write(txtNombre.getText()+"\n");
                    save.write(txtDes.getText()+"\n");
                    save.write(spCant.getModel().getValue().toString()+"\n");
                    save.write(spUni.getModel().getValue().toString()+"\n");
                    save.write(spMayo.getModel().getValue().toString()+"\n");
                    save.write(rutaArchivo+"\n");
                }
              JOptionPane.showMessageDialog(null,
                   "El archivo se ha guardado.",
                       "Información",JOptionPane.INFORMATION_MESSAGE);
              }
        }
         catch(IOException ex)
         {
          JOptionPane.showMessageDialog(null,
                  "Su archivo no se ha guardado.",
                  "¡ADVERTENCIA!",JOptionPane.WARNING_MESSAGE);
         }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnColorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnColorActionPerformed
        Color color=JColorChooser.showDialog(null, "Seleccione un color", Color.gray);
        lblTítulo.setForeground(color);
        txtId.setForeground(color);
        txtCódigo.setForeground(color);
        txtNombre.setForeground(color);
        txtDes.setForeground(color);
        spCant.setForeground(color);
        spUni.setForeground(color);
        spMayo.setForeground(color);
        DefaultTableCellRenderer cellcolor = new DefaultTableCellRenderer();
        cellcolor.setForeground(color);
        tDatos.getColumnModel().getColumn(0).setCellRenderer(cellcolor);
        tDatos.getColumnModel().getColumn(1).setCellRenderer(cellcolor);
        tDatos.getColumnModel().getColumn(2).setCellRenderer(cellcolor);
        tDatos.getColumnModel().getColumn(3).setCellRenderer(cellcolor);
    }//GEN-LAST:event_btnColorActionPerformed

    private void limpiar(){
        txtId.setText("");
        txtCódigo.setText("");
        txtNombre.setText("");
        txtDes.setText("");
        spCant.setValue(0);
        spUni.setValue(0);
        spMayo.setValue(0);
        rutaArchivo = null;
        imgFoto.setIcon(null);
        imgLabel.setIcon(null);
    }
    
    private void updateRowHeights(){
      JTable table  =  tDatos;
      
        for (int row = 0; row < table.getRowCount(); row++)
        {
            int rowHeight = table.getRowHeight();

            for (int column = 0; column < table.getColumnCount(); column++)
            {
                Component comp = table.prepareRenderer(table.getCellRenderer(row, column), row, column);
                rowHeight = Math.max(rowHeight, comp.getPreferredSize().height);
            }
            table.setRowHeight(row, rowHeight);
        }
   }
    
    private void escalarImagen(String urlFile){ 
        JLabel imgLabel = new JLabel(); 
        Image img = new ImageIcon(urlFile).getImage(); 
        Image newimg = img.getScaledInstance(130, 106, java.awt.Image.SCALE_SMOOTH); 
        ImageIcon imageIcon = new ImageIcon(newimg);
        imgFoto.setIcon(imageIcon);
    }
    
    private void determinarVacíos(){
        if(txtId.getText().length() == 0)
         {
            JOptionPane.showMessageDialog(null, "Falta id.");
         }
        if(txtCódigo.getText().length() == 0)
         {
            JOptionPane.showMessageDialog(null, "Falta código.");
         }
         if(txtNombre.getText().length() == 0)
         {
            JOptionPane.showMessageDialog(null, "Falta nombre.");
         }
        if(txtDes.getText().length() == 0)
         {
            JOptionPane.showMessageDialog(null, "Falta descripción.");
         }
        if(cantidad == 0)
         {
            JOptionPane.showMessageDialog(null, "Cantidad no designada.");
         } 
        if(unitario == 0)
         {
            JOptionPane.showMessageDialog(null, "Precio unitario no delimitado.");
         }
        if(mayoreo == 0)
         {
            JOptionPane.showMessageDialog(null, "Precio mayoreo no definido.");
         }
        if(rutaArchivo == null)
         {
            JOptionPane.showMessageDialog(null, "Imagen no seleccionada.");
         }
    }
    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                frmProducto dialog = new frmProducto(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton btnAbrir;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnColor;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnSelecImg;
    private javax.swing.JLabel imgFoto;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblAltas;
    private javax.swing.JLabel lblCantidad;
    private javax.swing.JLabel lblCódigo;
    private javax.swing.JLabel lblDes;
    private javax.swing.JLabel lblId;
    private javax.swing.JLabel lblImg;
    private javax.swing.JLabel lblNom;
    private javax.swing.JLabel lblPrecioM;
    private javax.swing.JLabel lblPrecioU;
    private javax.swing.JLabel lblTítulo;
    private javax.swing.JLabel lblÍcono;
    private javax.swing.JPanel pDatos;
    private javax.swing.JPanel pFondo;
    private javax.swing.JPanel pImgInsert;
    private javax.swing.JSpinner spCant;
    private javax.swing.JSpinner spMayo;
    private javax.swing.JSpinner spUni;
    private javax.swing.JTable tDatos;
    private javax.swing.JTextField txtCódigo;
    private javax.swing.JTextField txtDes;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}

class LabelRendar implements TableCellRenderer{
    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) 
    {
       return (Component)value;
    }
}
