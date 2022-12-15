create database sistema_de_gastos;
use sistema_de_gastos;

create table usuarios(
id_user int auto_increment primary key,
nome varchar(100) not null,
email varchar(100) not null,
senha varchar(100) not null
);

create table contas (
id_conta int auto_increment primary key,
conta varchar(100) not null,
preco varchar(20) not null
);

create table relatorio (
id_relatorio int auto_increment primary key,
renda varchar(100) not null,
gasto varchar(100) not null,
mes varchar(100) not null
);
