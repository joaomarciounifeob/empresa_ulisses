// Classe principal que simula a execução do sistema e cria serviços para um cliente.
public class SistemaUlisses {
    public static void main(String[] args) {
        // Criando um cliente e um veículo
        Cliente cliente = new Cliente("Maria da Silva", "123.456.789-00", "1199999-0000");
        Veiculo veiculo = new Veiculo("ABC-1234", "VW GOL");

        // Criando serviços para o cliente
        Servico lavagem = new ServicoLavagem(cliente, veiculo, 100.0);
        Servico corrida = new ServicoCorrida(cliente, veiculo, 100.0, "Centro", "Shopping");
        Servico polimento = new ServicoPolimento(cliente, veiculo, 20.0);

        // Criando o relatório de serviços
        RelatorioServicos relatorio = new RelatorioServicos();
        relatorio.adicionarServico(lavagem);
        relatorio.adicionarServico(corrida);
        relatorio.adicionarServico(polimento);

        // Exibindo o relatório com o total de serviços realizados
        relatorio.mostrarRelatorio();
    }
}
