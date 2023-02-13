CREATE TABLE category
(
    category_id BIGINT NOT NULL,
    category_name VARCHAR(500) NOT NULL,
    category_description VARCHAR(500) NOT NULL,
    CONSTRAINT category_id_pkey PRIMARY KEY (category_id)
);