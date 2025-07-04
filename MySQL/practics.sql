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



