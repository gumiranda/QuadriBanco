import java.io.Serializable;
import java.util.*;
public class CartaoDeCredito implements Serializable{
  private  int codigo;
  private  int limite;
    Conta conta;
    
    
    public void setConta(Conta conta){
        this.conta = conta;
    }
    
  
public boolean setCodigo(int codigo)
{
 if (codigo > 0){
 this.codigo = codigo;
 return true;
 }
 else {
 System.out.println("Codigo inválido!");
 return false;
 }
}

public int getCodigo(){
    return this.codigo;
}
public Conta getConta(){
    return this.conta;
}
public int getLimite(){
    return this.limite;
}
public boolean setLimite(int limite)
{
 if (limite > 0) {
 this.limite = limite;
 return true;
 }
 else {
 System.out.println("Limite inválido!");
 return false;
 }
}

    public void lerDados(){
        Scanner s = new Scanner(System.in);
        
        System.out.println("Digite o codigo do cartao:");
        while (true) {
            try {
                codigo = s.nextInt();
                System.out.println("Ok");
                break;
            } catch (InputMismatchException e) {
                System.out.println("Erro :" + e.toString());
                System.out.println("Digite novamente");
            }
        }
       //while(!setCodigo(s.nextInt()));
        
        System.out.println("Digite o limite do cartao:");
        while (true) {
            try {
                limite = s.nextInt();
                System.out.println("Ok");
                break;
            } catch (InputMismatchException e) {
                System.out.println("Erro :" + e.toString());
                System.out.println("Digite novamente");
            }
        }
        //while(!setCargaHoraria(s.nextInt()));
        
        
}
 public void mostrarDados(){
        System.out.println("Codigo do cartao" +this.codigo);
        System.out.println("Limite do cartao:"+this.limite);
    }
    }