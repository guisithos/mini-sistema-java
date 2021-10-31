
import java.util.*;

public class Sistema
{
    //armazena clientes
    private static ArrayList<Cliente> dados = new ArrayList<Cliente>();
    
    //obtem dados dos clientes
    public static void cadastrarCliente() {
        String nome, email, tipo; 
        int idade;
        nome = EntradaSaida.receberString("Nome:");
        email = EntradaSaida.receberString("E-mail:");
        idade = EntradaSaida.receberInt("Idade:");
        tipo = EntradaSaida.receberString("C ou V");
        Cliente cli;
        if (tipo.equalsIgnoreCase("V")) {
            cli = new ClienteVip(nome, email, idade);
        } else {
            cli = new ClienteComum(nome, email, idade);
        }
        dados.add(cli);
    }
    
    //cliente a pesquisar   
    public static void pesquisarCliente() {
        String pesq = EntradaSaida.receberString("Nome a pesquisar:");
        Cliente cli = retornarCliente(pesq);
        String saida = "";
        if (cli != null) {
            saida = saida + cli.retornarNome() + "\n";
            saida += cli.retornarEmail() + "\n";
            saida += cli.retornarIdade();
        } else {
            saida = "Cliente não encontrado";
        }
        EntradaSaida.mostrarTexto(saida);
    }
    
    
    //recebe a pesquisa e busca o objeto
    private static Cliente retornarCliente(String pesq) {
        Cliente cli = null;
        for (int i=0; i<dados.size(); i++) {
            cli = dados.get(i);
            String nome = cli.retornarNome();
            if (nome.equalsIgnoreCase(pesq)) {
                return cli;
            }
        }
        
        return null;
    }
    
    //aumenta limite do cliente vip
    public static void aumentarLimite() {
        String pesq = EntradaSaida.receberString("Cliente?");
        Cliente cli = retornarCliente(pesq);
        if (cli != null && cli instanceof ClienteVip) {
            ClienteVip cv = (ClienteVip)cli; //forçar o tipo (type casting)
            cv.ajustarLimite();
            double lim = cv.retornarLimite();
            EntradaSaida.mostrarTexto("Novo limite: "+lim);
        }
        else {
            EntradaSaida.mostrarTexto("Cliente Comum...");
        }
    }
}
