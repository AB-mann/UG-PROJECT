/*
SQLyog Community Edition- MySQL GUI v5.20
Host - 5.0.45-community-nt : Database - amruta_ppiacbmds
*********************************************************************
Server version : 5.0.45-community-nt
*/

SET NAMES utf8;

SET SQL_MODE='';

create database if not exists `amruta_ppiacbmds`;

USE `amruta_ppiacbmds`;

SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO';

/*Table structure for table `filehistry` */

CREATE TABLE `filehistry` (
  `id` int(11) NOT NULL auto_increment,
  `username` varchar(50) default NULL,
  `fileName` varchar(50) default NULL,
  PRIMARY KEY  (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=43 DEFAULT CHARSET=latin1;

/*Data for the table `filehistry` */

insert  into `filehistry`(`id`,`username`,`fileName`) values (1,'a@gmail.com','input.txt'),(2,'a@gmail.com','input.txt'),(3,'d@gmail.com','input.txt'),(4,'a@gmail.com','input.txt'),(5,'a@gmail.com','encFile.txt'),(6,'a@gmail.com','encFile.txt'),(7,'a@gmail.com','encFile.txt'),(8,'a@gmail.com','encFile.txt'),(9,'a@gmail.com','encFile.txt'),(10,'a@gmail.com','encFile.txt'),(11,'a@gmail.com','encFile.txt'),(12,'a@gmail.com','encFile.txt'),(13,'a@gmail.com','encFile.txt'),(14,'a@gmail.com','encFile.txt'),(15,'a@gmail.com','encFile.txt'),(16,'a@gmail.com','encFile.txt'),(17,'a@gmail.com','encFile.txt'),(18,'a@gmail.com','encFile.txt'),(19,'a@gmail.com','encFile.txt'),(20,'a@gmail.com','encFile.txt'),(21,'a@gmail.com','encFile.txt'),(22,'a@gmail.com','encFile.txt'),(23,'a@gmail.com','encFile.txt'),(24,'a@gmail.com','encFile.txt'),(25,'a@gmail.com','encFile.txt'),(26,'a@gmail.com','input.txt'),(27,'a@gmail.com','encFile.txt'),(28,'a@gmail.com','Input.txt'),(29,'a@gmail.com','encFile.txt'),(30,'a@gmail.com','VAERSSYMPTOMS.csv'),(31,'a@gmail.com','encFile.txt'),(32,'a@gmail.com','Input.txt'),(33,'a@gmail.com','encFile.txt'),(34,'a@gmail.com','Input.txt'),(35,'a@gmail.com','encFile.txt'),(36,'a@gmail.com','Input.txt'),(37,'a@gmail.com','encFile.txt'),(38,'a@gmail.com','encFile.txt'),(39,'a@gmail.com','encFile.txt'),(40,'a@gmail.com','Input.txt'),(41,'a@gmail.com','encFile.txt'),(42,'a@gmail.com','Input.txt');

/*Table structure for table `keydata` */

CREATE TABLE `keydata` (
  `keyid` int(11) NOT NULL auto_increment,
  `username` varchar(100) NOT NULL,
  `publickey` blob,
  `privatekey` blob,
  `keydate` date NOT NULL,
  PRIMARY KEY  (`keyid`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `keydata` */

/*Table structure for table `registration` */

CREATE TABLE `registration` (
  `regid` int(11) NOT NULL auto_increment,
  `firstname` varchar(50) NOT NULL,
  `lastname` varchar(50) NOT NULL,
  `emailid` varchar(100) NOT NULL,
  `password` varchar(100) NOT NULL,
  `mobno` bigint(20) NOT NULL,
  `gender` varchar(50) NOT NULL,
  `dateofbirh` date NOT NULL,
  `usertype` varchar(50) NOT NULL,
  `regdate` date NOT NULL,
  PRIMARY KEY  (`regid`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=latin1;

/*Data for the table `registration` */

insert  into `registration`(`regid`,`firstname`,`lastname`,`emailid`,`password`,`mobno`,`gender`,`dateofbirh`,`usertype`,`regdate`) values (1,'a','a','a@gmail.com','aaaaaa',9874547874,'male','2017-04-19','Data Provider','2017-04-10'),(2,'a','a','a@gmail.com','aaaaaa',9874757877,'female','2017-05-11','Data Provider','2017-05-05'),(3,'a','a','a@gmail.com','aaaaaa',9874558855,'male','2017-06-17','Data Provider','2017-06-17');

/*Table structure for table `userregistration` */

CREATE TABLE `userregistration` (
  `regid` int(11) NOT NULL auto_increment,
  `firstname` varchar(50) NOT NULL,
  `lastname` varchar(50) NOT NULL,
  `emailid` varchar(100) NOT NULL,
  `password` varchar(100) NOT NULL,
  `mobno` bigint(20) NOT NULL,
  `gender` varchar(50) NOT NULL,
  `dateofbirh` date NOT NULL,
  `usertype` varchar(50) NOT NULL,
  `regdate` date NOT NULL,
  PRIMARY KEY  (`regid`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=latin1;

/*Data for the table `userregistration` */

insert  into `userregistration`(`regid`,`firstname`,`lastname`,`emailid`,`password`,`mobno`,`gender`,`dateofbirh`,`usertype`,`regdate`) values (2,'s','s','s@gmail.com','ssssss',9854787584,'male','2017-04-13','Data Provider','2017-04-15'),(3,'b','b','b@gmail.com','bbbbbb',9874558866,'male','2017-06-15','Data Provider','2017-06-17'),(4,'b','b','b@gmail.com','bbbbbb',9877665555,'male','2017-06-17','Data Provider','2017-06-17');

SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
