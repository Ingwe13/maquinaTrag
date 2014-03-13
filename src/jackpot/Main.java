package jackpot;

import java.text.DecimalFormat;
import java.util.Random;
import javax.swing.ImageIcon;

public class Main extends javax.swing.JFrame {

    /**
     * Creates new form Main
     */
    public Main() {

        initComponents();
        setIconImage(new ImageIcon(getClass().getResource("/imagenes/3.png")).getImage());
        setLocationByPlatform(true);
    }
    private static final double Perdidajugada = 0.50;
    public static int saldo = 0;
    public static double premio = 0;
    public static double saldoTotal = 0;
    private static int depositoPremio = 1000;
    
    public static final double monedaCincuenta = 0.50;
    public static final double monedaUnEuros = 1;
    public static final double monedaDosEuros = 2;
    
    
    Random numAleatorios = new Random(7);
    
    int listaNumero[] = {0, 1, 2, 3};
    ImageIcon Siete = new ImageIcon(getClass().getResource("/imagenes/4.png"));
    ImageIcon Moneda = new ImageIcon(getClass().getResource("/imagenes/3.png"));
    ImageIcon Trebol = new ImageIcon(getClass().getResource("/imagenes/2.png"));
    ImageIcon Campana = new ImageIcon(getClass().getResource("/imagenes/1.png"));
    ImageIcon Cereza = new ImageIcon(getClass().getResource("/imagenes/0.png"));

    DecimalFormat formato = new DecimalFormat("#,###.##");
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButtonPalanca = new javax.swing.JButton();
        jPanelIconos = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabelImagen1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabelImagen2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabelImagen3 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabelSaldo = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabelPremio = new javax.swing.JLabel();
        jButton50cent = new javax.swing.JButton();
        jButton1euro = new javax.swing.JButton();
        jButton2euro = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jButtonCobrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Jackpot");
        setResizable(false);

        jButtonPalanca.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/palanca.png"))); // NOI18N
        jButtonPalanca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPalancaActionPerformed(evt);
            }
        });

        jPanelIconos.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabelImagen1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/vacio.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabelImagen1))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabelImagen1))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabelImagen2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/vacio.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabelImagen2))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabelImagen2))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabelImagen3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/vacio.png"))); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabelImagen3))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabelImagen3))
        );

        javax.swing.GroupLayout jPanelIconosLayout = new javax.swing.GroupLayout(jPanelIconos);
        jPanelIconos.setLayout(jPanelIconosLayout);
        jPanelIconosLayout.setHorizontalGroup(
            jPanelIconosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelIconosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelIconosLayout.setVerticalGroup(
            jPanelIconosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelIconosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelIconosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Saldo:");

        jLabelSaldo.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabelSaldo.setText("0,00 €");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("Premio:");

        jLabelPremio.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabelPremio.setText("0,00 €");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelSaldo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelPremio, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabelPremio)
                    .addComponent(jLabel1)
                    .addComponent(jLabelSaldo))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jButton50cent.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/50cent.png"))); // NOI18N
        jButton50cent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton50centActionPerformed(evt);
            }
        });

        jButton1euro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/1euro.png"))); // NOI18N
        jButton1euro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1euroActionPerformed(evt);
            }
        });

        jButton2euro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/2euro.png"))); // NOI18N
        jButton2euro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2euroActionPerformed(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/premios.png"))); // NOI18N

        jButtonCobrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cash.png"))); // NOI18N
        jButtonCobrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCobrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton2euro, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1euro, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton50cent, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButtonPalanca)
                            .addComponent(jButtonCobrar)))
                    .addComponent(jPanelIconos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(jButton50cent, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton1euro, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jButton2euro, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(jButtonCobrar)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jButtonPalanca, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addComponent(jPanelIconos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonPalancaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPalancaActionPerformed
        //cada vez que tire se restan 0.50€ 
        double jugada = saldoTotal - Perdidajugada;
        jLabelSaldo.setText(String.valueOf(jugada));

        //ha premio se le sumaria la cantidad que le haya tocado en el giro
        jLabelPremio.setText(String.valueOf(premio));
        System.out.println(listaNumero[1]);
    }//GEN-LAST:event_jButtonPalancaActionPerformed

    private void jButton50centActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton50centActionPerformed
        //cada vez que se pulse le suma 0.50€ al saldo total
        saldoTotal = saldoTotal + monedaCincuenta;
        jLabelSaldo.setText(String.valueOf(formato.format(saldoTotal)));
        double depositoSum = depositoPremio + monedaCincuenta;
    }//GEN-LAST:event_jButton50centActionPerformed

    private void jButton1euroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1euroActionPerformed
        //cada vez que se pulse le suma 1€ al saldo total
        saldoTotal = saldoTotal + monedaUnEuros;
        jLabelSaldo.setText(String.valueOf(formato.format(saldoTotal)));
        double depositoSum = depositoPremio + monedaUnEuros;
    }//GEN-LAST:event_jButton1euroActionPerformed

    private void jButton2euroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2euroActionPerformed
        //cada vez que se pulse le suma 2€ al saldo total
        saldoTotal = saldoTotal + monedaDosEuros;
        jLabelSaldo.setText(String.valueOf(formato.format(saldoTotal)));
        double depositoSum = depositoPremio + monedaDosEuros;
    }//GEN-LAST:event_jButton2euroActionPerformed

    private void jButtonCobrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCobrarActionPerformed
        if (premio > depositoPremio) {
            System.out.println("Depósito vacío. Pase por caja");
        } else {
            System.out.println("Enorabuena ha ganado" + depositoPremio);
        }
        jLabelPremio.setText(String.valueOf(premio));
        jLabelSaldo.setText(String.valueOf(saldo));
    }//GEN-LAST:event_jButtonCobrarActionPerformed

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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1euro;
    private javax.swing.JButton jButton2euro;
    private javax.swing.JButton jButton50cent;
    private javax.swing.JButton jButtonCobrar;
    private javax.swing.JButton jButtonPalanca;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabelImagen1;
    private javax.swing.JLabel jLabelImagen2;
    private javax.swing.JLabel jLabelImagen3;
    private javax.swing.JLabel jLabelPremio;
    private javax.swing.JLabel jLabelSaldo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanelIconos;
    // End of variables declaration//GEN-END:variables
}
