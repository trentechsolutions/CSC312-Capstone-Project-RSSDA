/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Shuaib UWC
 */
public class Statistics extends javax.swing.JFrame {

    /**
     * Creates new form Admin
     */
    public Statistics() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        Products_btn = new javax.swing.JButton();
        SalesClerk_btn = new javax.swing.JButton();
        Statistics = new javax.swing.JButton();
        LogOut_btn = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Sales_table = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        StatsClose_btn = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        Stats_table = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel2.setBackground(new java.awt.Color(0, 0, 204));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Products_btn.setBackground(new java.awt.Color(0, 0, 204));
        Products_btn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Products_btn.setForeground(new java.awt.Color(204, 255, 255));
        Products_btn.setText("PRODUCTS");
        Products_btn.setBorder(null);
        Products_btn.setContentAreaFilled(false);
        Products_btn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Products_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Products_btnActionPerformed(evt);
            }
        });
        jPanel2.add(Products_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 190, 150, 31));

        SalesClerk_btn.setBackground(new java.awt.Color(0, 0, 204));
        SalesClerk_btn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        SalesClerk_btn.setForeground(new java.awt.Color(204, 255, 255));
        SalesClerk_btn.setText("SALES CLERK");
        SalesClerk_btn.setBorder(null);
        SalesClerk_btn.setContentAreaFilled(false);
        SalesClerk_btn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        SalesClerk_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalesClerk_btnActionPerformed(evt);
            }
        });
        jPanel2.add(SalesClerk_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 240, 150, 31));

        Statistics.setBackground(new java.awt.Color(0, 0, 204));
        Statistics.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Statistics.setForeground(new java.awt.Color(204, 255, 255));
        Statistics.setText("STATISTICS");
        Statistics.setBorder(null);
        Statistics.setContentAreaFilled(false);
        Statistics.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Statistics.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StatisticsActionPerformed(evt);
            }
        });
        jPanel2.add(Statistics, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 290, 150, 31));

        LogOut_btn.setBackground(new java.awt.Color(0, 0, 204));
        LogOut_btn.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        LogOut_btn.setForeground(new java.awt.Color(255, 0, 0));
        LogOut_btn.setText("LOG OUT");
        LogOut_btn.setBorder(null);
        LogOut_btn.setContentAreaFilled(false);
        LogOut_btn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        LogOut_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogOut_btnActionPerformed(evt);
            }
        });
        jPanel2.add(LogOut_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 590, 150, 20));

        jLabel2.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 102, 102));
        jLabel2.setText("DESIGNED BY TRENTECH");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 630, 150, 20));

        jPanel3.setBackground(new java.awt.Color(204, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 204));
        jLabel1.setText("STATISTICS");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 10, 230, -1));

        Sales_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "SALES ID", "CLERK ID", "SALE DATE", "TOTAL"
            }
        ));
        Sales_table.setSelectionBackground(new java.awt.Color(0, 0, 204));
        jScrollPane1.setViewportView(Sales_table);

        jPanel3.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 360, 790, 80));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 204));
        jLabel3.setText("STATISTICS TABLE");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 110, -1, 20));

        StatsClose_btn.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        StatsClose_btn.setForeground(new java.awt.Color(255, 0, 0));
        StatsClose_btn.setText("X");
        StatsClose_btn.setBorder(null);
        StatsClose_btn.setBorderPainted(false);
        StatsClose_btn.setContentAreaFilled(false);
        StatsClose_btn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        StatsClose_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StatsClose_btnActionPerformed(evt);
            }
        });
        jPanel3.add(StatsClose_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 0, 38, 28));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 204));
        jLabel4.setText("SALES TABLE");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 330, -1, -1));

        Stats_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "DATE", "AVERAGE SALES", "AVERAGE PRODUCTS SOLD", "LOWEST SELLING PRODUCT"
            }
        ));
        Stats_table.setSelectionBackground(new java.awt.Color(0, 0, 204));
        jScrollPane2.setViewportView(Stats_table);

        jPanel3.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 140, 790, 80));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void StatsClose_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StatsClose_btnActionPerformed
        System.exit(0);// TODO add your handling code here:
    }//GEN-LAST:event_StatsClose_btnActionPerformed

    private void Products_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Products_btnActionPerformed
        setVisible(false);
        new Admin().setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_Products_btnActionPerformed

    private void SalesClerk_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalesClerk_btnActionPerformed
        setVisible(false);
        new SalesClerk().setVisible(true);
        //TODO add your handling code here:
    }//GEN-LAST:event_SalesClerk_btnActionPerformed

    private void StatisticsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StatisticsActionPerformed

        // TODO add your handling code here:
    }//GEN-LAST:event_StatisticsActionPerformed

    private void LogOut_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogOut_btnActionPerformed
        setVisible(false);
        new LoginPage().setVisible(true);// TODO add your handling code here:
    }//GEN-LAST:event_LogOut_btnActionPerformed

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
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Statistics().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton LogOut_btn;
    private javax.swing.JButton Products_btn;
    private javax.swing.JButton SalesClerk_btn;
    private javax.swing.JTable Sales_table;
    private javax.swing.JButton Statistics;
    private javax.swing.JButton StatsClose_btn;
    private javax.swing.JTable Stats_table;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
