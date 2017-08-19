-- Table USERS
CREATE TABLE user (
  id       INT          NOT NULL AUTO_INCREMENT PRIMARY KEY,
  username VARCHAR(255) NOT NULL,
  password VARCHAR(255) NOT NULL
)
ENGINE = InnoDB;

-- Table: roles
CREATE TABLE role (
  id   INT          NOT NULL AUTO_INCREMENT PRIMARY KEY,
  name VARCHAR(100) NOT NULL
)
  ENGINE = InnoDB;

-- Table for mapping user and roles: user_roles
CREATE TABLE user_role (
  user_id INT NOT NULL,
  role_id INT NOT NULL,

  FOREIGN KEY (user_id) REFERENCES user (id),
  FOREIGN KEY (role_id) REFERENCES role (id),

  UNIQUE (user_id, role_id)
)
  ENGINE = InnoDB;

-- bcrypt value 1
INSERT INTO user VALUES (1, 'user', '$2a$04$gtT.s26/G5oE/NYS5sZUzeWTQUcDfSVcYW2iuTNO33VqrRfyO17bm');

INSERT INTO role VALUES (1, 'ROLE_USER');
INSERT INTO role VALUES (2, 'ROLE_ADMIN');

INSERT INTO user_role VALUE (1, 2);