import java.io.Serializable;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Gerente extends Funcionario implements Serializable {
   private String agencia;
  private  String setor;
    private double salario;
    private double salarioBase;
    
public String getTipo(){
    return this.getClass().getName();
    
}
 public boolean setSalario(double salario)
{
 if (salario > 0) {
 this.salario = salario;
 return true;
 }
 else {
 System.out.println("Salario invalido!");
 return false;
 }
}
public double getSalario(){
    return this.salario;
}


    
    public double calcSalario(){
     return   this.salario = (1.99*salarioBase)  ;
     
    }
    
    public boolean setSalarioBase(double salarioBase)
{
 if (salarioBase > 0) {
 this.salarioBase = salarioBase;
 return true;
 }
 else {
 System.out.println("Salario invalido!");
 return false;
 }
}
    
    
    public boolean setAgencia(String agencia)
{
 if (agencia.length() > 0) {
 this.agencia = agencia;
 return true;
 }
 else {
 System.out.println("agencia invalida!");
 return false;
 }
}
public boolean setSetor(String setor)
{
 if (setor.length() > 0){
 this.setor = setor;
 return true;
 }
 else {
 System.out.println("Dado inválido!");
 return false;
 }
}

    public void lerDados(){
        Scanner s = new Scanner (System.in);
        super.lerDados();
        System.out.println("Digite a agencia do gerente:");
        while(!setAgencia(s.nextLine()));
        
        System.out.println("Digite o setor onde trabalha o gerente:");
       while(!setSetor(s.nextLine()));
   System.out.println("Digite o salario base do gerente:");
   while (true) {
            try {
                salarioBase = s.nextDouble();
                System.out.println("Ok");
                break;
            } catch (InputMismatchException e) {
                System.out.println("Erro :" + e.toString());
                System.out.println("Digite novamente");
            }
        }
      // while(!setSalarioBase(s.nextDouble()));
      
       //while(!setValorDedicacaoExclusiva(s.nextDouble()));
       
      // while(!setRetribTitulacao(s.nextDouble()));
    }
     public void mostrarDados(){
        System.out.println("Titulacao:" +this.agencia);
        System.out.println("Setor"+ this.setor);
     System.out.println("salario:" +this.calcSalario());
     System.out.println("Tipo de pesquisador  "+this.getTipo());
    }

    

}
