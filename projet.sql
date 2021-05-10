-- MySQL dump 10.13  Distrib 8.0.24, for Win64 (x86_64)
--
-- Host: localhost    Database: projet_java
-- ------------------------------------------------------
-- Server version	8.0.24

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
-- Table structure for table `autre_frais`
--

DROP TABLE IF EXISTS `autre_frais`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `autre_frais` (
  `id_autre` int NOT NULL AUTO_INCREMENT,
  `af_libelle` varchar(45) DEFAULT NULL,
  `af_prix` varchar(45) DEFAULT NULL,
  `af_tt` varchar(45) DEFAULT NULL,
  `fk_fiche_frais` int DEFAULT NULL,
  PRIMARY KEY (`id_autre`),
  KEY `fk_fiche_frais_idx` (`fk_fiche_frais`),
  CONSTRAINT `fk_fiche_frais` FOREIGN KEY (`fk_fiche_frais`) REFERENCES `fiche_frais` (`id_fiche`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `autre_frais`
--

LOCK TABLES `autre_frais` WRITE;
/*!40000 ALTER TABLE `autre_frais` DISABLE KEYS */;
/*!40000 ALTER TABLE `autre_frais` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `fiche_frais`
--

DROP TABLE IF EXISTS `fiche_frais`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `fiche_frais` (
  `id_fiche` int NOT NULL AUTO_INCREMENT,
  `f_mois` varchar(45) DEFAULT NULL,
  `f_nb_nuitee` int DEFAULT NULL,
  `f_tt_nuitee` varchar(45) DEFAULT NULL,
  `f_nb_repas` int DEFAULT NULL,
  `f_tt_repas` varchar(45) DEFAULT NULL,
  `f_nb_kilom` int DEFAULT NULL,
  `f_tt_kilom` varchar(45) DEFAULT NULL,
  `f_tt` varchar(45) DEFAULT NULL,
  `fk_matricule` int DEFAULT NULL,
  `fk_prix` int DEFAULT NULL,
  PRIMARY KEY (`id_fiche`),
  KEY `fk_user_idx` (`fk_matricule`),
  KEY `fk_prix_idx` (`fk_prix`),
  CONSTRAINT `fk_prix` FOREIGN KEY (`fk_prix`) REFERENCES `prix` (`id_prix`),
  CONSTRAINT `fk_user` FOREIGN KEY (`fk_matricule`) REFERENCES `user` (`id_matricule`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `fiche_frais`
--

LOCK TABLES `fiche_frais` WRITE;
/*!40000 ALTER TABLE `fiche_frais` DISABLE KEYS */;
INSERT INTO `fiche_frais` VALUES (1,'Janvier',NULL,NULL,NULL,NULL,NULL,NULL,NULL,1,NULL),(2,'Février',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL);
/*!40000 ALTER TABLE `fiche_frais` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `prix`
--

DROP TABLE IF EXISTS `prix`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `prix` (
  `id_prix` int NOT NULL AUTO_INCREMENT,
  `pr_nuitee` int DEFAULT NULL,
  `pr_repas` int DEFAULT NULL,
  `fk_vehicule` int DEFAULT NULL,
  PRIMARY KEY (`id_prix`),
  KEY `fk_vehicule_idx` (`fk_vehicule`),
  CONSTRAINT `fk_prvehicule` FOREIGN KEY (`fk_vehicule`) REFERENCES `véhicule` (`id_vehicule`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `prix`
--

LOCK TABLES `prix` WRITE;
/*!40000 ALTER TABLE `prix` DISABLE KEYS */;
/*!40000 ALTER TABLE `prix` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `profession`
--

DROP TABLE IF EXISTS `profession`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `profession` (
  `id_profession` int NOT NULL,
  `pr_libelle` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id_profession`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `profession`
--

LOCK TABLES `profession` WRITE;
/*!40000 ALTER TABLE `profession` DISABLE KEYS */;
INSERT INTO `profession` VALUES (1,'Compta'),(2,'Soignant'),(3,'Visiteur');
/*!40000 ALTER TABLE `profession` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `secteur`
--

DROP TABLE IF EXISTS `secteur`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `secteur` (
  `id_secteur` int NOT NULL AUTO_INCREMENT,
  `se_libelle` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id_secteur`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `secteur`
--

LOCK TABLES `secteur` WRITE;
/*!40000 ALTER TABLE `secteur` DISABLE KEYS */;
INSERT INTO `secteur` VALUES (1,'Nord'),(2,'Sud'),(3,'Ouest'),(4,'Est');
/*!40000 ALTER TABLE `secteur` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `user`
--

DROP TABLE IF EXISTS `user`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `user` (
  `id_matricule` int NOT NULL,
  `us_nom` varchar(45) DEFAULT NULL,
  `us_prenom` varchar(45) DEFAULT NULL,
  `us_identifiant` varchar(45) DEFAULT NULL,
  `us_pasword` varchar(45) DEFAULT NULL,
  `fk_profession` int DEFAULT NULL,
  `fk_vehicule` int DEFAULT NULL,
  `fk_secteur` int DEFAULT NULL,
  PRIMARY KEY (`id_matricule`),
  KEY `fk_profession` (`fk_profession`),
  KEY `fk_vehicule_idx` (`fk_vehicule`),
  KEY `fk_secteur_idx` (`fk_secteur`),
  CONSTRAINT `fk_profession` FOREIGN KEY (`fk_profession`) REFERENCES `profession` (`id_profession`),
  CONSTRAINT `fk_secteur` FOREIGN KEY (`fk_secteur`) REFERENCES `secteur` (`id_secteur`),
  CONSTRAINT `fk_vehicule` FOREIGN KEY (`fk_vehicule`) REFERENCES `véhicule` (`id_vehicule`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `user`
--

LOCK TABLES `user` WRITE;
/*!40000 ALTER TABLE `user` DISABLE KEYS */;
INSERT INTO `user` VALUES (1,'Pepper','Michel','Pepper','DrPepper',1,1,NULL),(2,'Salt','Didier','Salt','DrSalt',2,2,NULL),(3,'Curry','Mark','Curry','Mark',3,3,NULL),(4,'Cumin','Eddy','Cumin','Cumin',2,4,NULL);
/*!40000 ALTER TABLE `user` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `véhicule`
--

DROP TABLE IF EXISTS `véhicule`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `véhicule` (
  `id_vehicule` int NOT NULL AUTO_INCREMENT,
  `ve_type` varchar(45) DEFAULT NULL,
  `ve_chevaux` int DEFAULT NULL,
  `ve_prix` varchar(10) DEFAULT NULL,
  PRIMARY KEY (`id_vehicule`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `véhicule`
--

LOCK TABLES `véhicule` WRITE;
/*!40000 ALTER TABLE `véhicule` DISABLE KEYS */;
INSERT INTO `véhicule` VALUES (1,'Essence',4,'0.62'),(2,'Essence',5,'0.67'),(3,'Diesel',4,'0.52'),(4,'Diesel',5,'0.58');
/*!40000 ALTER TABLE `véhicule` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2021-05-10 22:07:53
