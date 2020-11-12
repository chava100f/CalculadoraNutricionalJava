create database db_calculadora_nutricional;

use db_calculadora_nutricional;

CREATE TABLE medida (
id_medida INT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
tipo_desc VARCHAR(255) NOT NULL
);

CREATE TABLE grupo_alimenticio (
id_grupo_alimenticio INT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
descripcion VARCHAR(255) NOT NULL
);

CREATE TABLE alimento (
id_alimento INT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
descripcion VARCHAR(255) NOT NULL,
cantidad FLOAT UNSIGNED NOT NULL,
id_medida INT UNSIGNED, 
id_grupo_alimenticio INT UNSIGNED,
CONSTRAINT FK_medida FOREIGN KEY (id_medida)
REFERENCES medida(id_medida),
CONSTRAINT FK_grupo_alimenticio FOREIGN KEY (id_grupo_alimenticio)
REFERENCES grupo_alimenticio(id_grupo_alimenticio)
);

insert into medida (tipo_desc) values ('taza');
insert into medida (tipo_desc) values ('cucharadita');
insert into medida (tipo_desc) values ('pieza');
insert into medida (tipo_desc) values ('cucharada');
insert into medida (tipo_desc) values ('gramos');
insert into medida (tipo_desc) values ('lata');
insert into medida (tipo_desc) values ('rebanada');

insert into grupo_alimenticio (descripcion) values ('aceite_grasa_con_proteina');
insert into grupo_alimenticio (descripcion) values ('aceite_grasa_sin_proteina');
insert into grupo_alimenticio (descripcion) values ('verdura');
insert into grupo_alimenticio (descripcion) values ('fruta');
insert into grupo_alimenticio (descripcion) values ('lacteo');
insert into grupo_alimenticio (descripcion) values ('cereal');
insert into grupo_alimenticio (descripcion) values ('alimento_sin_energia');
insert into grupo_alimenticio (descripcion) values ('origen_animal_bajo_grasa');
insert into grupo_alimenticio (descripcion) values ('origen_animal_muy_bajo_grasa');
insert into grupo_alimenticio (descripcion) values ('azucar');
insert into grupo_alimenticio (descripcion) values ('alimento_sin_energia');
INSERT INTO grupo_alimenticio (descripcion) VALUES ('leguminosa');

