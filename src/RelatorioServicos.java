// Classe RelatorioServicos, responsável por armazenar e exibir um relatório de serviços prestados.
import java.util.ArrayList;
import java.util.List;

public class RelatorioServicos {
    private List<Servico> servicos = new ArrayList<>(); // Lista que armazena os serviços.

    // Método para adicionar um serviço à lista de serviços.
    public void adicionarServico(Servico servico) {
        servicos.add(servico);
    }

    // Método para exibir o relatório de serviços, mostrando a descrição e o valor de cada serviço.
    public void mostrarRelatorio() {
        double total = 0; // Variável para armazenar o valor total dos serviços.
        for (Servico s : servicos) {
            System.out.println(s.getDescricao() + " | Valor: R$" + s.getValor()); // Exibe a descrição e valor do serviço.
            total += s.getValor(); // Soma o valor do serviço ao total.
        }
        System.out.println("Total ganho: R$" + total); // Exibe o total ganho com os serviços.
    }
}
