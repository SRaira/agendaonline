create TABLE 'email'
(
   `id`       bigint NOT NULL AUTO_INCREMENT,
  `descricao`    varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
);

create TABLE 'telefone'
(
  `id`       bigint NOT NULL AUTO_INCREMENT,
  `telefone`    int(15) DEFAULT NULL,
  PRIMARY KEY (`id`)
);

create TABLE 'contato'
(
  `id`       bigint NOT NULL AUTO_INCREMENT,
  `nome`     varchar(255) DEFAULT NULL,
  `email`    bigint DEFAULT NULL,
  `telefone`    bigint DEFAULT NULL,
  PRIMARY KEY (`id`),
  CONSTRAINT FOREIGN KEY (`email`) REFERENCES `email` (`id`),
  CONSTRAINT FOREIGN KEY (`telefone`) REFERENCES `telefone` (`id`)
);

CREATE TABLE `role_model`
(
  `roleid`    bigint       NOT NULL AUTO_INCREMENT,
  `role_name` varchar(255) NOT NULL,
  PRIMARY KEY (`roleid`),
  UNIQUE KEY (`role_name`)
);

-- oldera.url_permissao definition

CREATE TABLE `url_permissao`
(
  `permissao_id` bigint       NOT NULL AUTO_INCREMENT,
  `url`          varchar(255) NOT NULL,
  PRIMARY KEY (`permissao_id`)
);

-- oldera.user_model definition

CREATE TABLE `user_model`
(
  `user_id`   bigint       NOT NULL AUTO_INCREMENT,
  `password`  varchar(255) NOT NULL,
  `user_name` varchar(255) NOT NULL,
  PRIMARY KEY (`user_id`),
  UNIQUE KEY (`user_name`)
);

CREATE TABLE `url_permissao_roles` (
  `permissao_id` bigint NOT NULL,
  `role_id` bigint NOT NULL,
  CONSTRAINT FOREIGN KEY (`role_id`) REFERENCES `role_model` (`roleid`),
  CONSTRAINT FOREIGN KEY (`permissao_id`) REFERENCES `url_permissao` (`permissao_id`)
);


-- oldera.user_model_roles definition

CREATE TABLE `user_model_roles` (
  `user_id` bigint NOT NULL,
  `role_id` bigint NOT NULL,
  CONSTRAINT FOREIGN KEY (`role_id`) REFERENCES `role_model` (`roleid`),
  CONSTRAINT FOREIGN KEY (`user_id`) REFERENCES `user_model` (`user_id`)
);