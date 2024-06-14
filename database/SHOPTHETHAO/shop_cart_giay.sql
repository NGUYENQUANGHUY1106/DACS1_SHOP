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
INSERT INTO cart_giay VALUES (17,'MÅ© Man united','M',3,5999997.00,_binary 'ÿ\Øÿ\à\0JFIF\0\0\0\0\0\0ÿ\Û\0C\0		\n\r\Z\Z $.\' \",#(7),01444\'9=82<.342ÿ\Û\0C			\r\r2!!22222222222222222222222222222222222222222222222222ÿÀ\0\0\È\0\È\"\0ÿ\Ä\0\0\0\0\0\0\0\0\0\0\0	\nÿ\Ä\0µ\0\0\0}\0!1AQa\"q2‘¡#B±ÁR\Ñð$3br‚	\n\Z%&\'()*456789:CDEFGHIJSTUVWXYZcdefghijstuvwxyzƒ„…†‡ˆ‰Š’“”•–—˜™š¢£¤¥¦§¨©ª²³´µ¶·¸¹º\Â\Ã\Ä\Å\Æ\Ç\È\É\Ê\Ò\Ó\Ô\Õ\Ö\×\Ø\Ù\Ú\á\â\ã\ä\å\æ\ç\è\é\êñòóôõö÷øùúÿ\Ä\0\0\0\0\0\0\0\0	\nÿ\Ä\0µ\0\0w\0!1AQaq\"2B‘¡±Á	#3Rðbr\Ñ\n$4\á%ñ\Z&\'()*56789:CDEFGHIJSTUVWXYZcdefghijstuvwxyz‚ƒ„…†‡ˆ‰Š’“”•–—˜™š¢£¤¥¦§¨©ª²³´µ¶·¸¹º\Â\Ã\Ä\Å\Æ\Ç\È\É\Ê\Ò\Ó\Ô\Õ\Ö\×\Ø\Ù\Ú\â\ã\ä\å\æ\ç\è\é\êòóôõö÷øùúÿ\Ú\0\0\0?\0÷ú(¢€\n(¢€\n(¢€\n(¢€\n(¢€\n(¢€\n(¢€\n(¢€\n(¢€\n(¢€\n(¢€\n(¢€\n(¢€\n(¢€\n(¢€\n(¢€\n(¢€\n(¢€\n(¢€\n(¢€\n(¢€\n(¢€\n(¢€\n(¢€\n(¢€\n(¢€\n(¢€\n(¢€\n(¢€\n(¢€\n(¢€\n(¢€\n(¢€\n(¢€\n(¢€\n(¢€\n(¢€\n(¢€\n(¢€\n(¢€\n(¢€\n(¢€\n(¢€\n(¢€\n(¢€\n(¢€\n(¢€\n(¢€\n(¢€\n(¢€\n(¢€\n(¢€\n(¢€\n(¬\ßj\Ñh^¿\Õ&?%¬\r\'ÔÀüN\0a\Å\ãx®<Wu£Áè­²¯6z°\êÓ¥uÀ\ä;×ƒ|;i&¹–\æv&ybiž¥‰\Éþu\îV“,Ö±¸=TgÚ¼\ì>%\ËRŒž\É5úþ‡v>„h\Î1ò§ódôQHYTeˆ\Ü× \Ú[œ\"\ÕMKQƒJ\Óæ¼¸$G\ä\Ôû\nKR\Î\Ò–Y\Ô\"’9þU\æ\Zýþ¿\â™XCc$V þ\í$\Âq\ês\Ô\×-\\mE¾e÷\Ø\Z\ÄT÷\ä£»n\ßw™\èzGŠ4h´º_71?\Ê\ãð=\nØ¯¾\Ñ\îô‹O¶Ü¼Q$d\ÂeÊœñ\Ð\Öõ—\ÄmZ8\íöˆn•l…¹ó®GN*(\ãaR7\é\×\É#7|Ô—k­\\¢¸½/\âF™y*\Ãw\ÚHx\ÜHe\ëÚ»$‘$@\È\ê\ÊFA9®\È\Î2Ùž5|-l;µX\ØuQTs…Q@Q@Q@Q@Q@Q@yÇq­ôM?Añ&¡6\é@ÿ\0žjGób?*õ\Êù“\ã-û\ÝüIø´Š8—Ž7Õ¨\ZÜ½¢_I¦\\G,X\Êqƒ\ÜzW¦iž%¶ž5t•c`9Fm¤}zñMXŠô¦+À\ìx\î+q®`·Œ™\æD_ö›\àc0¯-n¤º£\îk\áp™\ÕRµ–ÿ\0£=vo\Å\Z|÷ª¼ÀV5ßŒ\í#ÿ\0V^wôPqùšóÖ­\ç›\È\Ó\í®/§#; Œþ§Ò¬\É´7¯g¤\ÃüM)óF{\ã\åü3ž•Œ2G?\â\ÎRõg‹,6W‡¼¨\çä¿¯\Ô\Öñˆ¼Oz¬\ÚT°À€}À¹“ðc\Ç\è+\Ín\î\ïnÜ½\åýÌ³\ä†H\Ç\Ýk|\êº31º›PÕ¶ôVsn~ƒ:\ç½ròÈ’M#Æ›œ•L\çh\'øW·…Á\Ó\Ã\ÆÑŠ_/\Ôòñu0ó•ððq^oúü\Ç\ÛG\Ü*\ÜJ\Ë9f\É\'«¨kJ\"û”¦\Ú\Õz0\Î}\ÍcŒž\Ô\Z\è•5\'vgOR”!¥úõô:+­VK9!h¥‘“|¬GN+GMñ\Ë\Ù]_<“[­¶\Ð<‰9>Ÿ¥q[\ÇL\Ó\Ò\í\ã†HVlG\'\ß\\ðk\'‡V²\Üô!œU\çn_\r¶\ß[[þ	\éú\Åb\Öõ3©\Å{jq˜/\ÇF\ÍzfŸñ7\Ã\×#e\å\Ê\Ø\Ü†Žc\Æ}|\Ïg‰ÁƒsÀ\â¯_kws^I\"I¶6#÷|2ô÷ª\åšvŽ\Æ\×\rVUU¥~‡Ö–Z…ž£Ÿes\r\Ä]7\Ä\á‡\éVs_!\é>&\ÖtKƒ6›-«3e\Äu¾«\Ðþ\"½Kø\å«Û ]KO·¼øÐ˜˜ÿ\01Z\Øó\åk\è{\Õ\ç:?\Æo\rj.#¼óô\Öþô\àÿ\0¾‡øWG|\'4†4\×\ì7Y@3\Ô\Ð#£¢ ¶¾´½Mö·PÎŸÞŠ@\Ãô©\è\0¢Š(\0¢Š(\0¢Š(\0¯’~!»?\Ä]qÛœ\Ý0ü\0þUõµ|¡ñ\ÖDñÖ´$o˜Ü±ô\àò?B(\ê)´\Zv\Ò\Ç%‰>\ç4Óµ;\æ•]OñÎ‡w±b\Ú\â{C!·™\ã2!G(q•\È8ý\Ó\\>ù¥yû\Ò1cú\Ó`\æbp\0\äš\ë´O‡$\Öö\ÉöQen\å­\ß\ÊHö^¦™P:œÕ‹+\ÍFo\'O³š\æ_\îÄ…ˆüºWµh¿	t?lš”’\êSp\çdcþ9?‰®\â\Ò\Þ\Ú\Âogm\r¼#¢D@ü0¹\âzO\Âo\ê^ù­ô\èi{ÿ\0\ß+þ5\Üi?<=eµ¯\åº\Ôd\í\å§\ä¼þµ\Ôk^\"\Òü=o\çê—‘\ÂùS«¿\ÑG&¼³\Ä?onƒC¡[Hº}¢l4‡\è:/\ë@£4žð}‰i\"Ó´\èHû¢0þƒ«Wœkÿ\0tû‰M¿‡ü9i,Œv­\ÅÝ²±\'ý”ùŸÂ¹½Àþ\"ñ­\×ö…\íÄ±[¿-yu–gÿ\0pO\è+\Ø|5\à½\Âñ«Y[	.ñ†º›\r!úv_Â€<\ëFøc\â/ÝC^–=2\çh‰VB=(Ê½\0ü9ð.‹¤»\ßY\Æ\Ð\Æ3%\Ý\Ü\Ä\Ì «>*ñ¾›\á+=÷ry÷n3ª7\Î\Þ\ç\Ñ}\ë\Äõ\rcÄ¿u\Èí‚´¤Ÿ\ÝZ\Å\ÄPSýX\Ðø¶÷\ÂOö_\é3›j’gù¹\è¨O\ê*\Þð¿\ÂSV€]k2Hön•½	…^k\Ð<ð\çLðª%\Ý\ÐK\ÝTŽeaòD}\ç\×\éKãŸ‰~gh\ïW#ˆ\Éù!\Ïw÷ö <ñO\Ã]?\Âö†\æ\ë\Ä\è7©­³,‡\ØýzWž\íú\Õ\ÍGP½\Õ\ï\ä½\Ôn^\â\æC–w==€\ì=…W 	´ýB÷JºŽ\æ\Â\æ[y£`\ÊÑ¶9£¡ük\Þ~|Mÿ\0„ž\ìV4‡S\nZ7Np:\àva\é_?’Z\í¾h·÷ž0\ÓõH£)gk.ZV9 «\êyü)ô ¢E \n(¢€\n(¢€\nñoX\ÙZø¶\é®ì£Ÿ\í\0JFF1\ß\ÜW´\Ö~¯¢Xkv¾EõºÉŒ\ì||\È}A\íS$\Ú\ÐÚ„©\Æi\ÔWG…Á\'‡#Á:%±?õ\ÅkN-[EŒa4k`=¢Oð¬û	l5;«9&	Y7c¨­t\Z75}U\Ù^&³U@Á\çC†ö\É\ÏU»#\ê\Þ+¥:º\'¶¬·i­\è±\\,\Ñ\é‘A(\é\"D¹ˆ\ÒZk\Ö÷K˜\æ\êQ\\–³\à]_D³’òAðGË´Nr£Ô‚+\Ýdžt†eyXüª€’Oµ\n­X»2žW—b)¹Ñ•’\êz\Çö‚\Ü9\Õ\ç¾)ñ÷ˆ\ãi-t}ò\Ý\îX\î d©®—Mð·5¬s> –»†|§F,¿^kb?ßók\Ìû0õ\ë¢5*=\Ñóõ°¸8¿rµþOü¢°Ö¼Cª2ˆ®®\ï_—ys‘\îI\è+\Ô<+ð÷M\ÒLwzÁK\ÛÁ†‘û¨\Ï\Óø¹\ãÚ»\Ó\àk\Ü\Ès\'ý«aþ5ø7[Œþ\ëSµ\ãe?¡5|ò\ìs{\n]*/¹ÿ\0‘u.Ñ°€\0¥s~5ñ\Ä°Éµ)‡\îb\'…\Þoo\çW¤\Ð<M\"\Þ	ÿ\0\ëœ\ãÿ\0f¼\×_ð\åœ\Ú\Äò\ê£P‚öC—\"ð;`\Ó\éI\ÕKr\é\à*Uv¤Ô½\Å\Ã«\â\ß,až\ëP¼~Y\Ï\æO¢ù_ExO\Ã\Z„t•µ´I\ÜqpG\Í#A\è+ˆø E¤\Ü\Ý]\é\Ñ\Ü]\Ë\"„<_qz\ãž+¾j*2ö’ø«ŒÔ¶9\ëQrMY•|m\â	|;\á\Ûø\'B\Çø]Ž3ør\nù¸\Ê\ÓJóM#I+±fv9$ž¤šú_³µñšt\ÝI$ò|Åª­‘ÓšÁƒ\áw‡/[Ê¶³»\r\ê·®i\Ü\Èñ‚Ã­Oacyª\\ˆ4ûYn$=£\\\ã\êzÆ½\ïMø7\á\ëb\â˜ÿ\0vYK\è+¯‹\ÃZu‰·²`\0|»\Ð\ÐP‘xW\áVù\Òmd­Ä£\æ‘·\È?\ßnÿ\0Aú×²iº<˜DQp¨=\0¨ô.k)Y™rË£œ~5­HP( Š( Š( Š( rÿ\0Ášv¡¨›×’egmÎ€­úWD\0P\0\à\nZ)Y\ç)$›Ø†\î\Ù/,æ¶“\îJ…\èF+žÒ¼k¥j1^-\Ë\È\ÑôR€˜®žŠS*5g\ã£QE\ÌÂŠ( ¹øPkóE2yDM„È§¦s\ÔWQE&“Ñ—N¤©Ëš.\Ì\Í\Ðô¸ôm\"\n6X¯BI\É5£F(¡+\nRrnOvc\ëZ;\ê2E,%E1n\ãµM£i­¦ÛºH\Ê\Î\í’V´¨¦HRâ’–€QŠ( Š( Š( Š( Š( Š( Š( Š( Š( Š( ’–Š\0J)h ¥¢Š\0(¢Š\0(¢Š\0(¢Š\0(¢Š\0(¢Š\0(¢Š\0(¢Š\0(¢Š\0(¢Š\0(¢Š\0(¢Š\0(¢Š\0(¢Š\0(¢Š\0(¢Š\0(¢Š\0(¢Š\0(¢Š\0(¢Š\0(¢Š\0(¢Š\0(¢Š\0(¢Š\0(¢Š\0(¢Š\0(¢Š\0(¢Š\0(¢Š\0(¢Š\0(¢Š\0(¢Š\0(¢Š\0(¢Š\0(¢Š\0(¢Š\0(¢Š\0(¢Š\0(¢Š\0(¢Š\0(¢Š\0(¢Š\0(¢Š\0ÿ\Ù','Nguyá»…n Quang Huy','nguyenquanghuy11062005@gmail.com',344413346,'18 lÃª thiá»‡n trá»‹ '),(18,'MÅ© Man united','L',4,7999996.00,_binary 'ÿ\Øÿ\à\0JFIF\0\0\0\0\0\0ÿ\Û\0C\0		\n\r\Z\Z $.\' \",#(7),01444\'9=82<.342ÿ\Û\0C			\r\r2!!22222222222222222222222222222222222222222222222222ÿÀ\0\0\È\0\È\"\0ÿ\Ä\0\0\0\0\0\0\0\0\0\0\0	\nÿ\Ä\0µ\0\0\0}\0!1AQa\"q2‘¡#B±ÁR\Ñð$3br‚	\n\Z%&\'()*456789:CDEFGHIJSTUVWXYZcdefghijstuvwxyzƒ„…†‡ˆ‰Š’“”•–—˜™š¢£¤¥¦§¨©ª²³´µ¶·¸¹º\Â\Ã\Ä\Å\Æ\Ç\È\É\Ê\Ò\Ó\Ô\Õ\Ö\×\Ø\Ù\Ú\á\â\ã\ä\å\æ\ç\è\é\êñòóôõö÷øùúÿ\Ä\0\0\0\0\0\0\0\0	\nÿ\Ä\0µ\0\0w\0!1AQaq\"2B‘¡±Á	#3Rðbr\Ñ\n$4\á%ñ\Z&\'()*56789:CDEFGHIJSTUVWXYZcdefghijstuvwxyz‚ƒ„…†‡ˆ‰Š’“”•–—˜™š¢£¤¥¦§¨©ª²³´µ¶·¸¹º\Â\Ã\Ä\Å\Æ\Ç\È\É\Ê\Ò\Ó\Ô\Õ\Ö\×\Ø\Ù\Ú\â\ã\ä\å\æ\ç\è\é\êòóôõö÷øùúÿ\Ú\0\0\0?\0÷ú(¢€\n(¢€\n(¢€\n(¢€\n(¢€\n(¢€\n(¢€\n(¢€\n(¢€\n(¢€\n(¢€\n(¢€\n(¢€\n(¢€\n(¢€\n(¢€\n(¢€\n(¢€\n(¢€\n(¢€\n(¢€\n(¢€\n(¢€\n(¢€\n(¢€\n(¢€\n(¢€\n(¢€\n(¢€\n(¢€\n(¢€\n(¢€\n(¢€\n(¢€\n(¢€\n(¢€\n(¢€\n(¢€\n(¢€\n(¢€\n(¢€\n(¢€\n(¢€\n(¢€\n(¢€\n(¢€\n(¢€\n(¢€\n(¢€\n(¢€\n(¢€\n(¢€\n(¢€\n(¬\ßj\Ñh^¿\Õ&?%¬\r\'ÔÀüN\0a\Å\ãx®<Wu£Áè­²¯6z°\êÓ¥uÀ\ä;×ƒ|;i&¹–\æv&ybiž¥‰\Éþu\îV“,Ö±¸=TgÚ¼\ì>%\ËRŒž\É5úþ‡v>„h\Î1ò§ódôQHYTeˆ\Ü× \Ú[œ\"\ÕMKQƒJ\Óæ¼¸$G\ä\Ôû\nKR\Î\Ò–Y\Ô\"’9þU\æ\Zýþ¿\â™XCc$V þ\í$\Âq\ês\Ô\×-\\mE¾e÷\Ø\Z\ÄT÷\ä£»n\ßw™\èzGŠ4h´º_71?\Ê\ãð=\nØ¯¾\Ñ\îô‹O¶Ü¼Q$d\ÂeÊœñ\Ð\Öõ—\ÄmZ8\íöˆn•l…¹ó®GN*(\ãaR7\é\×\É#7|Ô—k­\\¢¸½/\âF™y*\Ãw\ÚHx\ÜHe\ëÚ»$‘$@\È\ê\ÊFA9®\È\Î2Ùž5|-l;µX\ØuQTs…Q@Q@Q@Q@Q@Q@yÇq­ôM?Añ&¡6\é@ÿ\0žjGób?*õ\Êù“\ã-û\ÝüIø´Š8—Ž7Õ¨\ZÜ½¢_I¦\\G,X\Êqƒ\ÜzW¦iž%¶ž5t•c`9Fm¤}zñMXŠô¦+À\ìx\î+q®`·Œ™\æD_ö›\àc0¯-n¤º£\îk\áp™\ÕRµ–ÿ\0£=vo\Å\Z|÷ª¼ÀV5ßŒ\í#ÿ\0V^wôPqùšóÖ­\ç›\È\Ó\í®/§#; Œþ§Ò¬\É´7¯g¤\ÃüM)óF{\ã\åü3ž•Œ2G?\â\ÎRõg‹,6W‡¼¨\çä¿¯\Ô\Öñˆ¼Oz¬\ÚT°À€}À¹“ðc\Ç\è+\Ín\î\ïnÜ½\åýÌ³\ä†H\Ç\Ýk|\êº31º›PÕ¶ôVsn~ƒ:\ç½ròÈ’M#Æ›œ•L\çh\'øW·…Á\Ó\Ã\ÆÑŠ_/\Ôòñu0ó•ððq^oúü\Ç\ÛG\Ü*\ÜJ\Ë9f\É\'«¨kJ\"û”¦\Ú\Õz0\Î}\ÍcŒž\Ô\Z\è•5\'vgOR”!¥úõô:+­VK9!h¥‘“|¬GN+GMñ\Ë\Ù]_<“[­¶\Ð<‰9>Ÿ¥q[\ÇL\Ó\Ò\í\ã†HVlG\'\ß\\ðk\'‡V²\Üô!œU\çn_\r¶\ß[[þ	\éú\Åb\Öõ3©\Å{jq˜/\ÇF\ÍzfŸñ7\Ã\×#e\å\Ê\Ø\Ü†Žc\Æ}|\Ïg‰ÁƒsÀ\â¯_kws^I\"I¶6#÷|2ô÷ª\åšvŽ\Æ\×\rVUU¥~‡Ö–Z…ž£Ÿes\r\Ä]7\Ä\á‡\éVs_!\é>&\ÖtKƒ6›-«3e\Äu¾«\Ðþ\"½Kø\å«Û ]KO·¼øÐ˜˜ÿ\01Z\Øó\åk\è{\Õ\ç:?\Æo\rj.#¼óô\Öþô\àÿ\0¾‡øWG|\'4†4\×\ì7Y@3\Ô\Ð#£¢ ¶¾´½Mö·PÎŸÞŠ@\Ãô©\è\0¢Š(\0¢Š(\0¢Š(\0¯’~!»?\Ä]qÛœ\Ý0ü\0þUõµ|¡ñ\ÖDñÖ´$o˜Ü±ô\àò?B(\ê)´\Zv\Ò\Ç%‰>\ç4Óµ;\æ•]OñÎ‡w±b\Ú\â{C!·™\ã2!G(q•\È8ý\Ó\\>ù¥yû\Ò1cú\Ó`\æbp\0\äš\ë´O‡$\Öö\ÉöQen\å­\ß\ÊHö^¦™P:œÕ‹+\ÍFo\'O³š\æ_\îÄ…ˆüºWµh¿	t?lš”’\êSp\çdcþ9?‰®\â\Ò\Þ\Ú\Âogm\r¼#¢D@ü0¹\âzO\Âo\ê^ù­ô\èi{ÿ\0\ß+þ5\Üi?<=eµ¯\åº\Ôd\í\å§\ä¼þµ\Ôk^\"\Òü=o\çê—‘\ÂùS«¿\ÑG&¼³\Ä?onƒC¡[Hº}¢l4‡\è:/\ë@£4žð}‰i\"Ó´\èHû¢0þƒ«Wœkÿ\0tû‰M¿‡ü9i,Œv­\ÅÝ²±\'ý”ùŸÂ¹½Àþ\"ñ­\×ö…\íÄ±[¿-yu–gÿ\0pO\è+\Ø|5\à½\Âñ«Y[	.ñ†º›\r!úv_Â€<\ëFøc\â/ÝC^–=2\çh‰VB=(Ê½\0ü9ð.‹¤»\ßY\Æ\Ð\Æ3%\Ý\Ü\Ä\Ì «>*ñ¾›\á+=÷ry÷n3ª7\Î\Þ\ç\Ñ}\ë\Äõ\rcÄ¿u\Èí‚´¤Ÿ\ÝZ\Å\ÄPSýX\Ðø¶÷\ÂOö_\é3›j’gù¹\è¨O\ê*\Þð¿\ÂSV€]k2Hön•½	…^k\Ð<ð\çLðª%\Ý\ÐK\ÝTŽeaòD}\ç\×\éKãŸ‰~gh\ïW#ˆ\Éù!\Ïw÷ö <ñO\Ã]?\Âö†\æ\ë\Ä\è7©­³,‡\ØýzWž\íú\Õ\ÍGP½\Õ\ï\ä½\Ôn^\â\æC–w==€\ì=…W 	´ýB÷JºŽ\æ\Â\æ[y£`\ÊÑ¶9£¡ük\Þ~|Mÿ\0„ž\ìV4‡S\nZ7Np:\àva\é_?’Z\í¾h·÷ž0\ÓõH£)gk.ZV9 «\êyü)ô ¢E \n(¢€\n(¢€\nñoX\ÙZø¶\é®ì£Ÿ\í\0JFF1\ß\ÜW´\Ö~¯¢Xkv¾EõºÉŒ\ì||\È}A\íS$\Ú\ÐÚ„©\Æi\ÔWG…Á\'‡#Á:%±?õ\ÅkN-[EŒa4k`=¢Oð¬û	l5;«9&	Y7c¨­t\Z75}U\Ù^&³U@Á\çC†ö\É\ÏU»#\ê\Þ+¥:º\'¶¬·i­\è±\\,\Ñ\é‘A(\é\"D¹ˆ\ÒZk\Ö÷K˜\æ\êQ\\–³\à]_D³’òAðGË´Nr£Ô‚+\Ýdžt†eyXüª€’Oµ\n­X»2žW—b)¹Ñ•’\êz\Çö‚\Ü9\Õ\ç¾)ñ÷ˆ\ãi-t}ò\Ý\îX\î d©®—Mð·5¬s> –»†|§F,¿^kb?ßók\Ìû0õ\ë¢5*=\Ñóõ°¸8¿rµþOü¢°Ö¼Cª2ˆ®®\ï_—ys‘\îI\è+\Ô<+ð÷M\ÒLwzÁK\ÛÁ†‘û¨\Ï\Óø¹\ãÚ»\Ó\àk\Ü\Ès\'ý«aþ5ø7[Œþ\ëSµ\ãe?¡5|ò\ìs{\n]*/¹ÿ\0‘u.Ñ°€\0¥s~5ñ\Ä°Éµ)‡\îb\'…\Þoo\çW¤\Ð<M\"\Þ	ÿ\0\ëœ\ãÿ\0f¼\×_ð\åœ\Ú\Äò\ê£P‚öC—\"ð;`\Ó\éI\ÕKr\é\à*Uv¤Ô½\Å\Ã«\â\ß,až\ëP¼~Y\Ï\æO¢ù_ExO\Ã\Z„t•µ´I\ÜqpG\Í#A\è+ˆø E¤\Ü\Ý]\é\Ñ\Ü]\Ë\"„<_qz\ãž+¾j*2ö’ø«ŒÔ¶9\ëQrMY•|m\â	|;\á\Ûø\'B\Çø]Ž3ør\nù¸\Ê\ÓJóM#I+±fv9$ž¤šú_³µñšt\ÝI$ò|Åª­‘ÓšÁƒ\áw‡/[Ê¶³»\r\ê·®i\Ü\Èñ‚Ã­Oacyª\\ˆ4ûYn$=£\\\ã\êzÆ½\ïMø7\á\ëb\â˜ÿ\0vYK\è+¯‹\ÃZu‰·²`\0|»\Ð\ÐP‘xW\áVù\Òmd­Ä£\æ‘·\È?\ßnÿ\0Aú×²iº<˜DQp¨=\0¨ô.k)Y™rË£œ~5­HP( Š( Š( Š( rÿ\0Ášv¡¨›×’egmÎ€­úWD\0P\0\à\nZ)Y\ç)$›Ø†\î\Ù/,æ¶“\îJ…\èF+žÒ¼k¥j1^-\Ë\È\ÑôR€˜®žŠS*5g\ã£QE\ÌÂŠ( ¹øPkóE2yDM„È§¦s\ÔWQE&“Ñ—N¤©Ëš.\Ì\Í\Ðô¸ôm\"\n6X¯BI\É5£F(¡+\nRrnOvc\ëZ;\ê2E,%E1n\ãµM£i­¦ÛºH\Ê\Î\í’V´¨¦HRâ’–€QŠ( Š( Š( Š( Š( Š( Š( Š( Š( Š( ’–Š\0J)h ¥¢Š\0(¢Š\0(¢Š\0(¢Š\0(¢Š\0(¢Š\0(¢Š\0(¢Š\0(¢Š\0(¢Š\0(¢Š\0(¢Š\0(¢Š\0(¢Š\0(¢Š\0(¢Š\0(¢Š\0(¢Š\0(¢Š\0(¢Š\0(¢Š\0(¢Š\0(¢Š\0(¢Š\0(¢Š\0(¢Š\0(¢Š\0(¢Š\0(¢Š\0(¢Š\0(¢Š\0(¢Š\0(¢Š\0(¢Š\0(¢Š\0(¢Š\0(¢Š\0(¢Š\0(¢Š\0(¢Š\0(¢Š\0(¢Š\0(¢Š\0ÿ\Ù','phuco','vbhjnkm',147258369,'ngÃ£ tÆ° ');
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
