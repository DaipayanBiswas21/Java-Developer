CREATE DATABASE collegedet;
USE collegedet;
CREATE TABLE student(
rollno INT PRIMARY KEY,
name VARCHAR(50),
marks INT NOT NULL,
grade VARCHAR(1),
city VARCHAR(20)
);
INSERT INTO student 
(rollno, name, marks, grade, city)
VALUES
(101, "anil", 56, "c", "pune"),
(102, "bhumika", 12, "f", "mumbai"),
(103, "chetan", 76, "b", "mumbai"),
(104, "dhruv", 90, "a", "Delhi"),
(105, "emanuel", 78, "c", "Delhi"),
(106, "farah", 77, "c", "Delhi");
ALTER TABLE student
ADD COLUMN age INT NOT NULL;
ALTER TABLE student
DROP COLUMN age;
ALTER TABLE student
RENAME TO studentinfo;
SELECT * FROM studentinfo;
ALTER TABLE studentinfo
RENAME TO student;
ALTER TABLE student
ADD COLUMN age INT NOT NULL DEFAULT 19;
ALTER TABLE student
DROP COLUMN age;
ALTER TABLE student
RENAME TO xyz;
SELECT * FROM xyz;
ALTER TABLE xyz
RENAME TO student;
ALTER TABLE student
CHANGE age stu_age INT;
ALTER TABLE student
CHANGE stu_age stud_age INT DEFAULT 21;
ALTER TABLE student
CHANGE stud_age age INT DEFAULT 21;
ALTER TABLE student
CHANGE age stud_age VARCHAR(20) DEFAULT "SIX";
ALTER TABLE student
CHANGE stud_age age INT;
ALTER TABLE student
CHANGE COLUMN age stud_age VARCHAR(20);
UPDATE student
SET stud_age = "one";
ALTER TABLE student
DROP COLUMN stud_age;

ALTER TABLE student
CHANGE COLUMN stud_age age INT;
ALTER TABLE student
MODIFY COLUMN age VARCHAR(20) DEFAULT "six (NOT HAPPENING ANYTHING)";
ALTER TABLE student
MODIFY age VARCHAR(20) DEFAULT "Nine (NOT HAPPENING ANYTHING)";
ALTER TABLE student
MODIFY age VARCHAR(20);
SET SQL_SAFE_UPDATES = 0;
UPDATE student
SET age = "twelve";
UPDATE student
SET age = "null";
ALTER TABLE student
DROP   age;
TRUNCATE student;
TRUNCATE TABLE student;
ALTER TABLE student
CHANGE COLUMN name full_name VARCHAR(40) NOT NULL;
DELETE FROM student
WHERE marks < 70;
ALTER TABLE student
DROP COLUMN grade;
DROP TABLE student;


