-- MySQL dump 10.13  Distrib 8.0.12, for Win64 (x86_64)
--
-- Host: localhost    Database: db_encyclopedia
-- ------------------------------------------------------
-- Server version	8.0.12

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
 SET NAMES utf8 ;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `animals`
--

DROP TABLE IF EXISTS `animals`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `animals` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(90) NOT NULL,
  `weight` varchar(90) NOT NULL,
  `measure` varchar(90) NOT NULL,
  `average_age` varchar(90) NOT NULL,
  `classification` varchar(90) NOT NULL,
  `classes` varchar(90) NOT NULL,
  `family` varchar(90) NOT NULL,
  `genus` varchar(90) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=23 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `animals`
--

LOCK TABLES `animals` WRITE;
/*!40000 ALTER TABLE `animals` DISABLE KEYS */;
INSERT INTO `animals` VALUES (1,'Lion/Lioness','160-260 kg(male), 120-182 kg(female)','205-334 cm(male), 180-270 cm(female)','8 (wild), 12-20 (captivity)','Mammals','Mammalia','Felidae','Panthera'),(2,'Emperor penguin','22-45 kg','1.15-1.20 meters','20 (wild), 35 (captivity)','Birds','Birds','Spheniscidae','Aptenodytes'),(3,'Great white shark','680-1100 kg','4.5-6 meters','40-70 (wild)','Fishes','Chondrichthyes','Lamnidae','Carcharodon'),(4,'Blue poison dart frog','3 grams','3-4.5 cm','3-5 (wild), 7-8 (captivity)','Amphibians','Amphibia','Dendrobatidae','Dendrobates'),(5,'Leatherback sea turtle','600-1000 kg','2.3 meters','80 (wild)','Reptiles','Sauropsida','Dermochelyidae','Dermochelys'),(6,'Orchid mantis','50 grams','2.5-3 cm(male), 6 cm(female)','8 months(female), 5-6 months(male)','Arthropods','Insect','Hymenopodidae','Hymenopus'),(7,'Praying mantis','50 grams','6-7 cm(male), 7-9 cm(female)','6 months-1 year','Arthropods','Insect','Mantidae','Mantis');
/*!40000 ALTER TABLE `animals` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2018-10-19 19:57:34
