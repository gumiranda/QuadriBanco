import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.*;

public abstract class BaseDadosTecnicos {
    public static ArrayList<Funcionario> tecnicos = new ArrayList <Funcionario>();
    static {
    tecnicos = (ArrayList<Funcionario>)Persist.recuperar("tecnicos.dat");
    if(tecnicos == null){
        tecnicos = new ArrayList<Funcionario>();
    }
}
     public static void excluiCadastro(Funcionario c, String arquivo){
        		 tecnicos.remove(c);
         try	
		 {
		       FileOutputStream fout=new FileOutputStream(arquivo);
		       ObjectOutputStream oout=new ObjectOutputStream(fout);
		       oout.writeObject(tecnicos);
		}catch(Exception e){
                    e.printStackTrace();
                }
    }
    public static void cadastra(Tecnico c, String arquivo){
        try	
		 {
		       FileOutputStream fout=new FileOutputStream(arquivo);
		       ObjectOutputStream oout=new ObjectOutputStream(fout);
		       oout.writeObject(tecnicos);
		}catch(Exception e){
                    e.printStackTrace();
                }
		 tecnicos.add(c);
    }
    public static void recebeArray(ArrayList<Funcionario> listaSalva){
        tecnicos = listaSalva;
        
    }
    public static void adicionar(Tecnico t){
        tecnicos.add(t);
    }
    
    public static void listar(){
        for(Funcionario t: tecnicos)
            t.mostrarDados();
    }
    
    public static Funcionario buscar(String nome){
        for(Funcionario t: tecnicos){
            if(t.getNome().equals(nome)){
                return t;
        }
    }
        return null;
    }
    
      public static boolean excluir(String nome){
        for(Funcionario t: tecnicos){
            if(t.getNome().equals(nome)){
                tecnicos.remove(t);
            return true;
            }
        }
        return false;
    }
   
      public static ArrayList getArray(){
          return tecnicos;
      }
      
}
