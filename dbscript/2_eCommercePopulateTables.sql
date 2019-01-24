--- Read 0_ecommerceDBInstructions first --
-- This is the SECOND SCRIPT that must be run on database ecommerce --
-- Copy the code, right click database ecommerce created on PostgresSQL and run --


/*==========================================================================*/
/* Table: COUNTRY															*/
/*==========================================================================*/

insert into country(name, abv)
values('Árgentina', 'ARG');

insert into country(name, abv)
values('Brasil', 'BRA');

insert into country(name, abv)
values('Estados Unidos', 'USA');

insert into country(name, abv)
values('Itália', 'ITA');


/*==========================================================================*/
/* Table: STATE																*/
/*==========================================================================*/

/* Brazil States*/

insert into state(id_country, name, abv)
values(2, 'Acre','AC');

insert into state(id_country, name, abv)
values(2, 'Alagoas','AL');

insert into state(id_country, name, abv)
values(2, 'Amapá','AP');

insert into state(id_country, name, abv)
values(2, 'Amazonas','AM');

insert into state(id_country, name, abv)
values(2, 'Bahia','BA');

insert into state(id_country, name, abv)
values(2, 'Ceará','CE');

insert into state(id_country, name, abv)
values(2, 'Distrito Federal','DF');

insert into state(id_country, name, abv)
values(2, 'Espírito Santo','ES');

insert into state(id_country, name, abv)
values(2, 'Goiás','GO');

insert into state(id_country, name, abv)
values(2, 'Maranhão','MA');

insert into state(id_country, name, abv)
values(2, 'Mato Grosso','MT');

insert into state(id_country, name, abv)
values(2, 'Mato Grosso do Sul','MS');

insert into state(id_country, name, abv)
values(2, 'Minas Gerais','MG');

insert into state(id_country, name, abv)
values(2, 'Paraná','PR');

insert into state(id_country, name, abv)
values(2, 'Paraíba','PB');

insert into state(id_country, name, abv)
values(2, 'Pará','PA');

insert into state(id_country, name, abv)
values(2, 'Pernambuco','PE');

insert into state(id_country, name, abv)
values(2, 'Piauí','PI');

insert into state(id_country, name, abv)
values(2, 'Rio de Janeiro','RJ');

insert into state(id_country, name, abv)
values(2, 'Rio Grande do Norte','RN');

insert into state(id_country, name, abv)
values(2, 'Rio Grande do Sul','RS');

insert into state(id_country, name, abv)
values(2, 'Rondonia', 'RO');

insert into state(id_country, name, abv)
values(2, 'Roraima', 'RR');

insert into state(id_country, name, abv)
values(2, 'Santa Catarina', 'SC');

insert into state(id_country, name, abv)
values(2, 'Sergipe ', 'SE');

insert into state(id_country, name, abv)
values(2, 'São Paulo', 'SP');

insert into state(id_country, name, abv)
values(2, 'Tocantins', 'TO');

/* The USA States */

insert into state(id_country, name, abv)
values(3, 'Alabama','AL');

insert into state(id_country, name, abv)
values(3, 'Alaska','AK');

insert into state(id_country, name, abv)
values(3, 'Arizona','AZ');

insert into state(id_country, name, abv)
values(3, 'Arkansas','AR');

insert into state(id_country, name, abv)
values(3, 'California','CA');

insert into state(id_country, name, abv)
values(3, 'Colorado','CO');

insert into state(id_country, name, abv)
values(3, 'Connecticut','CT');

insert into state(id_country, name, abv)
values(3, 'Delaware','DE');

insert into state(id_country, name, abv)
values(3, 'Florida','FL');

insert into state(id_country, name, abv)
values(3, 'Georgia','GA');

insert into state(id_country, name, abv)
values(3, 'Hawaii','HI');

insert into state(id_country, name, abv)
values(3, 'Idaho','ID');

insert into state(id_country, name, abv)
values(3, 'Illinois','IL');