INSERT INTO `db_calculadora_nutricional`.`alimento` (`id_alimento`, `descripcion`, `cantidad`, `id_medida`, `id_grupo_alimenticio`) VALUES ('1', 'Amaranto natural', '0.25', '1', '6');
INSERT INTO `db_calculadora_nutricional`.`alimento` (`id_alimento`, `descripcion`, `cantidad`, `id_medida`, `id_grupo_alimenticio`) VALUES ('2', 'Arroz integral cocido', '0.333', '1', '6');
INSERT INTO `db_calculadora_nutricional`.`alimento` (`id_alimento`, `descripcion`, `cantidad`, `id_medida`, `id_grupo_alimenticio`) VALUES ('3', 'Harina', '2.5', '2', '6');
INSERT INTO `db_calculadora_nutricional`.`alimento` (`id_alimento`, `descripcion`, `cantidad`, `id_medida`, `id_grupo_alimenticio`) VALUES ('4', 'Avena en hojuela', '0.5', '1', '6');
INSERT INTO `db_calculadora_nutricional`.`alimento` (`id_alimento`, `descripcion`, `cantidad`, `id_medida`, `id_grupo_alimenticio`) VALUES ('5', 'Camote cocido', '0.333', '1', '6');
INSERT INTO `db_calculadora_nutricional`.`alimento` (`id_alimento`, `descripcion`, `cantidad`, `id_medida`, `id_grupo_alimenticio`) VALUES ('6', 'Centeno', '5', '2', '6');
INSERT INTO `db_calculadora_nutricional`.`alimento` (`id_alimento`, `descripcion`, `cantidad`, `id_medida`, `id_grupo_alimenticio`) VALUES ('7', 'Croutones', '0.5', '1', '6');
INSERT INTO `db_calculadora_nutricional`.`alimento` (`id_alimento`, `descripcion`, `cantidad`, `id_medida`, `id_grupo_alimenticio`) VALUES ('8', 'Elote amarillo', '0.75', '1', '6');
INSERT INTO `db_calculadora_nutricional`.`alimento` (`id_alimento`, `descripcion`, `cantidad`, `id_medida`, `id_grupo_alimenticio`) VALUES ('9', 'Galleta maria', '5', '3', '6');
INSERT INTO `db_calculadora_nutricional`.`alimento` (`id_alimento`, `descripcion`, `cantidad`, `id_medida`, `id_grupo_alimenticio`) VALUES ('10', 'Galleta integral (habaneras)', '4', '3', '6');
INSERT INTO `db_calculadora_nutricional`.`alimento` (`id_alimento`, `descripcion`, `cantidad`, `id_medida`, `id_grupo_alimenticio`) VALUES ('11', 'Granola', '3', '4', '6');
INSERT INTO `db_calculadora_nutricional`.`alimento` (`id_alimento`, `descripcion`, `cantidad`, `id_medida`, `id_grupo_alimenticio`) VALUES ('12', 'Palomitas naturales', '2.5', '1', '6');
INSERT INTO `db_calculadora_nutricional`.`alimento` (`id_alimento`, `descripcion`, `cantidad`, `id_medida`, `id_grupo_alimenticio`) VALUES ('13', 'Pan arabe', '20', '5', '6');
INSERT INTO `db_calculadora_nutricional`.`alimento` (`id_alimento`, `descripcion`, `cantidad`, `id_medida`, `id_grupo_alimenticio`) VALUES ('14', 'Pan integral', '1', '3', '6');
INSERT INTO `db_calculadora_nutricional`.`alimento` (`id_alimento`, `descripcion`, `cantidad`, `id_medida`, `id_grupo_alimenticio`) VALUES ('15', 'Pan tostado', '1', '3', '6');
INSERT INTO `db_calculadora_nutricional`.`alimento` (`id_alimento`, `descripcion`, `cantidad`, `id_medida`, `id_grupo_alimenticio`) VALUES ('16', 'Papa cocida', '0.5', '3', '6');
INSERT INTO `db_calculadora_nutricional`.`alimento` (`id_alimento`, `descripcion`, `cantidad`, `id_medida`, `id_grupo_alimenticio`) VALUES ('17', 'Pasta cocida', '0.5', '1', '6');
INSERT INTO `db_calculadora_nutricional`.`alimento` (`id_alimento`, `descripcion`, `cantidad`, `id_medida`, `id_grupo_alimenticio`) VALUES ('18', 'Quinoa', '20', '5', '6');
INSERT INTO `db_calculadora_nutricional`.`alimento` (`id_alimento`, `descripcion`, `cantidad`, `id_medida`, `id_grupo_alimenticio`) VALUES ('19', 'Tortilla de maiz', '1', '3', '6');
INSERT INTO `db_calculadora_nutricional`.`alimento` (`id_alimento`, `descripcion`, `cantidad`, `id_medida`, `id_grupo_alimenticio`) VALUES ('20', 'Tortilla de nopal', '3', '3', '6');
INSERT INTO `db_calculadora_nutricional`.`alimento` (`id_alimento`, `descripcion`, `cantidad`, `id_medida`, `id_grupo_alimenticio`) VALUES ('21', 'Tostada de maiz horneada', '2', '3', '6');

