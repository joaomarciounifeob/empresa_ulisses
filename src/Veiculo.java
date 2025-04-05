// Classe Veiculo, que representa um veículo.
public class Veiculo {
    private String placa;  // Atributo para armazenar a placa do veículo.
    private String modelo; // Atributo para armazenar o modelo do veículo.

    // Construtor da classe Veiculo, que inicializa os atributos 'placa' e 'modelo'.
    public Veiculo(String placa, String modelo) {
        this.placa = placa;
        this.modelo = modelo;
    }

    // Métodos getters para acessar os valores dos atributos.
    public String getPlaca() {
        return placa;
    }

    public String getModelo() {
        return modelo;
    }
}