insert into state(id_country, name, abv)
values(3, 'Indiana','IN');

insert into state(id_country, name, abv)
values(3, 'Iowa','IA');

insert into state(id_country, name, abv)
values(3, 'Kansas','KS');

insert into state(id_country, name, abv)
values(3, 'Kentucky','KY');

insert into state(id_country, name, abv)
values(3, 'Louisiania','LA');

insert into state(id_country, name, abv)
values(3, 'Maine','ME');

insert into state(id_country, name, abv)
values(3, 'Maryland','MD');

insert into state(id_country, name, abv)
values(3, 'Massachusetts','MA');

insert into state(id_country, name, abv)
values(3, 'Michigan','MI');

insert into state(id_country, name, abv)
values(3, 'Minnesota','MN');

insert into state(id_country, name, abv)
values(3, 'Mississipi','MS');

insert into state(id_country, name, abv)
values(3, 'Missouri','MO');

insert into state(id_country, name, abv)
values(3, 'Montana','MT');

insert into state(id_country, name, abv)
values(3, 'Nebraska','NE');

insert into state(id_country, name, abv)
values(3, 'Nevada','NV');

insert into state(id_country, name, abv)
values(3, 'New Hampshire','NH');

insert into state(id_country, name, abv)
values(3, 'New Jersey','NJ');

insert into state(id_country, name, abv)
values(3, 'New México','NM');

/* Italy States*/

insert into state(id_country, name, abv)
values(4, 'Alessandria','AL');

insert into state(id_country, name, abv)
values(4, 'Ancona','AN');

insert into state(id_country, name, abv)
values(4, 'Arezzo','AR');

insert into state(id_country, name, abv)
values(4, 'Ascoli Piceno','AP');

insert into state(id_country, name, abv)
values(4, 'Asti','AT');

insert into state(id_country, name, abv)
values(4, 'Avellino','AV');

insert into state(id_country, name, abv)
values(4, 'Bari','BA');

insert into state(id_country, name, abv)
values(4, 'Belluno','BL');

insert into state(id_country, name, abv)
values(4, 'Benevento','BN');

insert into state(id_country, name, abv)
values(4, 'Bergamo','BG');

insert into state(id_country, name, abv)
values(4, 'Napoli','NA');

insert into state(id_country, name, abv)
values(4, 'Pisa','PI');

insert into state(id_country, name, abv)
values(4, 'Pistoia','PT');

insert into state(id_country, name, abv)
values(4, 'Pordenone','PN');

insert into state(id_country, name, abv)
values(4, 'Potenza','PZ');

insert into state(id_country, name, abv)
values(4, 'Reggio Calabria','RC');

insert into state(id_country, name, abv)
values(4, 'Rieti','RI');

insert into state(id_country, name, abv)
values(4, 'Rimini','RN');

insert into state(id_country, name, abv)
values(4, 'Roma','RM');

insert into state(id_country, name, abv)
values(4, 'Salerno','SA');

insert into state(id_country, name, abv)
values(4, 'Savona','SV');

insert into state(id_country, name, abv)
values(4, 'Siena','SI');

insert into state(id_country, name, abv)
values(4, 'Siracusa','SR');

insert into state(id_country, name, abv)
values(4, 'Verona','VR');

/* Argentina States */

insert into state(id_country, name, abv)
values(1, 'Catamarca','CAT');

insert into state(id_country, name, abv)
values(1, 'Chaco','CHA');

insert into state(id_country, name, abv)
values(1, 'Chubut','CHU');

insert into state(id_country, name, abv)
values(1, 'Cordoba','CBA');

insert into state(id_country, name, abv)
values(1, 'Corrientes','CTE');

insert into state(id_country, name, abv)
values(1, 'DF Buenos Aires','BON');

insert into state(id_country, name, abv)
values(1, 'Entre Rios','ERI');

insert into state(id_country, name, abv)
values(1, 'Formosa','FOR');

