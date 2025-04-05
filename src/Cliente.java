// Classe Cliente, que herda de Pessoa.
// 'Cliente' é uma especialização de 'Pessoa' e pode acessar os atributos e métodos de 'Pessoa'.
public class Cliente extends Pessoa {
    private String telefone; // Atributo para armazenar o telefone do cliente.

    // Construtor da classe Cliente, que inicializa os atributos 'nome', 'cpf' e 'telefone'.
    public Cliente(String nome, String cpf, String telefone) {
        super(nome, cpf);  // Chama o construtor da classe base 'Pessoa'.
        this.telefone = telefone;
    }

    // Getter para acessar o telefone do cliente.
    public String getTelefone() {
        return telefone;
    }
}
