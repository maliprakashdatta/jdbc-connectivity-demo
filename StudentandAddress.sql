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
UPDATE student SET percentage = '37.66' WHERE student_id = 2;
UPDATE student SET percentage = '38.66' WHERE student_id = 3;
UPDATE student SET percentage = '39.66' WHERE student_id = 4;
UPDATE student SET percentage = '40.66' WHERE student_id = 5;
UPDATE student SET percentage = '41.66' WHERE student_id = 6;
UPDATE student SET percentage = '42.66' WHERE student_id = 7;
UPDATE student SET percentage = '43.66' WHERE student_id = 8;
UPDATE student SET percentage = '44.66' WHERE student_id = 9;
UPDATE student SET percentage = '45.66' WHERE student_id = 10;
UPDATE student SET percentage = '46.66' WHERE student_id = 11;
UPDATE student SET percentage = '47.66' WHERE student_id = 12;
UPDATE student SET percentage = '48.66' WHERE student_id = 13;
UPDATE student SET percentage = '49.66' WHERE student_id = 14;
UPDATE student SET percentage = '50.66' WHERE student_id = 15;
UPDATE student SET percentage = '51.66' WHERE student_id = 16;
UPDATE student SET percentage = '52.66' WHERE student_id = 17;
UPDATE student SET percentage = '53.66' WHERE student_id = 18;
UPDATE student SET percentage = '54.66' WHERE student_id = 19;
UPDATE student SET percentage = '55.66' WHERE student_id = 20;
UPDATE student SET percentage = '56.66' WHERE student_id = 21;
UPDATE student SET percentage = '57.66' WHERE student_id = 22;
UPDATE student SET percentage = '58.66' WHERE student_id = 23;
UPDATE student SET percentage = '59.66' WHERE student_id = 24;
UPDATE student SET percentage = '60.66' WHERE student_id = 25;
UPDATE student SET percentage = '61.66' WHERE student_id = 26;
UPDATE student SET percentage = '62.66' WHERE student_id = 27;
UPDATE student SET percentage = '63.66' WHERE student_id = 28;
UPDATE student SET percentage = '64.66' WHERE student_id = 29;
UPDATE student SET percentage = '65.66' WHERE student_id = 30;
UPDATE student SET percentage = '66.66' WHERE student_id = 31;
UPDATE student SET percentage = '67.66' WHERE student_id = 32;
UPDATE student SET percentage = '68.66' WHERE student_id = 33;
UPDATE student SET percentage = '69.66' WHERE student_id = 34;
UPDATE student SET percentage = '70.66' WHERE student_id = 35;
UPDATE student SET percentage = '71.66' WHERE student_id = 36;
UPDATE student SET percentage = '72.66' WHERE student_id = 37;
UPDATE student SET percentage = '73.66' WHERE student_id = 38;
UPDATE student SET percentage = '74.66' WHERE student_id = 39;
UPDATE student SET percentage = '75.66' WHERE student_id = 40;
UPDATE student SET percentage = '76.66' WHERE student_id = 41;
UPDATE student SET percentage = '77.66' WHERE student_id = 42;
UPDATE student SET percentage = '78.66' WHERE student_id = 43;
UPDATE student SET percentage = '79.66' WHERE student_id = 44;
UPDATE student SET percentage = '80.66' WHERE student_id = 45;
UPDATE student SET percentage = '81.66' WHERE student_id = 46;
UPDATE student SET percentage = '82.66' WHERE student_id = 47;
UPDATE student SET percentage = '83.66' WHERE student_id = 48;


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