insert into state(id_country, name, abv)
values(1, 'Jujuy','JUY');

insert into state(id_country, name, abv)
values(1, 'La Pampa','LPA');

insert into state(id_country, name, abv)
values(1, 'La Rioja','LRJ');

insert into state(id_country, name, abv)
values(1, 'Mendoza','MZA');

insert into state(id_country, name, abv)
values(1, 'Misiones','MIS');

insert into state(id_country, name, abv)
values(1, 'Neuquen','NEU');

insert into state(id_country, name, abv)
values(1, 'Buenos Aires','AR');

insert into state(id_country, name, abv)
values(1, 'Rio Negro','RNG');

insert into state(id_country, name, abv)
values(1, 'Salta','STA');

insert into state(id_country, name, abv)
values(1, 'San Juan','SJU');

insert into state(id_country, name, abv)
values(1, 'San Luis','SLU');

insert into state(id_country, name, abv)
values(1, 'Santa Cruz','SCR');

insert into state(id_country, name, abv)
values(1, 'Santa Fe','SFE');

insert into state(id_country, name, abv)
values(1, 'Santiago del Estero','SGO');

insert into state(id_country, name, abv)
values(1, 'Tierra de Fuego','TDF');

insert into state(id_country, name, abv)
values(1, 'Tucuman','TUC');


/*==========================================================================*/
/* Table: CITY																*/
/*==========================================================================*/

/* Brazil Cities*/

insert into city(id_state, name)
values(1, 'Rio Branco');

insert into city(id_state, name)
values(2, 'Maceió');

insert into city(id_state, name)
values(3, 'Macapá');

insert into city(id_state, name)
values(4, 'Manaus');

insert into city(id_state, name)
values(5, 'Salvador');

insert into city(id_state, name)
values(6, 'Fortaleza');

insert into city(id_state, name)
values(7, 'Brasília');

insert into city(id_state, name)
values(8, 'Vitória');

insert into city(id_state, name)
values(9, 'Goiânia');

insert into city(id_state, name)
values(10, 'São Luiz');

insert into city(id_state, name)
values(11, 'Cuiabá');

insert into city(id_state, name)
values(12, 'Campo Grande');

insert into city(id_state, name)
values(13, 'Belo Horizonte');

insert into city(id_state, name)
values(14, 'Curitiba');

insert into city(id_state, name)
values(15, 'João Pessoa');

insert into city(id_state, name)
values(16, 'Belém');

insert into city(id_state, name)
values(17, 'Recife');

insert into city(id_state, name)
values(18, 'Teresina');

insert into city(id_state, name)
values(19, 'Rio de Janeiro');

insert into city(id_state, name)
values(20, 'Natal');

insert into city(id_state, name)
values(21, 'Porto Alegre');

insert into city(id_state, name)
values(22, 'Porto Velho');

insert into city(id_state, name)
values(23, 'Boa Vista');

insert into city(id_state, name)
values(24, 'Florianópolis');

insert into city(id_state, name)
values(25, 'Aracajú');

insert into city(id_state, name)
values(26, 'São Paulo');

insert into city(id_state, name)
values(27, 'Palmas');

/* USA Cities*/

insert into city(id_state, name)
values(28, 'Montgomery');

insert into city(id_state, name)
values(29, 'Juneau');

insert into city(id_state, name)
values(30, 'Phoenix');

insert into city(id_state, name)
values(31, 'Little Rock');

insert into city(id_state, name)
values(32, 'Sacramento');

insert into city(id_state, name)
values(33, 'Denver');

insert into city(id_state, name)
values(34, 'Hartford');

insert into city(id_state, name)
values(35, 'Dover');

insert into city(id_state, name)
values(36, 'Tallahassee');

insert into city(id_state, name)
values(37, 'Atlanta');

insert into city(id_state, name)
values(38, 'Honolulu');

insert into city(id_state, name)
values(39, 'Boise');

insert into city(id_state, name)
values(40, 'Springfield');

