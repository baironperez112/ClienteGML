    -- Database: clientegml

-- DROP DATABASE IF EXISTS clientegml;

CREATE DATABASE clientegml
    WITH
    OWNER = postgres
    ENCODING = 'UTF8'
    LC_COLLATE = 'Spanish_Colombia.1252'
    LC_CTYPE = 'Spanish_Colombia.1252'
    TABLESPACE = pg_default
    CONNECTION LIMIT = -1;

COMMENT ON DATABASE clientegml
    IS 'Base de datos para GML';



-- Table: public.cliente

-- DROP TABLE IF EXISTS public.cliente;

CREATE TABLE IF NOT EXISTS public.cliente
(
    fecha_fin date NOT NULL,
    fecha_inicio date NOT NULL,
    telefono integer NOT NULL,
    email character varying(255) COLLATE pg_catalog."default" NOT NULL,
    nombre character varying(255) COLLATE pg_catalog."default" NOT NULL,
    shared_key character varying(255) COLLATE pg_catalog."default" NOT NULL,
    CONSTRAINT cliente_pkey PRIMARY KEY (shared_key)
)

TABLESPACE pg_default;

ALTER TABLE IF EXISTS public.cliente
    OWNER to postgres;