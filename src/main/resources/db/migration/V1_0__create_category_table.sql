CREATE TABLE category
(
    category_id BIGINT NOT NULL,
    category_name text NOT NULL,
    category_description text NOT NULL,
    CONSTRAINT category_id_pkey PRIMARY KEY (category_id)
)