insert into city(id_state, name)
values(41, 'Indianapolis');

insert into city(id_state, name)
values(42, 'Des Moines');

insert into city(id_state, name)
values(43, 'Topeka');

insert into city(id_state, name)
values(44, 'Frankfort');

insert into city(id_state, name)
values(45, 'Baton Rouge');

insert into city(id_state, name)
values(46, 'Augusta');

insert into city(id_state, name)
values(47, 'Annapolis');

insert into city(id_state, name)
values(48, 'Boston');

insert into city(id_state, name)
values(49, 'Lansing');

insert into city(id_state, name)
values(50, 'Saint Paul');

insert into city(id_state, name)
values(51, 'Jackson');

insert into city(id_state, name)
values(52, 'Jefferson City');

insert into city(id_state, name)
values(53, 'Helena');
  
insert into city(id_state, name)
values(54, 'Lincoln');

insert into city(id_state, name)
values(55, 'Carson City');

insert into city(id_state, name)
values(56, 'Concord');

insert into city(id_state, name)
values(57, 'Trenton');

insert into city(id_state, name)
values(58, 'Santa Fe');

insert into city(id_state, name)
values(59, 'Albany'); 

insert into city(id_state, name)
values(60, 'Raleigh'); 

insert into city(id_state, name)
values(61, 'Bismarck');

insert into city(id_state, name)
values(62, 'Columbus'); 

insert into city(id_state, name)
values(63, 'Oklahoma City'); 

insert into city(id_state, name)
values(64, 'Salem');

insert into city(id_state, name)
values(65, 'Harrisburg');

insert into city(id_state, name)
values(66, 'Providence');

insert into city(id_state, name)
values(67, 'Columbia');

insert into city(id_state, name)
values(68, 'Pierre');

insert into city(id_state, name)
values(69, 'Nashville');

insert into city(id_state, name)
values(70, 'Austin');

insert into city(id_state, name)
values(71, 'Salt Lake City');

insert into city(id_state, name)
values(72, 'Montpelier');

insert into city(id_state, name)
values(73, 'Richmond');

insert into city(id_state, name)
values(74, 'Olympia');

insert into city(id_state, name)
values(75, 'Charleston');

insert into city(id_state, name)
values(76, 'Madison');

insert into city(id_state, name)
values(77, 'Cheyenne');

/* Cities of DF */

insert into city(id_state, name)
values(7, 'Águas Claras');

insert into city(id_state, name)
values(7, 'Brazlândia');

insert into city(id_state, name)
values(7, 'Candangolândia');

insert into city(id_state, name)
values(7, 'Ceilândia');

insert into city(id_state, name)
values(7, 'Estrutural');

insert into city(id_state, name)
values(7, 'Gama');

insert into city(id_state, name)
values(7, 'Guará I');

insert into city(id_state, name)
values(7, 'Guará II');

insert into city(id_state, name)
values(7, 'Itapoã');

insert into city(id_state, name)
values(7, 'Núcleo Bandeirante');

insert into city(id_state, name)
values(7, 'Paranoá');

insert into city(id_state, name)
values(7, 'Planaltina');

insert into city(id_state, name)
values(7, 'Recanto das Emas');

insert into city(id_state, name)
values(7, 'Riacho Fundo');

insert into city(id_state, name)
values(7, 'Samambaia');

insert into city(id_state, name)
values(7, 'Santa Maria');

insert into city(id_state, name)
values(7, 'São Sebastião');

insert into city(id_state, name)
values(7, 'Sobradinho');

insert into city(id_state, name)
values(7, 'Taguatinga');

insert into city(id_state, name)
values(7, 'Varjão');

insert into city(id_state, name)
values(7, 'Vicente Pires');

/* Cities of Minas Gerais */

insert into city(id_state, name)
values(13, 'Arinos');

insert into city(id_state, name)
values(13, 'Paracatu');

insert into city(id_state, name)
values(13, 'Unaí');

/* Cities of California */