SELECT * FROM student;
SELECT name , marks FROM student;
SELECT city FROM student;
SELECT DISTINCT city FROM student;
SELECT DISTINCT city, marks FROM student;
SELECT * FROM student WHERE marks > 80;
SELECT name , grade FROM student WHERE marks > 80;
SELECT * FROM student WHERE city = "mumbai";
SELECT name , rollno FROM student WHERE city = "mumbai";
SELECT * FROM student where marks > 50 AND city = "mumbai";
SELECT name , rollno FROM student where marks > 50 AND city = "mumbai";
SELECT name FROM student where marks != 77;
SELECT * FROM student where marks > 50 OR city = "mumbai";
SELECT * FROM student WHERE marks BETWEEN 80 AND 90;
SELECT * FROM student WHERE city IN ( "mumbai", "delhi");
SELECT * FROM student WHERE city IN ( "mumbai", "delhi", "kolkata");
SELECT * FROM student WHERE city NOT IN ( "mumbai", "delhi");
SELECT * FROM student WHERE city NOT IN ( "mumbai", "delhi", "kolkata");
SELECT * FROM student LIMIT 3;
SELECT * FROM student WHERE marks > 70 LIMIT 3;
SELECT * FROM student ORDER BY city ASC;
SELECT * FROM student ORDER BY marks ASC;
SELECT * FROM student ORDER BY city ASC LIMIT 3;
SELECT * FROM student ORDER BY marks DESC;
SELECT * FROM student ORDER BY marks DESC LIMIT 2;
SELECT MAX(marks) FROM student;
SELECT MIN(marks) FROM student;
SELECT AVG(marks) FROM student;
SELECT COUNT(name) FROM student;
SELECT COUNT(city) FROM student; 
SELECT city FROM student GROUP BY city;
SELECT city , COUNT(rollno) FROM student GROUP BY city;
SELECT city , COUNT(city) FROM student GROUP BY city;
SELECT city , name , COUNT(rollno) FROM student GROUP BY city, name;
SELECT city , AVG(marks) FROM student GROUP BY city;
SELECT city , AVG(marks) FROM student GROUP BY city ORDER BY city ASC;
SELECT city , AVG(marks) FROM student GROUP BY city ORDER BY AVG(marks) ASC;
SELECT city , AVG(marks) FROM student GROUP BY city ORDER BY AVG(marks);
SELECT grade FROM student GROUP BY grade ORDER BY grade;
SELECT grade, COUNT(name) FROM student GROUP BY grade ORDER BY grade;
SELECT grade, COUNT(grade) FROM student GROUP BY grade ORDER BY grade;
SELECT city, COUNT(rollno) FROM student GROUP BY city HAVING MAX(marks) > 80;
SELECT city FROM student WHERE grade = "C" GROUP BY city;
SELECT city FROM student WHERE grade = "C" GROUP BY city HAVING MAX(marks) > 56 ;
SELECT city FROM student WHERE grade = "C" GROUP BY city HAVING MAX(marks) >= 56 ;
SELECT city FROM student WHERE grade = "C" GROUP BY city HAVING MAX(marks) >= 56 ORDER BY city;
SELECT city , COUNT(rollno) FROM student WHERE grade = "C" GROUP BY city HAVING MAX(marks) >= 56 ORDER BY city DESC;
SET SQL_SAFE_UPDATES = 0;
UPDATE student
SET grade = "O"
WHERE grade = "A";
UPDATE student
SET marks = marks + 40, grade ="d"
WHERE rollno = 102;
UPDATE student
SET grade = "B"
WHERE marks BETWEEN 80 AND 90;
UPDATE student
SET marks = marks + 5;
UPDATE student
SET marks = 15 , grade = "f"
WHERE rollno = 102;
DELETE FROM student
WHERE marks < 33;
SELECT * FROM student;
SELECT AVG(marks) FROM student;
ALTER TABLE student
CHANGE full_name name VARCHAR(50) NOT NULL;
SELECT name, marks  FROM student
WHERE marks > 80.250;
SELECT name FROM student
WHERE marks > AVG(marks) (NOT WORKING);
SELECT name, marks FROM student
WHERE marks > (SELECT AVG(marks) FROM student);
SELECT name FROM student
WHERE rollno % 2 = 0;
SELECT * FROM student;
SELECT * FROM student
WHERE city = "delhi";
SELECT MAX(marks) FROM (SELECT * FROM student
WHERE city = "delhi") AS temp ;
SELECT (SELECT MAX(marks) FROM student) , name FROM student;
SELECT (SELECT MAX(marks) FROM student) AS max , name FROM student;
SELECT (SELECT marks FROM student) , name FROM student;
CREATE VIEW view1 AS
SELECT rollno, name, marks FROM student;
SELECT * FROM view1;
SELECT * FROM view1
WHERE marks > 70;
DROP VIEW view1;



