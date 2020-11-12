insert into medidas (id_medida, tipo_medida) values (1, 'taza');

insert into medidas (id_medida, tipo_medida) values (2, 'cucharadita');

insert into medidas (id_medida, tipo_medida) values (3, 'pieza');

insert into medidas (id_medida, tipo_medida) values (4, 'cucharada');

insert into medidas (id_medida, tipo_medida) values (5, 'gramos');

insert into medidas (id_medida, tipo_medida) values (6, 'lata');

insert into medidas (id_medida, tipo_medida) values (7, 'rebanada');

CREATE SEQUENCE IF NOT EXISTS  seq_medidas INCREMENT 1
MINVALUE 0 NO MAXVALUE 
START  start OWNED BY { medidas.id_medida }

