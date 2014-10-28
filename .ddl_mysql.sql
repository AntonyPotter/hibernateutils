
    drop table if exists Account;

    create table Account (
        id bigint not null auto_increment,
        email varchar(255),
        password varchar(255),
        username varchar(255),
        version bigint,
        primary key (id)
    );
