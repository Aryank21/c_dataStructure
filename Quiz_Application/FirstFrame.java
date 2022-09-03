
package com.mycompany.firstsem;

import javax.swing.JOptionPane;

public class FirstFrame extends javax.swing.JFrame {
    
   
    public FirstFrame()
    {
        initComponents();
        setBounds(300,300,600,410);
        setResizable(false);
       
    }
    

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jdesktop = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldfirst = new javax.swing.JTextField();
        jButtonrule = new javax.swing.JButton();
        jButtonexit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 51, 51));

        jLabel1.setBackground(new java.awt.Color(0, 51, 51));
        jLabel1.setFont(new java.awt.Font("Segoe Print", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("                Welcome To Quiz Application");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 528, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(107, 107, 107))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 24, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jdesktop.setBackground(new java.awt.Color(0, 51, 51));
        jdesktop.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jdesktop.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Enter Your Name");
        jdesktop.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(397, 94, 145, 32));

        jTextFieldfirst.setBackground(new java.awt.Color(51, 51, 51));
        jTextFieldfirst.setFont(new java.awt.Font("Segoe Print", 0, 14)); // NOI18N
        jTextFieldfirst.setForeground(new java.awt.Color(255, 255, 255));
        jTextFieldfirst.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jTextFieldfirst.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldfirstActionPerformed(evt);
            }
        });
        jdesktop.add(jTextFieldfirst, new org.netbeans.lib.awtextra.AbsoluteConstraints(397, 152, 143, -1));

        jButtonrule.setBackground(new java.awt.Color(102, 102, 0));
        jButtonrule.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        jButtonrule.setText("Rule");
        jButtonrule.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButtonrule.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonruleMouseClicked(evt);
            }
        });
        jButtonrule.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonruleActionPerformed(evt);
            }
        });
        jdesktop.add(jButtonrule, new org.netbeans.lib.awtextra.AbsoluteConstraints(397, 244, -1, -1));

        jButtonexit.setBackground(new java.awt.Color(102, 102, 0));
        jButtonexit.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        jButtonexit.setText("Exit");
        jButtonexit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonexitActionPerformed(evt);
            }
        });
        jdesktop.add(jButtonexit, new org.netbeans.lib.awtextra.AbsoluteConstraints(483, 244, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jdesktop, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jdesktop, javax.swing.GroupLayout.PREFERRED_SIZE, 477, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldfirstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldfirstActionPerformed
        // TODO add your handling code here:
       
        
    }//GEN-LAST:event_jTextFieldfirstActionPerformed

    private void jButtonexitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonexitActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jButtonexitActionPerformed

    private void jButtonruleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonruleActionPerformed
        // TODO add your handling code here:
       // jButtonrule.setMnemonic(HEIGHT);
        if (jTextFieldfirst.getText().isEmpty())
        {
         JOptionPane.showMessageDialog(jdesktop,"Name cannot be blank");
         
        }
        else
                {
        SFrame f= new SFrame();
        f.setVisible(true);
       SFrame.jLabel3.setText(FirstFrame.jTextFieldfirst.getText());
        this.dispose();
                }
        
        

    }//GEN-LAST:event_jButtonruleActionPerformed

    private void jButtonruleMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonruleMouseClicked
        // TODO add your handling code here:
        SFrame f= new SFrame();
        jdesktop.add(f);
        f.setVisible(true);
        this.dispose();

    }//GEN-LAST:event_jButtonruleMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[])
    {
             
        
        
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
            java.util.logging.Logger.getLogger(FirstFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FirstFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FirstFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FirstFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run() 
            {
                new FirstFrame().setVisible(true);
               
              
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonexit;
    public static javax.swing.JButton jButtonrule;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    public static javax.swing.JTextField jTextFieldfirst;
    private javax.swing.JPanel jdesktop;
    // End of variables declaration//GEN-END:variables

    

    

    
    }