INSERT INTO `db_calculadora_nutricional`.`alimento` (`id_alimento`, `descripcion`, `cantidad`, `id_medida`, `id_grupo_alimenticio`) VALUES ('22', 'Achiote', '1', '4', '7');
INSERT INTO `db_calculadora_nutricional`.`alimento` (`id_alimento`, `descripcion`, `cantidad`, `id_medida`, `id_grupo_alimenticio`) VALUES ('23', 'Anis', '1', '4', '7');
INSERT INTO `db_calculadora_nutricional`.`alimento` (`id_alimento`, `descripcion`, `cantidad`, `id_medida`, `id_grupo_alimenticio`) VALUES ('24', 'Jengibre', '1', '4', '7');
INSERT INTO `db_calculadora_nutricional`.`alimento` (`id_alimento`, `descripcion`, `cantidad`, `id_medida`, `id_grupo_alimenticio`) VALUES ('25', 'Grenetina sin azucar', '1', '4', '7');
INSERT INTO `db_calculadora_nutricional`.`alimento` (`id_alimento`, `descripcion`, `cantidad`, `id_medida`, `id_grupo_alimenticio`) VALUES ('26', 'Hierbas finas', '1', '4', '7');
INSERT INTO `db_calculadora_nutricional`.`alimento` (`id_alimento`, `descripcion`, `cantidad`, `id_medida`, `id_grupo_alimenticio`) VALUES ('27', 'Hierbas molidas', '1', '4', '7');
INSERT INTO `db_calculadora_nutricional`.`alimento` (`id_alimento`, `descripcion`, `cantidad`, `id_medida`, `id_grupo_alimenticio`) VALUES ('28', 'Levadura', '1', '4', '7');
INSERT INTO `db_calculadora_nutricional`.`alimento` (`id_alimento`, `descripcion`, `cantidad`, `id_medida`, `id_grupo_alimenticio`) VALUES ('39', 'Menta', '1', '4', '7');
INSERT INTO `db_calculadora_nutricional`.`alimento` (`id_alimento`, `descripcion`, `cantidad`, `id_medida`, `id_grupo_alimenticio`) VALUES ('40', 'Mostaza', '1', '4', '7');
INSERT INTO `db_calculadora_nutricional`.`alimento` (`id_alimento`, `descripcion`, `cantidad`, `id_medida`, `id_grupo_alimenticio`) VALUES ('41', 'Nuez en polvo', '1', '4', '7');
INSERT INTO `db_calculadora_nutricional`.`alimento` (`id_alimento`, `descripcion`, `cantidad`, `id_medida`, `id_grupo_alimenticio`) VALUES ('42', 'Oregano', '1', '4', '7');
INSERT INTO `db_calculadora_nutricional`.`alimento` (`id_alimento`, `descripcion`, `cantidad`, `id_medida`, `id_grupo_alimenticio`) VALUES ('43', 'Curry', '1', '4', '7');
INSERT INTO `db_calculadora_nutricional`.`alimento` (`id_alimento`, `descripcion`, `cantidad`, `id_medida`, `id_grupo_alimenticio`) VALUES ('44', 'Salsa teriyaki', '1', '4', '7');
INSERT INTO `db_calculadora_nutricional`.`alimento` (`id_alimento`, `descripcion`, `cantidad`, `id_medida`, `id_grupo_alimenticio`) VALUES ('45', 'Vainilla', '1', '4', '7');
INSERT INTO `db_calculadora_nutricional`.`alimento` (`id_alimento`, `descripcion`, `cantidad`, `id_medida`, `id_grupo_alimenticio`) VALUES ('46', 'Vinagre', '1', '4', '7');
INSERT INTO `db_calculadora_nutricional`.`alimento` (`id_alimento`, `descripcion`, `cantidad`, `id_medida`, `id_grupo_alimenticio`) VALUES ('47', 'Cafe americano sin azucar', '1', '1', '7');
INSERT INTO `db_calculadora_nutricional`.`alimento` (`id_alimento`, `descripcion`, `cantidad`, `id_medida`, `id_grupo_alimenticio`) VALUES ('48', 'Cafe descafeinado', '1', '1', '7');
INSERT INTO `db_calculadora_nutricional`.`alimento` (`id_alimento`, `descripcion`, `cantidad`, `id_medida`, `id_grupo_alimenticio`) VALUES ('49', 'Cafe instantaneo', '1', '1', '7');
INSERT INTO `db_calculadora_nutricional`.`alimento` (`id_alimento`, `descripcion`, `cantidad`, `id_medida`, `id_grupo_alimenticio`) VALUES ('50', 'Consome de res', '1', '1', '7');
INSERT INTO `db_calculadora_nutricional`.`alimento` (`id_alimento`, `descripcion`, `cantidad`, `id_medida`, `id_grupo_alimenticio`) VALUES ('51', 'Consome de res enlatado', '1', '1', '7');
INSERT INTO `db_calculadora_nutricional`.`alimento` (`id_alimento`, `descripcion`, `cantidad`, `id_medida`, `id_grupo_alimenticio`) VALUES ('52', 'Consome de res en cubo', '1', '1', '7');
INSERT INTO `db_calculadora_nutricional`.`alimento` (`id_alimento`, `descripcion`, `cantidad`, `id_medida`, `id_grupo_alimenticio`) VALUES ('53', 'Coca cola zero ', '1', '6', '7');

INSERT INTO `db_calculadora_nutricional`.`alimento` (`id_alimento`, `descripcion`, `cantidad`, `id_medida`, `id_grupo_alimenticio`) VALUES ('54', 'Ate', '13', '5', '10');
INSERT INTO `db_calculadora_nutricional`.`alimento` (`id_alimento`, `descripcion`, `cantidad`, `id_medida`, `id_grupo_alimenticio`) VALUES ('55', 'Azucar de mesa', '2', '2', '10');
INSERT INTO `db_calculadora_nutricional`.`alimento` (`id_alimento`, `descripcion`, `cantidad`, `id_medida`, `id_grupo_alimenticio`) VALUES ('56', 'Chocolate en polvo no azucar', '2', '2', '10');
INSERT INTO `db_calculadora_nutricional`.`alimento` (`id_alimento`, `descripcion`, `cantidad`, `id_medida`, `id_grupo_alimenticio`) VALUES ('57', 'Cocoa en polvo', '2', '2', '10');
INSERT INTO `db_calculadora_nutricional`.`alimento` (`id_alimento`, `descripcion`, `cantidad`, `id_medida`, `id_grupo_alimenticio`) VALUES ('58', 'Gelatina', '0.333', '1', '10');
INSERT INTO `db_calculadora_nutricional`.`alimento` (`id_alimento`, `descripcion`, `cantidad`, `id_medida`, `id_grupo_alimenticio`) VALUES ('59', 'Mermelada', '2.5', '2', '10');
INSERT INTO `db_calculadora_nutricional`.`alimento` (`id_alimento`, `descripcion`, `cantidad`, `id_medida`, `id_grupo_alimenticio`) VALUES ('60', 'Miel de abeja', '2', '2', '10');
INSERT INTO `db_calculadora_nutricional`.`alimento` (`id_alimento`, `descripcion`, `cantidad`, `id_medida`, `id_grupo_alimenticio`) VALUES ('61', 'Cajeta', '1.5', '2', '10');
INSERT INTO `db_calculadora_nutricional`.`alimento` (`id_alimento`, `descripcion`, `cantidad`, `id_medida`, `id_grupo_alimenticio`) VALUES ('62', 'Flan en polvo', '1', '2', '10');

