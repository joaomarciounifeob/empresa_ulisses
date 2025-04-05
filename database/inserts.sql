INSERT INTO Pessoa (nome, cpf) 
VALUES ('João da Silva', '123.456.789-00');

INSERT INTO Pessoa (nome, cpf) 
VALUES ('Maria da Silva', '321.654.987-00');


INSERT INTO Cliente (pessoa_id, telefone) 
VALUES (1, '1199999-0000');

INSERT INTO Cliente (pessoa_id, telefone) 
VALUES (2, '199999-9999');


INSERT INTO Veiculo (placa, modelo) 
VALUES ('ABC1234', 'Fiat Uno');
INSERT INTO Veiculo (placa, modelo) 
VALUES ('DEF4567', 'VW Gol');



INSERT INTO ServicoTipo (descricao) 
VALUES ('Lavagem'), ('Polimento'), ('Corrida');


-- Inserir Serviço
INSERT INTO Servico (cliente_id, veiculo_id, tipo_id, valor) 
VALUES (1, 1, 1, 50.00),  -- Serviço de Lavagem
       (1, 1, 2, 100.00), -- Serviço de Polimento
       (1, 1, 3, 30.00);  -- Serviço de Corrida
       
       INSERT INTO Servico (cliente_id, veiculo_id, tipo_id, valor) 
VALUES (2, 2, 1, 50.00),  -- Serviço de Lavagem
       (2, 2, 2, 100.00); -- Serviço de Polimento


