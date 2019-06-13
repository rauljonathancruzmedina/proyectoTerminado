package ventas;

import alimentos.ListaAlimentosANor;
import alimentos.ListaAlimentosAd;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.ImageIcon;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;

import static principal.MenuPrincipalNor.escritorio;

/**
 *
 * @author John
 */
public class CajaNor extends javax.swing.JInternalFrame {

    public CajaNor() {
        initComponents();
        tablaCaja.getTableHeader().setDefaultRenderer(new principal.EstiloTablaHeader());
        tablaCaja.setDefaultRenderer(Object.class, new principal.EstiloTablaRenderer());
//        jPopupMenu1.add(menu);
        tablaCaja.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        limpiaCampos();

    }

    public static String fechaactual() {
        Date fecha = new Date();
        SimpleDateFormat formatofecha = new SimpleDateFormat("dd/MM/YYYY");
        return formatofecha.format(fecha);

    }

    void limpiaCampos() {
        DefaultTableModel modelo = (DefaultTableModel) tablaCaja.getModel();

        while (modelo.getRowCount() > 0) {
            modelo.removeRow(0);
        }
        recibi.setText("");
        cambio.setText("");
        total.setText("0.0");
        fecha.setText("");
        fecha.setText(fechaactual());
        OpcionesVen2.numeros();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        menu = new javax.swing.JPanel();
        borrar1 = new rojerusan.RSButtonHover();
        jPanel1 = new javax.swing.JPanel();
        busca = new rojerusan.RSButtonHover();
        jPanel7 = new javax.swing.JPanel();
        recibi = new app.bolivia.swing.JCTextField();
        jPanel8 = new javax.swing.JPanel();
        cambio = new app.bolivia.swing.JCTextField();
        jPanel9 = new javax.swing.JPanel();
        jPanel13 = new javax.swing.JPanel();
        jPanel14 = new javax.swing.JPanel();
        fecha = new app.bolivia.swing.JCTextField();
        jPanel4 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        rSPanelImage1 = new rojerusan.RSPanelImage();
        jPanel11 = new javax.swing.JPanel();
        numFac = new app.bolivia.swing.JCTextField();
        jLabel1 = new javax.swing.JLabel();
        calculo = new rojerusan.RSButtonHover();
        vender = new rojerusan.RSButtonHover();
        borrar = new rojerusan.RSButtonHover();
        cancelar = new rojerusan.RSButtonHover();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaCaja = new javax.swing.JTable();
        jPanel12 = new javax.swing.JPanel();
        total = new app.bolivia.swing.JCTextField();
        jPanel15 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        rSButtonRiple1 = new rojeru_san.RSButtonRiple();

        menu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        borrar1.setBackground(new java.awt.Color(255, 109, 0));
        borrar1.setText("ELIMINAR");
        borrar1.setColorHover(new java.awt.Color(139, 195, 111));
        borrar1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        borrar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                borrar1ActionPerformed(evt);
            }
        });
        menu.add(borrar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 50));

        setBorder(null);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        busca.setBackground(new java.awt.Color(255, 109, 0));
        busca.setText("B U S C A R");
        busca.setColorHover(new java.awt.Color(139, 195, 111));
        busca.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        busca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscaActionPerformed(evt);
            }
        });

        jPanel7.setBackground(new java.awt.Color(255, 109, 0));

        recibi.setBackground(new java.awt.Color(255, 109, 0));
        recibi.setBorder(null);
        recibi.setForeground(new java.awt.Color(255, 255, 255));
        recibi.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        recibi.setCaretColor(new java.awt.Color(255, 255, 255));
        recibi.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        recibi.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        recibi.setOpaque(false);
        recibi.setPhColor(new java.awt.Color(255, 255, 255));
        recibi.setPlaceholder("R E C I B I");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addComponent(recibi, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 10, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(recibi, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel8.setBackground(new java.awt.Color(255, 109, 0));

        cambio.setEditable(false);
        cambio.setBackground(new java.awt.Color(255, 109, 0));
        cambio.setBorder(null);
        cambio.setForeground(new java.awt.Color(255, 255, 255));
        cambio.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        cambio.setCaretColor(new java.awt.Color(255, 255, 255));
        cambio.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        cambio.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        cambio.setOpaque(false);
        cambio.setPhColor(new java.awt.Color(255, 255, 255));
        cambio.setPlaceholder("C A M B I O");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addComponent(cambio, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 10, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(cambio, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel9.setBackground(new java.awt.Color(255, 109, 0));

        jPanel13.setBackground(new java.awt.Color(255, 109, 0));

        jPanel14.setBackground(new java.awt.Color(255, 109, 0));

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 165, Short.MAX_VALUE)
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 32, Short.MAX_VALUE)
        );

        fecha.setEditable(false);
        fecha.setBackground(new java.awt.Color(255, 109, 0));
        fecha.setBorder(null);
        fecha.setForeground(new java.awt.Color(255, 255, 255));
        fecha.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        fecha.setCaretColor(new java.awt.Color(255, 255, 255));
        fecha.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        fecha.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        fecha.setOpaque(false);
        fecha.setPhColor(new java.awt.Color(255, 255, 255));
        fecha.setPlaceholder("F E C H A");

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fecha, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addComponent(fecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel10.setBackground(new java.awt.Color(255, 255, 255));
        jPanel10.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(102, 102, 102)));

        rSPanelImage1.setImagen(new javax.swing.ImageIcon(getClass().getResource("/imagenes2/presentacion.png"))); // NOI18N

        javax.swing.GroupLayout rSPanelImage1Layout = new javax.swing.GroupLayout(rSPanelImage1);
        rSPanelImage1.setLayout(rSPanelImage1Layout);
        rSPanelImage1Layout.setHorizontalGroup(
            rSPanelImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        rSPanelImage1Layout.setVerticalGroup(
            rSPanelImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 265, Short.MAX_VALUE)
        );

        jPanel11.setBackground(new java.awt.Color(104, 177, 67));

        numFac.setEditable(false);
        numFac.setBackground(new java.awt.Color(104, 177, 67));
        numFac.setBorder(null);
        numFac.setForeground(new java.awt.Color(255, 255, 255));
        numFac.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        numFac.setCaretColor(new java.awt.Color(255, 255, 255));
        numFac.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        numFac.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        numFac.setOpaque(false);
        numFac.setPhColor(new java.awt.Color(255, 255, 255));
        numFac.setPlaceholder("F A C T U R A");

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addComponent(numFac, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(numFac, javax.swing.GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE)
        );

        jLabel1.setText("- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -");

        calculo.setBackground(new java.awt.Color(255, 109, 0));
        calculo.setText("C A L C U L A R");
        calculo.setColorHover(new java.awt.Color(139, 195, 111));
        calculo.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        calculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calculoActionPerformed(evt);
            }
        });

        vender.setBackground(new java.awt.Color(255, 109, 0));
        vender.setText("O R D E N A R");
        vender.setColorHover(new java.awt.Color(139, 195, 111));
        vender.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        vender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                venderActionPerformed(evt);
            }
        });

        borrar.setBackground(new java.awt.Color(255, 109, 0));
        borrar.setText("E L I M I N A R");
        borrar.setColorHover(new java.awt.Color(139, 195, 111));
        borrar.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        borrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                borrarActionPerformed(evt);
            }
        });

        cancelar.setBackground(new java.awt.Color(255, 0, 0));
        cancelar.setText("C A N C E L A R");
        cancelar.setColorHover(new java.awt.Color(240, 85, 85));
        cancelar.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(calculo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(rSPanelImage1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(vender, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(borrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cancelar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addComponent(rSPanelImage1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(calculo, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(vender, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(borrar, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 14, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createMatteBorder(8, 8, 8, 8, new java.awt.Color(43, 189, 126)));

        tablaCaja.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CÓDIGO", "TIPO ALIMENTO", "DESCRIPCIÓN", "PRECIO $", "CANTIDAD", "IMPORTE $"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaCaja.setComponentPopupMenu(jPopupMenu1);
        tablaCaja.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jScrollPane1.setViewportView(tablaCaja);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 685, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 323, Short.MAX_VALUE)
        );

        jPanel12.setBackground(new java.awt.Color(255, 109, 0));

        total.setEditable(false);
        total.setBackground(new java.awt.Color(255, 109, 0));
        total.setBorder(null);
        total.setForeground(new java.awt.Color(255, 255, 255));
        total.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        total.setCaretColor(new java.awt.Color(255, 255, 255));
        total.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        total.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        total.setOpaque(false);
        total.setPhColor(new java.awt.Color(255, 255, 255));
        total.setPlaceholder("TOTAL");

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addComponent(total, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 10, Short.MAX_VALUE))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(total, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 54, Short.MAX_VALUE)
        );

        jPanel15.setBackground(new java.awt.Color(104, 177, 67));

        jLabel2.setFont(new java.awt.Font("Ink Free", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("C A J A");

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

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rSButtonRiple1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel15Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rSButtonRiple1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 812, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(busca, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(61, 61, 61))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(busca, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1046, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 3, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
alimentos.ListaAlimentosAd la;
    alimentos.ListaAlimentosANor laa;
    private void buscaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscaActionPerformed
        
        laa = new ListaAlimentosANor();
        principal.MenuPrincipalNor.escritorio.add(laa);
        laa.toFront();
        laa.setVisible(true);

    }//GEN-LAST:event_buscaActionPerformed

    private void calculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calculoActionPerformed
        if (tablaCaja.getRowCount() < 1) {
            JOptionPane.showMessageDialog(this, "Imposible realizar operación.", "Error", JOptionPane.ERROR_MESSAGE);
        } else if (recibi.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Ingrese un valor.", "Caja de cobro", 0,
                    new ImageIcon(getClass().getResource("/imagenes/usuarios/info.png")));
        } else {
            double recibe = Double.parseDouble(recibi.getText());
            double tota = Double.parseDouble(total.getText());

            if (recibe < tota) {
                JOptionPane.showMessageDialog(this, "Ingrese un valor valido.", "Caja de cobro", 0);
            } else {
                this.cambio.setText(String.valueOf(recibe - tota));
            }
        }
    }//GEN-LAST:event_calculoActionPerformed

    private void venderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_venderActionPerformed
        if (tablaCaja.getRowCount() < 1) {
            JOptionPane.showMessageDialog(this, "Imposible realizar venta.", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            VentasCod vc = new VentasCod();
            vc.setPrimaryKey(numFac.getText());
            vc.setTotal(total.getText());
            vc.setFecha(fecha.getText());
            int opcion = OpcionesVen2.registrar(vc);
            if (opcion != 0) {
                limpiaCampos();
                JOptionPane.showMessageDialog(this, "Venta realizada.", "Caja de cobro", 0);
                if (principal.MenuPrincipalAd.cerra1) {
                    OpcionesVen2.listar("");
                }
            }
        }
    }//GEN-LAST:event_venderActionPerformed

    private void borrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_borrarActionPerformed
        if (tablaCaja.getRowCount() > 0) {
            DefaultTableModel modelo = (DefaultTableModel) tablaCaja.getModel();
            int fila = tablaCaja.getSelectedRow();
            if (fila >= 0) {
                modelo.removeRow(fila);
                ListaAlimentosAd la = new ListaAlimentosAd();
                la.calcular();
            } else {
                JOptionPane.showMessageDialog(this, "Seleccione una fila.", "Caja de cobro", 0,
                        new ImageIcon(getClass().getResource("/imagenes/usuarios/info.png")));
            }
        } else {
            JOptionPane.showMessageDialog(this, "No hay registros\npara eliminar.", "Caja de cobro", 0,
                    new ImageIcon(getClass().getResource("/imagenes/usuarios/info.png")));
        }
    }//GEN-LAST:event_borrarActionPerformed

    private void cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarActionPerformed
        limpiaCampos();
    }//GEN-LAST:event_cancelarActionPerformed

    private void rSButtonRiple1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonRiple1ActionPerformed
        dispose();
    }//GEN-LAST:event_rSButtonRiple1ActionPerformed

    private void borrar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_borrar1ActionPerformed
        if (tablaCaja.getRowCount() > 0) {
            DefaultTableModel modelo = (DefaultTableModel) tablaCaja.getModel();
            int fila = tablaCaja.getSelectedRow();
            if (fila >= 0) {
                modelo.removeRow(fila);
                ListaAlimentosAd la = new ListaAlimentosAd();
                la.calcular();
            } else {
                JOptionPane.showMessageDialog(this, "Seleccione una fila.", "Caja de cobro", 0);
            }
        } else {
            JOptionPane.showMessageDialog(this, "No hay registros\npara eliminar.", "Caja de cobro", 0);
        }

    }//GEN-LAST:event_borrar1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private rojerusan.RSButtonHover borrar;
    private rojerusan.RSButtonHover borrar1;
    private rojerusan.RSButtonHover busca;
    private rojerusan.RSButtonHover calculo;
    public static app.bolivia.swing.JCTextField cambio;
    private rojerusan.RSButtonHover cancelar;
    public static app.bolivia.swing.JCTextField fecha;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel menu;
    public static app.bolivia.swing.JCTextField numFac;
    private rojeru_san.RSButtonRiple rSButtonRiple1;
    private rojerusan.RSPanelImage rSPanelImage1;
    public static app.bolivia.swing.JCTextField recibi;
    public static javax.swing.JTable tablaCaja;
    public static app.bolivia.swing.JCTextField total;
    private rojerusan.RSButtonHover vender;
    // End of variables declaration//GEN-END:variables
}
