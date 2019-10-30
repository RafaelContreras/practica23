/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica23;

import javax.swing.JOptionPane;

/**
 *
 * @author 18puerib0424
 */
public class FrmInicio extends javax.swing.JFrame {

    /**
     * Creates new form FrmInicio
     */
    public FrmInicio() {
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

        lblTitulo = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblCuadrado = new javax.swing.JLabel();
        txtLado = new javax.swing.JTextField();
        lblLado = new javax.swing.JLabel();
        btnCalcularCuadro = new javax.swing.JButton();
        lblResultadoCuadro = new javax.swing.JLabel();
        lblAreaCuadro = new javax.swing.JLabel();
        lblTriangulo = new javax.swing.JLabel();
        lblAltura = new javax.swing.JLabel();
        txtAlturaTriangulo = new javax.swing.JTextField();
        btnCalcularTriangulo = new javax.swing.JButton();
        txtBaseTriangulo = new javax.swing.JTextField();
        lblBase = new javax.swing.JLabel();
        lblResultadoTriangulo = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        lblRadio = new javax.swing.JLabel();
        txtRadio = new javax.swing.JTextField();
        btnCalcularCirculo = new javax.swing.JButton();
        lblResultadoCirculo = new javax.swing.JLabel();
        lblRombo = new javax.swing.JLabel();
        lblDiaMayor = new javax.swing.JLabel();
        txtDiaMayor = new javax.swing.JTextField();
        lblDiaMenor = new javax.swing.JLabel();
        txtDiaMenor = new javax.swing.JTextField();
        btnCalcularRombo = new javax.swing.JButton();
        lblResultadoRombo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Calculadora de figuras");
        setBackground(new java.awt.Color(153, 153, 153));
        setForeground(new java.awt.Color(153, 153, 153));
        setIconImages(null);
        setResizable(false);

        lblTitulo.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        lblTitulo.setText("Área de figuras geométricas");
        lblTitulo.setToolTipText("");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/practica23/CuadradoRojo.jpg"))); // NOI18N
        jLabel2.setText("jLabel2");

        lblCuadrado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/practica23/CuadradoRojo.jpg"))); // NOI18N
        lblCuadrado.setText("jLabel1");

        txtLado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLadoActionPerformed(evt);
            }
        });

        lblLado.setText("Lado");
        lblLado.setName(""); // NOI18N

        btnCalcularCuadro.setText("Calcular");
        btnCalcularCuadro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularCuadroActionPerformed(evt);
            }
        });

        lblResultadoCuadro.setText("Resultado");

        lblAreaCuadro.setText("Area");

        lblTriangulo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/practica23/TrianguloRosa.png"))); // NOI18N
        lblTriangulo.setText("jLabel1");

        lblAltura.setText("Altura");

        btnCalcularTriangulo.setText("Calcular");
        btnCalcularTriangulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularTrianguloActionPerformed(evt);
            }
        });

        lblBase.setText("Base");

        lblResultadoTriangulo.setText("Resultado");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/practica23/CirculoNegro.png"))); // NOI18N

        lblRadio.setText("Radio");

        btnCalcularCirculo.setText("Calcular");
        btnCalcularCirculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularCirculoActionPerformed(evt);
            }
        });

        lblResultadoCirculo.setText("Resultado");

        lblRombo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/practica23/RomboNegro.png"))); // NOI18N

        lblDiaMayor.setText("Diametro Mayor");

        lblDiaMenor.setText("Diametro Menor");

        btnCalcularRombo.setText("Calcular");
        btnCalcularRombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularRomboActionPerformed(evt);
            }
        });

        lblResultadoRombo.setText("Resultado");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(19, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(37, 37, 37)
                                .addComponent(lblTriangulo, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lblAltura)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(txtAlturaTriangulo, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(40, 40, 40)
                                                .addComponent(txtBaseTriangulo, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(25, 25, 25)
                                        .addComponent(btnCalcularTriangulo)
                                        .addGap(75, 75, 75)
                                        .addComponent(lblResultadoTriangulo))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblCuadrado, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(28, 28, 28)
                                        .addComponent(btnCalcularCuadro))
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(lblBase)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(lblLado)
                                                .addComponent(txtLado, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(25, 25, 25)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lblResultadoCuadro)
                                            .addComponent(lblAreaCuadro))))))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addComponent(lblRombo)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblDiaMayor)
                                    .addComponent(txtDiaMayor, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnCalcularRombo)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblRadio)
                                    .addComponent(txtRadio, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnCalcularCirculo))))
                        .addGap(74, 74, 74)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblResultadoCirculo)
                            .addComponent(txtDiaMenor, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblDiaMenor)
                            .addComponent(lblResultadoRombo))))
                .addGap(103, 103, 103))
            .addGroup(layout.createSequentialGroup()
                .addGap(326, 326, 326)
                .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblLado)
                            .addComponent(lblAreaCuadro))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtLado, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblResultadoCuadro))
                        .addGap(18, 18, 18)
                        .addComponent(btnCalcularCuadro))
                    .addComponent(lblCuadrado)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lblDiaMayor)
                                .addComponent(lblDiaMenor))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtDiaMayor, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtDiaMenor, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lblResultadoRombo)
                                .addComponent(btnCalcularRombo)))
                        .addComponent(lblRombo)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(lblTriangulo, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblAltura)
                            .addComponent(lblBase))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtBaseTriangulo, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                            .addComponent(txtAlturaTriangulo))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnCalcularTriangulo)
                            .addComponent(lblResultadoTriangulo)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblRadio)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtRadio, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(btnCalcularCirculo)
                                    .addComponent(lblResultadoCirculo)))
                            .addComponent(jLabel1))
                        .addGap(27, 27, 27))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtLadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLadoActionPerformed

    private void btnCalcularCuadroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularCuadroActionPerformed
       try{
        double lado= Double. parseDouble(txtLado.getText());
       lblAreaCuadro.setText(String.valueOf(Math.pow(lado,2)));
       }catch (NumberFormatException ex) {
           JOptionPane.showMessageDialog(null, "Error, debe de colocar un valor estrictamente numerico");
       }
    }//GEN-LAST:event_btnCalcularCuadroActionPerformed

    private void btnCalcularTrianguloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularTrianguloActionPerformed
        try{
            double base = Double.parseDouble(txtBaseTriangulo.getText());
            double altura = Double.parseDouble(txtAlturaTriangulo.getText());
            lblResultadoTriangulo.setText(String.valueOf(base * altura / 2));
            txtBaseTriangulo.setText("");
            txtAlturaTriangulo.setText("");
        
        }catch (NumberFormatException ex) {
              JOptionPane.showMessageDialog(null, "Error, debe de colocar un valor estrictamente numerico");
        }
    }//GEN-LAST:event_btnCalcularTrianguloActionPerformed

    private void btnCalcularCirculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularCirculoActionPerformed
        try {
            double radio= Double.parseDouble(txtRadio.getText());
            lblResultadoCirculo.setText(String.valueOf(Math.PI * Math.pow(radio, 2)));
            txtRadio.setText("");
        }catch (NumberFormatException ex) {
              JOptionPane.showMessageDialog(null, "Error, debe de colocar un valor estrictamente numerico");
        }
    }//GEN-LAST:event_btnCalcularCirculoActionPerformed

    private void btnCalcularRomboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularRomboActionPerformed
       try{
           double DiaMayor=Double.parseDouble(txtDiaMayor.getText());
           double DiaMenor=Double.parseDouble(txtDiaMenor.getText());
           lblResultadoRombo.setText(String.valueOf(DiaMayor*DiaMenor / 2));
           txtDiaMayor.setText("");
           txtDiaMenor.setText("");
            }catch (NumberFormatException ex) {
              JOptionPane.showMessageDialog(null, "Error, debe de colocar un valor estrictamente numerico");
       }
    }//GEN-LAST:event_btnCalcularRomboActionPerformed

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
            java.util.logging.Logger.getLogger(FrmInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmInicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCalcularCirculo;
    private javax.swing.JButton btnCalcularCuadro;
    private javax.swing.JButton btnCalcularRombo;
    private javax.swing.JButton btnCalcularTriangulo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lblAltura;
    private javax.swing.JLabel lblAreaCuadro;
    private javax.swing.JLabel lblBase;
    private javax.swing.JLabel lblCuadrado;
    private javax.swing.JLabel lblDiaMayor;
    private javax.swing.JLabel lblDiaMenor;
    private javax.swing.JLabel lblLado;
    private javax.swing.JLabel lblRadio;
    private javax.swing.JLabel lblResultadoCirculo;
    private javax.swing.JLabel lblResultadoCuadro;
    private javax.swing.JLabel lblResultadoRombo;
    private javax.swing.JLabel lblResultadoTriangulo;
    private javax.swing.JLabel lblRombo;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JLabel lblTriangulo;
    private javax.swing.JTextField txtAlturaTriangulo;
    private javax.swing.JTextField txtBaseTriangulo;
    private javax.swing.JTextField txtDiaMayor;
    private javax.swing.JTextField txtDiaMenor;
    private javax.swing.JTextField txtLado;
    private javax.swing.JTextField txtRadio;
    // End of variables declaration//GEN-END:variables
}
