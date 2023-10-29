create table if not exists "survey" (
    id int auto_increment primary key,
    user_id int not null,
    foreign key (user_id) references "user"(id)
);

create table if not exists "question" (
    id int auto_increment primary key,
    survey_id int not null,
    question varchar(1000) not null,
    foreign key(survey_id) references "survey"(id)
);

create table if not exists "option" (
    id int auto_increment primary key,
    question_id int not null,
    content varchar(1000) not null,
    votes int,
    foreign key(question_id) references "question"(id)
);

create table if not exists "votes" (
    id int auto_increment primary key,
    user_id int not null,
    survey_id int not null
);