INSERT INTO `db_calculadora_nutricional`.`alimento` (`id_alimento`, `descripcion`, `cantidad`, `id_medida`, `id_grupo_alimenticio`) VALUES ('63', 'Leche descremada', '1', '1', '5');
INSERT INTO `db_calculadora_nutricional`.`alimento` (`id_alimento`, `descripcion`, `cantidad`, `id_medida`, `id_grupo_alimenticio`) VALUES ('64', 'Yogur natural', '0.75', '1', '5');
INSERT INTO `db_calculadora_nutricional`.`alimento` (`id_alimento`, `descripcion`, `cantidad`, `id_medida`, `id_grupo_alimenticio`) VALUES ('65', 'Yogur griego', '1', '1', '5');
INSERT INTO `db_calculadora_nutricional`.`alimento` (`id_alimento`, `descripcion`, `cantidad`, `id_medida`, `id_grupo_alimenticio`) VALUES ('66', 'Leche arroz', '1', '1', '5');
INSERT INTO `db_calculadora_nutricional`.`alimento` (`id_alimento`, `descripcion`, `cantidad`, `id_medida`, `id_grupo_alimenticio`) VALUES ('67', 'Leche nuez', '1', '1', '5');
INSERT INTO `db_calculadora_nutricional`.`alimento` (`id_alimento`, `descripcion`, `cantidad`, `id_medida`, `id_grupo_alimenticio`) VALUES ('68', 'Leche coco', '1', '1', '5');
INSERT INTO `db_calculadora_nutricional`.`alimento` (`id_alimento`, `descripcion`, `cantidad`, `id_medida`, `id_grupo_alimenticio`) VALUES ('69', 'Leche semi descremada', '1', '1', '5');

INSERT INTO `db_calculadora_nutricional`.`alimento` (`id_alimento`, `descripcion`, `cantidad`, `id_medida`, `id_grupo_alimenticio`) VALUES ('70', 'Agua de coco', '1.5', '1', '4');
INSERT INTO `db_calculadora_nutricional`.`alimento` (`id_alimento`, `descripcion`, `cantidad`, `id_medida`, `id_grupo_alimenticio`) VALUES ('71', 'Arandano fresco', '1.5', '1', '4');
INSERT INTO `db_calculadora_nutricional`.`alimento` (`id_alimento`, `descripcion`, `cantidad`, `id_medida`, `id_grupo_alimenticio`) VALUES ('72', 'Blueberries', '0.75', '1', '4');
INSERT INTO `db_calculadora_nutricional`.`alimento` (`id_alimento`, `descripcion`, `cantidad`, `id_medida`, `id_grupo_alimenticio`) VALUES ('73', 'Ciruela negra', '0.5', '3', '4');
INSERT INTO `db_calculadora_nutricional`.`alimento` (`id_alimento`, `descripcion`, `cantidad`, `id_medida`, `id_grupo_alimenticio`) VALUES ('74', 'Fresas', '1', '1', '4');
INSERT INTO `db_calculadora_nutricional`.`alimento` (`id_alimento`, `descripcion`, `cantidad`, `id_medida`, `id_grupo_alimenticio`) VALUES ('75', 'Guayaba', '3', '3', '4');
INSERT INTO `db_calculadora_nutricional`.`alimento` (`id_alimento`, `descripcion`, `cantidad`, `id_medida`, `id_grupo_alimenticio`) VALUES ('76', 'Higo', '2', '3', '4');
INSERT INTO `db_calculadora_nutricional`.`alimento` (`id_alimento`, `descripcion`, `cantidad`, `id_medida`, `id_grupo_alimenticio`) VALUES ('77', 'Mango picado', '1', '1', '4');
INSERT INTO `db_calculadora_nutricional`.`alimento` (`id_alimento`, `descripcion`, `cantidad`, `id_medida`, `id_grupo_alimenticio`) VALUES ('78', 'Manzana', '1', '3', '4');
INSERT INTO `db_calculadora_nutricional`.`alimento` (`id_alimento`, `descripcion`, `cantidad`, `id_medida`, `id_grupo_alimenticio`) VALUES ('79', 'Melon', '1', '1', '4');
INSERT INTO `db_calculadora_nutricional`.`alimento` (`id_alimento`, `descripcion`, `cantidad`, `id_medida`, `id_grupo_alimenticio`) VALUES ('80', 'Naranja', '2', '3', '4');
INSERT INTO `db_calculadora_nutricional`.`alimento` (`id_alimento`, `descripcion`, `cantidad`, `id_medida`, `id_grupo_alimenticio`) VALUES ('81', 'Papaya', '1', '1', '4');
INSERT INTO `db_calculadora_nutricional`.`alimento` (`id_alimento`, `descripcion`, `cantidad`, `id_medida`, `id_grupo_alimenticio`) VALUES ('82', 'Pera', '0.5', '3', '4');
INSERT INTO `db_calculadora_nutricional`.`alimento` (`id_alimento`, `descripcion`, `cantidad`, `id_medida`, `id_grupo_alimenticio`) VALUES ('83', 'Piña', '0.75', '1', '4');
INSERT INTO `db_calculadora_nutricional`.`alimento` (`id_alimento`, `descripcion`, `cantidad`, `id_medida`, `id_grupo_alimenticio`) VALUES ('84', 'Platano', '0.5', '3', '4');
INSERT INTO `db_calculadora_nutricional`.`alimento` (`id_alimento`, `descripcion`, `cantidad`, `id_medida`, `id_grupo_alimenticio`) VALUES ('85', 'Sandia', '1', '1', '4');
INSERT INTO `db_calculadora_nutricional`.`alimento` (`id_alimento`, `descripcion`, `cantidad`, `id_medida`, `id_grupo_alimenticio`) VALUES ('86', 'Toronja', '1', '3', '4');
INSERT INTO `db_calculadora_nutricional`.`alimento` (`id_alimento`, `descripcion`, `cantidad`, `id_medida`, `id_grupo_alimenticio`) VALUES ('87', 'Tuna', '2', '3', '4');
INSERT INTO `db_calculadora_nutricional`.`alimento` (`id_alimento`, `descripcion`, `cantidad`, `id_medida`, `id_grupo_alimenticio`) VALUES ('88', 'Uva', '1', '1', '4');

