SELECT 
    s.id AS Servico_ID,
    st.descricao AS Tipo_Servico,
    v.modelo AS Modelo_Veiculo,
    s.valor AS Valor
FROM 
    Servico s
JOIN 
    ServicoTipo st ON s.tipo_id = st.id
JOIN 
    Veiculo v ON s.veiculo_id = v.id
WHERE 
    s.cliente_id = 2;




SELECT 
    v.placa, 
    v.modelo
FROM 
    Veiculo v
JOIN 
    Cliente c ON v.id = c.id
WHERE 
    c.id = 1;
    
    
    
SELECT * from veiculo;

SELECT * from servico;
 
SELECT * from cliente;


SELECT 
    p.nome, 
    c.telefone
FROM 
    Cliente c
JOIN 
    Pessoa p ON c.pessoa_id = p.id;
