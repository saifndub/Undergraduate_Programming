/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package result_meaker;

/**
 *
 * @author saifn
 */
public class Result extends javax.swing.JFrame {

    /**
     * Creates new form Result
     */
    double gradeValue;
    //double gradeValue2;
    double totals1;
    double totals2;
    double totals3;
    double totals4;
    double total;
    double res;
    
    public Result() {
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

        jLabel1 = new javax.swing.JLabel();
        credit1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        g1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        credit2 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        g2 = new javax.swing.JTextField();
        credit3 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        g3 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        g4 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        credit4 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        submit = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        result = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel1.setText("Credit :");

        credit1.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel2.setText("Grade  :");

        g1.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel3.setText("Credit :");

        credit2.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel4.setText("Grade  :");

        g2.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N

        credit3.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel5.setText("Grade  :");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel6.setText("Credit :");

        g3.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel7.setText("Grade  :");

        g4.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel8.setText("Credit :");

        credit4.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel9.setText("Class 1->");

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel10.setText("Class 2->");

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel11.setText("Class 3->");

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel12.setText("Class 4->");

        submit.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        submit.setText("Submit");
        submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel13.setText("Your Result is :");

        result.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(submit)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel11)
                                    .addComponent(jLabel12))
                                .addGap(43, 43, 43)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(credit3, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(credit2, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(credit1, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel8)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(credit4, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(g4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(g3, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(g2, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(g1, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(67, 67, 67))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addGap(18, 18, 18)
                        .addComponent(result, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(113, 113, 113))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(credit1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9))
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(credit2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10))
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(credit3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11))
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(credit4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(g1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(g2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(g3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(g4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(58, 58, 58)
                .addComponent(submit)
                .addGap(66, 66, 66)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(result, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(157, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void submitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitActionPerformed
        // TODO add your handling code here:
        
        String grade =g1.getText(); 
        double cr1 = Double.parseDouble(credit1.getText());
                
        if (grade.equals("A+")) {
            gradeValue = 4.00;
        } else if (grade.equals("A")) {
            gradeValue = 3.75;
        } else if (grade.equals("A-")) {
            gradeValue = 3.50;
        } else if (grade.equals("B+")) {
            gradeValue = 3.25;
        } else if (grade.equals("B")) {
            gradeValue = 3.00;
        } else if (grade.equals("B-")) {
            gradeValue = 2.75;
        } else if (grade.equals("C+")) {
            gradeValue = 2.50;
        } else if (grade.equals("C")) {
            gradeValue = 2.25;
        } else if (grade.equals("D")) {
            gradeValue = 2.00;
        } else if (grade.equals("F")) {
            gradeValue = 0.00;
        }
        else {
            result.setText("Invalid Grade");
        }
        
        totals1 = gradeValue * cr1;
        gradeValue = 0;
        
        String grade2 =g2.getText(); 
        double cr2 = Double.parseDouble(credit2.getText());
                
        if (grade2.equals("A+")) {
            gradeValue = 4.00;
        } else if (grade2.equals("A")) {
            gradeValue = 3.75;
        } else if (grade2.equals("A-")) {
            gradeValue = 3.50;
        } else if (grade2.equals("B+")) {
            gradeValue = 3.25;
        } else if (grade2.equals("B")) {
            gradeValue = 3.00;
        } else if (grade2.equals("B-")) {
            gradeValue = 2.75;
        } else if (grade2.equals("C+")) {
            gradeValue = 2.50;
        } else if (grade2.equals("C")) {
            gradeValue = 2.25;
        } else if (grade2.equals("D")) {
            gradeValue = 2.00;
        } else if (grade2.equals("F")) {
            gradeValue = 0.00;
        }
        else {
            result.setText("Invalid Grade");
        }
        
        totals2 = gradeValue * cr2;
        gradeValue = 0;
        
        String grade3 =g3.getText(); 
        double cr3 = Double.parseDouble(credit3.getText());
                
        if (grade3.equals("A+")) {
            gradeValue = 4.00;
        } else if (grade3.equals("A")) {
            gradeValue = 3.75;
        } else if (grade3.equals("A-")) {
            gradeValue = 3.50;
        } else if (grade3.equals("B+")) {
            gradeValue = 3.25;
        } else if (grade3.equals("B")) {
            gradeValue = 3.00;
        } else if (grade3.equals("B-")) {
            gradeValue = 2.75;
        } else if (grade3.equals("C+")) {
            gradeValue = 2.50;
        } else if (grade3.equals("C")) {
            gradeValue = 2.25;
        } else if (grade3.equals("D")) {
            gradeValue = 2.00;
        } else if (grade3.equals("F")) {
            gradeValue = 0.00;
        }
        else {
            result.setText("Invalid Grade");
        }
        
        totals3 = gradeValue * cr3;
        gradeValue = 0;
        
        String grade4 =g4.getText(); 
        double cr4 = Double.parseDouble(credit4.getText());
                
        if (grade4.equals("A+")) {
            gradeValue = 4.00;
        } else if (grade4.equals("A")) {
            gradeValue = 3.75;
        } else if (grade4.equals("A-")) {
            gradeValue = 3.50;
        } else if (grade4.equals("B+")) {
            gradeValue = 3.25;
        } else if (grade4.equals("B")) {
            gradeValue = 3.00;
        } else if (grade4.equals("B-")) {
            gradeValue = 2.75;
        } else if (grade4.equals("C+")) {
            gradeValue = 2.50;
        } else if (grade4.equals("C")) {
            gradeValue = 2.25;
        } else if (grade4.equals("D")) {
            gradeValue = 2.00;
        } else if (grade4.equals("F")) {
            gradeValue = 0.00;
        }
        else {
            result.setText("Invalid Grade");
        }
        
        totals4 = gradeValue * cr4;
        
        total = totals1 + totals2 + totals3 + totals4;
        res = total/(cr1 + cr2 + cr3 + cr4) ;
        
        result.setText(String.valueOf(res));
    }//GEN-LAST:event_submitActionPerformed

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
            java.util.logging.Logger.getLogger(Result.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Result.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Result.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Result.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Result().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField credit1;
    private javax.swing.JTextField credit2;
    private javax.swing.JTextField credit3;
    private javax.swing.JTextField credit4;
    private javax.swing.JTextField g1;
    private javax.swing.JTextField g2;
    private javax.swing.JTextField g3;
    private javax.swing.JTextField g4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField result;
    private javax.swing.JButton submit;
    // End of variables declaration//GEN-END:variables
}
