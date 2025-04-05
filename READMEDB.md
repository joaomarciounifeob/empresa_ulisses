# Sistema de Gerenciamento de Serviços de Veículos - Ulisses

Este projeto contém um sistema para gerenciar serviços de veículos, incluindo registro de clientes, veículos, tipos de serviços e execução de serviços. O banco de dados simula um sistema de gerenciamento de serviços de lavagem, polimento e corridas para veículos, com a capacidade de gerar relatórios de serviços realizados.

## Estrutura do Banco de Dados

O banco de dados `empresa_ulisses` contém as seguintes tabelas principais:

### Tabelas

#### 1. **Pessoa**

Armazena as informações básicas de uma pessoa, como nome e CPF.

- **id**: Identificador único da pessoa.
- **nome**: Nome da pessoa.
- **cpf**: CPF da pessoa (único).

#### 2. **Cliente**

Extende a tabela `Pessoa` e adiciona informações sobre o cliente, como telefone.

- **id**: Identificador único do cliente.
- **pessoa_id**: Referência para a tabela `Pessoa`.
- **telefone**: Número de telefone do cliente.

#### 3. **Veiculo**

Armazena informações sobre os veículos dos clientes.

- **id**: Identificador único do veículo.
- **placa**: Placa do veículo (única).
- **modelo**: Modelo do veículo.

#### 4. **ServicoTipo**

Armazena os tipos de serviços realizados nos veículos (Lavagem, Polimento, Corrida).

- **id**: Identificador único do tipo de serviço.
- **descricao**: Descrição do tipo de serviço (ex: "Lavagem", "Polimento", "Corrida").

#### 5. **Servico**

Registra os serviços realizados, vinculando um cliente, um veículo e um tipo de serviço.

- **id**: Identificador único do serviço.
- **cliente_id**: Referência para a tabela `Cliente`.
- **veiculo_id**: Referência para a tabela `Veiculo`.
- **tipo_id**: Referência para a tabela `ServicoTipo`.
- **valor**: Valor do serviço realizado.

## Como Executar

1. **Criar o banco de dados**:

   - Execute o script criando_banco.sql

2. **Criar as tabelas**:

   - Execute o script criando_tabelas.sql

3. **Inserir Dados de Exemplo**:

   - Execute o script inserts.sql

4. **Consultas SQL**:

   - Execute o script selects.sql

5. **Atualização de Dados**:

   - Execute o script update.sql
