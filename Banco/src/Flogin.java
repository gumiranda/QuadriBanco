import javax.swing.*;
public class Flogin extends javax.swing.JFrame {
    public static void main(String args[]) {  
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Flogin().setVisible(true);
            }
        });
    }
    
    public Flogin() {
        initComponents();
    }
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pDados = new javax.swing.JPanel();
        lNome = new javax.swing.JLabel();
        tNome = new javax.swing.JTextField();
        lSenha = new javax.swing.JLabel();
        tSenha = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        bOK = new javax.swing.JButton();
        bCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        pDados.setBorder(javax.swing.BorderFactory.createTitledBorder("Dados"));
        pDados.setToolTipText("");

        lNome.setText("Nome:");

        lSenha.setText("Senha:");

        tSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tSenhaActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/13516358_10206109215721272_6847997602060323443_n.jpg"))); // NOI18N
        jLabel1.setText(" ");

        bOK.setText("OK");
        bOK.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bOK.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bOKMouseClicked(evt);
            }
        });
        bOK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bOKActionPerformed(evt);
            }
        });

        bCancelar.setText("Cancelar");
        bCancelar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bCancelar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bCancelarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout pDadosLayout = new javax.swing.GroupLayout(pDados);
        pDados.setLayout(pDadosLayout);
        pDadosLayout.setHorizontalGroup(
            pDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pDadosLayout.createSequentialGroup()
                .addGroup(pDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pDadosLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(pDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tNome, javax.swing.GroupLayout.DEFAULT_SIZE, 227, Short.MAX_VALUE)
                            .addComponent(lNome)
                            .addComponent(lSenha)
                            .addComponent(tSenha)))
                    .addGroup(pDadosLayout.createSequentialGroup()
                        .addComponent(bOK, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                        .addComponent(bCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addContainerGap())
        );
        pDadosLayout.setVerticalGroup(
            pDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pDadosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lNome)
                .addGap(4, 4, 4)
                .addComponent(tNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 9, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(tSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bOK, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(pDadosLayout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pDados, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pDados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bOKMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bOKMouseClicked
        JOptionPane.showMessageDialog(null, "O Usuário " + tNome.getText() + " Se Logou" );
    }//GEN-LAST:event_bOKMouseClicked

    private void bCancelarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bCancelarMouseClicked
        System.exit(0);
    }//GEN-LAST:event_bCancelarMouseClicked

    private void bOKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bOKActionPerformed
        // TODO add your handling code here:
        if(tNome.getText().equals("admin")&& tSenha.getText().equals("admin")){
        Main2 main = new Main2();
        main.setVisible(true);
        this.setVisible(false);
        }
        else {
            JOptionPane.showMessageDialog(this,"Usuário inválido");
        }
        
    }//GEN-LAST:event_bOKActionPerformed

    private void tSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tSenhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tSenhaActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bCancelar;
    private javax.swing.JButton bOK;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lNome;
    private javax.swing.JLabel lSenha;
    private javax.swing.JPanel pDados;
    private javax.swing.JTextField tNome;
    private javax.swing.JPasswordField tSenha;
    // End of variables declaration//GEN-END:variables


}
