/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class TelaPesquisarFuncionario extends javax.swing.JInternalFrame {

    /**
     * Creates new form TelaPesquisar
     */
    public TelaPesquisarFuncionario(Funcionario c) {
        initComponents();
        nome.setText(c.getNome());
        cpf.setText(c.getCPF());
        nascimento.setText(c.getCTPS());
        endereco.setText(c.getEndereco());
        telefone.setText(c.getTelefone());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        telefone = new javax.swing.JTextField();
        celular = new javax.swing.JTextField();
        email = new javax.swing.JTextField();
        endereco = new javax.swing.JTextField();
        cpf = new javax.swing.JTextField();
        nome = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        nascimento = new javax.swing.JTextField();
        voltar = new javax.swing.JButton();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setClosable(true);
        setTitle("Pesquisar");
        setNormalBounds(new java.awt.Rectangle(0, 0, 81, 0));
        setPreferredSize(new java.awt.Dimension(600, 430));
        setVerifyInputWhenFocusTarget(false);
        getContentPane().setLayout(null);

        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 112));
        jLabel1.setText("Dados Pessoais");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(10, 11, 170, 17);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setText("Nome");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(10, 30, 40, 10);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setText("CPF");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(10, 90, 40, 15);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setText("CTPS");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(340, 30, 110, 15);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 112));
        jLabel5.setText("Contato");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(10, 210, 100, 17);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel6.setText("Endereço");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(10, 150, 80, 15);


        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel9.setText("Telefone");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(10, 290, 60, 15);


        
        telefone.setEnabled(false);
        jPanel1.add(telefone);
        telefone.setBounds(10, 310, 120, 30);

        


        endereco.setEnabled(false);
        jPanel1.add(endereco);
        endereco.setBounds(10, 170, 280, 30);

        cpf.setEnabled(false);
        jPanel1.add(cpf);
        cpf.setBounds(10, 110, 280, 30);

        nome.setEnabled(false);
        nome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomeActionPerformed(evt);
            }
        });
        jPanel1.add(nome);
        nome.setBounds(10, 50, 280, 30);

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel11.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.add(jLabel11);
        jLabel11.setBounds(340, 90, 40, 15);

        nascimento.setEnabled(false);
        nascimento.setFocusCycleRoot(true);
        nascimento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nascimentoActionPerformed(evt);
            }
        });
        jPanel1.add(nascimento);
        nascimento.setBounds(340, 50, 150, 30);

        voltar.setText("Voltar");
        voltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voltarActionPerformed(evt);
            }
        });
        jPanel1.add(voltar);
        voltar.setBounds(400, 350, 65, 27);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 586, 390);
        jPanel1.getAccessibleContext().setAccessibleDescription("Pesquisar");

        getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>                        

    private void nascimentoActionPerformed(java.awt.event.ActionEvent evt) {                                           
        // TODO add your handling code here:
    }                                          

    private void nomeActionPerformed(java.awt.event.ActionEvent evt) {                                     

    }                                    

    private void emailActionPerformed(java.awt.event.ActionEvent evt) {                                      
        // TODO add your handling code here:
    }                                     

    private void voltarActionPerformed(java.awt.event.ActionEvent evt) {                                       
        getContentPane().remove(voltar);
        TelaPesquisarFuncionario.this.dispose();
        voltar = null; 
    }                                      


    // Variables declaration - do not modify                     
    private javax.swing.JTextField celular;
    private javax.swing.JTextField cpf;
    private javax.swing.JTextField email;
    private javax.swing.JTextField endereco;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField nascimento;
    private javax.swing.JTextField nome;
    private javax.swing.JTextField telefone;
    private javax.swing.JButton voltar;
    // End of variables declaration                   
}
