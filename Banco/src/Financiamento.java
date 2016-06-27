
import java.io.Serializable;
import java.util.*;

public class Financiamento implements Serializable {

    private int codigo;
    private String nome;
    private double valor;
    private double juros;
    Conta conta;
    Gerente gerente;

    private static ArrayList<Conta> contas = new ArrayList<Conta>();

    public ArrayList<Conta> getArray() {
        return contas;
    }

    public void setArray(ArrayList<Conta> contas) {
        this.contas = contas;
    }

    public void setGerenteResponsavel(Gerente gerente) {
        this.gerente = gerente;

    }

    public void setConta(Conta conta) {
        this.conta = conta;
    }

    public boolean setCodigo(int codigo) {
        if (codigo > 0) {
            this.codigo = codigo;
            return true;
        } else {
            System.out.println("Codigo inválido!");
            return false;
        }
    }

    public boolean setValor(double valor) {
        if (valor > 0) {
            this.valor = valor;
            return true;
        } else {
            System.out.println("Codigo inválido!");
            return false;
        }
    }

    public double getValor() {
        return this.valor;
    }

    public int getCodigo() {
        return this.codigo;
    }

    public String getNome() {
        return this.nome;
    }

    public boolean setNome(String nome) {
        if (nome.length() > 0) {
            this.nome = nome;
            return true;
        } else {
            return false;
        }
    }

    public static void adicionar(Conta a) {
        contas.add(a);
    }

    public static void listar() {
        for (Conta a : contas) {
            a.mostrarDados();
        }
    }

    public static Conta buscar(String id_cliente) {
        for (Conta a : contas) {
            if (a.getIdCliente().equals(id_cliente)) {
                return a;
            }
        }
        return null;
    }

    public static boolean excluir(String id_cliente) {
        for (Conta a : contas) {
            if (a.getIdCliente().equals(id_cliente)) {
                contas.remove(a);
                return true;
            }
        }
        return false;
    }

    public void lerDados() {
        Scanner s = new Scanner(System.in);

        System.out.println("\nDigite o codigo do financiamento:");
        while (!setCodigo(s.nextInt()));

        System.out.println("\nQual o tipo de financiamento?");
        while (!setNome(s.nextLine()));
        System.out.println("\nQual o tipo de financiamento?");
        while (!setNome(s.nextLine()));
        System.out.println("\nQual o valor do financiamento?");
        while (!setValor(s.nextDouble()));
        // sera cobrada uma taxa de juros de 3% sobre o valor do financiamento para quem possui
        // credito consignado e de 7% para quem n possui
        System.out.println("\nO cliente possui credito consignado?\n1- Sim\n2- Nao\n");
        int op = s.nextInt();
        switch (op) {
            case 1:
                this.juros = (this.valor * 2) / 100;
                break;
            case 2:
                this.juros = (this.valor * 7) / 100;
                break;
        }
        /* System.out.println("Digite a taxa de juros do financiamento:");
        while (true) {
            try {
         juros = s.nextInt();
                System.out.println("Ok");
                break;
            } catch (InputMismatchException e) {
                System.out.println("Erro :" + e.toString());
                System.out.println("Digite novamente");
            }
        }*/

    }

    public void mostrarDadoss() {
        System.out.println("Codigo do financiamento: " + this.codigo);
        System.out.println("Tipo de financiamento: " + this.nome);
        for (Conta p : contas) {
            System.out.println("Conta do financiamento " + p.getIdCliente());
        }
        System.out.println("Taxa de juros a.m: " + this.juros);

    }
}
