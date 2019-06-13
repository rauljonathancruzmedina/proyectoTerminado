
package principal;

import alimentos.Alimentos;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;
import javax.swing.Timer;
import usuarios.Usuarios;
import ventas.CajaAd;
import ventas.CajaNor;
import ventas.RegistroVentas;

public class MenuPrincipalNor extends javax.swing.JFrame {

    public boolean estacerrado(Object obj) {
        JInternalFrame[] activos = escritorio.getAllFrames();
        boolean cerrado = true;
        int i = 0;
        while (i < activos.length && cerrado) {
            if (activos[i] == obj) {
                cerrado = false;
            }
            i++;
        }
        return cerrado;
    }

   
    public MenuPrincipalNor() {
        this.setResizable(false);
        initComponents();
        this.setExtendedState(this.getExtendedState() | JFrame.MAXIMIZED_BOTH);
        
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        escritorio = new principal.Escritorio();
        jPanel3 = new javax.swing.JPanel();
        fecha = new javax.swing.JLabel();
        hora = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        desc1 = new rojerusan.RSButtonHover();
        usuarios = new rojerusan.RSButtonHover();
        alimentos = new rojerusan.RSButtonHover();
        ventas = new rojerusan.RSButtonHover();
        caja = new rojerusan.RSButtonHover();
        userConect = new javax.swing.JLabel();
        logoSexo1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(0, 150, 36));

        jPanel3.setBackground(new java.awt.Color(0, 0, 0));

        fecha.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        fecha.setForeground(new java.awt.Color(255, 255, 255));
        fecha.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        fecha.setText("DIA - MES - AÑO");

