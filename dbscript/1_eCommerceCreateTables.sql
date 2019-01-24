-- This is the FIRST SCRIPT that must be run on database ecommerce --
-- Copy the code, right click database ecommerce created on PostgresSQL and run --

-- object: public.country | type: TABLE --
CREATE TABLE public.country(
	id bigserial NOT NULL,
	name varchar(30) NOT NULL,
	abv varchar(5),
	CONSTRAINT pk_country PRIMARY KEY (id)

);
-- ddl-end --


-- object: public.state | type: TABLE --
CREATE TABLE public.state(
	id bigserial NOT NULL,
	name varchar(30) NOT NULL,
	abv varchar(5),
	id_country bigint NOT NULL,
	CONSTRAINT pk_state PRIMARY KEY (id)

);
-- ddl-end --


-- object: public.city | type: TABLE --
CREATE TABLE public.city(
	id bigserial NOT NULL,
	name varchar(50) NOT NULL,
	id_state bigint NOT NULL,
	CONSTRAINT pk_city PRIMARY KEY (id)

);
-- ddl-end --


-- object: public.producttype | type: TABLE --
CREATE TABLE public.producttype(
	id bigserial NOT NULL,
	insertedon timestamp,
	insertedby bigint,
	lastupdatedon timestamp,
	lastupdatedby bigint,
	description varchar(50) NOT NULL,
	CONSTRAINT pk_producttype PRIMARY KEY (id)

);
-- ddl-end --


-- object: public.product | type: TABLE --
CREATE TABLE public.product(
	id bigserial NOT NULL,
	insertedon timestamp,
	insertedby bigint,
	lastupdatedon timestamp,
	lastupdatedby bigint,
	name varchar(50) NOT NULL,
	price float NOT NULL,
	wheight float NOT NULL,
	detail varchar(500),
	id_producttype bigint,
	CONSTRAINT pk_product PRIMARY KEY (id)

);
-- ddl-end --

-- object: public.product | type: TABLE --
CREATE TABLE public.customer(
	id bigserial NOT NULL,
	insertedon timestamp,
	insertedby bigint,
	lastupdatedon timestamp,
	lastupdatedby bigint,
	name varchar(50) NOT NULL,
	birthday date,
	CONSTRAINT pk_customer PRIMARY KEY (id)
);
-- ddl-end --


-- object: country_fk | type: CONSTRAINT --
ALTER TABLE public.state ADD CONSTRAINT country_fk FOREIGN KEY (id_country)
REFERENCES public.country (id) MATCH FULL
ON DELETE RESTRICT ON UPDATE CASCADE NOT DEFERRABLE;
-- ddl-end --


-- object: state_fk | type: CONSTRAINT --
ALTER TABLE public.city ADD CONSTRAINT state_fk FOREIGN KEY (id_state)
REFERENCES public.state (id) MATCH FULL
ON DELETE RESTRICT ON UPDATE CASCADE NOT DEFERRABLE;
-- ddl-end --


-- object: producttype_fk | type: CONSTRAINT --
ALTER TABLE public.product ADD CONSTRAINT producttype_fk FOREIGN KEY (id_producttype)
REFERENCES public.producttype (id) MATCH FULL
ON DELETE SET NULL ON UPDATE CASCADE NOT DEFERRABLE;
-- ddl-end --






