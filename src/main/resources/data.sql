create table produto
(
    nome         VARCHAR not null,
    valor        DECIMAL not null,
    quantEstoque INTEGER not null
);
INSERT INTO produto (nome, valor, quantEstoque) VALUES ('camisa', 50.0, 25);