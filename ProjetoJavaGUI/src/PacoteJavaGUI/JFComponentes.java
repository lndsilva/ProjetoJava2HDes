/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PacoteJavaGUI;

import javax.swing.JOptionPane;

/**
 *
 * @author Laercio-pc
 */
public class JFComponentes extends javax.swing.JFrame {

    /**
     * Creates new form JFComponentes
     */
    public JFComponentes() {
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

        btgSexo = new javax.swing.ButtonGroup();
        btnSelecionou = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        rdbFeminino = new javax.swing.JRadioButton();
        rdbMasculino = new javax.swing.JRadioButton();
        btnResponder1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        ckbVingadores = new javax.swing.JCheckBox();
        ckbAOrigem = new javax.swing.JCheckBox();
        ckbToyStory4 = new javax.swing.JCheckBox();
        ckbCoringa = new javax.swing.JCheckBox();
        btnSelecionaFilmes = new javax.swing.JButton();
        cbbSelecionou = new javax.swing.JComboBox<>();
        btnCarregaCombo = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        lstEstados = new javax.swing.JList<>();
        jLabel2 = new javax.swing.JLabel();
        lblRecebeEstado = new javax.swing.JLabel();
        btnRecebeNome = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnSelecionou.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        btnSelecionou.setText("Selecionou");
        btnSelecionou.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSelecionouActionPerformed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Sexo:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Segoe UI", 0, 18))); // NOI18N
        jPanel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N

        btgSexo.add(rdbFeminino);
        rdbFeminino.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        rdbFeminino.setText("Feminino");

        btgSexo.add(rdbMasculino);
        rdbMasculino.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        rdbMasculino.setText("Masculino");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rdbFeminino)
                    .addComponent(rdbMasculino))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(rdbFeminino)
                .addGap(18, 18, 18)
                .addComponent(rdbMasculino)
                .addContainerGap(46, Short.MAX_VALUE))
        );

        btnResponder1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        btnResponder1.setText("Botão responde");
        btnResponder1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResponder1ActionPerformed(evt);
            }
        });

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Escolha seu filme", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Segoe UI", 0, 24))); // NOI18N

        ckbVingadores.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        ckbVingadores.setText("Vingadores");

        ckbAOrigem.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        ckbAOrigem.setText("A origem");

        ckbToyStory4.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        ckbToyStory4.setText("Toy Story 4");

        ckbCoringa.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        ckbCoringa.setText("Coringa");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ckbVingadores)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                            .addComponent(ckbCoringa)
                            .addGap(38, 38, 38))
                        .addComponent(ckbToyStory4)
                        .addComponent(ckbAOrigem)))
                .addContainerGap(64, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(ckbVingadores)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ckbCoringa)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ckbToyStory4)
                .addGap(18, 18, 18)
                .addComponent(ckbAOrigem)
                .addGap(0, 33, Short.MAX_VALUE))
        );

        btnSelecionaFilmes.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        btnSelecionaFilmes.setText("Selecionou");
        btnSelecionaFilmes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSelecionaFilmesActionPerformed(evt);
            }
        });

        cbbSelecionou.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cbbSelecionouMouseClicked(evt);
            }
        });

        btnCarregaCombo.setText("Carrega estados");
        btnCarregaCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCarregaComboActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Estados");

        lstEstados.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "São Paulo", "Rio de Janeiro", "Belo Horizonte" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(lstEstados);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel2.setText("Nome do Estado:");

        lblRecebeEstado.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblRecebeEstado.setText("Nome do Estado");

        btnRecebeNome.setText("Recebe Nome");
        btnRecebeNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRecebeNomeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnResponder1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnSelecionou, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(40, 40, 40)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addComponent(btnSelecionaFilmes, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 84, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbbSelecionou, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblRecebeEstado)
                    .addComponent(btnCarregaCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRecebeNome, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addComponent(btnSelecionou, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(180, 180, 180)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnResponder1, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addComponent(lblRecebeEstado)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(btnSelecionaFilmes, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cbbSelecionou, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnCarregaCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnRecebeNome, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(58, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSelecionouActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSelecionouActionPerformed
        // TODO add your handling code here:

        if (rdbFeminino.isSelected() == false && rdbMasculino.isSelected() == false) {
            JOptionPane.showMessageDialog(null, "Favor selecionar um sexo");
        } else {

            if (rdbFeminino.isSelected()) {
                JOptionPane.showMessageDialog(null, "Você selecionou o sexo feminino");
            }
            if (rdbMasculino.isSelected()) {
                JOptionPane.showMessageDialog(null, "Você selecionou o sexo masculino");
            }
        }


    }//GEN-LAST:event_btnSelecionouActionPerformed

    private void btnResponder1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResponder1ActionPerformed
        // TODO add your handling code here:

        int resposta = JOptionPane.showConfirmDialog(null, "Deseja realmente excluir os valores?");

        if (resposta == 0) {
            JOptionPane.showMessageDialog(null, "Você escolheu o sim");
        }
        if (resposta == 1) {
            JOptionPane.showMessageDialog(null, "Você escolheu o não");
        }
        if (resposta == 2) {
            JOptionPane.showMessageDialog(null, "Você escolheu o cancelar");
        }
    }//GEN-LAST:event_btnResponder1ActionPerformed

    private void btnSelecionaFilmesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSelecionaFilmesActionPerformed
        // TODO add your handling code here:

        if (ckbVingadores.isSelected() == false && ckbCoringa.isSelected() == false && ckbAOrigem.isSelected() == false && ckbToyStory4.isSelected() == false) {
            JOptionPane.showMessageDialog(null, "Favor selecionar pelo menos um item");
        } else {

            if (ckbVingadores.isSelected()) {
                JOptionPane.showMessageDialog(null, "Você escolheu o filme vingadores");
            }
            if (ckbCoringa.isSelected()) {
                JOptionPane.showMessageDialog(null, "Você escolheu o filme Coringa");
            }
            if (ckbAOrigem.isSelected()) {
                JOptionPane.showMessageDialog(null, "Você escolheu o filme A Origem");
            }
            if (ckbToyStory4.isSelected()) {
                JOptionPane.showMessageDialog(null, "Você escolheu o filme Toy Story 4");
            }
        }

    }//GEN-LAST:event_btnSelecionaFilmesActionPerformed

    private void btnCarregaComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCarregaComboActionPerformed
        // TODO add your handling code here:
        
         cbbSelecionou.removeAllItems();
        
        cbbSelecionou.addItem("São Paulo");
        cbbSelecionou.addItem("Rio de Janeiro");
        cbbSelecionou.addItem("Belo Horizonte");
        cbbSelecionou.addItem("Pernambuco");
        cbbSelecionou.addItem("Manaus"); 
        
        
    }//GEN-LAST:event_btnCarregaComboActionPerformed

    private void btnRecebeNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRecebeNomeActionPerformed
        // TODO add your handling code here:
          int estado = cbbSelecionou.getSelectedIndex();
        
        lblRecebeEstado.setText(String.valueOf(estado)); 
    }//GEN-LAST:event_btnRecebeNomeActionPerformed

    private void cbbSelecionouMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cbbSelecionouMouseClicked
        // TODO add your handling code here:
      
    }//GEN-LAST:event_cbbSelecionouMouseClicked

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
            java.util.logging.Logger.getLogger(JFComponentes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFComponentes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFComponentes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFComponentes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFComponentes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup btgSexo;
    private javax.swing.JButton btnCarregaCombo;
    private javax.swing.JButton btnRecebeNome;
    private javax.swing.JButton btnResponder1;
    private javax.swing.JButton btnSelecionaFilmes;
    private javax.swing.JButton btnSelecionou;
    private javax.swing.JComboBox<String> cbbSelecionou;
    private javax.swing.JCheckBox ckbAOrigem;
    private javax.swing.JCheckBox ckbCoringa;
    private javax.swing.JCheckBox ckbToyStory4;
    private javax.swing.JCheckBox ckbVingadores;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblRecebeEstado;
    private javax.swing.JList<String> lstEstados;
    private javax.swing.JRadioButton rdbFeminino;
    private javax.swing.JRadioButton rdbMasculino;
    // End of variables declaration//GEN-END:variables
}
