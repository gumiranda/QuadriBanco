
import java.io.Serializable;
import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author root
 */
public class Pessoa implements Serializable{
    private String nome;
 private  String cpf;
 private String telefone;
  private  String endereco;
  
  public boolean setEndereco(String endereco)
{
 if (endereco.length() > 0){
 this.endereco = endereco;
 return true;
 }
 else {
 System.out.println("Endereço inválido!");
 return true;
 }
}
 public boolean setTelefone(String telefone)
{
 if (telefone.length() > 0) {
 this.telefone= telefone;
 return true;
 }
 else {
 System.out.println("Telefone invalido!");
 return false;
 }
}
 
public boolean setNome(String nome)
{
 if (nome.length() > 0) {
 this.nome = nome;
 return true;
 }
 else {
 System.out.println("Nome invalido!");
 return false;
 }
}
public String getCPF(){
    return this.cpf;
}
 
public String getNome(){
    return this.nome;
}
public String getTelefone(){
    return this.telefone;
}

public String getEndereco(){
    return this.endereco;
}

public  boolean setCpf(String cpf) {
    if (cpf.equals("00000000000") || cpf.equals("11111111111") ||
        cpf.equals("22222222222") || cpf.equals("33333333333") ||
        cpf.equals("44444444444") || cpf.equals("55555555555") ||
        cpf.equals("66666666666") || cpf.equals("77777777777") ||
        cpf.equals("88888888888") || cpf.equals("99999999999") ||
       (cpf.length() != 11))
       return(false);

    char dig10, dig11;
    int sm, i, r, num, peso;

    try {

      sm = 0;
      peso = 10;
      for (i=0; i<9; i++) {                    
        num = (int)(cpf.charAt(i) - 48); 
        sm = sm + (num * peso);
        peso = peso - 1;
      }

      r = 11 - (sm % 11);
      if ((r == 10) || (r == 11))
         dig10 = '0';
      else dig10 = (char)(r + 48); 
      sm = 0;
      peso = 11;
      for(i=0; i<10; i++) {
        num = (int)(cpf.charAt(i) - 48);
        sm = sm + (num * peso);
        peso = peso - 1;
      }

      r = 11 - (sm % 11);
      if ((r == 10) || (r == 11))
         dig11 = '0';
      else dig11 = (char)(r + 48);

      if ((dig10 ==cpf.charAt(9)) && (dig11 == cpf.charAt(10))){
          this.cpf = cpf;
         return(true);
      }else
          System.out.println("CPF invalido");
          return(false);
    }
    catch (InputMismatchException erro) {
        return(false);
    }
  }

  public void mostrarDados(){
        System.out.println("Endereco: " +this.endereco);
        System.out.println("Telefone:"+this.telefone);
  }
   public void lerDados() {
        Scanner s = new Scanner(System.in);
        System.out.println("Digite o nome");
      while(!setNome(s.nextLine()));
        System.out.println("Digite o cpf ");
        while(!setCpf(s.nextLine()));
        System.out.println("Digite telefone :");
      //  while(!setTelefone(s.nextInt()));
        System.out.println("Digite o endereco :");
        while(!setEndereco(s.next()));
        
       
    }
}
