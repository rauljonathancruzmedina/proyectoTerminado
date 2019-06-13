package usuarios;

import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import principal.GenerarCodigos;
import principal.conectar;
import static usuarios.Usuarios.tablaUsuarios;

/**
 *
 * @author John
 */
public class agregarUsuario extends javax.swing.JFrame {

     static conectar cc = new conectar();
    static Connection cn = cc.conexion();
    static PreparedStatement ps;
    private ImageIcon imagenicon;
    
    public agregarUsuario() {
        initComponents();
       
         imagenicon = new ImageIcon(this.getClass().getResource("/imagenes2/Imagen1.png"));
        this.setIconImage(imagenicon.getImage());
       OpcionesUs.listarUsuario("");
       rsutilities.RSUtilities.setCentrarVentana(this);
       rsutilities.RSUtilities.setMoverVentana(this);
       rsutilities.RSUtilities.setOpaqueVentana(this, false);
       
//       sexo.addItemListener(new ItemListener() {
//
//            @Override
//            public void itemStateChanged(ItemEvent ie) {
//                if (sexo.getSelectedItem().equals("SEXO")) {
//                    sexoL.setIcon(new ImageIcon(getClass().getResource("/imagenes/usuarios/sexoL.png")));
//                    nombreL.setIcon(new ImageIcon(getClass().getResource("/imagenes/usuarios/nomUs.png")));
//                }
//                if (sexo.getSelectedItem().equals("MASCULINO")) {
//                    sexoL.setIcon(new ImageIcon(getClass().getResource("/imagenes/usuarios/masL.png")));
//                    nombreL.setIcon(new ImageIcon(getClass().getResource("/imagenes/usuarios/usMas.png")));
//                }
//                if (sexo.getSelectedItem().equals("FEMENINO")) {
//                    sexoL.setIcon(new ImageIcon(getClass().getResource("/imagenes/usuarios/femL.png")));
//                    nombreL.setIcon(new ImageIcon(getClass().getResource("/imagenes/usuarios/usFem.png")));
//                }
//            }
//        });
//
//        tipoUs.addItemListener(new ItemListener() {
//
//            @Override
//            public void itemStateChanged(ItemEvent ie) {
//                if (tipoUs.getSelectedItem().equals("TIPO USUARIO")) {
//                    tipoUsL.setIcon(new ImageIcon(getClass().getResource("/imagenes/usuarios/tipousL.png")));
//                }
//                if (tipoUs.getSelectedItem().equals("ADMINISTRADOR")) {
//                    tipoUsL.setIcon(new ImageIcon(getClass().getResource("/imagenes/usuarios/administrador.png")));
//                }
//                if (tipoUs.getSelectedItem().equals("NORMAL")) {
//                    tipoUsL.setIcon(new ImageIcon(getClass().getResource("/imagenes/usuarios/normal.png")));
//                }
//            }
//        });
//
//        tablaUsuarios.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
//            @Override
//            public void valueChanged(ListSelectionEvent lse) {
//                if (tablaUsuarios.getSelectedRow() != -1) {
//                    cambiaDatos();
//                    selecionRegistro = true;
//                }
//            }
//        });
    }
    
    void cambiaDatos() {
        int fila = tablaUsuarios.getSelectedRow();
        codigo.setText(tablaUsuarios.getValueAt(fila, 0).toString());
        nombre.setText(tablaUsuarios.getValueAt(fila, 1).toString());
        sexo.setSelectedItem(tablaUsuarios.getValueAt(fila, 2).toString());
        tipoUs.setSelectedItem(tablaUsuarios.getValueAt(fila, 3).toString());
        pass.setText(tablaUsuarios.getValueAt(fila, 4).toString());
    }

    void limpiaCampos() {
        if (tablaUsuarios.getSelectedRow() > -1) {
            tablaUsuarios.removeRowSelectionInterval(tablaUsuarios.getSelectedRow(), tablaUsuarios.getSelectedRow());
        }
        codigo.setText("");
        nombre.setText("");
        sexo.setSelectedItem("SEXO");
        tipoUs.setSelectedItem("TIPO USUARIO");
        pass.setText("");
        //buscar.setText("");
        selecionRegistro = false;
        OpcionesUs.listarUsuario("");
//        OpcionesUs.extraerID();
    }
    String codigAA;
    
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

        jPanel1 = new javax.swing.JPanel();
        rSPanelImage1 = new rojerusan.RSPanelImage();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        registrar = new rojerusan.RSButtonHover();
        rSButtonHover1 = new rojerusan.RSButtonHover();
        nombre = new rscomponentshade.RSTextFieldShade();
        codigo = new rscomponentshade.RSTextFieldShade();
        sexo = new rojerusan.RSComboMetro();
        tipoUs = new rojerusan.RSComboMetro();
        pass = new rscomponentshade.RSTextFieldShade();
        eliminarT = new rojerusan.RSButtonHover();
        Btn_nuevo = new rojerusan.RSButtonHover();
        buscar = new rscomponentshade.RSTextFieldShade();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        rSPanelImage1.setImagen(new javax.swing.ImageIcon(getClass().getResource("/imagenes2/presentacion.png"))); // NOI18N

