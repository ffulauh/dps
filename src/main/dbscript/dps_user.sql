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

UPDATE dps.user SET username = 'hsh', password = '02042018', fullName = '韩少华', email = 'hshua24@gmail.com', updateByEmail = 0 WHERE id = 1;
UPDATE dps.user SET username = 'steve', password = '22222', fullName = '乔布斯', email = 'steve@apple.com', updateByEmail = 0 WHERE id = 2;