/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author a11511BCC038
 */
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.*;

public abstract class BaseDadosFinanciamentos {

    private static ArrayList<Financiamento> financiamentos = new ArrayList<Financiamento>();

    public static void adicionar(Financiamento a) {
        financiamentos.add(a);
    }
    public static void excluiCadastro(Financiamento f, String arquivo){
        		 financiamentos.remove(f);
        try	
		 {
		       FileOutputStream fout=new FileOutputStream(arquivo);
		       ObjectOutputStream oout=new ObjectOutputStream(fout);
		       oout.writeObject(financiamentos);
		}catch(Exception e){
                    e.printStackTrace();
                }
    }
    public static void cadastra(Financiamento f, String arquivo){
        try	
		 {
		       FileOutputStream fout=new FileOutputStream(arquivo);
		       ObjectOutputStream oout=new ObjectOutputStream(fout);
		       oout.writeObject(financiamentos);
		}catch(Exception e){
                    e.printStackTrace();
                }
		 financiamentos.add(f);
    }
    public static void recebeArray(ArrayList<Financiamento> listaSalva){
        financiamentos = listaSalva;
        
    }

    public static void listar() {
        for (Financiamento a : financiamentos) {
            a.mostrarDadoss();
        }
    }

    public static Financiamento buscar(String nome) {
        for (Financiamento a : financiamentos) {
            if (a.getNome().equals(nome)) {
                return a;
            }
        }
        return null;
    }

    public static Financiamento buscar(int codigo) {
        for (Financiamento a : financiamentos) {
            if (a.getCodigo() == codigo) {
                return a;
            }
        }
        return null;
    }

    public static boolean excluir(int codigo) {
        for (Financiamento a : financiamentos) {
            if (a.getCodigo() == codigo) {
                financiamentos.remove(a);
                return true;
            }
        }
        return false;
    }

    public static ArrayList getArray() {
        return financiamentos;
    }
}
