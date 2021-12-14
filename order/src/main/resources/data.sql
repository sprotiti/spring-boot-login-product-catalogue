create table orders (oid integer not null, cust_id bigint, order_id bigint, prod_id integer not null, total_amount double not null, primary key (oid));
create table products (product_id integer not null, available boolean not null, description varchar(255), measurement_unit varchar(255), name varchar(255), price double, primary key (product_id));
create sequence hibernate_sequence start with 4 increment by 1;
insert into orders(oid, cust_id , order_id , prod_id , total_amount ) values ( 1, 1, 101, 3, 300 );
insert into orders(oid, cust_id , order_id , prod_id , total_amount ) values ( 2, 1, 102, 2, 400 );
insert into orders(oid, cust_id , order_id , prod_id , total_amount ) values ( 3, 2, 201, 1, 500 );