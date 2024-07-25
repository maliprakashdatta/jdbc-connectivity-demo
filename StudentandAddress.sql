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

UPDATE student SET percentage = '36.66' WHERE student_id = 1;


select * from student;

ALTER TABLE student
DROP COLUMN percentage;

DROP TABLE student;
-- Pls insert data again ---------------------------------------------

select student_id, name, address_id, percentage from student;
select max(percentage) from student;
select min(percentage) from student;
select avg(percentage) from student;

select * from student where percentage = (select max(percentage) from student);

select * from student order by percentage DESC limit 3;

select count(*) from student where percentage > '60.00' and percentage < '80.00';
ALTER TABLE student
ADD COLUMN grade VARCHAR(128);

select * from student;

UPDATE student SET grade = 'Distinction' WHERE percentage > '75.00';
UPDATE student SET grade = 'First Class' WHERE percentage > '65.00' and percentage < '75.00';
UPDATE student SET grade = 'Second Class' WHERE percentage > '55.00' and percentage < '65.00';
UPDATE student SET grade = 'Well Pass' WHERE percentage > '45.00' and percentage < '55.00';
UPDATE student SET grade = 'Fail' WHERE percentage < '45.00';

select distinct(grade) from student;

select student_id, name, grade, percentage, rank() OVER (order by percentage desc) from student;

select student_id, name, grade, percentage, rank() OVER (order by percentage desc) from student LIMIT 10 OFFSET 2;

SELECT
	s.student_id,
	s.name,
	s.percentage,
	s.grade,
	a.city,
	rank() OVER (order by s.percentage desc)
FROM student s JOIN address a
ON a.address_id = s.address_id
WHERE s.percentage > '80.00'
ORDER BY s.percentage desc LIMIT 5;

SELECT
	a.city
FROM address a LEFT JOIN Student s ON a.address_id = s.address_id;

SELECT a.city
FROM address a RIGHT JOIN Student s ON a.address_id = s.address_id;


DELETE FROM STUDENT;
DELETE FROM ADDRESS;

INSERT INTO address (address_id, city) VALUES
(1, 'Pune, Shivajinager'),
(2, 'Pune, Hadapsar'),
(3, 'Kolhapur'),
(4, 'Nashik'),
(5, 'Solapur'),
(6, 'Thane'),
(7, 'Mumbai'),
(8, 'Nagpur'),
(9, 'Satara'),
(10, 'Sangli');
