

create table client (
                         id    bigint auto_increment primary key,
                         email varchar(255) null,
                         name  varchar(255) null
);

create table product(
                        id    bigint auto_increment primary key,
                        name  varchar(255) null,
                        value double       not null
);

create table buy
(
    id         bigint auto_increment primary key,
    data       datetime     null,
    quantity int          null,
    status     varchar(255) null,
    client_id bigint       null,
    product_id bigint       null,
    constraint FK_COMPRA_PRODUTO foreign key (product_id) references product (id),
    constraint FK_COMPRA_CLIENTE foreign key (client_id) references client (id)
);