INSERT INTO `db_calculadora_nutricional`.`alimento` (`id_alimento`, `descripcion`, `cantidad`, `id_medida`, `id_grupo_alimenticio`) VALUES ('89', 'Acelga cocida', '0.5', '1', '3');
INSERT INTO `db_calculadora_nutricional`.`alimento` (`id_alimento`, `descripcion`, `cantidad`, `id_medida`, `id_grupo_alimenticio`) VALUES ('90', 'Apio crudo', '0.75', '1', '3');
INSERT INTO `db_calculadora_nutricional`.`alimento` (`id_alimento`, `descripcion`, `cantidad`, `id_medida`, `id_grupo_alimenticio`) VALUES ('91', 'Berenjena picada cocida', '1', '1', '3');
INSERT INTO `db_calculadora_nutricional`.`alimento` (`id_alimento`, `descripcion`, `cantidad`, `id_medida`, `id_grupo_alimenticio`) VALUES ('92', 'Betabel', '0.25', '1', '3');
INSERT INTO `db_calculadora_nutricional`.`alimento` (`id_alimento`, `descripcion`, `cantidad`, `id_medida`, `id_grupo_alimenticio`) VALUES ('93', 'Brocoli cocido', '0.5', '1', '3');
INSERT INTO `db_calculadora_nutricional`.`alimento` (`id_alimento`, `descripcion`, `cantidad`, `id_medida`, `id_grupo_alimenticio`) VALUES ('94', 'Calabacita', '1', '3', '3');
INSERT INTO `db_calculadora_nutricional`.`alimento` (`id_alimento`, `descripcion`, `cantidad`, `id_medida`, `id_grupo_alimenticio`) VALUES ('95', 'Champiñon cocido', '0.5', '1', '3');
INSERT INTO `db_calculadora_nutricional`.`alimento` (`id_alimento`, `descripcion`, `cantidad`, `id_medida`, `id_grupo_alimenticio`) VALUES ('96', 'Cebollita cambray', '3', '3', '3');
INSERT INTO `db_calculadora_nutricional`.`alimento` (`id_alimento`, `descripcion`, `cantidad`, `id_medida`, `id_grupo_alimenticio`) VALUES ('97', 'Coliflor cocida', '0.75', '1', '3');
INSERT INTO `db_calculadora_nutricional`.`alimento` (`id_alimento`, `descripcion`, `cantidad`, `id_medida`, `id_grupo_alimenticio`) VALUES ('98', 'Chayote cocido', '0.5', '1', '3');
INSERT INTO `db_calculadora_nutricional`.`alimento` (`id_alimento`, `descripcion`, `cantidad`, `id_medida`, `id_grupo_alimenticio`) VALUES ('99', 'Chile poblano', '0.5', '3', '3');
INSERT INTO `db_calculadora_nutricional`.`alimento` (`id_alimento`, `descripcion`, `cantidad`, `id_medida`, `id_grupo_alimenticio`) VALUES ('100', 'Ejotes cocidos', '0.5', '1', '3');
INSERT INTO `db_calculadora_nutricional`.`alimento` (`id_alimento`, `descripcion`, `cantidad`, `id_medida`, `id_grupo_alimenticio`) VALUES ('101', 'Espinaca cruda', '2', '1', '3');
INSERT INTO `db_calculadora_nutricional`.`alimento` (`id_alimento`, `descripcion`, `cantidad`, `id_medida`, `id_grupo_alimenticio`) VALUES ('102', 'Espinaca cocida', '0.5', '1', '3');
INSERT INTO `db_calculadora_nutricional`.`alimento` (`id_alimento`, `descripcion`, `cantidad`, `id_medida`, `id_grupo_alimenticio`) VALUES ('103', 'Flor de calabaza cocida', '1', '1', '3');
INSERT INTO `db_calculadora_nutricional`.`alimento` (`id_alimento`, `descripcion`, `cantidad`, `id_medida`, `id_grupo_alimenticio`) VALUES ('104', 'Germen de alfalfa', '3', '1', '3');
INSERT INTO `db_calculadora_nutricional`.`alimento` (`id_alimento`, `descripcion`, `cantidad`, `id_medida`, `id_grupo_alimenticio`) VALUES ('105', 'Jitomate bola', '1', '3', '3');
INSERT INTO `db_calculadora_nutricional`.`alimento` (`id_alimento`, `descripcion`, `cantidad`, `id_medida`, `id_grupo_alimenticio`) VALUES ('106', 'Jitomate cherry', '4', '3', '3');
INSERT INTO `db_calculadora_nutricional`.`alimento` (`id_alimento`, `descripcion`, `cantidad`, `id_medida`, `id_grupo_alimenticio`) VALUES ('107', 'Lechuga', '3', '1', '3');
INSERT INTO `db_calculadora_nutricional`.`alimento` (`id_alimento`, `descripcion`, `cantidad`, `id_medida`, `id_grupo_alimenticio`) VALUES ('108', 'Nopal cocido', '1', '1', '3');
INSERT INTO `db_calculadora_nutricional`.`alimento` (`id_alimento`, `descripcion`, `cantidad`, `id_medida`, `id_grupo_alimenticio`) VALUES ('109', 'Pepino', '1', '1', '3');
INSERT INTO `db_calculadora_nutricional`.`alimento` (`id_alimento`, `descripcion`, `cantidad`, `id_medida`, `id_grupo_alimenticio`) VALUES ('110', 'Pimiento cocido', '0.5', '1', '3');
INSERT INTO `db_calculadora_nutricional`.`alimento` (`id_alimento`, `descripcion`, `cantidad`, `id_medida`, `id_grupo_alimenticio`) VALUES ('111', 'Setas cocidas', '0.5', '1', '3');
INSERT INTO `db_calculadora_nutricional`.`alimento` (`id_alimento`, `descripcion`, `cantidad`, `id_medida`, `id_grupo_alimenticio`) VALUES ('112', 'zanahoria', '0.5', '1', '3');

