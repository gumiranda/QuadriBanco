/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lara
 */
import java.io.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;
public class Main2 extends javax.swing.JFrame {

    /**
     * Creates new form Main2
     */
    public Main2() {
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
        jDesktopPane1 = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu5 = new javax.swing.JMenu();
        menuitem2 = new javax.swing.JMenuItem();
        jMenuItem16 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jmcadastrar = new javax.swing.JMenuItem();
        jmconta = new javax.swing.JMenuItem();
        jmpesquisar = new javax.swing.JMenuItem();
        jmexcluir = new javax.swing.JMenuItem();
        jmalterar = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenuItem10 = new javax.swing.JMenuItem();
        jMenuItem12 = new javax.swing.JMenuItem();
        jMenuItem13 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();
        depositar = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Projeto Banco");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 737, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jDesktopPane1.setBackground(new java.awt.Color(204, 204, 204));

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 664, Short.MAX_VALUE)
        );

        jMenu5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons 1/house.png"))); // NOI18N
        jMenu5.setText("Arquivo");

        menuitem2.setText("Carregar Base de Dados");
        menuitem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuitem2ActionPerformed(evt);
            }
        });
        jMenu5.add(menuitem2);

        jMenuItem16.setText("Sair");
        jMenuItem16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem16ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem16);

        jMenuBar1.add(jMenu5);

        jMenu2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons 1/group.png"))); // NOI18N
        jMenu2.setText("Clientes");
        jMenu2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu2ActionPerformed(evt);
            }
        });

        jmcadastrar.setText("Cadastrar");
        jmcadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmcadastrarActionPerformed(evt);
            }
        });
        jMenu2.add(jmcadastrar);

        jmconta.setText("Criar conta");
        jmconta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmcontaActionPerformed(evt);
            }
        });
        jMenu2.add(jmconta);

        jmpesquisar.setText("Pesquisar");
        jmpesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmpesquisarActionPerformed(evt);
            }
        });
        jMenu2.add(jmpesquisar);

        jmexcluir.setText("Excluir");
        jmexcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmexcluirActionPerformed(evt);
            }
        });
        jMenu2.add(jmexcluir);

        jmalterar.setText("Alterar");
        jmalterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmalterarActionPerformed(evt);
            }
        });
        jMenu2.add(jmalterar);

        jMenuBar1.add(jMenu2);

        jMenu4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons 1/group.png"))); // NOI18N
        jMenu4.setText("Funcionários");

        jMenuItem9.setText("Cadastrar Técnico");
        jMenuItem9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem9ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem9);

        jMenuItem10.setText("Cadastrar Gerente");
        jMenuItem10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem10ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem10);

        jMenuItem12.setText("Pesquisar");
        jMenuItem12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem12ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem12);

        jMenuItem13.setText("Excluir Técnico");
        jMenuItem13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem13ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem13);

        jMenuItem2.setText("Excluir Gerente");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem2);

        jMenuBar1.add(jMenu4);

        jMenu3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons 1/cog.png"))); // NOI18N
        jMenu3.setText("Operações");

        jMenuItem5.setText("Sacar");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem5);

        depositar.setText("Depositar");
        depositar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                depositarActionPerformed(evt);
            }
        });
        jMenu3.add(depositar);

        jMenuItem7.setText("Abrir Financiamento");
        jMenu3.add(jMenuItem7);

        jMenuItem8.setText("Adquirir Cartão de Crédito");
        jMenu3.add(jMenuItem8);

        jMenuItem1.setText("Transferências");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem1);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 144, Short.MAX_VALUE))
            .addComponent(jDesktopPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jmcadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmcadastrarActionPerformed
        TelaCadastroCliente cadCliente = new TelaCadastroCliente(); // instancia a tela
        jDesktopPane1.add(cadCliente); // adiciona a tela a area de trabalho
        cadCliente.setVisible(true); // mostra a tela
    }//GEN-LAST:event_jmcadastrarActionPerformed

    private void jmexcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmexcluirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jmexcluirActionPerformed

    private void jMenu2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenu2ActionPerformed

    private void jmcontaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmcontaActionPerformed
    TelaCriaConta conta = new TelaCriaConta();
    jDesktopPane1.add(conta);
    conta.setVisible(true);
    }//GEN-LAST:event_jmcontaActionPerformed

    private void jmpesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmpesquisarActionPerformed
        String nome;
        Cliente c;
        nome = JOptionPane.showInputDialog("Qual o nome do cliente?");
        c = BaseDadosClientes.buscar(nome);
        if(c == null)
            JOptionPane.showMessageDialog(this, "Cliente não encontrado.");
        else
        {
            TelaPesquisar p = new TelaPesquisar(c);
            jDesktopPane1.add(p);
            p.setVisible(true);
        }
         
        
    }//GEN-LAST:event_jmpesquisarActionPerformed

    private void jmalterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmalterarActionPerformed
      Cliente c;
     String nome = JOptionPane.showInputDialog("Qual o nome do cliente?");
     c = BaseDadosClientes.buscar(nome);
     
     if(c==null){
         JOptionPane.showMessageDialog(this, "Cliente não encontrado.");
     }
     else {
         TelaAlterar tela = new TelaAlterar(c);
         jDesktopPane1.add(tela);
         tela.setVisible(true);
     }
    }//GEN-LAST:event_jmalterarActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        String num = JOptionPane.showInputDialog("Qual o numero da conta?");
        Conta c = BaseDadosContas.buscar(num);
     
        if(c==null){            
                    JOptionPane.showMessageDialog(this, "Conta não encontrada.");     
            
        }
        else {
            TelaSaque tela = new TelaSaque(c);
            jDesktopPane1.add(tela);
            tela.setVisible(true);
        }
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void depositarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_depositarActionPerformed
        String num = JOptionPane.showInputDialog("Qual o numero da conta?");
        Conta c = BaseDadosContas.buscar(num);
        if(c==null){
            JOptionPane.showMessageDialog(this, "Conta não encontrada.");
            
        }
        else{
            TelaDeposito tela = new TelaDeposito(c);
            jDesktopPane1.add(tela);
            tela.setVisible(true);
        }
    }//GEN-LAST:event_depositarActionPerformed
 
    
    /*
    private final Object Read_file(String arquivo,Object o){
                File ficheiro = new File(arquivo);
                try {
                        if(!ficheiro.exists()){return o;}
                         InputStream file   = new FileInputStream(arquivo);
                         InputStream buffer = new BufferedInputStream(file);
                         ObjectInput input  = new ObjectInputStream (buffer);
                         return input.readObject();
                        }catch (FileNotFoundException e)   {e.printStackTrace();}
                         catch (IOException e)                     {e.printStackTrace();}
                         catch (ClassNotFoundException e)  {e.printStackTrace();}
                        return o;
        }*/
    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
       TelaTransferencia tela = new TelaTransferencia();
       jDesktopPane1.add(tela);
       tela.setVisible(true);
              
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void menuitem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuitem2ActionPerformed
        // TODO add your handling code here:
  //   String arquivo = JOptionPane.showInputDialog("Digite o caminho do arquivo");
     
     
     
     if(new File("clientes.dat").canRead()==true){
         try{
             FileInputStream in = new FileInputStream("clientes.dat");
             ObjectInputStream objIn = new ObjectInputStream(in);
             ArrayList<Cliente> clientes = (ArrayList<Cliente>) objIn.readObject();
            BaseDadosClientes.recebeArray(clientes);
         }catch (Exception e ){
             e.printStackTrace();
         }
           
     }else{
         JOptionPane.showMessageDialog(this,"Não foi possivel carregar o arquivo de clientes");
     }
     if(new File("contas.dat").canRead()==true){
         try{
             FileInputStream in = new FileInputStream("contas.dat");
             ObjectInputStream objIn = new ObjectInputStream(in);
             ArrayList<Conta> contas = (ArrayList<Conta>) objIn.readObject();
             BaseDadosContas.recebeArray(contas);
         }catch (Exception e ){
             e.printStackTrace();
         }
           
     }else{
         JOptionPane.showMessageDialog(this,"Não foi possível carregar o arquivo de contas");
     }
        if(new File("cartoes.dat").canRead()==true){
         try{
             FileInputStream in = new FileInputStream("cartoes.dat");
             ObjectInputStream objIn = new ObjectInputStream(in);
             ArrayList<CartaoDeCredito> cartoes = (ArrayList<CartaoDeCredito>) objIn.readObject();
            BaseDadosCartoesDeCredito.recebeArray(cartoes);
         }catch (Exception e ){
             e.printStackTrace();
         }
           
     }else{
         JOptionPane.showMessageDialog(this,"Não foi possivel carregar o arquivo de cartoes de credito");
     }
        if(new File("financiamentos.dat").canRead()==true){
         try{
             FileInputStream in = new FileInputStream("financiamentos.dat");
             ObjectInputStream objIn = new ObjectInputStream(in);
             ArrayList<Financiamento> financiamentos = (ArrayList<Financiamento>) objIn.readObject();
            BaseDadosFinanciamentos.recebeArray(financiamentos);
         }catch (Exception e ){
             e.printStackTrace();
         }
         }else{
         JOptionPane.showMessageDialog(this,"Não foi possivel carregar o arquivo de financiamentos");
     }
         if(new File("gerentes.dat").canRead()==true){
         try{
             FileInputStream in = new FileInputStream("gerentes.dat");
             ObjectInputStream objIn = new ObjectInputStream(in);
             ArrayList<Gerente> gerentes = (ArrayList<Gerente>) objIn.readObject();
            BaseDadosGerentes.recebeArray(gerentes);
         }catch (Exception e ){
             e.printStackTrace();
         }
           
     }else{
         JOptionPane.showMessageDialog(this,"Não foi possivel carregar o arquivo de gerentes");
     }
          if(new File("tecnicos.dat").canRead()==true){
         try{
             FileInputStream in = new FileInputStream("tecnicos.dat");
             ObjectInputStream objIn = new ObjectInputStream(in);
             ArrayList<Funcionario> tecnicos= (ArrayList<Funcionario>) objIn.readObject();
            BaseDadosTecnicos.recebeArray(tecnicos);
         }catch (Exception e ){
             e.printStackTrace();
         }
           
     }else{
         JOptionPane.showMessageDialog(this,"Não foi possivel carregar o arquivo de tecnicos");
     } 
     
        
    }//GEN-LAST:event_menuitem2ActionPerformed

    private void jMenuItem16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem16ActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
    }//GEN-LAST:event_jMenuItem16ActionPerformed

    private void jMenuItem10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem10ActionPerformed
        // TODO add your handling code here:
        TelaCadastroGerente cadGerente = new TelaCadastroGerente(); // instancia a tela
        jDesktopPane1.add(cadGerente); // adiciona a tela a area de trabalho
        cadGerente.setVisible(true); // mostra a tela
    }//GEN-LAST:event_jMenuItem10ActionPerformed

    private void jMenuItem9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem9ActionPerformed
        // TODO add your handling code here:
        TelaCadastroFuncionario telafunc = new TelaCadastroFuncionario();
        telafunc.setVisible(true);
        
    }//GEN-LAST:event_jMenuItem9ActionPerformed

    private void jMenuItem12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem12ActionPerformed
        // TODO add your handling code here:
      //  TelaPesquisar telapesq = new TelaPesquisar();
      //  telapesq.setVisible(true);
    }//GEN-LAST:event_jMenuItem12ActionPerformed

    private void jMenuItem13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem13ActionPerformed
        // TODO add your handling code here:
        TelaExcluirTecnico telatecno = new TelaExcluirTecnico();
        jDesktopPane1.add(telatecno);
        telatecno.setVisible(true);
    }//GEN-LAST:event_jMenuItem13ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
        TelaExcluirGerente telagerente = new TelaExcluirGerente();
        jDesktopPane1.add(telagerente);
        telagerente.setVisible(true);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

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
            java.util.logging.Logger.getLogger(Main2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem depositar;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem12;
    private javax.swing.JMenuItem jMenuItem13;
    private javax.swing.JMenuItem jMenuItem16;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JMenuItem jmalterar;
    private javax.swing.JMenuItem jmcadastrar;
    private javax.swing.JMenuItem jmconta;
    private javax.swing.JMenuItem jmexcluir;
    private javax.swing.JMenuItem jmpesquisar;
    private javax.swing.JMenuItem menuitem2;
    // End of variables declaration//GEN-END:variables
}
