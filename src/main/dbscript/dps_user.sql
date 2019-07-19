CREATE TABLE user
(
  id            INT AUTO_INCREMENT
    PRIMARY KEY,
  username      VARCHAR(24)            NOT NULL,
  password      VARCHAR(24)            NOT NULL,
  fullName      VARCHAR(96)            NOT NULL,
  email         VARCHAR(48)            NOT NULL,
  updateByEmail TINYINT(1) DEFAULT '0' NOT NULL
);

INSERT INTO dps.user (username, password, fullName, email, updateByEmail) VALUES ('hsh', '02042018', '韩少华', 'hshua24@gmail.com', 0);
INSERT INTO dps.user (username, password, fullName, email, updateByEmail) VALUES ('steve', '22222', '乔布斯', 'steve@apple.com', 0);