INSERT INTO `db_calculadora_nutricional`.`alimento` (`id_alimento`, `descripcion`, `cantidad`, `id_medida`, `id_grupo_alimenticio`) VALUES ('113', 'Frijol germinado cocido', '1', '1', '12');
INSERT INTO `db_calculadora_nutricional`.`alimento` (`id_alimento`, `descripcion`, `cantidad`, `id_medida`, `id_grupo_alimenticio`) VALUES ('114', 'Chicharo cocido', '0.5', '1', '12');
INSERT INTO `db_calculadora_nutricional`.`alimento` (`id_alimento`, `descripcion`, `cantidad`, `id_medida`, `id_grupo_alimenticio`) VALUES ('115', 'Frijol entero enlatado', '0.5', '1', '12');
INSERT INTO `db_calculadora_nutricional`.`alimento` (`id_alimento`, `descripcion`, `cantidad`, `id_medida`, `id_grupo_alimenticio`) VALUES ('116', 'Garbanzos cocidos', '0.5', '1', '12');
INSERT INTO `db_calculadora_nutricional`.`alimento` (`id_alimento`, `descripcion`, `cantidad`, `id_medida`, `id_grupo_alimenticio`) VALUES ('117', 'Haba cocida', '0.5', '1', '12');
INSERT INTO `db_calculadora_nutricional`.`alimento` (`id_alimento`, `descripcion`, `cantidad`, `id_medida`, `id_grupo_alimenticio`) VALUES ('118', 'Lenteja cocida', '0.5', '1', '12');
INSERT INTO `db_calculadora_nutricional`.`alimento` (`id_alimento`, `descripcion`, `cantidad`, `id_medida`, `id_grupo_alimenticio`) VALUES ('119', 'Frijol refrito cocido', '0.333', '1', '12');
INSERT INTO `db_calculadora_nutricional`.`alimento` (`id_alimento`, `descripcion`, `cantidad`, `id_medida`, `id_grupo_alimenticio`) VALUES ('120', 'Soya cocida', '0.333', '1', '12');
INSERT INTO `db_calculadora_nutricional`.`alimento` (`id_alimento`, `descripcion`, `cantidad`, `id_medida`, `id_grupo_alimenticio`) VALUES ('121', 'Harina de soya', '4', '4', '12');
INSERT INTO `db_calculadora_nutricional`.`alimento` (`id_alimento`, `descripcion`, `cantidad`, `id_medida`, `id_grupo_alimenticio`) VALUES ('122', 'Harina de frijol', '3', '4', '12');
INSERT INTO `db_calculadora_nutricional`.`alimento` (`id_alimento`, `descripcion`, `cantidad`, `id_medida`, `id_grupo_alimenticio`) VALUES ('123', 'Harina de garbanzo', '3', '4', '12');
INSERT INTO `db_calculadora_nutricional`.`alimento` (`id_alimento`, `descripcion`, `cantidad`, `id_medida`, `id_grupo_alimenticio`) VALUES ('124', 'Harina de lenteja ', '3', '4', '12');

