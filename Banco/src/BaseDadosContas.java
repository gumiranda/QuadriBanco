import java.io.*;
import java.util.*;

public abstract class BaseDadosContas {
    private static ArrayList<Conta> contas = new ArrayList<Conta>();
    
    public static void adicionar(Conta a){
        contas.add(a);
    }
   
    public static void excluiCadastro(Conta c, String arquivo){
        		 contas.add(c);
        try	
		 {
		       FileOutputStream fout=new FileOutputStream(arquivo);
		       ObjectOutputStream oout=new ObjectOutputStream(fout);
		       oout.writeObject(contas);
                       oout.close();
		}catch(Exception e){
                    e.printStackTrace();
                }
        }
    public static void cadastra(Conta c, String arquivo){
        try	
		 {
		       FileOutputStream fout=new FileOutputStream(arquivo);
		       ObjectOutputStream oout=new ObjectOutputStream(fout);
		       oout.writeObject(contas);
                       oout.close();
		}catch(Exception e){
                    e.printStackTrace();
                }
		 contas.add(c);
        }
    //metodo que recebe um array do arquivo e passa pro array da base de dados contas
    public static void recebeArray(ArrayList<Conta> listaSalva){
        contas = listaSalva;
        
    }
     public static void leArquivo(String arquivo){
         if(new File(arquivo).canRead()==true){
       
         try
		{
		   FileInputStream fin=new FileInputStream(arquivo);
		   ObjectInputStream oin=new ObjectInputStream(fin);
		   contas = (ArrayList<Conta>)oin.readObject();
		}catch(Exception e)
		 {
			 contas=new ArrayList<Conta>();
		 }
		
         }
     }
    /*
    public static void leArquivo(Conta c,String arquivo){
         try
		{
		   FileInputStream fin=new FileInputStream(arquivo);
		   ObjectInputStream oin=new ObjectInputStream(fin);
		   contas = (ArrayList<Conta>)oin.readObject();
		}catch(Exception e)
		 {
			 contas=new ArrayList<Conta>();
		 }
		
		 contas.add(c);
    }
    /*
    public static ArrayList Read_file(String nomeDoFicheiro,ArrayList<Conta> contas){
                File ficheiro = new File(nomeDoFicheiro);
                try {
                        if(!ficheiro.exists()){
                            return contas;
                        }
                         InputStream file  = new FileInputStream(nomeDoFicheiro);
                         InputStream buffer = new BufferedInputStream(file);
                         ObjectInput input  = new ObjectInputStream (buffer);
                         return (ArrayList) input.readObject();
                        }catch (FileNotFoundException e)   
                        {
                            e.printStackTrace();
                        }
                         catch (IOException e) {
                             e.printStackTrace();
                         }
                         catch (ClassNotFoundException e)  {
                             e.printStackTrace();}
                        return contas;
        }
    public static void gravando(String ficheiro,Conta c){
        contas.add(c);
                File file = new File(ficheiro);
                try {
                        if(!file.exists()) file.createNewFile();
                            FileOutputStream f_out = new FileOutputStream(ficheiro);// Write to disk with FileOutputStream
                            ObjectOutputStream obj_out = new ObjectOutputStream (f_out);// Write object with ObjectOutputStream
                            obj_out.writeObject (c);// Write object out to disk
                            f_out.close();
                           } catch (IOException e) {
                               e.printStackTrace(); 
                           }
                  }
    /*
    public void CriarArquivo(ArrayList<Conta> contas) throws IOException {
				
		try {						
			ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("contas.dat"));
			
			oos.writeObject(contas); 
			oos.close();			
			
		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
		} catch (NotSerializableException e1) {
			e1.printStackTrace();
		} 
		
	}
*/
      public static void cadastrar(Conta a){
          contas.add(a);
          
          
      }
    
    public static void listar(){
        for(Conta a: contas){
            a.mostrarDados();
        }
    }
    
    public static Conta buscar(String id){
        for(Conta a: contas){
            if(a.getIdCliente().equals(id)){
                return a;
            }
        }
        return null;
}
    public static Conta buscarPorCliente(String nome)
    {
        for(Conta a: contas)
        {
            if(a.getNomeCliente().equals(nome))
                return a;
        }
        return null;
    }
    
    public static boolean excluir(String id){
        for(Conta a: contas){
            if(a.getIdCliente().equals(id)){
                contas.remove(a);
            return true;
            }
        }
        return false;
    }
    
     public static ArrayList getArray(){
          return contas;
      }

   
}