        hora.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        hora.setForeground(new java.awt.Color(255, 255, 255));
        hora.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        hora.setText("HORA");

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes2/1ra.png"))); // NOI18N
        jLabel5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel6.setFont(new java.awt.Font("Segoe Print", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("tu pagas, yo invito");

        desc1.setBackground(new java.awt.Color(0, 0, 0));
        desc1.setForeground(new java.awt.Color(255, 0, 0));
        desc1.setText("S A L I R");
        desc1.setColorHover(new java.awt.Color(0, 0, 0));
        desc1.setColorText(new java.awt.Color(204, 0, 0));
        desc1.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        desc1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                desc1MouseClicked(evt);
            }
        });
        desc1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                desc1ActionPerformed(evt);
            }
        });

        usuarios.setBackground(new java.awt.Color(0, 0, 0));
        usuarios.setText("U S U A R I O S");
        usuarios.setColorHover(new java.awt.Color(104, 177, 67));
        usuarios.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        usuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usuariosActionPerformed(evt);
            }
        });

        alimentos.setBackground(new java.awt.Color(0, 0, 0));
        alimentos.setText("A L I M E NT O S");
        alimentos.setColorHover(new java.awt.Color(104, 177, 67));
        alimentos.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        alimentos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alimentosActionPerformed(evt);
            }
        });

        ventas.setBackground(new java.awt.Color(0, 0, 0));
        ventas.setText("REGISTRO VENTAS");
        ventas.setColorHover(new java.awt.Color(104, 177, 67));
        ventas.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        ventas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ventasActionPerformed(evt);
            }
        });

        caja.setBackground(new java.awt.Color(0, 0, 0));
        caja.setText("CAJA DE COBRO");
        caja.setColorHover(new java.awt.Color(104, 177, 67));
        caja.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        caja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cajaActionPerformed(evt);
            }
        });

        userConect.setFont(new java.awt.Font("Tempus Sans ITC", 1, 14)); // NOI18N
        userConect.setForeground(new java.awt.Color(255, 255, 255));
        userConect.setText("USUARIO");

        logoSexo1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        logoSexo1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/principal/conectado.png"))); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(hora, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(fecha, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 8, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(logoSexo1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(userConect, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32))
            .addComponent(usuarios, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(alimentos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(ventas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(caja, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(desc1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(logoSexo1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(userConect, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(usuarios, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(alimentos, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(ventas, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(caja, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 76, Short.MAX_VALUE)
                .addComponent(desc1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(hora)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(fecha)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(escritorio, javax.swing.GroupLayout.PREFERRED_SIZE, 1132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(escritorio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        //Fehca del sistema
        Date sistemaFech = new Date();
        SimpleDateFormat formato = new SimpleDateFormat("dd MMMM yyyy");
        fecha.setText(formato.format(sistemaFech));

        //Hora del sistema
        Timer tiempo = new Timer(100, new MenuPrincipalNor.horas());
        tiempo.start();
    }//GEN-LAST:event_formWindowOpened
    usuarios.Usuarios us;    alimentos.Alimentos al;    CajaNor ca;
    RegistroVentas rv;
    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        if (JOptionPane.showConfirmDialog(this, "Esta a punto de salir\nde la aplicación.\n¿Desea continuar?", "Cerrar", JOptionPane.YES_NO_OPTION, 0,
                new ImageIcon(getClass().getResource("/imagenes/principal/adver1.png"))) == JOptionPane.YES_OPTION) {
            System.exit(0);
        } else {
            this.setDefaultCloseOperation(0);
        }
    }//GEN-LAST:event_formWindowClosing

    private void usuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usuariosActionPerformed
         JOptionPane.showMessageDialog(this, "Acceso denegado.", "Error", 0,
                new ImageIcon(getClass().getResource("/imagenes/usuarios/impo.png"))); 
    }//GEN-LAST:event_usuariosActionPerformed

    private void alimentosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alimentosActionPerformed
        JOptionPane.showMessageDialog(this, "Acceso denegado.", "Error", 0,
                new ImageIcon(getClass().getResource("/imagenes/usuarios/impo.png")));
    }//GEN-LAST:event_alimentosActionPerformed

    private void ventasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ventasActionPerformed
        JOptionPane.showMessageDialog(this, "Acceso denegado.", "Error", 0,
                new ImageIcon(getClass().getResource("/imagenes/usuarios/impo.png")));
    }//GEN-LAST:event_ventasActionPerformed

    private void cajaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cajaActionPerformed
         if (estacerrado(ca)) {
            ca = new CajaNor();
            escritorio.add(ca).setLocation(160, 3);
            ca.show();
        } else {
            JOptionPane.showMessageDialog(this, "La ventana CAJA DE COBRO\nya esta abierta !!!", "Aviso", 0,
                    new ImageIcon(getClass().getResource("/imagenes/principal/adver.png")));
        }
    }//GEN-LAST:event_cajaActionPerformed

    private void desc1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_desc1MouseClicked
        if (JOptionPane.showConfirmDialog(this, "Esta a punto de\ncerrar la sesión\n¿Desea continuar?", "Cerrar Sesión", JOptionPane.YES_NO_OPTION, 0,
                new ImageIcon(getClass().getResource("/imagenes/principal/preg2.png"))) == JOptionPane.YES_OPTION) {
            this.dispose();
            new AccesoLogin().setVisible(true);
        }
    }//GEN-LAST:event_desc1MouseClicked

    private void desc1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_desc1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_desc1ActionPerformed
    class horas implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            Date sistemaHora = new Date();
            String pmAm = "hh:mm:ss a";
            SimpleDateFormat formato = new SimpleDateFormat(pmAm);
            Calendar now = Calendar.getInstance();
            hora.setText(String.format(formato.format(sistemaHora), now));
        }
    }

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
            java.util.logging.Logger.getLogger(MenuPrincipalNor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipalNor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipalNor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipalNor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuPrincipalNor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private rojerusan.RSButtonHover alimentos;
    private rojerusan.RSButtonHover caja;
    private rojerusan.RSButtonHover desc1;
    public static principal.Escritorio escritorio;
    private javax.swing.JLabel fecha;
    private javax.swing.JLabel hora;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel logoSexo1;
    public static javax.swing.JLabel userConect;
    private rojerusan.RSButtonHover usuarios;
    private rojerusan.RSButtonHover ventas;
    // End of variables declaration//GEN-END:variables
}