INSERT INTO `db_calculadora_nutricional`.`alimento` (`id_alimento`, `descripcion`, `cantidad`, `id_medida`, `id_grupo_alimenticio`) VALUES ('125', 'Aceite para cocina', '1', '2', '2');
INSERT INTO `db_calculadora_nutricional`.`alimento` (`id_alimento`, `descripcion`, `cantidad`, `id_medida`, `id_grupo_alimenticio`) VALUES ('126', 'Crema agria', '1', '2', '2');
INSERT INTO `db_calculadora_nutricional`.`alimento` (`id_alimento`, `descripcion`, `cantidad`, `id_medida`, `id_grupo_alimenticio`) VALUES ('127', 'Crema para cafe', '1', '2', '2');
INSERT INTO `db_calculadora_nutricional`.`alimento` (`id_alimento`, `descripcion`, `cantidad`, `id_medida`, `id_grupo_alimenticio`) VALUES ('128', 'Aceituna negra sin hueso', '5', '3', '2');
INSERT INTO `db_calculadora_nutricional`.`alimento` (`id_alimento`, `descripcion`, `cantidad`, `id_medida`, `id_grupo_alimenticio`) VALUES ('129', 'Aceituna verde sin hueso', '8', '3', '2');
INSERT INTO `db_calculadora_nutricional`.`alimento` (`id_alimento`, `descripcion`, `cantidad`, `id_medida`, `id_grupo_alimenticio`) VALUES ('130', 'Aderezo', '2', '2', '2');
INSERT INTO `db_calculadora_nutricional`.`alimento` (`id_alimento`, `descripcion`, `cantidad`, `id_medida`, `id_grupo_alimenticio`) VALUES ('131', 'Aguacate', '0.333', '3', '2');
INSERT INTO `db_calculadora_nutricional`.`alimento` (`id_alimento`, `descripcion`, `cantidad`, `id_medida`, `id_grupo_alimenticio`) VALUES ('132', 'Ajonjoli', '4', '2', '1');
INSERT INTO `db_calculadora_nutricional`.`alimento` (`id_alimento`, `descripcion`, `cantidad`, `id_medida`, `id_grupo_alimenticio`) VALUES ('133', 'Almendra', '10', '3', '1');
INSERT INTO `db_calculadora_nutricional`.`alimento` (`id_alimento`, `descripcion`, `cantidad`, `id_medida`, `id_grupo_alimenticio`) VALUES ('134', 'Cacahuate natural', '14', '3', '1');
INSERT INTO `db_calculadora_nutricional`.`alimento` (`id_alimento`, `descripcion`, `cantidad`, `id_medida`, `id_grupo_alimenticio`) VALUES ('135', 'Crema de cacahuate', '3', '4', '1');
INSERT INTO `db_calculadora_nutricional`.`alimento` (`id_alimento`, `descripcion`, `cantidad`, `id_medida`, `id_grupo_alimenticio`) VALUES ('136', 'Nuez', '3', '3', '1');
INSERT INTO `db_calculadora_nutricional`.`alimento` (`id_alimento`, `descripcion`, `cantidad`, `id_medida`, `id_grupo_alimenticio`) VALUES ('137', 'Nuez de la india sin sal', '8', '3', '1');
INSERT INTO `db_calculadora_nutricional`.`alimento` (`id_alimento`, `descripcion`, `cantidad`, `id_medida`, `id_grupo_alimenticio`) VALUES ('138', 'Chia', '5', '4', '1');
INSERT INTO `db_calculadora_nutricional`.`alimento` (`id_alimento`, `descripcion`, `cantidad`, `id_medida`, `id_grupo_alimenticio`) VALUES ('139', 'Pepita de calabaza', '1.5', '4', '1');

