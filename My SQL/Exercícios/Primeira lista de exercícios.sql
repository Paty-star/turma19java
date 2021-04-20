create database tb_rh;
use tb_rh;

create table tb_funcionarios(
id bigint auto_increment,
nome varchar(255) not null,
cadastro float not null,
ativo boolean,
primary key(id)
);

insert into tb_rh (nome, cadastro, ativo) values ("Maria",0001);
insert into tb_rh (nome, cadastro, ativo) values ("Carla",0002);
insert into tb_rh (nome, cadastro, ativo) values ("Nelson",0003);
insert into tb_rh (nome, cadastro, ativo) values ("Julia",0004);
insert into tb_rh (nome, cadastro, ativo) values ("Carlos",0005);

create database tb_salario;

create table tb_salarios(
 id bigint AUTO_INCREMENT,  
  nome varchar(30) not NULL,
  preco decimal(10,2),
  marca_id bigint not NULL,
  PRIMARY KEY (id), 
  FOREIGN KEY (rh_id) REFERENCES tb_rh (id) 
);
INSERT INTO tb_produtos (nome,cadastro,rh_id) VALUES ("salario","998.00",1);
INSERT INTO tb_produtos (nome,cadastro,rh_id) VALUES ("salario","2.000.00",2);
INSERT INTO tb_produtos (nome,cadastro,rh_id) VALUES ("salario","1.000.00",3);
INSERT INTO tb_produtos (nome,cadastro,rh_id) VALUES ("salario","998.00",4);
INSERT INTO tb_produtos (nome,cadastro,rh_id) VALUES ("salario","998.00",5);

select * from tb_rh where preco> 3;


