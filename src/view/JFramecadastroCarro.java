/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

/**
 *
 * @author Alunos
 */
public class JFramecadastroCarro extends javax.swing.JFrame {

    /**
     * Creates new form JFramecadastroCarro
     */
    public JFramecadastroCarro() {
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
        buttonGroupQuantidadePortas = new javax.swing.ButtonGroup();
        jLabelCodigo = new javax.swing.JLabel();
        jTextFieldCodigo = new javax.swing.JTextField();
        jLabelNome = new javax.swing.JLabel();
        jTextFieldNome = new javax.swing.JTextField();
        jLabelCor = new javax.swing.JLabel();
        jComboBoxCor = new javax.swing.JComboBox();
        jLabelAnoFabricacao = new javax.swing.JLabel();
        jSpinnerAnoFabricação = new javax.swing.JSpinner();
        jLabelAnoLancamento = new javax.swing.JLabel();
        jSpinnerAnoLancamento = new javax.swing.JSpinner();
        jLabeltipoPneu = new javax.swing.JLabel();
        jTextFieldTipoPneu = new javax.swing.JTextField();
        jLabelQuantidadeBatidas = new javax.swing.JLabel();
        jTextFieldQuantidadeBatidas = new javax.swing.JTextField();
        jButtonSalvar = new javax.swing.JButton();
        jButtonCancelar = new javax.swing.JButton();
        jLabelFabricante = new javax.swing.JLabel();
        jTextFieldFabricante = new javax.swing.JTextField();
        jLabelPlaca = new javax.swing.JLabel();
        jTextFieldPlaca = new javax.swing.JTextField();
        jLabelChassi = new javax.swing.JLabel();
        jTextFieldChassi = new javax.swing.JTextField();
        jLabelQuilometragem = new javax.swing.JLabel();
        jTextFieldQuilometragem = new javax.swing.JTextField();
        jLabelPotencia = new javax.swing.JLabel();
        jTextFieldPotencia = new javax.swing.JTextField();
        jLabelDataCompra = new javax.swing.JLabel();
        jTextFieldDataCompra = new javax.swing.JTextField();
        jLabelEstaFuncional = new javax.swing.JLabel();
        jComboBoxEstaFuncional = new javax.swing.JComboBox();
        jLabelPermitidaCirculacao = new javax.swing.JLabel();
        jRadioButtonPermitidaCirculacaooSim = new javax.swing.JRadioButton();
        jRadioButtonPermitidaCirculacaooNao = new javax.swing.JRadioButton();
        jLabelQuantidadePortas = new javax.swing.JLabel();
        jRadioButtonQuantidadePortas2 = new javax.swing.JRadioButton();
        jRadioButtonQuantidadePortas3 = new javax.swing.JRadioButton();
        jRadioButtonQuantidadePortas4 = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabelCodigo.setText("codigo");

        jTextFieldCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCodigoActionPerformed(evt);
            }
        });

        jLabelNome.setText("nome");

        jLabelCor.setText("cor");

        jComboBoxCor.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Branco\t", "Prata\t", "Preto\t", "Cinza", "Vermelho", "Azul", "Bege", "Verde" }));

        jLabelAnoFabricacao.setText("Ano Fabricacao");

        jLabelAnoLancamento.setText("anoLancamento");

        jLabeltipoPneu.setText("Tipo Pneu");

        jLabelQuantidadeBatidas.setText("Quantidade de Batidas");

        jButtonSalvar.setText("Salvar");

        jButtonCancelar.setText("Cancelar");

        jLabelFabricante.setText("Fabricante");

        jLabelPlaca.setText("Placa");

        jLabelChassi.setText("Chassi");

        jLabelQuilometragem.setText("Quilometragem");

        jLabelPotencia.setText("Potencia");

        jTextFieldPotencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldPotenciaActionPerformed(evt);
            }
        });

        jLabelDataCompra.setText("Data Compra");

        jLabelEstaFuncional.setText("Esta Funcional");

        jComboBoxEstaFuncional.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Sim", "Não" }));
        jComboBoxEstaFuncional.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxEstaFuncionalActionPerformed(evt);
            }
        });

        jLabelPermitidaCirculacao.setText("Permitida Circulacao");

        jRadioButtonPermitidaCirculacaooSim.setText("Sim");

        jRadioButtonPermitidaCirculacaooNao.setText("Não");

        jLabelQuantidadePortas.setText("quantidade de Portas");

        buttonGroupQuantidadePortas.add(jRadioButtonQuantidadePortas2);
        jRadioButtonQuantidadePortas2.setText("2");

        buttonGroupQuantidadePortas.add(jRadioButtonQuantidadePortas3);
        jRadioButtonQuantidadePortas3.setText("3");

        buttonGroupQuantidadePortas.add(jRadioButtonQuantidadePortas4);
        jRadioButtonQuantidadePortas4.setText("4");

        jLabel2.setText("Descrição");

        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jScrollPane2.setViewportView(jTextArea2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelCor)
                            .addComponent(jLabelNome, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelCodigo)
                            .addComponent(jLabelAnoFabricacao)
                            .addComponent(jLabelAnoLancamento)
                            .addComponent(jLabeltipoPneu)
                            .addComponent(jLabelPotencia))
                        .addGap(52, 52, 52)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldCodigo)
                            .addComponent(jTextFieldNome)
                            .addComponent(jTextFieldPotencia)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jSpinnerAnoFabricação, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                                        .addComponent(jSpinnerAnoLancamento))
                                    .addComponent(jComboBoxCor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelQuantidadeBatidas)
                            .addComponent(jLabelPlaca)
                            .addComponent(jLabelQuilometragem)
                            .addComponent(jLabelFabricante)
                            .addComponent(jLabelChassi)
                            .addComponent(jLabelDataCompra)
                            .addComponent(jLabelQuantidadePortas)
                            .addComponent(jLabelEstaFuncional)
                            .addComponent(jLabelPermitidaCirculacao))
                        .addGap(16, 16, 16)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldTipoPneu)
                            .addComponent(jTextFieldQuantidadeBatidas)
                            .addComponent(jTextFieldFabricante)
                            .addComponent(jTextFieldPlaca)
                            .addComponent(jTextFieldChassi)
                            .addComponent(jTextFieldQuilometragem)
                            .addComponent(jTextFieldDataCompra)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jRadioButtonQuantidadePortas2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jRadioButtonQuantidadePortas3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jRadioButtonQuantidadePortas4))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jComboBoxEstaFuncional, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jRadioButtonPermitidaCirculacaooSim)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jRadioButtonPermitidaCirculacaooNao)))
                                .addGap(0, 25, Short.MAX_VALUE)))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(162, 162, 162)
                                .addComponent(jButtonCancelar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButtonSalvar))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(119, 119, 119)
                                .addComponent(jLabel2)))
                        .addGap(26, 26, 26))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(80, 80, 80))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelNome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelCor)
                            .addComponent(jComboBoxCor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelAnoFabricacao)
                            .addComponent(jSpinnerAnoFabricação, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelAnoLancamento)
                            .addComponent(jSpinnerAnoLancamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldTipoPneu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabeltipoPneu))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldPotencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelPotencia))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldQuantidadeBatidas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelQuantidadeBatidas))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldFabricante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelFabricante))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelPlaca))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldChassi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelChassi))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldQuilometragem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelQuilometragem))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelQuantidadePortas)
                            .addComponent(jRadioButtonQuantidadePortas2)
                            .addComponent(jRadioButtonQuantidadePortas3)
                            .addComponent(jRadioButtonQuantidadePortas4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelDataCompra)
                            .addComponent(jTextFieldDataCompra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jRadioButtonPermitidaCirculacaooSim)
                                .addComponent(jRadioButtonPermitidaCirculacaooNao))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabelPermitidaCirculacao)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabelEstaFuncional)
                                    .addComponent(jComboBoxEstaFuncional, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(21, 21, 21))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(340, 340, 340)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButtonSalvar)
                            .addComponent(jButtonCancelar))))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldCodigoActionPerformed

    private void jTextFieldPotenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldPotenciaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldPotenciaActionPerformed

    private void jComboBoxEstaFuncionalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxEstaFuncionalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxEstaFuncionalActionPerformed

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
            java.util.logging.Logger.getLogger(JFramecadastroCarro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFramecadastroCarro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFramecadastroCarro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFramecadastroCarro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFramecadastroCarro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroupQuantidadePortas;
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JButton jButtonSalvar;
    private javax.swing.JComboBox jComboBoxCor;
    private javax.swing.JComboBox jComboBoxEstaFuncional;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabelAnoFabricacao;
    private javax.swing.JLabel jLabelAnoLancamento;
    private javax.swing.JLabel jLabelChassi;
    private javax.swing.JLabel jLabelCodigo;
    private javax.swing.JLabel jLabelCor;
    private javax.swing.JLabel jLabelDataCompra;
    private javax.swing.JLabel jLabelEstaFuncional;
    private javax.swing.JLabel jLabelFabricante;
    private javax.swing.JLabel jLabelNome;
    private javax.swing.JLabel jLabelPermitidaCirculacao;
    private javax.swing.JLabel jLabelPlaca;
    private javax.swing.JLabel jLabelPotencia;
    private javax.swing.JLabel jLabelQuantidadeBatidas;
    private javax.swing.JLabel jLabelQuantidadePortas;
    private javax.swing.JLabel jLabelQuilometragem;
    private javax.swing.JLabel jLabeltipoPneu;
    private javax.swing.JRadioButton jRadioButtonPermitidaCirculacaooNao;
    private javax.swing.JRadioButton jRadioButtonPermitidaCirculacaooSim;
    private javax.swing.JRadioButton jRadioButtonQuantidadePortas2;
    private javax.swing.JRadioButton jRadioButtonQuantidadePortas3;
    private javax.swing.JRadioButton jRadioButtonQuantidadePortas4;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSpinner jSpinnerAnoFabricação;
    private javax.swing.JSpinner jSpinnerAnoLancamento;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextField jTextFieldChassi;
    private javax.swing.JTextField jTextFieldCodigo;
    private javax.swing.JTextField jTextFieldDataCompra;
    private javax.swing.JTextField jTextFieldFabricante;
    private javax.swing.JTextField jTextFieldNome;
    private javax.swing.JTextField jTextFieldPlaca;
    private javax.swing.JTextField jTextFieldPotencia;
    private javax.swing.JTextField jTextFieldQuantidadeBatidas;
    private javax.swing.JTextField jTextFieldQuilometragem;
    private javax.swing.JTextField jTextFieldTipoPneu;
    // End of variables declaration//GEN-END:variables
}