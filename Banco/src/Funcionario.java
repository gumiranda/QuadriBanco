import java.io.Serializable;
import java.util.Scanner;
public abstract class  Funcionario extends Pessoa implements Serializable {
  
 private   String ctps;
 private   double salario;
 private static double pisoSalarial;

public abstract double calcSalario();



public static boolean setPisoSalarial(double pisoSalarial){
    if(pisoSalarial > 0){
        Funcionario.pisoSalarial = pisoSalarial;
        return true;
    }
    else{
        System.out.println("Valor inválido!");
 return false;
    }
    }

public static double getPisoSalarial(){
    return Funcionario.pisoSalarial;
}

public boolean setCtps(String ctps)
{
 if (ctps.length() > 0) {
 this.ctps = ctps;
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
       
        System.out.println("Digite a ctps do funcionario:");
       while(!setCtps(s.nextLine()));
        
    }
    
    public void mostrarDados(){
        super.mostrarDados();
        System.out.println("Ctps:" +this.ctps);
    }

   public double getSalario() {
        return this.salario;
    }
}