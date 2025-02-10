CREATE DATABASE contact_form_db;

USE contact_form_db;

CREATE TABLE contacts (
    name VARCHAR(255) NOT NULL,
    email VARCHAR(255) NOT NULL,
    phone_number NUMBER(10) NOT NULL,
    your_query VARCHAR(150) NOT NULL,
);