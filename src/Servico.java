// Classe abstrata Servico, que define a estrutura básica de um serviço.
// Não pode ser instanciada diretamente e deve ser estendida por outras classes.
public abstract class Servico {
    protected Cliente cliente;  // Atributo que representa o cliente que solicitou o serviço.
    protected Veiculo veiculo; // Atributo que representa o veículo do cliente.
    protected double valor;    // Atributo para armazenar o valor do serviço.

    // Construtor da classe Servico, inicializa os atributos 'cliente', 'veiculo' e 'valor'.
    public Servico(Cliente cliente, Veiculo veiculo, double valor) {
        this.cliente = cliente;
        this.veiculo = veiculo;
        this.valor = valor;
    }

    // Método para obter o valor do serviço.
    public double getValor() {
        return valor;
    }

    // Método abstrato que será implementado pelas classes filhas para descrever o serviço.
    public abstract String getDescricao();
}
