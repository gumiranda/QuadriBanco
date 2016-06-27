
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Lara
 */
public class TelaCadastroCliente extends javax.swing.JInternalFrame {

    /**
     * Creates new form TelaCadastroCliente
     */
    public TelaCadastroCliente() {
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
        jLabel1 = new javax.swing.JLabel();
        jtnome = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jtcpf = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jtendereco = new javax.swing.JTextField();
        jbSexo = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jtdata = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jtemail = new javax.swing.JTextField();
        jtcelular = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jttelefone = new javax.swing.JTextField();
        jtlimpar = new javax.swing.JButton();
        jtenviar = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setClosable(true);
        setResizable(true);
        setTitle("Cadastro");

        jPanel1.setBackground(new java.awt.Color(239, 234, 234));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Dados Pessoais", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12), new java.awt.Color(0, 0, 102))); // NOI18N
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel1.setText("Nome");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(20, 40, 50, 20);

        jtnome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtnomeActionPerformed(evt);
            }
        });
        jPanel1.add(jtnome);
        jtnome.setBounds(20, 60, 280, 30);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setText("CPF");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(20, 100, 50, 20);

        jtcpf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtcpfActionPerformed(evt);
            }
        });
        jPanel1.add(jtcpf);
        jtcpf.setBounds(20, 120, 280, 30);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setText("Endereço");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(20, 160, 120, 20);

        jtendereco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtenderecoActionPerformed(evt);
            }
        });
        jPanel1.add(jtendereco);
        jtendereco.setBounds(20, 180, 280, 30);

        jbSexo.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jbSexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione", "Masculino", "Feminino" }));
        jbSexo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSexoActionPerformed(evt);
            }
        });
        jPanel1.add(jbSexo);
        jbSexo.setBounds(400, 60, 90, 20);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel6.setText("Sexo");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(400, 40, 70, 15);

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel7.setText("Data de Nascimento");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(400, 100, 140, 15);

        jtdata.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtdataActionPerformed(evt);
            }
        });
        jPanel1.add(jtdata);
        jtdata.setBounds(400, 120, 130, 30);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 51, 102));
        jLabel5.setText("Contato");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(20, 250, 57, 15);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setText("Email");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(20, 290, 80, 20);

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel9.setText("Celular");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(400, 290, 82, 15);

        jtemail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtemailActionPerformed(evt);
            }
        });
        jPanel1.add(jtemail);
        jtemail.setBounds(20, 310, 280, 30);

        jtcelular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtcelularActionPerformed(evt);
            }
        });
        jPanel1.add(jtcelular);
        jtcelular.setBounds(400, 310, 190, 30);

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel8.setText("Telefone");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(20, 360, 120, 14);
        jPanel1.add(jttelefone);
        jttelefone.setBounds(20, 380, 280, 30);

        jtlimpar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jtlimpar.setText("Limpar");
        jtlimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtlimparActionPerformed(evt);
            }
        });
        jPanel1.add(jtlimpar);
        jtlimpar.setBounds(400, 380, 90, 29);

        jtenviar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jtenviar.setText("Cadastrar");
        jtenviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtenviarActionPerformed(evt);
            }
        });
        jPanel1.add(jtenviar);
        jtenviar.setBounds(490, 380, 100, 29);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 599, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 487, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 11, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtlimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtlimparActionPerformed
        jtnome.setText("");
        jtcpf.setText("");
        jtendereco.setText("");
        jttelefone.setText("");
        jtdata.setText("");
        jtcelular.setText("");
        jtemail.setText("");
    }//GEN-LAST:event_jtlimparActionPerformed

    private void jtenviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtenviarActionPerformed
        Cliente c = new Cliente();
        c.setNome(jtnome.getText());
        c.setCpf(jtcpf.getText());
        c.setEndereco(jtendereco.getText());
        c.setTelefone(jttelefone.getText());
        c.setEmail(jtemail.getText());
        c.setData(jtdata.getText());
        c.setCelular(jtcelular.getText());
        c.setSexo((String) jbSexo.getSelectedItem());
        BaseDadosClientes.adicionar(c);
        BaseDadosClientes.cadastra(c,"clientes.dat");//metodo que salva em um arquivo binario clientes.dat
        salvarCadastro();//METODO QUE SALVA EM ARQUIVO O CADASTRO
        JOptionPane.showMessageDialog(this, "Cliente cadastrado!");
        getContentPane().remove(jtenviar);
        TelaCadastroCliente.this.dispose();
        jtenviar = null;

    }//GEN-LAST:event_jtenviarActionPerformed

    private void jbSexoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSexoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbSexoActionPerformed

    private void jtemailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtemailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtemailActionPerformed

    private void jtnomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtnomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtnomeActionPerformed

    private void jtcpfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtcpfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtcpfActionPerformed

    private void jtenderecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtenderecoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtenderecoActionPerformed

    private void jtdataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtdataActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtdataActionPerformed

    private void jtcelularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtcelularActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtcelularActionPerformed
    public void salvarCadastro() { //como salvar no arquivo
        String caminho = JOptionPane.showInputDialog("Digite o caminho do arquivo");
        //se nao quiser que o usuario escolha, apenas coloque arquivo = new File(o que caminho que vc quiser);
        arquivo = new File(caminho);

        try {//tenta acessar o arquivo
            if (!arquivo.exists()) {//se nao existir ele cria o arquivo
                arquivo.createNewFile();
            }
            fw = new FileWriter(arquivo);
            bw = new BufferedWriter(fw);
            bw.write("<-----------------------------Dados de cadastro----------------------------->");
            bw.write("\n<----------------Nome : " + jtnome.getText());
            bw.write("\n<-----------------CPF :" + jtcpf.getText());
            bw.write("\n<------------Endereço :" + jtendereco.getText());
            bw.write("\n<--Data de Nascimento :" + jtdata.getText());
            bw.write("\n<---------------Email :" + jtemail.getText());
            bw.write("\n<-------------Celular :" + jtcelular.getText());
            bw.write("\n<------------Telefone :" + jttelefone.getText());

            bw.close();
            fw.close();

        } catch (IOException ex) {//caso o arquivo de erro
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }

    }
    File arquivo;//arquivo
    BufferedReader br;//buffer de leitura
    BufferedWriter bw;//buffer de escrita
    FileReader fr;//leitor do arquivo
    FileWriter fw;//escritor do arquivo
     public static void main(String args[]) {

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCadastroCliente().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JComboBox<String> jbSexo;
    private javax.swing.JTextField jtcelular;
    private javax.swing.JTextField jtcpf;
    private javax.swing.JTextField jtdata;
    private javax.swing.JTextField jtemail;
    private javax.swing.JTextField jtendereco;
    private javax.swing.JButton jtenviar;
    private javax.swing.JButton jtlimpar;
    private javax.swing.JTextField jtnome;
    private javax.swing.JTextField jttelefone;
    // End of variables declaration//GEN-END:variables
}
