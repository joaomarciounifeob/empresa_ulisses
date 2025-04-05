// Classe ServicoCorrida, que estende a classe Servico.
// Representa um tipo específico de serviço: uma corrida de táxi.
public class ServicoCorrida extends Servico {
    private String origem;  // Atributo que representa o ponto de origem da corrida.
    private String destino; // Atributo que representa o ponto de destino da corrida.

    // Construtor da classe ServicoCorrida, que chama o construtor da classe base Servico.
    public ServicoCorrida(Cliente cliente, Veiculo veiculo, double valor, String origem, String destino) {
        super(cliente, veiculo, valor);
        this.origem = origem;
        this.destino = destino;
    }

    // Implementação do método abstrato 'getDescricao()', fornecendo uma descrição específica para a corrida de táxi.
    @Override
    public String getDescricao() {
        return "Corrida de táxi de " + origem + " para " + destino;
    }
}
