create database db_farmacia_do_bem;
use db_farmacia_do_bem;
create table tb_categoria(
id bigint(5) auto_increment,
descricao varchar(255) not null,
ativo boolean not null,
primary key (id)
);
insert tb_categoria (descricao, ativo) values ("Comprimidos",true);
insert tb_categoria (descricao, ativo) values ("Xarope",true);
insert tb_categoria (descricao, ativo) values ("Pomadas",true);
insert tb_categoria (descricao, ativo) values ("Cosmeticos",true);
insert tb_categoria (descricao, ativo) values ("Curativos",true);
select * from tb_categoria;
create table tb_produtos (
id bigint(5) auto_increment,
nome varchar (255) not null,
preco decimal not null,
qtProduto int not null,
categoria_id bigint,
primary key (id),
FOREIGN KEY (categoria_id) REFERENCES tb_categoria (id)
);
insert tb_produtos (nome, preco, qtProduto, categoria_id) values ("Doril",6.58,30,1);
insert tb_produtos (nome, preco, qtProduto, categoria_id) values ("Dipirona Sódica 500mg com 30 Comprimidos Medley Generico",17.05,60,1);
insert tb_produtos (nome, preco, qtProduto, categoria_id) values ("Xarope para tosse Vick 44E 120ml P&G",21.02,30,2);
insert tb_produtos (nome, preco, qtProduto, categoria_id) values ("Pomada Fitoscar 60mg / 50g Apsen",155.52,10,3);
insert tb_produtos (nome, preco, qtProduto, categoria_id) values ("Batom Vult Cremoso Cereja N1",8.07,5,4);
insert tb_produtos (nome, preco, qtProduto, categoria_id) values ("Hidratante Paixão Felicidade 200ml",5,63,15,4);
insert tb_produtos (nome, preco, qtProduto, categoria_id) values ("Curativo Microporoso 3M Com 10 Unidades",4.74,20,5);
insert tb_produtos (nome, preco, qtProduto, categoria_id) values ("Esparadrapo Impermeável Nexcare 3M Bege 25mm X 0,9m",3.79,12,5);
select * from tb_produtos where preco > 50;
select * from tb_produtos where preco BETWEEN 3 AND 60; 
select * from tb_produtos where nome like "%B%"
select nome, preco, qtProduto, tb_categoria.descricao as descricao_da_categoria ,tb_categoria.ativo as estado_da_categoria
 from tb_produtos inner join tb_categoria on  tb_categoria.id = tb_produtos.categoria_id;


