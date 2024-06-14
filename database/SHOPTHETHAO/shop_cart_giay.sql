-- MySQL dump 10.13  Distrib 8.0.34, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: shop
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
-- Table structure for table `cart_giay`
--

DROP TABLE IF EXISTS cart_giay;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE cart_giay (
  id int NOT NULL AUTO_INCREMENT,
  productName varchar(100) COLLATE utf8mb3_bin DEFAULT NULL,
  size varchar(10) COLLATE utf8mb3_bin DEFAULT NULL,
  quantity int DEFAULT NULL,
  price decimal(10,2) DEFAULT NULL,
  image longblob,
  `Name` varchar(45) COLLATE utf8mb3_bin DEFAULT NULL,
  email varchar(45) COLLATE utf8mb3_bin DEFAULT NULL,
  sdt int DEFAULT NULL,
  address varchar(45) COLLATE utf8mb3_bin DEFAULT NULL,
  PRIMARY KEY (id)
) ENGINE=InnoDB AUTO_INCREMENT=19 DEFAULT CHARSET=utf8mb3 COLLATE=utf8mb3_bin;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `cart_giay`
--

LOCK TABLES cart_giay WRITE;
/*!40000 ALTER TABLE cart_giay DISABLE KEYS */;
INSERT INTO cart_giay VALUES (17,'Mũ Man united','M',3,5999997.00,_binary '�\��\�\0JFIF\0\0\0\0\0\0�\�\0C\0		\n\r\Z\Z $.\' \",#(7),01444\'9=82<.342�\�\0C			\r\r2!!22222222222222222222222222222222222222222222222222��\0\0\�\0\�\"\0�\�\0\0\0\0\0\0\0\0\0\0\0	\n�\�\0�\0\0\0}\0!1AQa\"q2���#B��R\��$3br�	\n\Z%&\'()*456789:CDEFGHIJSTUVWXYZcdefghijstuvwxyz�����������������������������������\�\�\�\�\�\�\�\�\�\�\�\�\�\�\�\�\�\�\�\�\�\�\�\�\�\�\�\������������\�\0\0\0\0\0\0\0\0	\n�\�\0�\0\0w\0!1AQaq\"2�B����	#3R�br\�\n$4\�%�\Z&\'()*56789:CDEFGHIJSTUVWXYZcdefghijstuvwxyz������������������������������������\�\�\�\�\�\�\�\�\�\�\�\�\�\�\�\�\�\�\�\�\�\�\�\�\�\�\�����������\�\0\0\0?\0��(��\n(��\n(��\n(��\n(��\n(��\n(��\n(��\n(��\n(��\n(��\n(��\n(��\n(��\n(��\n(��\n(��\n(��\n(��\n(��\n(��\n(��\n(��\n(��\n(��\n(��\n(��\n(��\n(��\n(��\n(��\n(��\n(��\n(��\n(��\n(��\n(��\n(��\n(��\n(��\n(��\n(��\n(��\n(��\n(��\n(��\n(��\n(��\n(��\n(��\n(��\n(��\n(��\n(�\�j\�h^�\�&?%�\r\'ԁ��N\0a\�\�x�<Wu��譲�6z�\�ӥu�\�;׃|;i&��\�v&ybi���\��u\�V�,ֱ�=Tgڼ\�>%\�R��\�5���v>�h\�1���d�QHYTe�\�נ\�[�\"\�MKQ�J\�漸$G\�\��\nK�R\�\��Y\�\"�9�U\�\Z���\�XCc$V �\�$\�q\�s\�\�-\\mE�e��\�\Z\�T�\��n\�w�\�zG�4�h��_71?\�\��=\nد�\�\��O�ܼQ$d\�eʜ�\�\���\�mZ8\���n�l����GN*(\�aR7�\�\�\�#7|ԗk�\\���/\�F�y*\�w\�Hx\�He\�ڻ$�$@\�\�\�FA9�\�\�2ٞ5|-l;�X\�uQTs�Q@Q@Q@Q@Q@Q@yǍq��M?A��&�6\�@�\0�jG�b?*�\���\�-�\��I����8��7ը\Zܽ�_I�\\G,X\�q�\�zW�i�%��5t�c`9Fm�}z�MX���+�\�x\�+q�`���\�D_��\�c0�-n���\�k\�p��\�R���\0�=vo\�\Z|����V5ߌ\�#�\0V^w�Pq���֭\�\�\�\��/�#; ���Ҭ\��7�g�\��M)�F{\�\��3���2G?\�\�R�g�,6W���\�俯\�\����Oz�\�T���}����c\�\�+\�n\�\�nܽ\��̳\�H\�\�k|\�31��Pն�Vsn~�:\�r�ȒM#ƛ��L\�h\'��W���\�\�\�ъ_/\���u0���q^o��\�\�G\�*\�J\�9f\�\'��kJ\"���\�\�z�0\�}\�c��\�\Z\�5\'vgOR�!����:+�VK9!h���|�GN+GM�\�\�]_<�[��\�<�9>��q[\�L\�\�\�\�HVlG\'\�\\�k\'�V�\��!�U\�n_\r�\�[[�	\��\�b\��3�\�{jq�/\�F\�zf��7\�\�#e\�\�\�\���c\�}�|\��g���s�\�_kws^I\"I�6#�|2���\�v�\�\�\rVUU�~�֖Z����es\r\�]7\�\�\�Vs_!\�>&\�tK�6�-�3e\�u��\��\"�K�\�۠]KO���И��\01Z\��\�k\�{\�\�:?\�o\rj.#���\���\��\0���WG�|\'4�4\�\�7Y@3\�\�#�������M��PΟފ@\���\�\0��(\0��(\0��(\0��~!�?\�]qۜ\�0�\0�U��|��\�D�ִ$o�ܱ�\��?B(\�)�\Zv\�\�%�>\�4ӵ;\�]O�Ν�w�b\�\�{C!��\�2!G(q�\�8�\�\\>��y�\�1c�\��`\�bp\0\�\�O�$\��\��Qen\�\�\�H�^���P:�Ջ+\�Fo\'O��\�_\�ą���W�h�	t?l���\�Sp\�dc�9?��\�\�\�\�\�ogm\r�#�D�@�0�\�zO\�o\�^���\�i{�\0\�+�5\�i?<=e��\�\�d�\�\�\���\�k^\"\��=o\�ꗑ\��S��\�G&��\�?on�C�[H�}�l4�\�:/\�@�4��}�i\"Ӵ\�H��0���W�k�\0t��M���9i,�v�\�ݲ�\'����¹���\"�\���\�ı[�-yu�g�\0pO\�+\�|5\�\��Y[	.񆺛\r!�v_<\�F�c\�/ݍC^�=2\�h�VB=(ʽ\0�9�.���\�Y\�\�\�3%\�\�\�\����>*�\�+=�ry�n3�7\�\�\�\�}\�\��\rcĿu\�킴��\�Z\�\�P�S�X\����\�O�_\�3��j�g��\�O\�*\��\�SV�]k2H�n��	�^k\�<�\�L�%\�\�K\�T�ea�D}\�\�\�K㟉~gh\�W#�\��!\�w���<�O\�]?\���\�\�\�\�7����,�\��zW�\��\�\�GP�\�\�\�\�n^\�\�C�w==�\�=�W�	��B�J��\�\�\�[y�`\�Ѷ9���k\�~|M�\0��\�V4�S\nZ7Np:\�va\�_?�Z\��h���0\��H�)gk.ZV9 ��\�y�)����E \n(��\n(��\n�oX\�Z��\�죟\�\0JFF1\�\�W�\�~��Xkv�E��Ɍ\�||\�}A\�S$\�\�ڄ�\�i\�WG��\'�#�:%�?�\�kN-[E�a4k`=�O��	l5;�9&	Y7c��t\Z7�5}U\�^&�U@�\�C��\�\�U�#\�\�+�:�\'���i�\�\\,\�\�A(\�\"D��\�Zk\��K�\�\�Q\\��\�]_D���A�G˴Nr�Ԃ+\�d�t�eyX����O�\n�X�2�W�b)�ѕ�\�z\���\�9\�\�)���\�i-t}�\�\�X\�d���M��5�s>����|�F,�^kb?߁�k\��0�\�5*=\�����8�r��O�����ּC�2���\�_�ys�\�I\�+\�<+��M\�Lwz�K\������\�\����\�ڻ\�\�k\�\�s\'��a�5�7[��\�S���\�e?�5|�\�s{\n]*/��\0�u.Ѱ�\0�s~5�\��ɵ)�\�b\'�\�oo\�W�\�<M\"\�	�\0\�\��\0f�\�_�\�\�\��\�P��C�\"�;`\�\�I\�Kr\�\�*Uv�Խ\�\��\�\�,a�\�P�~Y\�\�O���_ExO\�\Z�t���I\�qpG\�#A\�+���E�\�\�]\�\�\�]\�\"�<_qz�\�+�j*2�����Զ9\�Q�rMY�|m\�	|;\�\��\'B\��]�3�r\n��\�\�J�M#I+�fv9$����_����t\�I$�|Ő���Ӛ��\�w�/[ʶ��\r\���i\�\��íOacy�\\�4�Yn$=�\\\�\�zƽ\�M�7\�\�b\���\0vYK�\�+��\�Zu�����`\0|�\�\�P�xW\�V�\�md�ģ\���\�?\�n�\0A�ײi�<�DQp�=\0��.k)Y�rˍ��~5�HP(��(��(��(�r�\0��v���גegm΀���WD\0P\0\�\nZ)Y\�)$�؆\�\�/,涓\�J�\�F+�Ҽk�j1^-\�\�\��R�����S*5g\��QE\�(���Pk�E2yDM�ȧ�s\�WQE&�їN��˚.\�\�\����m\"\n6X�BI\�5�F(�+\nRrnOvc\�Z;\�2E,%E1n\�M�i��ۺH\�\�\�V���HR⒖�Q�(��(��(��(��(��(��(��(��(��(����\0J)h����\0(��\0(��\0(��\0(��\0(��\0(��\0(��\0(��\0(��\0(��\0(��\0(��\0(��\0(��\0(��\0(��\0(��\0(��\0(��\0(��\0(��\0(��\0(��\0(��\0(��\0(��\0(��\0(��\0(��\0(��\0(��\0(��\0(��\0(��\0(��\0(��\0(��\0(��\0(��\0(��\0(��\0(��\0�\�','Nguyễn Quang Huy','nguyenquanghuy11062005@gmail.com',344413346,'18 lê thiện trị '),(18,'Mũ Man united','L',4,7999996.00,_binary '�\��\�\0JFIF\0\0\0\0\0\0�\�\0C\0		\n\r\Z\Z $.\' \",#(7),01444\'9=82<.342�\�\0C			\r\r2!!22222222222222222222222222222222222222222222222222��\0\0\�\0\�\"\0�\�\0\0\0\0\0\0\0\0\0\0\0	\n�\�\0�\0\0\0}\0!1AQa\"q2���#B��R\��$3br�	\n\Z%&\'()*456789:CDEFGHIJSTUVWXYZcdefghijstuvwxyz�����������������������������������\�\�\�\�\�\�\�\�\�\�\�\�\�\�\�\�\�\�\�\�\�\�\�\�\�\�\�\������������\�\0\0\0\0\0\0\0\0	\n�\�\0�\0\0w\0!1AQaq\"2�B����	#3R�br\�\n$4\�%�\Z&\'()*56789:CDEFGHIJSTUVWXYZcdefghijstuvwxyz������������������������������������\�\�\�\�\�\�\�\�\�\�\�\�\�\�\�\�\�\�\�\�\�\�\�\�\�\�\�����������\�\0\0\0?\0��(��\n(��\n(��\n(��\n(��\n(��\n(��\n(��\n(��\n(��\n(��\n(��\n(��\n(��\n(��\n(��\n(��\n(��\n(��\n(��\n(��\n(��\n(��\n(��\n(��\n(��\n(��\n(��\n(��\n(��\n(��\n(��\n(��\n(��\n(��\n(��\n(��\n(��\n(��\n(��\n(��\n(��\n(��\n(��\n(��\n(��\n(��\n(��\n(��\n(��\n(��\n(��\n(��\n(�\�j\�h^�\�&?%�\r\'ԁ��N\0a\�\�x�<Wu��譲�6z�\�ӥu�\�;׃|;i&��\�v&ybi���\��u\�V�,ֱ�=Tgڼ\�>%\�R��\�5���v>�h\�1���d�QHYTe�\�נ\�[�\"\�MKQ�J\�漸$G\�\��\nK�R\�\��Y\�\"�9�U\�\Z���\�XCc$V �\�$\�q\�s\�\�-\\mE�e��\�\Z\�T�\��n\�w�\�zG�4�h��_71?\�\��=\nد�\�\��O�ܼQ$d\�eʜ�\�\���\�mZ8\���n�l����GN*(\�aR7�\�\�\�#7|ԗk�\\���/\�F�y*\�w\�Hx\�He\�ڻ$�$@\�\�\�FA9�\�\�2ٞ5|-l;�X\�uQTs�Q@Q@Q@Q@Q@Q@yǍq��M?A��&�6\�@�\0�jG�b?*�\���\�-�\��I����8��7ը\Zܽ�_I�\\G,X\�q�\�zW�i�%��5t�c`9Fm�}z�MX���+�\�x\�+q�`���\�D_��\�c0�-n���\�k\�p��\�R���\0�=vo\�\Z|����V5ߌ\�#�\0V^w�Pq���֭\�\�\�\��/�#; ���Ҭ\��7�g�\��M)�F{\�\��3���2G?\�\�R�g�,6W���\�俯\�\����Oz�\�T���}����c\�\�+\�n\�\�nܽ\��̳\�H\�\�k|\�31��Pն�Vsn~�:\�r�ȒM#ƛ��L\�h\'��W���\�\�\�ъ_/\���u0���q^o��\�\�G\�*\�J\�9f\�\'��kJ\"���\�\�z�0\�}\�c��\�\Z\�5\'vgOR�!����:+�VK9!h���|�GN+GM�\�\�]_<�[��\�<�9>��q[\�L\�\�\�\�HVlG\'\�\\�k\'�V�\��!�U\�n_\r�\�[[�	\��\�b\��3�\�{jq�/\�F\�zf��7\�\�#e\�\�\�\���c\�}�|\��g���s�\�_kws^I\"I�6#�|2���\�v�\�\�\rVUU�~�֖Z����es\r\�]7\�\�\�Vs_!\�>&\�tK�6�-�3e\�u��\��\"�K�\�۠]KO���И��\01Z\��\�k\�{\�\�:?\�o\rj.#���\���\��\0���WG�|\'4�4\�\�7Y@3\�\�#�������M��PΟފ@\���\�\0��(\0��(\0��(\0��~!�?\�]qۜ\�0�\0�U��|��\�D�ִ$o�ܱ�\��?B(\�)�\Zv\�\�%�>\�4ӵ;\�]O�Ν�w�b\�\�{C!��\�2!G(q�\�8�\�\\>��y�\�1c�\��`\�bp\0\�\�O�$\��\��Qen\�\�\�H�^���P:�Ջ+\�Fo\'O��\�_\�ą���W�h�	t?l���\�Sp\�dc�9?��\�\�\�\�\�ogm\r�#�D�@�0�\�zO\�o\�^���\�i{�\0\�+�5\�i?<=e��\�\�d�\�\�\���\�k^\"\��=o\�ꗑ\��S��\�G&��\�?on�C�[H�}�l4�\�:/\�@�4��}�i\"Ӵ\�H��0���W�k�\0t��M���9i,�v�\�ݲ�\'����¹���\"�\���\�ı[�-yu�g�\0pO\�+\�|5\�\��Y[	.񆺛\r!�v_<\�F�c\�/ݍC^�=2\�h�VB=(ʽ\0�9�.���\�Y\�\�\�3%\�\�\�\����>*�\�+=�ry�n3�7\�\�\�\�}\�\��\rcĿu\�킴��\�Z\�\�P�S�X\����\�O�_\�3��j�g��\�O\�*\��\�SV�]k2H�n��	�^k\�<�\�L�%\�\�K\�T�ea�D}\�\�\�K㟉~gh\�W#�\��!\�w���<�O\�]?\���\�\�\�\�7����,�\��zW�\��\�\�GP�\�\�\�\�n^\�\�C�w==�\�=�W�	��B�J��\�\�\�[y�`\�Ѷ9���k\�~|M�\0��\�V4�S\nZ7Np:\�va\�_?�Z\��h���0\��H�)gk.ZV9 ��\�y�)����E \n(��\n(��\n�oX\�Z��\�죟\�\0JFF1\�\�W�\�~��Xkv�E��Ɍ\�||\�}A\�S$\�\�ڄ�\�i\�WG��\'�#�:%�?�\�kN-[E�a4k`=�O��	l5;�9&	Y7c��t\Z7�5}U\�^&�U@�\�C��\�\�U�#\�\�+�:�\'���i�\�\\,\�\�A(\�\"D��\�Zk\��K�\�\�Q\\��\�]_D���A�G˴Nr�Ԃ+\�d�t�eyX����O�\n�X�2�W�b)�ѕ�\�z\���\�9\�\�)���\�i-t}�\�\�X\�d���M��5�s>����|�F,�^kb?߁�k\��0�\�5*=\�����8�r��O�����ּC�2���\�_�ys�\�I\�+\�<+��M\�Lwz�K\������\�\����\�ڻ\�\�k\�\�s\'��a�5�7[��\�S���\�e?�5|�\�s{\n]*/��\0�u.Ѱ�\0�s~5�\��ɵ)�\�b\'�\�oo\�W�\�<M\"\�	�\0\�\��\0f�\�_�\�\�\��\�P��C�\"�;`\�\�I\�Kr\�\�*Uv�Խ\�\��\�\�,a�\�P�~Y\�\�O���_ExO\�\Z�t���I\�qpG\�#A\�+���E�\�\�]\�\�\�]\�\"�<_qz�\�+�j*2�����Զ9\�Q�rMY�|m\�	|;\�\��\'B\��]�3�r\n��\�\�J�M#I+�fv9$����_����t\�I$�|Ő���Ӛ��\�w�/[ʶ��\r\���i\�\��íOacy�\\�4�Yn$=�\\\�\�zƽ\�M�7\�\�b\���\0vYK�\�+��\�Zu�����`\0|�\�\�P�xW\�V�\�md�ģ\���\�?\�n�\0A�ײi�<�DQp�=\0��.k)Y�rˍ��~5�HP(��(��(��(�r�\0��v���גegm΀���WD\0P\0\�\nZ)Y\�)$�؆\�\�/,涓\�J�\�F+�Ҽk�j1^-\�\�\��R�����S*5g\��QE\�(���Pk�E2yDM�ȧ�s\�WQE&�їN��˚.\�\�\����m\"\n6X�BI\�5�F(�+\nRrnOvc\�Z;\�2E,%E1n\�M�i��ۺH\�\�\�V���HR⒖�Q�(��(��(��(��(��(��(��(��(��(����\0J)h����\0(��\0(��\0(��\0(��\0(��\0(��\0(��\0(��\0(��\0(��\0(��\0(��\0(��\0(��\0(��\0(��\0(��\0(��\0(��\0(��\0(��\0(��\0(��\0(��\0(��\0(��\0(��\0(��\0(��\0(��\0(��\0(��\0(��\0(��\0(��\0(��\0(��\0(��\0(��\0(��\0(��\0(��\0�\�','phuco','vbhjnkm',147258369,'ngã tư ');
/*!40000 ALTER TABLE cart_giay ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2024-06-02 22:15:08