drop database if EXISTS DB_API_HarryPotter;
create database DB_API_HarryPotter;
use DB_API_HarryPotter;

create table tbUser(
IdUser int primary key auto_increment not null,
NameUser varchar(50) not null,
Email varchar(100) not null,
Senha varchar(10) 
);


create table tbBooks(
IdBooks int auto_increment primary key,
Titulo varchar(100) not null,
Sumario varchar(2000) not null,
Autor varchar(100) not null,
Ano_lancamento int not null,
Ordem int not null,
Cover varchar(2000) not null,
NumPaginas int
);

insert into tbUser(NameUser, Email, Senha)
Values('Leonardo', 'leonardo.matias00@gmail.com', 'leo123');
select * from tbUser;

insert into tbBooks(Titulo, Sumario, Autor, Ano_lancamento, Ordem, Cover, NumPaginas)
Values('Harry Potter e a Pedra Filosofal',
'Inicialmente, os garotos acreditavam que a Pedra Filosofal, que se encontrava protegida em Hogwarts, fosse alvo de Severo Snape, professor da escola, para que este se tornasse rico. Mas os garotos descobrem que Voldemort, enfraquecido, está à procura da Pedra para se tornar um grande bruxo novamente.',
'J. K. Rowling',
1997,
1,
'https://m.media-amazon.com/images/I/81DVO1WYN8L._AC_UF1000,1000_QL80_.jpg',
317
);
select * from tbBooks;

CREATE USER 'harry'@'localhost' IDENTIFIED WITH mysql_native_password BY '12345678';
GRANT ALL PRIVILEGES ON DB_API_HarryPotter.* TO 'harry'@'localhost' WITH GRANT OPTION;

