create table if not exists "user" (
    id int auto_increment primary key,
    email varchar(75) not null,
    password varchar(300) not null,
    name varchar(40) not null,
    lastName varchar(60) not null
);