import javax.swing.JOptionPane;

public class TelaExcluirCliente extends javax.swing.JInternalFrame {

    public TelaExcluirCliente() {
        initComponents();
    }
                         
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jnome = new javax.swing.JTextPane();
        jexcluir = new javax.swing.JButton();
        jcancelar = new javax.swing.JButton();

        setTitle("Excluir cliente");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel1.setText("Nome do cliente:");

        jScrollPane1.setViewportView(jnome);

        jexcluir.setText("Excluir");
        jexcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jexcluirActionPerformed(evt);
            }
        });

        jcancelar.setText("Cancelar");
        jcancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addGap(23, 23, 23))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(146, Short.MAX_VALUE)
                .addComponent(jcancelar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jexcluir)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jexcluir)
                    .addComponent(jcancelar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
    }                   

    private void jexcluirActionPerformed(java.awt.event.ActionEvent evt) {                                         
        Cliente c = BaseDadosClientes.buscar(jnome.getText());
        
        if(c == null)
            JOptionPane.showMessageDialog(this, "Cliente não encontrado");
        else                                                
        {
            Conta con = BaseDadosContas.buscarPorCliente(jnome.getText());
            if(con != null)
            {
                CartaoDeCredito cartao = BaseDadosCartoesDeCredito.buscarPorConta(con);
                if(cartao != null)
                    BaseDadosCartoesDeCredito.excluir(cartao.getCodigo());
                BaseDadosContas.excluir(con.getIdCliente());
            }
            BaseDadosClientes.excluiCadastro(c,"clientes.dat");
            JOptionPane.showMessageDialog(this, "Cliente excluido");
            getContentPane().remove(jexcluir);
            TelaExcluirCliente.this.dispose();
            jexcluir = null;  
        }
    }                                        

    private void jcancelarActionPerformed(java.awt.event.ActionEvent evt) {                                          
        getContentPane().remove(jcancelar);
        TelaExcluirCliente.this.dispose();
        jcancelar = null;  
    }                                         
                   
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jcancelar;
    private javax.swing.JButton jexcluir;
    private javax.swing.JTextPane jnome;               
}
