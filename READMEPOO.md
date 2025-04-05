# Sistema de Serviços de Veículos - Ulisses

Este projeto simula um sistema de gerenciamento de serviços de veículos, onde é possível registrar, realizar e gerar relatórios de serviço. O sistema permite registrar clientes, veículos e serviços como lavagem, polimento e corridas de táxi, exibindo relatórios com os totais dos serviços realizados.

## Estrutura do Projeto

O projeto é composto pelas seguintes classes:

- **Pessoa**: Classe abstrata que serve como base para a classe `Cliente`. Contém os atributos `nome` e `cpf`.
- **Cliente**: Classe que estende a classe `Pessoa` e adiciona o atributo `telefone`. Representa um cliente que solicita serviços.
- **Veiculo**: Representa um veículo, com atributos como `placa` e `modelo`.
- **Servico**: Classe abstrata que define os atributos básicos de um serviço, como o cliente, o veículo e o valor do serviço. É estendida por classes específicas de serviços.
- **ServicoCorrida**: Representa um serviço de corrida de táxi. Contém os atributos `origem` e `destino`, e implementa o método `getDescricao()` para fornecer a descrição do serviço.
- **ServicoLavagem**: Representa um serviço de lavagem de carro. Implementa o método `getDescricao()` para fornecer a descrição do serviço de lavagem.
- **ServicoPolimento**: Representa um serviço de polimento de carro. Implementa o método `getDescricao()` para fornecer a descrição do serviço de polimento.
- **RelatorioServicos**: Classe responsável por armazenar e exibir os serviços realizados. O relatório mostra a descrição e o valor de cada serviço, além do total ganho.
- **SistemaUlisses**: Classe principal que simula o funcionamento do sistema, criando um cliente, um veículo e diversos serviços, e gerando um relatório de serviços realizados.

## Como Executar

Para rodar o sistema, basta compilar e executar a classe `SistemaUlisses.java`. O sistema cria um cliente e um veículo, e realiza três tipos de serviços (lavagem, corrida e polimento). Em seguida, um relatório é gerado mostrando os serviços realizados e o total ganho.
