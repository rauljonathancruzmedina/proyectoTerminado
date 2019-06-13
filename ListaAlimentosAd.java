
package alimentos;

import java.awt.Cursor;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;
import usuarios.*;
import ventas.CajaAd;

/**
 *
 * @author Jonh
 */
public class ListaAlimentosAd extends javax.swing.JInternalFrame {
    public ListaAlimentosAd() {
        initComponents();
        tablaAlimentos.getTableHeader().setDefaultRenderer(new principal.EstiloTablaHeader());
        tablaAlimentos.setDefaultRenderer(Object.class, new principal.EstiloTablaRenderer());
        //this.tipoAl.setCursor(new Cursor(12));
        tablaAlimentos.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        OpcionesAl.listar2("");

        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        rSButtonRiple1 = new rojeru_san.RSButtonRiple();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaAlimentos = new javax.swing.JTable();
        enviar1 = new rojerusan.RSButtonHover();
        buscar = new rscomponentshade.RSTextFieldShade();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel7.setBackground(new java.awt.Color(104, 177, 67));

        jLabel2.setFont(new java.awt.Font("Ink Free", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("M E N Ù  D E L   D I A");

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

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 619, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(rSButtonRiple1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rSButtonRiple1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createMatteBorder(8, 8, 8, 8, new java.awt.Color(43, 189, 126)));

        tablaAlimentos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CÓDIGO", "TIPO ALIMENTO", "NOMBRE ALIMENTO", "PRECIO $"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaAlimentos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jScrollPane1.setViewportView(tablaAlimentos);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 704, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 214, Short.MAX_VALUE)
        );

        enviar1.setBackground(new java.awt.Color(255, 109, 0));
        enviar1.setText("O R D E N A R");
        enviar1.setColorHover(new java.awt.Color(139, 195, 111));
        enviar1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        enviar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enviar1ActionPerformed(evt);
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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(506, 506, 506)
                .addComponent(enviar1, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                        .addComponent(enviar1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(13, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    public void calcular() {
        String pre;
        String can;
        double total = 0;
        double precio;
        int cantidad;
        double imp = 0.0;

        for (int i = 0; i < ventas.CajaAd.tablaCaja.getRowCount(); i++) {
            pre = ventas.CajaAd.tablaCaja.getValueAt(i, 3).toString();
            can = ventas.CajaAd.tablaCaja.getValueAt(i, 4).toString();
            precio = Double.parseDouble(pre);
            cantidad = Integer.parseInt(can);
            imp = precio * cantidad;
            total = total + imp;
            ventas.CajaAd.tablaCaja.setValueAt(Math.rint(imp * 100) / 100, i, 5);

        }
        ventas.CajaAd.total.setText("" + Math.rint(total * 100) / 100);

    }
    private void rSButtonRiple1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonRiple1ActionPerformed
        dispose();
    }//GEN-LAST:event_rSButtonRiple1ActionPerformed

    private void buscarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buscarMouseClicked

    }//GEN-LAST:event_buscarMouseClicked

    private void buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buscarActionPerformed

    private void buscarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_buscarKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_buscarKeyPressed

    private void buscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_buscarKeyReleased
        buscar.setText(buscar.getText().toUpperCase());
        OpcionesAl.listar2(buscar.getText());
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

    private void enviar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enviar1ActionPerformed
        if (tablaAlimentos.getRowCount() > 0) {
            try {
                String cant = null;
                DefaultTableModel tabladet = (DefaultTableModel) ventas.CajaAd.tablaCaja.getModel();

                String[] dato = new String[6];

                int fila = tablaAlimentos.getSelectedRow();

                if (fila == -1) {
                    JOptionPane.showMessageDialog(this, "Seleccione un registro.", "Alimentos", 0,
                            new ImageIcon(getClass().getResource("/imagenes/usuarios/info.png")));
                } else {
                    String cod = tablaAlimentos.getValueAt(fila, 0).toString();
                    String tipo = tablaAlimentos.getValueAt(fila, 1).toString();
                    String nom = tablaAlimentos.getValueAt(fila, 2).toString();
                    String precio = tablaAlimentos.getValueAt(fila, 3).toString();
                    int c = 0;
                    int j = 0;
                    cant = JOptionPane.showInputDialog(this, "Cantidad:", "Alimentos", JOptionPane.INFORMATION_MESSAGE);
                    while (!OpcionesAl.isNumber(cant) && cant != null) {
                        cant = JOptionPane.showInputDialog(this, "Debe ingresar valores numéricos\ny que sean mayor a 0:",
                                "Error", JOptionPane.ERROR_MESSAGE);
                    }
                    if ((cant.equals("")) || (cant.equals("0"))) {
//                        JOptionPane.showMessageDialog(this, "Debe ingresar algun valor mayor que 0");
                    } else {
                        for (int i = 0; i < ventas.CajaAd.tablaCaja.getRowCount(); i++) {
                            Object com = ventas.CajaAd.tablaCaja.getValueAt(i, 0);
                            Object cant1 = ventas.CajaAd.tablaCaja.getValueAt(i, 4);
                            if (cod.equals(com)) {
                                j = i;
                                int cantT = Integer.parseInt(cant) + Integer.parseInt((String) cant1);
                                ventas.CajaAd.tablaCaja.setValueAt(String.valueOf(cantT), i, 4);
                                c++;
                                calcular();
                                CajaAd.recibi.setText("");
                                CajaAd.cambio.setText("");
                            }
                        }
                        if (c == 0) {

                            dato[0] = cod;
                            dato[1] = tipo;
                            dato[2] = nom;
                            dato[3] = precio;
                            dato[4] = cant;

                            tabladet.addRow(dato);

                            ventas.CajaAd.tablaCaja.setModel(tabladet);
                            calcular();

                            CajaAd.recibi.setText("");
                            CajaAd.cambio.setText("");
                        }
                    }
                }
            } catch (Exception e) {
            }
        } else {
            JOptionPane.showMessageDialog(this, "No hay registros.", "Alimentos", 0,
                    new ImageIcon(getClass().getResource("/imagenes/usuarios/info.png")));
        }
    }//GEN-LAST:event_enviar1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private rscomponentshade.RSTextFieldShade buscar;
    private rojerusan.RSButtonHover enviar1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private rojeru_san.RSButtonRiple rSButtonRiple1;
    public static javax.swing.JTable tablaAlimentos;
    // End of variables declaration//GEN-END:variables
}