insert into city(id_state, name)
values(32, 'San Francisco');

/* Cities of Italy */ 

insert into city(id_state, name)
values(4, 'Marsala');


/*==========================================================================*/
/* Table: producttype														*/
/*==========================================================================*/

insert into producttype(insertedon, insertedby, lastupdatedon, lastupdatedby, description)
values(null, null, null, null, 'Boneca');

insert into producttype(insertedon, insertedby, lastupdatedon, lastupdatedby, description)
values(null, null, null, null, 'Bolsa');

insert into producttype(insertedon, insertedby, lastupdatedon, lastupdatedby, description)
values(null, null, null, null, 'Bermuda');

insert into producttype(insertedon, insertedby, lastupdatedon, lastupdatedby, description)
values(null, null, null, null, 'Carteira');

insert into producttype(insertedon, insertedby, lastupdatedon, lastupdatedby, description)
values(null, null, null, null, 'Charuto');

insert into producttype(insertedon, insertedby, lastupdatedon, lastupdatedby, description)
values(null, null, null, null, 'Livro');

insert into producttype(insertedon, insertedby, lastupdatedon, lastupdatedby, description)
values(null, null, null, null, 'Tênis');


/*==========================================================================*/
/* Table: PRODUCT															*/
/*==========================================================================*/

insert into product
(
  insertedon, insertedby, lastupdatedon, lastupdatedby,
  name,
  id_producttype,
  price,
  wheight,
  detail
)
values
(
  '2016-09-14', null, null, null,
  'Barbie Professora',
  1,
  15.80,
  0.89,
  'A boneca que gosta de ensinar.'
);

insert into product
(
  insertedon, insertedby, lastupdatedon, lastupdatedby,
  name,
  id_producttype,
  price,
  wheight,
  detail
)
values
(
  '2016-09-14', null, null, null,
  'Barbie Safari',
  1,
  15.80,
  0.89,
  'A boneca melhor amiga do Tarzan.'
);

insert into product
(
  insertedon, insertedby, lastupdatedon, lastupdatedby,
  name,
  id_producttype,
  price,
  wheight,
  detail
)
values
(
  '2016-09-14', null, null, null,
  'Vade Mecum',
  6,
  159.99,
  2.89,
  'Vade Mecum 2016.'
);

insert into product
(
  insertedon, insertedby, lastupdatedon, lastupdatedby,
  name,
  id_producttype,
  price,
  wheight,
  detail
)
values
(
  '2016-09-14', null, null, null,
  'Constituição Federal',
  6,
  39.99,
  1.8,
  'CF anotada e revisada - 2016, com inclusão da Lei 8.420'
);

insert into product
(
  insertedon, insertedby, lastupdatedon, lastupdatedby,
  name,
  id_producttype,
  price,
  wheight,
  detail
)
values
(
  '2016-09-14', null, null, null,
  'E o vento levou',
  6,
  59.99,
  0.8,
  'Romance Best Seller 20015'
);


/*==========================================================================*/
/* Table: CUSTOMER															*/
/*==========================================================================*/

insert into customer
(
  insertedon, insertedby, lastupdatedon, lastupdatedby,
  name,
  birthday
)
values
(
  '2016-09-14', null, null, null,
  'Maria da Silva',
  '1960-09-14'
);

insert into customer
(
  insertedon, insertedby, lastupdatedon, lastupdatedby,
  name,
  birthday
)
values
(
  '2016-09-14', null, null, null,
  'Chin Ling Young',
  '1994-09-01'
);

insert into customer
(
  insertedon, insertedby, lastupdatedon, lastupdatedby,
  name,
  birthday
)
values
(
  '2016-09-14', null, null, null,
  'François Bilod',
  '1950-10-25'
);

insert into customer
(
  insertedon, insertedby, lastupdatedon, lastupdatedby,
  name,
  birthday
)
values
(
  '2016-09-14', null, null, null,
  'Brad Pit',
  '1962-01-30'
);

