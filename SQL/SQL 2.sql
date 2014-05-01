--Pizza mysql db

create database PizzaPazzo;
create table produto(
    id int not null auto_increment,
    descricao varchar(255),
    preco float,
    primary key (id)
);

create table sabor(
    id int not null auto_increment,
    nomeDoSabor varchar(255),
    primary key (id)
    
);

create table pizza(
    id int not null,
    id_sabor1 int not null,
    id_sabor2 int not null,
    foreign key (id) references produto(id)
);

create table pizza_sabor(
    id_pizza int not null,
    id_sabor int not null,
    primary key (id_pizza,id_sabor)
);

create table bebida(
    id int not null,
    qtd int,
    descricao varchar(255),
    foreign key (id) references produto(id)
)

create table cliente(
    id int not null auto_increment,
    cliente varchar(255),
    telefone varchar(255),
    endereco varchar(255),
    primary key (id)
);

create table itemPededido(
    id_it int not null auto_increment,
    id int not null,
    preco float,
    primary key (id_it),
    foreign key id references pedido(id)
);

create table pedido(
    id int not null auto_increment,
    primary key (id)
);

