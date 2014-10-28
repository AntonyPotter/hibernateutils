
    drop table Account cascade constraints;

    drop sequence hibernate_sequence;

    create table Account (
        id bigint not null,
        email varchar(255),
        password varchar(255),
        username varchar(255),
        version bigint,
        primary key (id)
    );

    create sequence hibernate_sequence;
