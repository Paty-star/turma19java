create database db_pizzaria_legal;

use db_pizzaria_legal;

create table tb_categoria(
id bigint(5) auto_increment,
descricao varchar(255) not null,
ativo boolean not null,
primary key (id)
);

insert tb_categoria (descricao, ativo) values ("Broto",true);
insert tb_categoria (descricao, ativo) values ("Média",true);
insert tb_categoria (descricao, ativo) values ("Grande",true);
insert tb_categoria (descricao, ativo) values ("Big",true);

select * from tb_categoria;

create table tb_pizza (
id bigint(5) auto_increment,
nome varchar (255) not null,
preco decimal not null,
qtProduto int not null,
categoria_id bigint,
primary key (id),
FOREIGN KEY (categoria_id) REFERENCES tb_categoria (id)
);
insert tb_pizza (nome, preco, qtProduto, categoria_id) values ("Mussarela",32.00,20,1);
insert tb_pizza (nome, preco, qtProduto, categoria_id) values ("Calabresa",46.00,15,2);
insert tb_pizza (nome, preco, qtProduto, categoria_id) values ("Napolitana",36.00,10,3);
insert tb_pizza (nome, preco, qtProduto, categoria_id) values ("Frango",60.00,30,4);
insert tb_pizza (nome, preco, qtProduto, categoria_id) values ("Paulista",41.00,30,4);
insert tb_pizza (nome, preco, qtProduto, categoria_id) values ("Mexicana",40.00,30,3);
insert tb_pizza (nome, preco, qtProduto, categoria_id) values ("Doce Brigadiro",50.00,10,4);

select * from tb_pizza where preco BETWEEN 29 AND 60; 
select * from tb_pizza;
select * from tb_pizza where preco > 45;
select * from tb_pizza where nome like "%Ca%"

select nome, preco, qtProduto, tb_categoria.descricao as descricao_da_categoria ,tb_categoria.ativo as estado_da_categoria
 from tb_pizza inner join tb_categoria on  tb_categoria.id = tb_pizza.categoria_id;



