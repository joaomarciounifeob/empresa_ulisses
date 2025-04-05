// Classe ServicoLavagem, que estende a classe Servico.
// Representa um tipo específico de serviço: a lavagem de um veículo.
public class ServicoLavagem extends Servico {

    // Construtor da classe ServicoLavagem, que chama o construtor da classe base Servico.
    public ServicoLavagem(Cliente cliente, Veiculo veiculo, double valor) {
        super(cliente, veiculo, valor);
    }

    // Implementação do método abstrato 'getDescricao()', fornecendo uma descrição específica do serviço de lavagem.
    @Override
    public String getDescricao() {
        return "Lavagem de carro - " + veiculo.getModelo();
    }
}
