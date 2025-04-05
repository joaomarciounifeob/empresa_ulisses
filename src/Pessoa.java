// Classe abstrata Pessoa, que serve como classe base para outras classes.
// O modificador 'abstract' impede que a classe seja instanciada diretamente, mas pode ser estendida por outras classes.
public abstract class Pessoa {
    protected String nome; // Atributo para armazenar o nome da pessoa.
    protected String cpf;  // Atributo para armazenar o CPF da pessoa.

    // Construtor da classe Pessoa, inicializa os atributos 'nome' e 'cpf'.
    public Pessoa(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    // Métodos getters para acessar os valores dos atributos.
    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }
}
