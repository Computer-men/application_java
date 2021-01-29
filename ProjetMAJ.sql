-- MySQL dump 10.13  Distrib 8.0.21, for Win64 (x86_64)
--
-- Host: localhost    Database: projet
-- ------------------------------------------------------
-- Server version	8.0.21

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `authentification`
--

DROP TABLE IF EXISTS `authentification`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `authentification` (
  `id_authentification` int NOT NULL AUTO_INCREMENT,
  `au_login` varchar(25) NOT NULL,
  `au_pwd` varchar(25) NOT NULL,
  `fk_users` int DEFAULT NULL,
  PRIMARY KEY (`id_authentification`),
  KEY `fk_users_idx` (`fk_users`),
  CONSTRAINT `fk_users` FOREIGN KEY (`fk_users`) REFERENCES `users` (`fk_authentification`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `authentification`
--

LOCK TABLES `authentification` WRITE;
/*!40000 ALTER TABLE `authentification` DISABLE KEYS */;
INSERT INTO `authentification` VALUES (1,'saint.michel','bretagne',1),(2,'biden.joe','president',2),(3,'trump.donald','attaquecapitol',3);
/*!40000 ALTER TABLE `authentification` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `frais_forfaitaires`
--

DROP TABLE IF EXISTS `frais_forfaitaires`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `frais_forfaitaires` (
  `id_fraisforfaitaires` int NOT NULL AUTO_INCREMENT,
  `ff_date` varchar(45) NOT NULL,
  `ff_nbNuit` int NOT NULL,
  `ff_nbRepas` int NOT NULL,
  `fk_users` int DEFAULT NULL,
  `fk_prix` int DEFAULT NULL,
  PRIMARY KEY (`id_fraisforfaitaires`),
  KEY `fk_users_idx` (`fk_users`),
  KEY `fk_prix_idx` (`fk_prix`),
  CONSTRAINT `fk_prix` FOREIGN KEY (`fk_prix`) REFERENCES `prix` (`id_prix`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `frais_forfaitaires`
--

LOCK TABLES `frais_forfaitaires` WRITE;
/*!40000 ALTER TABLE `frais_forfaitaires` DISABLE KEYS */;
INSERT INTO `frais_forfaitaires` VALUES (1,'decembre',23,20,3,1);
/*!40000 ALTER TABLE `frais_forfaitaires` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `frais_horsforfait`
--

DROP TABLE IF EXISTS `frais_horsforfait`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `frais_horsforfait` (
  `id_frais_horsforfait` int NOT NULL AUTO_INCREMENT,
  `fhf_date` varchar(45) NOT NULL,
  `fhf_type` varchar(45) NOT NULL,
  `fhf_quantite` varchar(45) NOT NULL,
  PRIMARY KEY (`id_frais_horsforfait`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `frais_horsforfait`
--

LOCK TABLES `frais_horsforfait` WRITE;
/*!40000 ALTER TABLE `frais_horsforfait` DISABLE KEYS */;
/*!40000 ALTER TABLE `frais_horsforfait` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `frais_kilometrage`
--

DROP TABLE IF EXISTS `frais_kilometrage`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `frais_kilometrage` (
  `id_frais_kilometrage` int NOT NULL AUTO_INCREMENT,
  `frk_prix` varchar(45) NOT NULL,
  `frk_kmparcouru` varchar(45) NOT NULL,
  PRIMARY KEY (`id_frais_kilometrage`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `frais_kilometrage`
--

LOCK TABLES `frais_kilometrage` WRITE;
/*!40000 ALTER TABLE `frais_kilometrage` DISABLE KEYS */;
INSERT INTO `frais_kilometrage` VALUES (1,'0.52',''),(2,'0.58',''),(3,'0.62',''),(4,'0.67','');
/*!40000 ALTER TABLE `frais_kilometrage` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `prix`
--

DROP TABLE IF EXISTS `prix`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `prix` (
  `id_prix` int NOT NULL AUTO_INCREMENT,
  `pr_nuit` varchar(45) DEFAULT NULL,
  `pr_repas` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id_prix`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `prix`
--

LOCK TABLES `prix` WRITE;
/*!40000 ALTER TABLE `prix` DISABLE KEYS */;
INSERT INTO `prix` VALUES (1,'80','29');
/*!40000 ALTER TABLE `prix` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `users`
--

DROP TABLE IF EXISTS `users`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `users` (
  `id_users` int NOT NULL,
  `us_nom` varchar(25) NOT NULL,
  `us_prenom` varchar(25) NOT NULL,
  `us_profession` varchar(25) NOT NULL,
  `us_matricule` varchar(25) NOT NULL,
  `fk_authentification` int DEFAULT NULL,
  `fk_fraisforfaitaires` int DEFAULT NULL,
  `fk_vehicule` int DEFAULT NULL,
  PRIMARY KEY (`id_users`),
  KEY `fk_authentification_idx` (`fk_authentification`),
  KEY `fk_fraisforfaitaires_idx` (`fk_fraisforfaitaires`),
  KEY `fk_vehicule_idx` (`fk_vehicule`),
  CONSTRAINT `fk_authentification` FOREIGN KEY (`fk_authentification`) REFERENCES `authentification` (`id_authentification`),
  CONSTRAINT `fk_fraisforfaitaires` FOREIGN KEY (`fk_fraisforfaitaires`) REFERENCES `frais_forfaitaires` (`id_fraisforfaitaires`),
  CONSTRAINT `fk_vehicule` FOREIGN KEY (`fk_vehicule`) REFERENCES `vehicule` (`id_vehicule`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `users`
--

LOCK TABLES `users` WRITE;
/*!40000 ALTER TABLE `users` DISABLE KEYS */;
INSERT INTO `users` VALUES (1,'Saint','Michel','Comptable','NRD_001',1,NULL,1),(2,'Biden','Joe','Visiteur','NRD_002',2,NULL,4),(3,'Trump','Donald','Soignant','NRD_003',3,NULL,2);
/*!40000 ALTER TABLE `users` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `vehicule`
--

DROP TABLE IF EXISTS `vehicule`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `vehicule` (
  `id_vehicule` int NOT NULL AUTO_INCREMENT,
  `ve_chv` varchar(45) NOT NULL,
  `ve_carburant` varchar(45) NOT NULL,
  `fk_frais_kilometrage` int NOT NULL,
  PRIMARY KEY (`id_vehicule`),
  KEY `fk_frais_kilometrage_idx` (`fk_frais_kilometrage`),
  CONSTRAINT `fk_frais_kilometrage` FOREIGN KEY (`fk_frais_kilometrage`) REFERENCES `frais_kilometrage` (`id_frais_kilometrage`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `vehicule`
--

LOCK TABLES `vehicule` WRITE;
/*!40000 ALTER TABLE `vehicule` DISABLE KEYS */;
INSERT INTO `vehicule` VALUES (1,'4','Diesel',1),(2,'5/6','Diesel',2),(3,'4','Essence',3),(4,'5/6','Essence',4);
/*!40000 ALTER TABLE `vehicule` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2021-01-29 11:32:42