CREATE TABLE customerinfo(
customer_id INT PRIMARY KEY,
custome VARCHAR(50),
mode VARCHAR(40),
city VARCHAR(40)
);
INSERT INTO customerinfo VALUES 
(101, "Olivia Barrett", "Netbanking" , "Portland"),
(102, "Ethan Sinclair", "Credit Card", "Miami"),
(103, "Maya Hernandez", "Credit Card" , "Seattle"),
(104, "Liam Donovan", "Netbanking", "Denver"),
(105, "Sophia Nguyen", "Credit Card", "New Orleans" ),
(106, "Caleb Foster", "Debit Card", "Minneapolis"),
(107,"Ava Patel", "Debit Card","Phoneix"),
(108,"Lucas Carter", "Netbanking","Boston"),
(109,"Isabella Martinez", "Netbanking","Nashville"),
(110, "Jackson Brooks", "Credit Card","Boston");
SELECT mode , COUNT(mode)  FROM customerinfo GROUP BY mode;
SELECT mode , COUNT(custome)  FROM customerinfo GROUP BY mode;
CREATE TABLE dept (
id INT PRIMARY KEY,
name VARCHAR(50)
);
CREATE TABLE teacher (
id INT PRIMARY KEY,
name VARCHAR(50),
dept_id INT NOT NULL,
FOREIGN KEY (dept_id) REFERENCES dept(id)
ON UPDATE CASCADE
ON DELETE CASCADE
);
INSERT INTO dept VALUES
(101, "english"),
(102, "IT");
UPDATE dept
SET id = 111
WHERE id = 101;
SELECT * FROM dept;
INSERT INTO teacher VALUES 
(101, "Adam", 101),
(102, "Eve", 102);
SELECT * FROM teacher;
CREATE DATABASE Practicequesns;
USE practicequesns;
CREATE TABLE Student(
Student_id INT PRIMARY KEY,
Name VARCHAR(50) NOT NULL
);
INSERT INTO Student VALUES 
(101, "Adam"),
(102 , "Bob"),
(103 , "Casey");
CREATE TABLE Course (
Student_id INT PRIMARY KEY,
Course VARCHAR(50) NOT NULL
); 
INSERT INTO Course VALUES
(102, "English" ),
(105,  "Maths"),
(103,  "Science"),
(107, "C.S");

SELECT * FROM Student
INNER JOIN Course
ON Student.Student_id = Course.Student_id;
SELECT Name FROM Student
INNER JOIN Course
ON Student.Student_id = Course.Student_id;
SELECT * FROM Student as s
LEFT JOIN Course as c
ON s.Student_id = c.Student_id;
SELECT * FROM Student as s
RIGHT JOIN Course as c
ON s.Student_id = c.Student_id;
SELECT * FROM Student as s
LEFT JOIN Course as c
ON s.Student_id = c.Student_id
UNION
SELECT * FROM Student as s
RIGHT JOIN Course as c
ON s.Student_id = c.Student_id;
SELECT * FROM Student as s
LEFT JOIN Course as c
ON s.Student_id = c.Student_id
WHERE c.Student_id IS NULL;
SELECT * FROM Student as s
RIGHT JOIN Course as c
ON s.Student_id = c.Student_id
WHERE s.Student_id IS NULL;
SELECT * FROM Student as s
RIGHT JOIN Course as c
ON s.Student_id = c.Student_id
WHERE s.Student_id IS NOT NULL;
SELECT * FROM Student as s
LEFT JOIN Course as c
ON s.Student_id = c.Student_id
WHERE c.Student_id IS NULL
UNION
SELECT * FROM Student as s
RIGHT JOIN Course as c
ON s.Student_id = c.Student_id
WHERE s.Student_id IS NULL;
CREATE TABLE employee(
id INT PRIMARY KEY,
name VARCHAR(50),
manager_id INT 
);
INSERT INTO employee VALUES 
(101 , "adam", 103 ),
(102 , "bob", 104 ),
(103, "casey", NULL ),
(104, "donald", 103 );
SELECT * FROM employee;
SELECT * FROM employee as a
JOIN employee as b
ON a.id = b.manager_id;
SELECT a.name, b.name FROM employee as a
JOIN employee as b
ON a.id = b.manager_id;
SELECT a.name as manager_name , b.name FROM employee as a
JOIN employee as b
ON a.id = b.manager_id;
SELECT name FROM employee
UNION
SELECT name FROM employee;
SELECT name FROM employee
UNION ALL
SELECT name FROM employee;