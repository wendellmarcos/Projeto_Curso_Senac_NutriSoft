/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package nutrisoft.telas;

import javax.swing.JOptionPane;

/**
 *
 * @author Wendell Marcos
 */
public class TelaRecomendacoes extends javax.swing.JFrame {

    /**
     * Creates new form TelaRecomendacoes
     */
    public TelaRecomendacoes() {
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
        btnCalcularRecomendacoes = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        fieldCaloriasRecomendacoes = new javax.swing.JTextField();
        btnLimparCampos = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        fieldCarboidradosResposta = new javax.swing.JTextField();
        fieldProteinasResposta = new javax.swing.JTextField();
        fieldGorduraResposta = new javax.swing.JTextField();
        btnVoltarRecomendacoes = new javax.swing.JButton();
        finalizarPrograma = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximizedBounds(new java.awt.Rectangle(500, 470, 0, 0));
        setMinimumSize(new java.awt.Dimension(470, 450));
        setUndecorated(true);
        setResizable(false);

        btnCalcularRecomendacoes.setText("Calcular");
        btnCalcularRecomendacoes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularRecomendacoesActionPerformed(evt);
            }
        });

        jLabel4.setText("Calorias diarias (Kcal):");

        fieldCaloriasRecomendacoes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldCaloriasRecomendacoesActionPerformed(evt);
            }
        });

        btnLimparCampos.setText("Limpar");
        btnLimparCampos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparCamposActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnCalcularRecomendacoes)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnLimparCampos))
                    .addComponent(fieldCaloriasRecomendacoes, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(33, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(fieldCaloriasRecomendacoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCalcularRecomendacoes)
                    .addComponent(btnLimparCampos)))
        );

        jLabel1.setText("Carboidratos (50%):");

        jLabel2.setText("Proteinas (25%):");

        jLabel3.setText("Gordura (25%):");

        fieldCarboidradosResposta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldCarboidradosRespostaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(fieldCarboidradosResposta, javax.swing.GroupLayout.DEFAULT_SIZE, 83, Short.MAX_VALUE)
                    .addComponent(fieldProteinasResposta)
                    .addComponent(fieldGorduraResposta))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(fieldCarboidradosResposta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(fieldProteinasResposta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(fieldGorduraResposta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnVoltarRecomendacoes.setText("Voltar");
        btnVoltarRecomendacoes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnVoltarRecomendacoes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarRecomendacoesActionPerformed(evt);
            }
        });

        finalizarPrograma.setText("Sair");
        finalizarPrograma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                finalizarProgramaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(124, 124, 124)
                        .addComponent(btnVoltarRecomendacoes, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(finalizarPrograma, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnVoltarRecomendacoes)
                    .addComponent(finalizarPrograma))
                .addContainerGap(89, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnVoltarRecomendacoesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarRecomendacoesActionPerformed
        dispose();
    }//GEN-LAST:event_btnVoltarRecomendacoesActionPerformed

    private void finalizarProgramaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_finalizarProgramaActionPerformed
        System.exit(0);
    }//GEN-LAST:event_finalizarProgramaActionPerformed

    private void btnCalcularRecomendacoesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularRecomendacoesActionPerformed

        String erro = "O campo Caloria precisa ser preenchido! ";
        try {

            if (fieldCaloriasRecomendacoes.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, erro);
            } else {
                double calorias = Double.parseDouble(fieldCaloriasRecomendacoes.getText().replace(",", "."));
                double carboidratos = (calorias * 0.5) / 4;
                double proteinas = (calorias * 0.25) / 4;
                double gordura = (calorias * 0.25) / 9;

                String txtCaboidratos = String.format("%.2f", carboidratos);
                String txtProteinas = String.format("%.2f", proteinas);
                String txtGordura = String.format("%.2f", gordura);

                fieldCarboidradosResposta.setText(txtCaboidratos);
                fieldProteinasResposta.setText(txtProteinas);
                fieldGorduraResposta.setText(txtGordura);
            }
        } catch (NumberFormatException error) {
            JOptionPane.showMessageDialog(null, erro + error.getMessage());
            return;
        }

    }//GEN-LAST:event_btnCalcularRecomendacoesActionPerformed

    private void fieldCaloriasRecomendacoesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldCaloriasRecomendacoesActionPerformed

    }//GEN-LAST:event_fieldCaloriasRecomendacoesActionPerformed

    private void fieldCarboidradosRespostaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldCarboidradosRespostaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fieldCarboidradosRespostaActionPerformed

    private void btnLimparCamposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparCamposActionPerformed
        limpar();

    }//GEN-LAST:event_btnLimparCamposActionPerformed

    public void limpar() {
        fieldCaloriasRecomendacoes.setText("");
        fieldCarboidradosResposta.setText("");
        fieldProteinasResposta.setText("");
        fieldGorduraResposta.setText("");

    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCalcularRecomendacoes;
    private javax.swing.JButton btnLimparCampos;
    private javax.swing.JButton btnVoltarRecomendacoes;
    private javax.swing.JTextField fieldCaloriasRecomendacoes;
    private javax.swing.JTextField fieldCarboidradosResposta;
    private javax.swing.JTextField fieldGorduraResposta;
    private javax.swing.JTextField fieldProteinasResposta;
    private javax.swing.JButton finalizarPrograma;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}