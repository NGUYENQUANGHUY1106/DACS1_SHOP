-- MySQL dump 10.13  Distrib 8.0.34, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: quanlysanbong
-- ------------------------------------------------------
-- Server version	8.0.35

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
-- Table structure for table `quanlydanhsachdatsan`
--

DROP TABLE IF EXISTS quanlydanhsachdatsan;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE quanlydanhsachdatsan (
  STT int NOT NULL AUTO_INCREMENT,
  maSan varchar(45) COLLATE utf8mb3_bin NOT NULL,
  tenKhachHang varchar(45) COLLATE utf8mb3_bin NOT NULL,
  ngayDat varchar(45) COLLATE utf8mb3_bin NOT NULL,
  gioBatDau varchar(45) COLLATE utf8mb3_bin NOT NULL,
  gioKetThuc varchar(45) COLLATE utf8mb3_bin NOT NULL,
  donGia varchar(45) COLLATE utf8mb3_bin NOT NULL,
  loaiThue varchar(45) COLLATE utf8mb3_bin NOT NULL,
  PRIMARY KEY (STT)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8mb3 COLLATE=utf8mb3_bin;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `quanlydanhsachdatsan`
--

LOCK TABLES quanlydanhsachdatsan WRITE;
/*!40000 ALTER TABLE quanlydanhsachdatsan DISABLE KEYS */;
INSERT INTO quanlydanhsachdatsan VALUES (6,'Sân 1','PHƯỚC','2024-06-02','6H','7H','200000','');
/*!40000 ALTER TABLE quanlydanhsachdatsan ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2024-06-02 22:14:47
