create table produto
(
    nome         VARCHAR not null,
    valor        DECIMAL not null,
    quantEstoque INTEGER not null
);
INSERT INTO produto (nome, valor, quantEstoque) VALUES ('camisa', 50.0, 25);


create table cliente
(
    nome         VARCHAR not null,
    rg           VARCHAR not null,
    cpf          VARCHAR not null,
    telefone     VARCHAR not null,
    email        VARCHAR not null,
    idEndereco   LONG not null,
    idCartao     LONG not null,
);

INSERT INTO cliente (nome, rg, cpf, telefone, email, idEndereco, idCartao) VALUES ('Lucas Pereira', '9600000', '00011122233', '81988915576', 'lucaspericles.fp@gmail.com', 1, 0);