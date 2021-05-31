  
DROP TABLE IF EXISTS items;
DROP TABLE IF EXISTS sales;
CREATE TABLE items(id serial PRIMARY KEY, name VARCHAR(255), price INTEGER);
CREATE TABLE sales(id serial PRIMARY KEY, itemid INTEGER references items(id), purchasedate DATE);
DROP SEQUENCE IF EXISTS hibernate_sequence;
CREATE SEQUENCE hibernate_sequence START 1;