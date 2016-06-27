
import java.io.Serializable;
import java.util.*;

public class Cliente extends Pessoa implements Serializable{

    private String email;
    private double saldo = 0;
    private double deposito;
    private double saque;
    private String sexo;
    private String data;
    private String celular;
    
    public boolean setCelular(String celular) {
        if (email.length() > 0) {
            this.celular = celular;
            return true;
        } else {
            System.out.println("Email invalido!");
            return false;
        }
    }

    public boolean setEmail(String email) {
        if (email.length() > 0) {
            this.email = email;
            return true;
        } else {
            System.out.println("Email invalido!");
            return false;
        }
    }
    
     public boolean setSexo(String sexo) {
        if (sexo.length() > 0) {
            this.sexo = sexo;
            return true;
        } else {
            System.out.println("invalido!");
            return false;
        }
    }
     
      public boolean setData(String data) {
        if (data.length() > 0) {
            this.data = data;
            return true;
        } else {
            System.out.println("Email invalido!");
            return false;
        }
    }

    
    
    public String getNascimento() {
        return this.data;
    }
    
    public String getSexo() {
        return this.sexo;
    }
    
    public String getCelular() {
        return this.celular;
    }

   

    public String getEmail() {
        return this.email;
    }

    public void lerDados() {
        Scanner s = new Scanner(System.in);
        super.lerDados();
        System.out.println("Digite o email:");
        while (!setEmail(s.nextLine()));

    }

    public void mostrarDados() {
        super.mostrarDados();
        System.out.println("Email:" + this.email);
    }
}
