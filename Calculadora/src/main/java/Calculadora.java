
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;



public class Calculadora extends javax.swing.JFrame {
    
    ScriptEngineManager sem = new ScriptEngineManager();
    ScriptEngine se = sem.getEngineByName("JavaScript");
    
    public Calculadora() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txtOperacion = new javax.swing.JLabel();
        txtResultado = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        boton_c = new javax.swing.JButton();
        boton_borrar = new javax.swing.JButton();
        boton_porc = new javax.swing.JButton();
        boton_div = new javax.swing.JButton();
        boton_x = new javax.swing.JButton();
        boton_menos = new javax.swing.JButton();
        boton_mas = new javax.swing.JButton();
        boton_9 = new javax.swing.JButton();
        boton_6 = new javax.swing.JButton();
        boton_3 = new javax.swing.JButton();
        boton_7 = new javax.swing.JButton();
        boton_4 = new javax.swing.JButton();
        boton_1 = new javax.swing.JButton();
        boton_0 = new javax.swing.JButton();
        boton_igual = new javax.swing.JButton();
        boton_2 = new javax.swing.JButton();
        boton_5 = new javax.swing.JButton();
        boton_8 = new javax.swing.JButton();
        boton_coma = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(244, 253, 251));

        txtOperacion.setFont(new java.awt.Font("Courier", 0, 18)); // NOI18N
        txtOperacion.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        txtResultado.setFont(new java.awt.Font("Courier", 0, 48)); // NOI18N
        txtResultado.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtResultado, javax.swing.GroupLayout.DEFAULT_SIZE, 258, Short.MAX_VALUE)
                    .addComponent(txtOperacion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(txtOperacion, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtResultado, javax.swing.GroupLayout.DEFAULT_SIZE, 71, Short.MAX_VALUE)
                .addContainerGap())
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 270, 130));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        boton_c.setFont(new java.awt.Font("Courier", 0, 24)); // NOI18N
        boton_c.setText("C");
        boton_c.setFocusPainted(false);
        boton_c.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_cActionPerformed(evt);
            }
        });
        jPanel2.add(boton_c, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 50, 50));

        boton_borrar.setFont(new java.awt.Font("Courier", 0, 24)); // NOI18N
        boton_borrar.setText("<");
        boton_borrar.setFocusPainted(false);
        boton_borrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_borrarActionPerformed(evt);
            }
        });
        jPanel2.add(boton_borrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 20, 50, 50));

        boton_porc.setFont(new java.awt.Font("Courier", 0, 24)); // NOI18N
        boton_porc.setText("%");
        boton_porc.setFocusPainted(false);
        boton_porc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_porcActionPerformed(evt);
            }
        });
        jPanel2.add(boton_porc, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 20, 50, 50));

        boton_div.setFont(new java.awt.Font("Courier", 0, 24)); // NOI18N
        boton_div.setText("/");
        boton_div.setFocusPainted(false);
        boton_div.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_divActionPerformed(evt);
            }
        });
        jPanel2.add(boton_div, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 20, 50, 50));

        boton_x.setFont(new java.awt.Font("Courier", 0, 24)); // NOI18N
        boton_x.setText("x");
        boton_x.setFocusPainted(false);
        boton_x.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_xActionPerformed(evt);
            }
        });
        jPanel2.add(boton_x, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 80, 50, 50));

        boton_menos.setFont(new java.awt.Font("Courier", 0, 24)); // NOI18N
        boton_menos.setText("-");
        boton_menos.setFocusPainted(false);
        boton_menos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_menosActionPerformed(evt);
            }
        });
        jPanel2.add(boton_menos, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 140, 50, 50));

        boton_mas.setFont(new java.awt.Font("Courier", 0, 24)); // NOI18N
        boton_mas.setText("+");
        boton_mas.setFocusPainted(false);
        boton_mas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_masActionPerformed(evt);
            }
        });
        jPanel2.add(boton_mas, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 200, 50, 50));

        boton_9.setFont(new java.awt.Font("Courier", 0, 24)); // NOI18N
        boton_9.setText("9");
        boton_9.setFocusPainted(false);
        boton_9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_9ActionPerformed(evt);
            }
        });
        jPanel2.add(boton_9, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 80, 50, 50));

        boton_6.setFont(new java.awt.Font("Courier", 0, 24)); // NOI18N
        boton_6.setText("6");
        boton_6.setFocusPainted(false);
        boton_6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_6ActionPerformed(evt);
            }
        });
        jPanel2.add(boton_6, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 140, 50, 50));

        boton_3.setFont(new java.awt.Font("Courier", 0, 24)); // NOI18N
        boton_3.setText("3");
        boton_3.setFocusPainted(false);
        boton_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_3ActionPerformed(evt);
            }
        });
        jPanel2.add(boton_3, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 200, 50, 50));

        boton_7.setFont(new java.awt.Font("Courier", 0, 24)); // NOI18N
        boton_7.setText("7");
        boton_7.setFocusPainted(false);
        boton_7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_7ActionPerformed(evt);
            }
        });
        jPanel2.add(boton_7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 50, 50));

        boton_4.setFont(new java.awt.Font("Courier", 0, 24)); // NOI18N
        boton_4.setText("4");
        boton_4.setFocusPainted(false);
        boton_4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_4ActionPerformed(evt);
            }
        });
        jPanel2.add(boton_4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 50, 50));

        boton_1.setFont(new java.awt.Font("Courier", 0, 24)); // NOI18N
        boton_1.setText("1");
        boton_1.setFocusPainted(false);
        boton_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_1ActionPerformed(evt);
            }
        });
        jPanel2.add(boton_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 50, 50));

        boton_0.setFont(new java.awt.Font("Courier", 0, 24)); // NOI18N
        boton_0.setText("0");
        boton_0.setFocusPainted(false);
        boton_0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_0ActionPerformed(evt);
            }
        });
        jPanel2.add(boton_0, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, 110, 50));

        boton_igual.setFont(new java.awt.Font("Courier", 0, 24)); // NOI18N
        boton_igual.setText("=");
        boton_igual.setFocusPainted(false);
        boton_igual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_igualActionPerformed(evt);
            }
        });
        jPanel2.add(boton_igual, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 260, 50, 50));

        boton_2.setFont(new java.awt.Font("Courier", 0, 24)); // NOI18N
        boton_2.setText("2");
        boton_2.setFocusPainted(false);
        boton_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_2ActionPerformed(evt);
            }
        });
        jPanel2.add(boton_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 200, 50, 50));

        boton_5.setFont(new java.awt.Font("Courier", 0, 24)); // NOI18N
        boton_5.setText("5");
        boton_5.setFocusPainted(false);
        boton_5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_5ActionPerformed(evt);
            }
        });
        jPanel2.add(boton_5, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 140, 50, 50));

        boton_8.setFont(new java.awt.Font("Courier", 0, 24)); // NOI18N
        boton_8.setText("8");
        boton_8.setFocusPainted(false);
        boton_8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_8ActionPerformed(evt);
            }
        });
        jPanel2.add(boton_8, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 80, 50, 50));

        boton_coma.setFont(new java.awt.Font("Courier", 0, 24)); // NOI18N
        boton_coma.setText(",");
        boton_coma.setFocusPainted(false);
        boton_coma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_comaActionPerformed(evt);
            }
        });
        jPanel2.add(boton_coma, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 260, 50, 50));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 270, 330));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void boton_cActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_cActionPerformed
        txtOperacion.setText("");
        txtResultado.setText("");
    }//GEN-LAST:event_boton_cActionPerformed

    private void boton_borrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_borrarActionPerformed
        String texto = txtOperacion.getText().substring(0, txtOperacion.getText().length() - 1);
        txtOperacion.setText(texto);
        boton_igual.doClick();
    }//GEN-LAST:event_boton_borrarActionPerformed

    private void boton_7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_7ActionPerformed
        addNumber("7");
        boton_igual.doClick();
    }//GEN-LAST:event_boton_7ActionPerformed

    private void boton_8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_8ActionPerformed
        addNumber("8");
        boton_igual.doClick();
    }//GEN-LAST:event_boton_8ActionPerformed

    private void boton_9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_9ActionPerformed
        addNumber("9");
        boton_igual.doClick();
    }//GEN-LAST:event_boton_9ActionPerformed

    private void boton_4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_4ActionPerformed
        addNumber("4");
        boton_igual.doClick();
    }//GEN-LAST:event_boton_4ActionPerformed

    private void boton_5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_5ActionPerformed
        addNumber("5");
        boton_igual.doClick();
    }//GEN-LAST:event_boton_5ActionPerformed

    private void boton_6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_6ActionPerformed
        addNumber("6");
        boton_igual.doClick();
    }//GEN-LAST:event_boton_6ActionPerformed

    private void boton_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_1ActionPerformed
        addNumber("1");
        boton_igual.doClick();
    }//GEN-LAST:event_boton_1ActionPerformed

    private void boton_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_2ActionPerformed
        addNumber("2");
        boton_igual.doClick();
    }//GEN-LAST:event_boton_2ActionPerformed

    private void boton_0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_0ActionPerformed
        addNumber("0");
        boton_igual.doClick();
    }//GEN-LAST:event_boton_0ActionPerformed

    private void boton_porcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_porcActionPerformed
        addNumber("%");
    }//GEN-LAST:event_boton_porcActionPerformed

    private void boton_divActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_divActionPerformed
        addNumber("/");
    }//GEN-LAST:event_boton_divActionPerformed

    private void boton_xActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_xActionPerformed
        addNumber("*");
    }//GEN-LAST:event_boton_xActionPerformed

    private void boton_menosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_menosActionPerformed
        addNumber("-");
    }//GEN-LAST:event_boton_menosActionPerformed

    private void boton_masActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_masActionPerformed
        addNumber("+");
    }//GEN-LAST:event_boton_masActionPerformed
        
    private void boton_igualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_igualActionPerformed
        //addNumber(" = ");
        try {
            String resultado = se.eval(txtOperacion.getText()).toString();
            txtResultado.setText(resultado);            
        } 
        catch (Exception e) { 
            txtResultado.setText("error");  
        }              
    }//GEN-LAST:event_boton_igualActionPerformed

    private void boton_3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_3ActionPerformed
        addNumber("3");
        boton_igual.doClick();
    }//GEN-LAST:event_boton_3ActionPerformed

    private void boton_comaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_comaActionPerformed
        addNumber(",");  
    }//GEN-LAST:event_boton_comaActionPerformed

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
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calculadora().setVisible(true);
            }
        });
    }
    
    // añade el dígito al texto que ya teníamos
    public void addNumber(String digito){
        txtOperacion.setText(txtOperacion.getText() + digito);
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton boton_0;
    private javax.swing.JButton boton_1;
    private javax.swing.JButton boton_2;
    private javax.swing.JButton boton_3;
    private javax.swing.JButton boton_4;
    private javax.swing.JButton boton_5;
    private javax.swing.JButton boton_6;
    private javax.swing.JButton boton_7;
    private javax.swing.JButton boton_8;
    private javax.swing.JButton boton_9;
    private javax.swing.JButton boton_borrar;
    private javax.swing.JButton boton_c;
    private javax.swing.JButton boton_coma;
    private javax.swing.JButton boton_div;
    private javax.swing.JButton boton_igual;
    private javax.swing.JButton boton_mas;
    private javax.swing.JButton boton_menos;
    private javax.swing.JButton boton_porc;
    private javax.swing.JButton boton_x;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel txtOperacion;
    private javax.swing.JLabel txtResultado;
    // End of variables declaration//GEN-END:variables
}
