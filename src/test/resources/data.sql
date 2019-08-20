CREATE SCHEMA IF NOT EXISTS users;

DROP TABLE user;

CREATE TABLE user (
  id INT PRIMARY KEY,
  name VARCHAR(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
);

INSERT INTO `user`
(`id`,
`name`)
VALUES
(1,
'Fernando');
