-- Criação da tabela Pessoa
CREATE TABLE Pessoa (
    id INT AUTO_INCREMENT PRIMARY KEY,   -- Identificador único para cada pessoa
    nome VARCHAR(255) NOT NULL,          -- Nome da pessoa
    cpf VARCHAR(14) NOT NULL UNIQUE      -- CPF da pessoa, com 14 caracteres (com pontos e traço)
);

-- Criação da tabela Cliente
CREATE TABLE Cliente (
    id INT AUTO_INCREMENT PRIMARY KEY,   -- Identificador único para cada cliente
    pessoa_id INT NOT NULL,              -- Referência à pessoa
    telefone VARCHAR(15) NOT NULL,       -- Número de telefone do cliente
    FOREIGN KEY (pessoa_id) REFERENCES Pessoa(id) ON DELETE CASCADE  -- Relacionamento com Pessoa
);

-- Criação da tabela Veiculo
CREATE TABLE Veiculo (
    id INT AUTO_INCREMENT PRIMARY KEY,   -- Identificador único para cada veículo
    placa VARCHAR(7) NOT NULL UNIQUE,    -- Placa do veículo, com 7 caracteres (ex: ABC-1234)
    modelo VARCHAR(255) NOT NULL         -- Modelo do veículo
);

-- Criação da tabela ServicoTipo (para armazenar os tipos de serviço, como Lavagem, Polimento, Corrida)
CREATE TABLE ServicoTipo (
    id INT AUTO_INCREMENT PRIMARY KEY,   -- Identificador único para o tipo de serviço
    descricao VARCHAR(255) NOT NULL      -- Descrição do tipo de serviço (ex: Lavagem, Polimento, Corrida)
);

-- Criação da tabela Servico
CREATE TABLE Servico (
    id INT AUTO_INCREMENT PRIMARY KEY,   -- Identificador único para cada serviço
    cliente_id INT NOT NULL,             -- Referência ao cliente que contratou o serviço
    veiculo_id INT NOT NULL,             -- Referência ao veículo do cliente
    tipo_id INT NOT NULL,                -- Referência ao tipo de serviço (Lavagem, Polimento, Corrida)
    valor DECIMAL(10, 2) NOT NULL,       -- Valor do serviço realizado
    FOREIGN KEY (cliente_id) REFERENCES Cliente(id) ON DELETE CASCADE, -- Relacionamento com Cliente
    FOREIGN KEY (veiculo_id) REFERENCES Veiculo(id) ON DELETE CASCADE, -- Relacionamento com Veiculo
    FOREIGN KEY (tipo_id) REFERENCES ServicoTipo(id) ON DELETE CASCADE -- Relacionamento com ServicoTipo
);
