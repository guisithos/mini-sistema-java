/**
 * Classe que contém as informações dos clientes
 * como "nome", "email", "idade", etc. 
 * <br />
 * Possui métodos para ajustar e obter esses dados.
 * 
 * @author (Alfamidia) 
 * @version (1.0)
 */
public abstract class Cliente
{
    private String nome;
    private String email;
    private int idade;
    
    /**
     * Construtor com inicialização básica
     */
    public Cliente() {
        this.nome = "";
        this.email = "";
        this.idade = 0;
    }
    
    /**
     * Construtor 
     * @param (String, String, int)
     */
    public Cliente(String nome, String email, int idade) {
        this.nome = nome;
        this.email = email;
        this.idade = idade;
    }

    //métodos "get" e "set"
    public String retornarNome() {
        return this.nome;
    }
    
    public void ajustarNome(String nome) {
        this.nome = nome;
    }
    
    public String retornarEmail() {
        return this.email;
    }
    public void ajustarEmail(String email) {
        this.email = email;
    }
    
    public int retornarIdade() {
        return this.idade;
    }
    public void ajustarIdade(int idade) {
        this.idade = idade;
    }
}