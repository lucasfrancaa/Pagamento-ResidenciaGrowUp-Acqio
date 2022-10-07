create table PRODUTO
(
    NOME         VARCHAR not null,
    VALOR        DECIMAL not null,
    QUANTESTOQUE INTEGER not null
);
INSERT INTO PRODUTO (NOME, VALOR, QUANTESTOQUE) VALUES ('camisa', 50.0, 25);