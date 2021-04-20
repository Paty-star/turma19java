-- Criar um banco de dados 
create database dbquitanda;

-- acessa o banco de dados
 use dbquitanda;
 
 
create table tbtb_produtos_produtos(
id bigint auto_increment,
nome varchar(255) not null,
preco float not null,
primary key(id)
);

insert into tb_produtos (nome,preco) values ("mamao",2,50);
insert into tb_produtos (nome,preco) values ("melancia",1,50);



select* from tb_produtos;
alter table tb_produtos add descricao varchar(255);


 