
package com.mycompany.firstsem;

import javax.swing.ButtonGroup;

import javax.swing.JRadioButton;

public class Set7 extends javax.swing.JFrame {
    
    String [] questions=
    
    
    {"(1) Mark the incorrect statement from the following",
    "(2)In java, objects are passed as",
    "(3) Which of the following is not a component of Java Integrated Development Environment (IDE)?",
   "(4) Identify, from among the following, the incorrect variable name(s)"
    ,"(5) An applet cannot be viewed using",
    "(6) Java compiler javac translates Java source code into …………",
    "(7)A package is a collection of",
    "(8)Basic Java language functions are stored in which of the following java package?",
    "(9) Which of the following is a member of the java.lang package?",
    "(10) Which of the following has a method names flush( )?",
    };
            
    String[][] option=
    {{"(a)   Java is a fully object oriented language with strong support for proper software engineering techniques",
        "(b)   In java it is not easy to write C-like so called procedural programs",
         "(c)In java language objects have to be manipulated",
           "(d)In java language error processing is built into the language"},
        {"a)  Copy of that object"
           ,"(b)  Method called call by value",
                "(c)Memory address ",                                                           
                   "(d)  Constructor"},
        {"(a)  Net Beans",                                        
            "(b)Borland’s Jbuilder",
                  "(c)Symantec’s Visual Café",
                      "(d)Microsoft Visual Fox Pro"},
            {"(a)theButton ",
                "(b)$reallyBigNumber",
                    "(c)  2ndName",                                        
                          "(d)  CurrentWeatherStateofplanet"},
            {"(a)Netscape navigator",
                "(b)Microsoft Internet Explorer",
                             "(c) Sun’ Hot Java Browser",
                                    "(d) Applet viewer tool which comes, with the Java Development Kit."},
            {"(a)  Assembler language",
                     "(b)  Byte code\n",
                         "(c)  Bit code ",               
                            "(d)  Machine code"},
            {"(a)Classes",
                  "(b) Interfaces"
                     ,"(c) Editing tools",
                         "(d)Classes and interfaces"},
            {"(a) java.lang"
                ,"(b) java.io "
                    ,"(c) java.net "
                        ,"(d) java.util"},
            {"(a)   List",
                    "(b) Queue",
                         "(c) Math",                
                            "(d) Stack"},
            {"(a) Input stream ",
                 "(b) Output Stream",
                    "(c) Reader stream",
                         "(d) Input reader stream"}
    };
            int index=0;
            static int correct=0;
            ButtonGroup bg= new ButtonGroup();
            Score sc=new Score();
          
  
    
       
    

    /**
     * Creates new form Set1
     */
    public Set7() {
          
        initComponents();
       jButton_Next_QActionPerformed(null);
        setBounds(300,300,750,410);
        setResizable(false);
        bg.add(jRadioButton1); 
        bg.add(jRadioButton2);
        bg.add(jRadioButton3);
        bg.add(jRadioButton4);
        
   }
    public int getSelectOption(JRadioButton rbtn)
            
    {
      System.out.println(rbtn.getText());
     // System.out.println(option[index][4]);
      
        if(rbtn.getText().equals(option[0][3]))
        {
            
           correct++;
           index++;
        }
      
       
         if(rbtn.getText().equals(option[1][2]))
        {
            
          correct++;
        index++;
      
        }
        if(rbtn.getText().equals(option[2][2]))
        {
            
          correct++;
         
            index++;
        }
        if(rbtn.getText().equals(option[3][2]))
        {
            correct++;
           index++;
        }
        if(rbtn.getText().equals(option[4][3]))
        {
            correct++;
           index++;
        }
        if(rbtn.getText().equals(option[5][1]))
        {
            correct++;
           index++;
        }
        if(rbtn.getText().equals(option[6][3]))
        {
            correct++;
            index++;
        }
        if(rbtn.getText().equals(option[7][0]))
        {
            correct++;
            index++;
        }
        if(rbtn.getText().equals(option[8][1]))
        {
            correct++;
           index++;
        }
         if(rbtn.getText().equals(option[9][1]))
        {
            correct++;
       }
      
    
    
      //enableRbuttons(false);
      //  Score.correctlbl.setText(Set1.correctlbl3.getText());
        return correct;
         
    }

     public void enableRbuttons(boolean yes_or_no)
     {
         jRadioButton1.setEnabled(yes_or_no);
          jRadioButton2.setEnabled(yes_or_no);
           jRadioButton3.setEnabled(yes_or_no);
            jRadioButton4.setEnabled(yes_or_no);
         
     }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        correctlbl1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton_Next_Q = new javax.swing.JButton();
        jRadioButton4 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jPanelQ = new javax.swing.JPanel();
        lbl_Question = new javax.swing.JLabel();
        correctlbl2 = new javax.swing.JLabel();
        clabel = new javax.swing.JLabel();

