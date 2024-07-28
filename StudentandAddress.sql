-----------------------------------------------
CREATE TABLE address (
  address_id INT NOT NULL,
  city VARCHAR(45) NULL,
  PRIMARY KEY (`id`));
--------------------------------------------------


CREATE TABLE address (
	address_id INT, -- primary key
    city VARCHAR(128),
    CONSTRAINT PRIMARY KEY pkey_address (address_id)
);

CREATE TABLE student (
	student_id INT, -- primary key
    name VARCHAR(128),
    address_id INT,
    CONSTRAINT PRIMARY KEY pkey_student (student_id),
    CONSTRAINT FOREIGN KEY fkey_student_address_id (address_id) REFERENCES address(address_id)
);
INSERT INTO address(address_id, city) VALUES ('1', 'Jath');
INSERT INTO address(address_id, city) VALUES ('2', 'pune');
INSERT INTO address(address_id, city) VALUES ('3', 'sangli');
INSERT INTO address(address_id, city) VALUES ('4', 'Kolhapur');
INSERT INTO address(address_id, city) VALUES ('5', 'Mumbai');
INSERT INTO address(address_id, city) VALUES ('6', 'pune');
INSERT INTO address(address_id, city) VALUES ('7', 'Sankh');
INSERT INTO address(address_id, city) VALUES ('8', 'kolkata');
INSERT INTO address (address_id, city) VALUES ('9', 'Loni');
INSERT INTO address(address_id, city) VALUES ('10', 'iindapur');

UPDATE address
SET city = 'Surat' 
WHERE address_id = 3;

DELETE FROM address WHERE address_id = 3;

DELETE FROM address;
TRUNCATE table address;

ALTER TABLE student 
CHANGE COLUMN student_Id INT NOT NULL ;


SELECT * FROM student;

ALTER TABLE student
ADD COLUMN percentage FLOAT;

SELECT * FROM student;
INSERT INTO student (student_Id, name, address, percentage, grade) VALUES ('1', 'Prakash', 'Jath', '78.4', 'A');
INSERT INTO student(student_Id, name, address, percentage, grade) VALUES ('2', 'Nirav', 'Pune', '80.45', 'A');

UPDATE student SET percentage = '79.66' WHERE student_id = 1;


select * from student;

ALTER TABLE student
DROP COLUMN percentage;

SELECT * FROM student;

CREATE TABLE student (
  studentId INT NOT NULL,
  name VARCHAR(45) NULL,
  address VARCHAR(45) NULL,
  percentage FLOAT NULL,
  grade VARCHAR(45) NULL,
  PRIMARY KEY (`studentId`));


