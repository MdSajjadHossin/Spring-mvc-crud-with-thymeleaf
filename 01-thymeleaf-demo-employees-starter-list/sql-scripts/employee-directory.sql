CREATE DATABASE  IF NOT EXISTS `employee_directory`;
USE `employee_directory`;

--
-- Table structure for table `employee`
--

DROP TABLE IF EXISTS `employee`;

CREATE TABLE `employee` (
  `id` int NOT NULL AUTO_INCREMENT,
  `first_name` varchar(45) DEFAULT NULL,
  `last_name` varchar(45) DEFAULT NULL,
  `email` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;

--
-- Data for table `employee`
--

INSERT INTO `employee` VALUES 
	(1,'Md Sajjad','Hossin','sajjad@hossin.com'),
	(2,'Md Sajid','Hossin','sajid@hossin.com'),
	(3,'Md Maruful','Islam','maruful@islam.com'),
	(4,'Nayon','Biswas','nayon@biswas.com'),
	(5,'Sagore','Das','shagore@dsa.com');