        correctlbl1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 51, 51));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setBackground(new java.awt.Color(102, 102, 0));
        jButton1.setFont(new java.awt.Font("Segoe Print", 0, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Submit");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 320, 90, 40));

        jButton_Next_Q.setBackground(new java.awt.Color(102, 102, 0));
        jButton_Next_Q.setFont(new java.awt.Font("Segoe Print", 0, 14)); // NOI18N
        jButton_Next_Q.setForeground(new java.awt.Color(255, 255, 255));
        jButton_Next_Q.setText("Next");
        jButton_Next_Q.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton_Next_QMouseClicked(evt);
            }
        });
        jButton_Next_Q.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Next_QActionPerformed(evt);
            }
        });
        jPanel1.add(jButton_Next_Q, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 320, 85, -1));

        jRadioButton4.setBackground(new java.awt.Color(0, 51, 51));
        jRadioButton4.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        jRadioButton4.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jRadioButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(47, 282, 540, -1));

        jRadioButton2.setBackground(new java.awt.Color(0, 51, 51));
        jRadioButton2.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        jRadioButton2.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jRadioButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(47, 184, 540, -1));

        jRadioButton1.setBackground(new java.awt.Color(0, 51, 51));
        jRadioButton1.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        jRadioButton1.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jRadioButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(47, 145, 530, -1));

        jRadioButton3.setBackground(new java.awt.Color(0, 51, 51));
        jRadioButton3.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        jRadioButton3.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jRadioButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(47, 232, 540, -1));

        jPanelQ.setBackground(new java.awt.Color(0, 51, 51));

        lbl_Question.setFont(new java.awt.Font("Segoe Print", 0, 14)); // NOI18N
        lbl_Question.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanelQLayout = new javax.swing.GroupLayout(jPanelQ);
        jPanelQ.setLayout(jPanelQLayout);
        jPanelQLayout.setHorizontalGroup(
            jPanelQLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelQLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_Question, javax.swing.GroupLayout.DEFAULT_SIZE, 586, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanelQLayout.setVerticalGroup(
            jPanelQLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelQLayout.createSequentialGroup()
                .addContainerGap(30, Short.MAX_VALUE)
                .addComponent(lbl_Question, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel1.add(jPanelQ, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 610, 110));
        jPanel1.add(correctlbl2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 330, -1, -1));
        jPanel1.add(clabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 330, 260, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 374, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        // TODO add your handling code here:
        getSelectOption(jRadioButton1);
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void jRadioButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton4ActionPerformed
        // TODO add your handling code here:
          getSelectOption(jRadioButton4);
    }//GEN-LAST:event_jRadioButton4ActionPerformed

    private void jButton_Next_QActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Next_QActionPerformed
       
    
        if (index==questions.length-1)
        {
            
            sc.setVisible(true);
            Score.correctlbl.setText("Score is "+correct);
            this.dispose();
        
        }
     else
       {
        enableRbuttons(true);
        lbl_Question.setText(questions[index]);
        jRadioButton1.setText(option[index][0]);
        jRadioButton2.setText(option[index][1]);
        jRadioButton3.setText(option[index][2]);
        jRadioButton4.setText(option[index][3]);
         bg.clearSelection();
       /*  lbl_Question.setText(questions[index]);
        jRadioButton1.setText(option[index][0]);
        jRadioButton2.setText(option[index][1]);
        jRadioButton3.setText(option[index][2]);
        jRadioButton4.setText(option[index][3]);
         */
        
       
    }//GEN-LAST:event_jButton_Next_QActionPerformed
    }
    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
        // TODO add your handling code here:
         getSelectOption(jRadioButton2);
    }//GEN-LAST:event_jRadioButton2ActionPerformed

    private void jRadioButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton3ActionPerformed
        // TODO add your handling code here:
          getSelectOption(jRadioButton3);
    }//GEN-LAST:event_jRadioButton3ActionPerformed

    private void jButton_Next_QMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_Next_QMouseClicked
        // TODO add your handling code here:
       index++;
    }//GEN-LAST:event_jButton_Next_QMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
         sc.setVisible(true);
            Score.correctlbl.setText("Score is "+correct);
            this.dispose();
        
    }//GEN-LAST:event_jButton1ActionPerformed


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
            java.util.logging.Logger.getLogger(Set7.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Set7.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Set7.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Set7.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Set7().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JLabel clabel;
    public static javax.swing.JLabel correctlbl1;
    private javax.swing.JLabel correctlbl2;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton_Next_Q;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanelQ;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JLabel lbl_Question;
    // End of variables declaration//GEN-END:variables

   
}