        javax.swing.GroupLayout rSPanelImage1Layout = new javax.swing.GroupLayout(rSPanelImage1);
        rSPanelImage1.setLayout(rSPanelImage1Layout);
        rSPanelImage1Layout.setHorizontalGroup(
            rSPanelImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        rSPanelImage1Layout.setVerticalGroup(
            rSPanelImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel2.setBackground(new java.awt.Color(104, 177, 67));
        jPanel2.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 0, new java.awt.Color(0, 0, 0)));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Segoe Script", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("A G R E G A R   U S U A R I O S ");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 473, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        registrar.setBackground(new java.awt.Color(104, 177, 67));
        registrar.setText("G U A R D A R ");
        registrar.setColorHover(new java.awt.Color(139, 195, 111));
        registrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrarActionPerformed(evt);
            }
        });

        rSButtonHover1.setBackground(new java.awt.Color(245, 2, 28));
        rSButtonHover1.setText("C A N C E L A R ");
        rSButtonHover1.setColorHover(new java.awt.Color(234, 113, 115));
        rSButtonHover1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonHover1ActionPerformed(evt);
            }
        });

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
        });

        codigo.setDisabledTextColor(new java.awt.Color(255, 109, 0));
        codigo.setPlaceholder("C O D I G O");
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

        sexo.setBackground(new java.awt.Color(0, 204, 0));
        sexo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "SEXO", "MASCULINO", "FEMENINO" }));
        sexo.setColorArrow(new java.awt.Color(104, 177, 67));
        sexo.setColorBorde(new java.awt.Color(102, 102, 102));
        sexo.setColorFondo(new java.awt.Color(104, 177, 67));
        sexo.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 11)); // NOI18N

        tipoUs.setBackground(new java.awt.Color(0, 204, 0));
        tipoUs.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "TIPO USUARIO", "ADMINISTRADOR", "NORMAL" }));
        tipoUs.setToolTipText("");
        tipoUs.setColorArrow(new java.awt.Color(104, 177, 67));
        tipoUs.setColorBorde(new java.awt.Color(102, 102, 102));
        tipoUs.setColorFondo(new java.awt.Color(104, 177, 67));
        tipoUs.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 11)); // NOI18N

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

        eliminarT.setBackground(new java.awt.Color(255, 109, 0));
        eliminarT.setText("E L I M I N A R   T O D O ");
        eliminarT.setColorHover(new java.awt.Color(139, 195, 111));
        eliminarT.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        eliminarT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarTActionPerformed(evt);
            }
        });

        Btn_nuevo.setBackground(new java.awt.Color(255, 109, 0));
        Btn_nuevo.setText("N U E V O");
        Btn_nuevo.setColorHover(new java.awt.Color(139, 195, 111));
        Btn_nuevo.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Btn_nuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_nuevoActionPerformed(evt);
            }
        });

        buscar.setDisabledTextColor(new java.awt.Color(255, 109, 0));
        buscar.setPlaceholder("B U S C A R ");
        buscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buscarMouseClicked(evt);
            }
        });
        buscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                buscarKeyReleased(evt);
            }
        });

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes2/x64-buscar.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(rSPanelImage1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nombre, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(codigo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pass, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sexo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tipoUs, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(rSButtonHover1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(registrar, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(Btn_nuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(eliminarT, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel2)))
                .addContainerGap(77, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(codigo, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(pass, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(sexo, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tipoUs, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(rSPanelImage1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(eliminarT, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Btn_nuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(registrar, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rSButtonHover1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
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

    private void rSButtonHover1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonHover1ActionPerformed
        dispose();
    }//GEN-LAST:event_rSButtonHover1ActionPerformed

    private void nombreMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nombreMouseClicked
    
    }//GEN-LAST:event_nombreMouseClicked

    private void nombreKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nombreKeyReleased
       char letras = evt.getKeyChar();
        if ((letras < 'a' || letras > 'z') && (letras < 'A' | letras > 'Z')) {
            if ((letras != 'ñ') && (letras != 'Ñ') && (letras != 'á') && (letras != 'Á') && (letras != 'é') && (letras != 'É') && (letras != 'í')
                    && (letras != 'Í') && (letras != 'ó') && (letras != 'Ó') && (letras != 'ú') && (letras != 'Ú') && (letras != ' ')) {
                evt.consume();
            }
        }
    }//GEN-LAST:event_nombreKeyReleased

    private void codigoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_codigoMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_codigoMouseClicked

    private void codigoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_codigoKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_codigoKeyReleased

    private void nombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombreActionPerformed

    private void nombreKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nombreKeyPressed
        nombre.setText(nombre.getText().toUpperCase());
    }//GEN-LAST:event_nombreKeyPressed

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
                    
                }
                dispose();
            }
        }
        
    }//GEN-LAST:event_registrarActionPerformed

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

    private void Btn_nuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_nuevoActionPerformed
        new agregarUsuario().setVisible(true);
    }//GEN-LAST:event_Btn_nuevoActionPerformed

    private void buscarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buscarMouseClicked
        limpiaCampos();
    }//GEN-LAST:event_buscarMouseClicked

    private void buscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_buscarKeyReleased
        buscar.setText(buscar.getText().toUpperCase());
        OpcionesUs.listarUsuario(buscar.getText());
    }//GEN-LAST:event_buscarKeyReleased

    
     
    
    
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
            java.util.logging.Logger.getLogger(agregarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(agregarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(agregarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(agregarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new agregarUsuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private rojerusan.RSButtonHover Btn_nuevo;
    private rscomponentshade.RSTextFieldShade buscar;
    private rscomponentshade.RSTextFieldShade codigo;
    private rojerusan.RSButtonHover eliminarT;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private rscomponentshade.RSTextFieldShade nombre;
    private rscomponentshade.RSTextFieldShade pass;
    private rojerusan.RSButtonHover rSButtonHover1;
    private rojerusan.RSPanelImage rSPanelImage1;
    private rojerusan.RSButtonHover registrar;
    private rojerusan.RSComboMetro sexo;
    private rojerusan.RSComboMetro tipoUs;
    // End of variables declaration//GEN-END:variables
}