INSERT INTO `db_calculadora_nutricional`.`alimento` (`id_alimento`, `descripcion`, `cantidad`, `id_medida`, `id_grupo_alimenticio`) VALUES ('140', 'Atun en agua', '0.5', '6', '9');
INSERT INTO `db_calculadora_nutricional`.`alimento` (`id_alimento`, `descripcion`, `cantidad`, `id_medida`, `id_grupo_alimenticio`) VALUES ('141', 'Bistec', '30', '5', '9');
INSERT INTO `db_calculadora_nutricional`.`alimento` (`id_alimento`, `descripcion`, `cantidad`, `id_medida`, `id_grupo_alimenticio`) VALUES ('142', 'Camaron cocido', '5', '3', '9');
INSERT INTO `db_calculadora_nutricional`.`alimento` (`id_alimento`, `descripcion`, `cantidad`, `id_medida`, `id_grupo_alimenticio`) VALUES ('143', 'Clara de huevo', '2', '3', '9');
INSERT INTO `db_calculadora_nutricional`.`alimento` (`id_alimento`, `descripcion`, `cantidad`, `id_medida`, `id_grupo_alimenticio`) VALUES ('144', 'Filete de pescado', '0.5', '3', '9');
INSERT INTO `db_calculadora_nutricional`.`alimento` (`id_alimento`, `descripcion`, `cantidad`, `id_medida`, `id_grupo_alimenticio`) VALUES ('145', 'Jamon de pechuga de pavo', '2', '7', '9');
INSERT INTO `db_calculadora_nutricional`.`alimento` (`id_alimento`, `descripcion`, `cantidad`, `id_medida`, `id_grupo_alimenticio`) VALUES ('146', 'Pechuga de pollo', '30', '5', '9');
INSERT INTO `db_calculadora_nutricional`.`alimento` (`id_alimento`, `descripcion`, `cantidad`, `id_medida`, `id_grupo_alimenticio`) VALUES ('147', 'Queso cottage', '3', '4', '9');
INSERT INTO `db_calculadora_nutricional`.`alimento` (`id_alimento`, `descripcion`, `cantidad`, `id_medida`, `id_grupo_alimenticio`) VALUES ('148', 'Requeson promedio', '2', '4', '9');
INSERT INTO `db_calculadora_nutricional`.`alimento` (`id_alimento`, `descripcion`, `cantidad`, `id_medida`, `id_grupo_alimenticio`) VALUES ('149', 'Aguja de res', '35', '5', '8');
INSERT INTO `db_calculadora_nutricional`.`alimento` (`id_alimento`, `descripcion`, `cantidad`, `id_medida`, `id_grupo_alimenticio`) VALUES ('150', 'Atun en aceite', '0.333', '6', '8');
INSERT INTO `db_calculadora_nutricional`.`alimento` (`id_alimento`, `descripcion`, `cantidad`, `id_medida`, `id_grupo_alimenticio`) VALUES ('151', 'Carne molida de cerdo', '50', '5', '8');
INSERT INTO `db_calculadora_nutricional`.`alimento` (`id_alimento`, `descripcion`, `cantidad`, `id_medida`, `id_grupo_alimenticio`) VALUES ('152', 'Higado de res', '30', '5', '8');
INSERT INTO `db_calculadora_nutricional`.`alimento` (`id_alimento`, `descripcion`, `cantidad`, `id_medida`, `id_grupo_alimenticio`) VALUES ('153', 'Queso oaxaca light', '30', '5', '8');
INSERT INTO `db_calculadora_nutricional`.`alimento` (`id_alimento`, `descripcion`, `cantidad`, `id_medida`, `id_grupo_alimenticio`) VALUES ('154', 'Queso fresco', '40', '5', '8');
INSERT INTO `db_calculadora_nutricional`.`alimento` (`id_alimento`, `descripcion`, `cantidad`, `id_medida`, `id_grupo_alimenticio`) VALUES ('155', 'Queso panela', '40', '5', '8');

select al.descripcion, al.cantidad, me.tipo_desc as medida, ga.descripcion as grupo
from alimento al
inner join grupo_alimenticio ga on ga.id_grupo_alimenticio = al.id_grupo_alimenticio
inner join medida me on me.id_medida = al.id_medida
where ga.id_grupo_alimenticio = 2
Order by al.id_alimento;