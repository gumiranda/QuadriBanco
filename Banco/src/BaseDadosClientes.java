import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.*;

public abstract class BaseDadosClientes {
    private static ArrayList<Cliente> clientes = new ArrayList<Cliente>();
    
    public static void adicionar(Cliente a){
        clientes.add(a);
    }
    public static void excluiCadastro(Cliente c, String arquivo){
        		 clientes.remove(c);
        try	
		 {
		       FileOutputStream fout=new FileOutputStream(arquivo);
		       ObjectOutputStream oout=new ObjectOutputStream(fout);
		       oout.writeObject(clientes);
		}catch(Exception e){
                    e.printStackTrace();
                }
    }
    public static void cadastra(Cliente c, String arquivo){
        try	
		 {
		       FileOutputStream fout=new FileOutputStream(arquivo);
		       ObjectOutputStream oout=new ObjectOutputStream(fout);
		       oout.writeObject(clientes);
		}catch(Exception e){
                    e.printStackTrace();
                }
		 clientes.add(c);
    }
    public static void recebeArray(ArrayList<Cliente> listaSalva){
        clientes = listaSalva;
        
    }
    public static void leArquivo(String arquivo){
       
         try
		{
		   FileInputStream fin=new FileInputStream(arquivo);
		   ObjectInputStream oin=new ObjectInputStream(fin);
		   clientes = (ArrayList<Cliente>)oin.readObject();
		}catch(Exception e)
		 {
			 clientes =new ArrayList<Cliente>();
		 }
		
    
     }
    
    public static void listar(){
        for(Cliente a: clientes){
            a.mostrarDados();
        }
    }
    
    public static Cliente buscar(String nome){
        for(Cliente a: clientes){
            if(a.getNome().equals(nome)){
                return a;
            }
        }
        return null;
}
    public static boolean excluir(String nome){
        for(Cliente a: clientes){
            if(a.getNome().equals(nome)){
                clientes.remove(a);
            return true;
            }
        }
        return false;
    }
    
     public static ArrayList getArray(){
          return clientes;
      }
}
