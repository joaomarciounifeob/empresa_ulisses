// Classe ServicoPolimento, que estende a classe Servico.
// Representa um tipo específico de serviço: o polimento de um veículo.
public class ServicoPolimento extends Servico {

    // Construtor da classe ServicoPolimento, que chama o construtor da classe base Servico.
    public ServicoPolimento(Cliente cliente, Veiculo veiculo, double valor) {
        super(cliente, veiculo, valor);
    }

    // Implementação do método abstrato 'getDescricao()', fornecendo uma descrição específica do serviço de polimento.
    @Override
    public String getDescricao() {
        return "Polimento de carro - " + veiculo.getModelo();
    }
}
