
import java.io.Serializable;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Conta implements Serializable{
 double saldo=0;
 private   String num_conta;
 private   String id_cliente;
 Cliente cliente;
 
 public Cliente getCliente(){
     return this.cliente;
 }
 public String getNomeCliente(){
   return cliente.getNome();
 }
  /*       
         public void atualizaSaldoSaque() {
        this.saldo = saldo - this.saque;
    }

    public void atualizaSaldoDeposito() {
        this.saldo = saldo + this.deposito;

    }
    
     public boolean sacar(double valor) {
        if (valor > 0) {
            this.saque = valor;
            return true;
        } else {
            System.out.println("\nValor invalido.");
            return false;
        }
    }

    public boolean depositar(double valor) {
        if (valor > 0) {
            this.deposito = valor;
            return true;
        } else {
            System.out.println("\nValor invalido.");
            return false;
        }
    }
*/
  public void depositar(double valor)
    {
        this.saldo += valor;
    }
    
      public void sacar(double valor){
        if(saldo >= valor){
            this.saldo -= valor;
        } else {
        }
    }
public void transferir(Conta c1,Conta c2, double valor){
    c1.sacar(valor);
    c2.depositar(valor);
    
}

  

    public double getSaldo() {
        return this.saldo;
    }
 public void setCliente(Cliente cliente){
        this.cliente = cliente;
    }
 
 public boolean setSaldo(double saldo)
{
 if (saldo > 0) {
 this.saldo = saldo;
 return true;
 }
 else {
 System.out.println("Saldo invalido!");
 return false;
 }
}
 
 public double saldo(){
     return this.saldo;
 }
 public String getIdCliente(){
     return this.id_cliente;
 }
 public String getNum_Conta(){
     return this.num_conta;
 }
 
public boolean setNum_Conta(String num_conta)
{
 if (num_conta.length() > 0){
 this.num_conta = num_conta;
 return true;
 }
 else {
 System.out.println("Numero inválido!");
 return false;
 }
}
public boolean setId_cliente(String id_cliente)
{
 if (id_cliente.length() > 0) {
 this.id_cliente = id_cliente;
 return true;
 }
 else {
 System.out.println("Id inválida!");
 return false;
 }
}

    
    public void lerDados(){
        Scanner s = new Scanner(System.in);
        
        
        System.out.println("Digite o numero da conta:");
        
         /*while (true) {
            try {
         num_conta = s.nextInt();
                System.out.println("Ok");
                break;
            } catch (InputMismatchException e) {
                System.out.println("Erro :" + e.toString());
                System.out.println("Digite novamente");
            }
        }
        
        System.out.println("Digite o id do cliente:");
        while (true) {
            try {
         id_cliente = s.nextInt();
                System.out.println("Ok");
                break;
            } catch (InputMismatchException e) {
                System.out.println("Erro :" + e.toString());
                System.out.println("Digite novamente");
            }
        }*/
        
    }
     public void mostrarDados(){
        System.out.println("Saldo da conta:" +this.saldo);
        System.out.println("Numero da conta: " +this.num_conta);
        System.out.println("Id do cliente:"+this.id_cliente);
    
    }

    void depositar(String c) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    
}
