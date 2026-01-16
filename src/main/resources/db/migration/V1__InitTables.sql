CREATE TABLE users(
id serial primary key,
mail varchar not null,
password varchar not null,
loginDisabled BOOLEAN DEFAULT TRUE,
roles varchar not null)