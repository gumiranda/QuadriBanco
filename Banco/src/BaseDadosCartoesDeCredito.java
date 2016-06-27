import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.*;

public abstract class BaseDadosCartoesDeCredito {
    public static ArrayList<CartaoDeCredito> cartoes = new ArrayList<CartaoDeCredito>();
    
    public static void adicionar(CartaoDeCredito d){
        cartoes.add(d);
    }
    public static void cadastra(CartaoDeCredito cartao, String arquivo){
        try	
		 {
		       FileOutputStream fout=new FileOutputStream(arquivo);
		       ObjectOutputStream oout=new ObjectOutputStream(fout);
		       oout.writeObject(cartoes);
		}catch(Exception e){
                    e.printStackTrace();
                }
		 cartoes.add(cartao);
    }
    public static void recebeArray(ArrayList<CartaoDeCredito> listaSalva){
        cartoes = listaSalva;
        
    }
    public static void listar(){
        for(CartaoDeCredito d: cartoes){
            d.mostrarDados();
        }
    }
    
    public static CartaoDeCredito buscar(int codigo){
        for(CartaoDeCredito d: cartoes){
            if(d.getCodigo() == codigo) {
                return d;
            }
        }
        return null;
    }
    
    public static CartaoDeCredito buscarPorConta(Conta c)
    {
        for(CartaoDeCredito d: cartoes)
        {
            if(d.getConta().equals(c))
                return d;
        }
        return null;
    }
    
    public static boolean excluir(int codigo){
        for(CartaoDeCredito d: cartoes){
            if(d.getCodigo() == codigo){
                cartoes.remove(d);
                return true;
            }
        }
        return false;
    }
    
     public static ArrayList getArray(){
          return cartoes;
      }
}
