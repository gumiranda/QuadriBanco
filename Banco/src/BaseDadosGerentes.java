
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;


public abstract class BaseDadosGerentes {
  public static ArrayList<Gerente> gerentes = new ArrayList<Gerente>();

public static void adicionar(Gerente p){
    gerentes.add(p);
}  
public static void cadastra(Gerente c, String arquivo){
        try	
		 {
		       FileOutputStream fout=new FileOutputStream(arquivo);
		       ObjectOutputStream oout=new ObjectOutputStream(fout);
		       oout.writeObject(gerentes);
		}catch(Exception e){
                    e.printStackTrace();
                }
		 gerentes.add(c);
    }
    public static void recebeArray(ArrayList<Gerente> listaSalva){
        gerentes = listaSalva;
        
    }

public static void listar(){
        for(Gerente p: gerentes)
p.mostrarDados();
}

  
    public static Gerente buscar(String nome){
        for(Gerente p: gerentes){
            if(p.getNome().equals(nome)){
                return p;
            }
        }
        return null;
}
    public static boolean excluir(String nome){
        for(Gerente p: gerentes){
            if(p.getNome().equals(nome)){
                gerentes.remove(p);
            return true;
            }
        }
        return false;
    }
    
     public static ArrayList getArray(){
          return gerentes;
      }
}

