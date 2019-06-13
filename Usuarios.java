package usuarios;

import static alimentos.Alimentos.codigo;
import static alimentos.Alimentos.tablaAlimentos;
import alimentos.OpcionesAl;
import java.awt.Cursor;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

/**
 *
 * @author Jonh
 */
public final class Usuarios extends javax.swing.JInternalFrame {


    public Usuarios() {
        initComponents();
        tablaUsuarios.getTableHeader().setDefaultRenderer(new principal.EstiloTablaHeader());
        tablaUsuarios.setDefaultRenderer(Object.class, new principal.EstiloTablaRenderer());
        this.sexo.setCursor(new Cursor(12));
        this.tipoUs.setCursor(new Cursor(12));       
        tablaUsuarios.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        jPopupMenu1.add(menu);
         OpcionesUs.listarUsuario("");
        
        
       

        tablaUsuarios.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent lse) {
                if (tablaUsuarios.getSelectedRow() != -1) {
                    cambiaDatos();
                    selecionRegistro = true;
                }
            }
        });
    }

    void cambiaDatos() {
        int fila = tablaUsuarios.getSelectedRow();
        codigo.setText(tablaUsuarios.getValueAt(fila, 0).toString());
        nombre.setText(tablaUsuarios.getValueAt(fila, 1).toString());
        sexo.setSelectedItem(tablaUsuarios.getValueAt(fila, 2).toString());
        tipoUs.setSelectedItem(tablaUsuarios.getValueAt(fila, 3).toString());
        buscar.setText(tablaUsuarios.getValueAt(fila, 4).toString());
    }

    void limpiaCampos() {
        if (tablaUsuarios.getSelectedRow() > -1) {
            tablaUsuarios.removeRowSelectionInterval(tablaUsuarios.getSelectedRow(), tablaUsuarios.getSelectedRow());
        }
        codigo.setText("");
        nombre.setText("");
        sexo.setSelectedItem("SEXO");
        tipoUs.setSelectedItem("TIPO USUARIO");
        buscar.setText("");
        buscar.setText("");
        pass.setText("");
        selecionRegistro = false;
        OpcionesUs.listarUsuario("");
        //OpcionesUs.extraerID();
    }

    void selecionaFila(String id) {
        for (int i = 0; i < tablaUsuarios.getRowCount(); i++) {
            if (id.equals(tablaUsuarios.getValueAt(i, 0))) {
                tablaUsuarios.setRowSelectionInterval(i, i);
                break;
            }
        }

    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        menu = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        eliminar = new rojerusan.RSButtonHover();
        jPopupMenu1 = new javax.swing.JPopupMenu();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        rSPanelImage1 = new rojerusan.RSPanelImage();
        registrar = new rojerusan.RSButtonHover();
        buscar = new rscomponentshade.RSTextFieldShade();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaUsuarios = new javax.swing.JTable();
        codigo = new rscomponentshade.RSTextFieldShade();
        nombre = new rscomponentshade.RSTextFieldShade();
        tipoUs = new rojerusan.RSComboMetro();
        sexo = new rojerusan.RSComboMetro();
        pass = new rscomponentshade.RSTextFieldShade();
        jPanel5 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        rSButtonRiple1 = new rojeru_san.RSButtonRiple();
        eliminarT = new rojerusan.RSButtonHover();
        actualizar = new rojerusan.RSButtonHover();

        menu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel6.setBackground(new java.awt.Color(0, 204, 0));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        eliminar.setBackground(new java.awt.Color(255, 109, 0));
        eliminar.setText("E L I M I N A R");
        eliminar.setColorHover(new java.awt.Color(139, 195, 111));
        eliminar.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarActionPerformed(evt);
            }
        });
        jPanel6.add(eliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 49));

        menu.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        setOpaque(true);
        setVisible(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createMatteBorder(5, 5, 5, 5, new java.awt.Color(43, 189, 126)));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "REGISTRO", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        rSPanelImage1.setImagen(new javax.swing.ImageIcon(getClass().getResource("/imagenes2/presentacion.png"))); // NOI18N

        javax.swing.GroupLayout rSPanelImage1Layout = new javax.swing.GroupLayout(rSPanelImage1);
        rSPanelImage1.setLayout(rSPanelImage1Layout);
        rSPanelImage1Layout.setHorizontalGroup(
            rSPanelImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 251, Short.MAX_VALUE)
        );
        rSPanelImage1Layout.setVerticalGroup(
            rSPanelImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 244, Short.MAX_VALUE)
        );

        registrar.setBackground(new java.awt.Color(255, 109, 0));
        registrar.setText("R E G I S T R A R");
        registrar.setColorHover(new java.awt.Color(139, 195, 111));
        registrar.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        registrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrarActionPerformed(evt);
            }
        });

        buscar.setBgShade(new java.awt.Color(0, 204, 0));
        buscar.setBgShadeHover(new java.awt.Color(255, 109, 0));
        buscar.setDisabledTextColor(new java.awt.Color(255, 109, 0));
        buscar.setPlaceholder("B U S C A R");
        buscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buscarMouseClicked(evt);
            }
        });
        buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarActionPerformed(evt);
            }
        });
        buscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                buscarKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                buscarKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                buscarKeyTyped(evt);
            }
        });

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createMatteBorder(5, 5, 5, 5, new java.awt.Color(43, 189, 126)));

        tablaUsuarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CÓDIGO", "NOMBRE USUARIO", "SEXO", "TIPO USUARIO", "CONTRASEÑA"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaUsuarios.setComponentPopupMenu(jPopupMenu1);
        tablaUsuarios.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jScrollPane1.setViewportView(tablaUsuarios);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 704, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );

        codigo.setForeground(new java.awt.Color(104, 177, 67));
        codigo.setBgShade(new java.awt.Color(104, 177, 67));
        codigo.setBgShadeHover(new java.awt.Color(255, 109, 0));
        codigo.setDisabledTextColor(new java.awt.Color(255, 109, 0));
        codigo.setPlaceholder("C O D I G O");
        codigo.setSelectionColor(new java.awt.Color(104, 177, 67));
        codigo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                codigoMouseClicked(evt);
            }
        });
        codigo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                codigoKeyReleased(evt);
            }
        });

        nombre.setForeground(new java.awt.Color(0, 204, 0));
        nombre.setBgShade(new java.awt.Color(104, 177, 67));
        nombre.setBgShadeHover(new java.awt.Color(255, 109, 0));
        nombre.setDisabledTextColor(new java.awt.Color(255, 109, 0));
        nombre.setPlaceholder("N O M B R E");
        nombre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                nombreMouseClicked(evt);
            }
        });
        nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombreActionPerformed(evt);
            }
        });
        nombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                nombreKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                nombreKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                nombreKeyTyped(evt);
            }
        });

        tipoUs.setBackground(new java.awt.Color(0, 204, 0));
        tipoUs.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "TIPO USUARIO", "ADMINISTRADOR", "CLIENTE" }));
        tipoUs.setToolTipText("");
        tipoUs.setColorArrow(new java.awt.Color(104, 177, 67));
        tipoUs.setColorBorde(new java.awt.Color(102, 102, 102));
        tipoUs.setColorFondo(new java.awt.Color(104, 177, 67));
        tipoUs.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 11)); // NOI18N

        sexo.setBackground(new java.awt.Color(0, 204, 0));
        sexo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "SEXO", "MASCULINO", "FEMENINO" }));
        sexo.setColorArrow(new java.awt.Color(104, 177, 67));
        sexo.setColorBorde(new java.awt.Color(102, 102, 102));
        sexo.setColorFondo(new java.awt.Color(104, 177, 67));
        sexo.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 11)); // NOI18N

        pass.setForeground(new java.awt.Color(0, 204, 0));
        pass.setBgShade(new java.awt.Color(0, 204, 0));
        pass.setBgShadeHover(new java.awt.Color(255, 109, 0));
        pass.setDisabledTextColor(new java.awt.Color(255, 109, 0));
        pass.setPlaceholder("C O N T R A S E Ñ A");
        pass.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                passMouseClicked(evt);
            }
        });
        pass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passActionPerformed(evt);
            }
        });
        pass.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                passKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                passKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                passKeyTyped(evt);
            }
        });

        jPanel5.setBackground(new java.awt.Color(255, 109, 0));

        jLabel1.setFont(new java.awt.Font("Ink Free", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("U S U A R I O S");

        rSButtonRiple1.setBackground(new java.awt.Color(0, 204, 0));
        rSButtonRiple1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 102, 102)));
        rSButtonRiple1.setForeground(new java.awt.Color(255, 51, 153));
        rSButtonRiple1.setText("X");
        rSButtonRiple1.setColorHover(new java.awt.Color(255, 255, 255));
        rSButtonRiple1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonRiple1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(rSButtonRiple1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rSButtonRiple1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        eliminarT.setBackground(new java.awt.Color(255, 109, 0));
        eliminarT.setText("ELIMINAR TODO");
        eliminarT.setColorHover(new java.awt.Color(139, 195, 111));
        eliminarT.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        eliminarT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarTActionPerformed(evt);
            }
        });

        actualizar.setBackground(new java.awt.Color(255, 109, 0));
        actualizar.setText("E D I T A R");
        actualizar.setColorHover(new java.awt.Color(139, 195, 111));
        actualizar.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        actualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actualizarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(rSPanelImage1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 331, Short.MAX_VALUE)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(codigo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(nombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(sexo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(tipoUs, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(pass, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(registrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(actualizar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(eliminarT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rSPanelImage1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(eliminarT, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(actualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(codigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(sexo, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tipoUs, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(registrar, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 38, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
boolean selecionRegistro = false;
    private void registrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrarActionPerformed
        if (selecionRegistro) {
            JOptionPane.showMessageDialog(this, "El CODIGO: " + this.codigo.getText() + "\nya existe en un registro.", "Usuarios", 0,
                    new ImageIcon(getClass().getResource("/imagenes/usuarios/impo.png")));
        } else {
            //getPassword()
            String pas = new String(pass.getText());
            if (codigo.getText().equals("") || nombre.getText().equals("") || sexo.getSelectedItem().equals("SEXO")
                    || tipoUs.getSelectedItem().equals("TIPO USUARIO") || pas.equals("")) {
                JOptionPane.showMessageDialog(this, "Todos los campos\nson obligatorios.", "Usuarios", 0,
                        new ImageIcon(getClass().getResource("/imagenes/usuarios/info.png")));
            } else {
                usuarios.UsuariosCod us = new UsuariosCod();
                us.setPrimaryKey(codigo.getText());
                us.setNombre(nombre.getText());
                us.setSexo(sexo.getSelectedItem().toString());
                us.setTipouser(tipoUs.getSelectedItem().toString());
                us.setPassword(pas);
                int opcion = OpcionesUs.registrarUsuario(us);
                if (opcion != 0) {
                    String id = codigo.getText();
                    limpiaCampos();
                    selecionaFila(id);
                    JOptionPane.showMessageDialog(this, "Registro éxitoso.", "Usuarios", 0,
                            new ImageIcon(getClass().getResource("/imagenes/usuarios/registrado.png")));
                    limpiaCampos();
                    
                }
                
            }
        }
    }//GEN-LAST:event_registrarActionPerformed

    private void nombreMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nombreMouseClicked

    }//GEN-LAST:event_nombreMouseClicked

    private void nombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombreActionPerformed

    private void nombreKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nombreKeyPressed
      //  nombre.setText(nombre.getText().toUpperCase());
    }//GEN-LAST:event_nombreKeyPressed

    private void nombreKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nombreKeyReleased
        nombre.setText(nombre.getText().toUpperCase());
        
    }//GEN-LAST:event_nombreKeyReleased

    private void buscarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buscarMouseClicked
        limpiaCampos();
    }//GEN-LAST:event_buscarMouseClicked

    private void buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buscarActionPerformed

    private void buscarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_buscarKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_buscarKeyPressed

    private void buscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_buscarKeyReleased
        buscar.setText(buscar.getText().toUpperCase());
        OpcionesUs.listarUsuario(buscar.getText());
    }//GEN-LAST:event_buscarKeyReleased

    private void buscarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_buscarKeyTyped
        char num = evt.getKeyChar();
        char letras = evt.getKeyChar();
        if ((num < '0' || num > '9') && ((letras < 'a' || letras > 'z') && (letras < 'A' | letras > 'Z'))) {
            if ((letras != 'ñ') && (letras != 'Ñ') && (letras != '.') && (letras != ',')) {
                evt.consume();
            }
        }
    }//GEN-LAST:event_buscarKeyTyped

    private void passMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_passMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_passMouseClicked

    private void passActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passActionPerformed

    private void passKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_passKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_passKeyPressed

    private void passKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_passKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_passKeyReleased

    private void passKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_passKeyTyped
         char num = evt.getKeyChar();
        char letras = evt.getKeyChar();
        if ((num < '0' || num > '9') && ((letras < 'a' || letras > 'z') && (letras < 'A' | letras > 'Z'))) {
            if ((letras != 'ñ') && (letras != 'Ñ') && (letras != '.') && (letras != ',')) {
                evt.consume();
            }
        }
    }//GEN-LAST:event_passKeyTyped

    private void codigoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_codigoMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_codigoMouseClicked

    private void codigoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_codigoKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_codigoKeyReleased

    private void nombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nombreKeyTyped
        char letras = evt.getKeyChar();
        if ((letras < 'a' || letras > 'z') && (letras < 'A' | letras > 'Z')) {
            if ((letras != 'ñ') && (letras != 'Ñ') && (letras != 'á') && (letras != 'Á') && (letras != 'é') && (letras != 'É') && (letras != 'í')
                && (letras != 'Í') && (letras != 'ó') && (letras != 'Ó') && (letras != 'ú') && (letras != 'Ú') && (letras != ' ')) {
                evt.consume();
            }
        }
    }//GEN-LAST:event_nombreKeyTyped

    private void eliminarTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarTActionPerformed
        if (tablaUsuarios.getRowCount() > 0) {
            if (JOptionPane.showConfirmDialog(this, "Esta a punto de elimnar\ntodos los registros.\n¿Desea continuar?", "Usuarios", JOptionPane.YES_NO_OPTION, 0,
                    new ImageIcon(getClass().getResource("/imagenes/usuarios/seguro.png"))) == JOptionPane.YES_OPTION) {
                int eliminaT = OpcionesUs.eliminaTodos();
                if (eliminaT != 0) {
                    limpiaCampos();
                    JOptionPane.showMessageDialog(this, "Registros eliminados.", "Usuarios", 0,
                            new ImageIcon(getClass().getResource("/imagenes/usuarios/borrado.png")));
                }
            }
        } else {
            JOptionPane.showMessageDialog(this, "No hay registros\npara eliminar.", "Usuarios", 0,
                    new ImageIcon(getClass().getResource("/imagenes/usuarios/info.png")));
        }
    }//GEN-LAST:event_eliminarTActionPerformed

    private void eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarActionPerformed
        if (tablaUsuarios.getRowCount() > 0) {
            if (tablaUsuarios.getSelectedRowCount() > 0) {
                if (JOptionPane.showConfirmDialog(this, "Esta a punto de eliminar\nun registro.\n¿Desea continuar?", "Usuarios", JOptionPane.YES_NO_OPTION, 0,
                        new ImageIcon(getClass().getResource("/imagenes/usuarios/seguro.png"))) == JOptionPane.YES_OPTION) {
                    int fila = tablaUsuarios.getSelectedRow();
                    String id = tablaUsuarios.getValueAt(fila, 0).toString();
                    int elimina = OpcionesUs.eliminarUsuario(id);
                    if (elimina != 0) {
                        limpiaCampos();
                        JOptionPane.showMessageDialog(this, "Registro eliminado.", "Usuarios", 0,
                                new ImageIcon(getClass().getResource("/imagenes/usuarios/borrado1.png")));
                    }
                }
            } else {
                JOptionPane.showMessageDialog(this, "Seleccione un registro.", "Usuarios", 0,
                        new ImageIcon(getClass().getResource("/imagenes/usuarios/info.png")));
            }

        } else {
            JOptionPane.showMessageDialog(this, "No hay registros\npara eliminar.", "Usuarios", 0,
                    new ImageIcon(getClass().getResource("/imagenes/usuarios/info.png")));
        }
    }//GEN-LAST:event_eliminarActionPerformed

    private void rSButtonRiple1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonRiple1ActionPerformed
        dispose();
    }//GEN-LAST:event_rSButtonRiple1ActionPerformed

    private void actualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_actualizarActionPerformed
        if (tablaUsuarios.getRowCount() > 0) {
            if (tablaUsuarios.getSelectedRowCount() > 0) {
                String pas = new String(buscar.getText());
                if (codigo.getText().equals("") || nombre.getText().equals("") || sexo.getSelectedItem().equals("SEXO")
                        || tipoUs.getSelectedItem().equals("TIPO USUARIO") || pas.equals("")) {
                    JOptionPane.showMessageDialog(this, "Es necesario completar\ntodos los campos.", "Usuarios", 0,
                            new ImageIcon(getClass().getResource("/imagenes/usuarios/info.png")));
                } else if (JOptionPane.showConfirmDialog(this, "Esta a punto de actualizar\nun registro.\n¿Desea continuar?", "Usuarios", JOptionPane.YES_NO_OPTION, 0,
                        new ImageIcon(getClass().getResource("/imagenes/usuarios/seguro.png"))) == JOptionPane.YES_OPTION) {
                    usuarios.UsuariosCod us = new UsuariosCod();
                    us.setPrimaryKey(codigo.getText());
                    us.setNombre(nombre.getText());
                    us.setSexo(sexo.getSelectedItem().toString());
                    us.setTipouser(tipoUs.getSelectedItem().toString());
                    us.setPassword(pas);
                    int opcion = OpcionesUs.actualizarUsuario(us);
                    if (opcion != 0) {
                        String id = codigo.getText();
                        limpiaCampos();
                        selecionaFila(id);
                        JOptionPane.showMessageDialog(this, "Registro actualizado.", "Usuarios", 0,
                                new ImageIcon(getClass().getResource("/imagenes/usuarios/actualizado.png")));
                        
                    }
                }
            } else {
                JOptionPane.showMessageDialog(this, "Seleccione un registro.", "Usuarios", 0,
                        new ImageIcon(getClass().getResource("/imagenes/usuarios/info.png")));
            }

        } else {
            JOptionPane.showMessageDialog(this, "No hay registros\npara actualizar.", "Usuarios", 0,
                    new ImageIcon(getClass().getResource("/imagenes/usuarios/info.png")));
        }
        limpiaCampos();
    }//GEN-LAST:event_actualizarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private rojerusan.RSButtonHover actualizar;
    private rscomponentshade.RSTextFieldShade buscar;
    private rscomponentshade.RSTextFieldShade codigo;
    private rojerusan.RSButtonHover eliminar;
    private rojerusan.RSButtonHover eliminarT;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel menu;
    private rscomponentshade.RSTextFieldShade nombre;
    private rscomponentshade.RSTextFieldShade pass;
    private rojeru_san.RSButtonRiple rSButtonRiple1;
    private rojerusan.RSPanelImage rSPanelImage1;
    private rojerusan.RSButtonHover registrar;
    private rojerusan.RSComboMetro sexo;
    public static javax.swing.JTable tablaUsuarios;
    private rojerusan.RSComboMetro tipoUs;
    // End of variables declaration//GEN-END:variables
}
