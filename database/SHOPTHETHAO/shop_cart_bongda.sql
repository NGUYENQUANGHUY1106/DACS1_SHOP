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
-- Table structure for table `cart_bongda`
--

DROP TABLE IF EXISTS cart_bongda;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE cart_bongda (
  id int NOT NULL AUTO_INCREMENT,
  productName varchar(100) COLLATE utf8mb3_bin DEFAULT NULL,
  size varchar(10) COLLATE utf8mb3_bin DEFAULT NULL,
  quantity int DEFAULT NULL,
  image longblob,
  price decimal(10,2) DEFAULT NULL,
  `Name` varchar(45) COLLATE utf8mb3_bin DEFAULT NULL,
  email varchar(45) COLLATE utf8mb3_bin DEFAULT NULL,
  sdt int DEFAULT NULL,
  address varchar(45) COLLATE utf8mb3_bin DEFAULT NULL,
  PRIMARY KEY (id)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8mb3 COLLATE=utf8mb3_bin;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `cart_bongda`
--

LOCK TABLES cart_bongda WRITE;
/*!40000 ALTER TABLE cart_bongda DISABLE KEYS */;
INSERT INTO cart_bongda VALUES (5,'BÃ³ng Adidas','XL',3,_binary 'ÿ\Øÿ\à\0JFIF\0\0\0\0\0\0ÿ\Û\0C\0		\n\r\Z\Z $.\' \",#(7),01444\'9=82<.342ÿ\Û\0C			\r\r2!!22222222222222222222222222222222222222222222222222ÿÀ\0\0\È\0\È\"\0ÿ\Ä\0\0\0\0\0\0\0\0\0\0\0	\nÿ\Ä\0µ\0\0\0}\0!1AQa\"q2‘¡#B±ÁR\Ñð$3br‚	\n\Z%&\'()*456789:CDEFGHIJSTUVWXYZcdefghijstuvwxyzƒ„…†‡ˆ‰Š’“”•–—˜™š¢£¤¥¦§¨©ª²³´µ¶·¸¹º\Â\Ã\Ä\Å\Æ\Ç\È\É\Ê\Ò\Ó\Ô\Õ\Ö\×\Ø\Ù\Ú\á\â\ã\ä\å\æ\ç\è\é\êñòóôõö÷øùúÿ\Ä\0\0\0\0\0\0\0\0	\nÿ\Ä\0µ\0\0w\0!1AQaq\"2B‘¡±Á	#3Rðbr\Ñ\n$4\á%ñ\Z&\'()*56789:CDEFGHIJSTUVWXYZcdefghijstuvwxyz‚ƒ„…†‡ˆ‰Š’“”•–—˜™š¢£¤¥¦§¨©ª²³´µ¶·¸¹º\Â\Ã\Ä\Å\Æ\Ç\È\É\Ê\Ò\Ó\Ô\Õ\Ö\×\Ø\Ù\Ú\â\ã\ä\å\æ\ç\è\é\êòóôõö÷øùúÿ\Ú\0\0\0?\0÷ú(¢€\n(¢€\n(¢€\nJ7\nŽIc†&’GTEfc€¹ ð(\Íyþ»ñs\Ã\ZC<V÷¨N¿Áj7.}\Üñùf¸W\ãf»r\Åt\ËK8ó\ÃI™Ÿ .itp5\ê\ë\è{ösHX\É\ë_+^x\ï\ÅZˆcq¯^„\'\î\ÂþXú| VÎ£}xyu\"ú<\î\ß\Ì\Ô{TvG\'¨÷’>ÁûD9Ç\Þ  Œ‚ö¯‹„*ù©á¾¿µ9¶¾»ƒ<«‡_\äiª‰Žy=H¯ˆû3?òe<]§\àA\â\â\Î\Ù\ß\ÍøöO\ë]v•ñ\Ï^µmº®Ÿi}~ô9…\Çóù\Ñ\Ç<\rXŸB\Ñ^y |að®²\Ë÷O§\\\à¼Ÿg/\çŠï£•&ŒHŽ¬Œ2NAg,¡(î‰¨¤\Èõ¥ ¢Š(\0¢Š(\0¢Š(\0¢Š(\0¢ŠBq@4°«\Ý\ÞÁai%\ÕÔ©)g’FÂ¨õ&¼\Æÿ\0.õ\ç’\ÃD’KM0‚­8’\àtúªûu>\Õ3’Š\Ô\è\Ãajb\'\Ëw~0ø¯¤øy¥´°P\Ô@ÁDlGÿ\0i¿ \ç\é^)¯ø·_ñT\Ä\êw\ÌÐŽV\Ú/’%ÿ\0€Ž¿SšÍ†\Ô\íl\0ŒŸ@*_\ÜF¤F<\×\Ç	þ$\×,ª¶}F*¥GW«*\ÇlÅ‚\"s€R´F+ót\0‚J°\Ó\Ê\ãi &I\n£\0g·®>µ\Ý\éŠ\Î\ìõ=ž‡ý‰\Ä&U(ë¼¨}\ÇP=úTqÖž²º8tb¬;Š˜2]pB\Ç7np¬ùS\Ü\Ê6ƒ³*œb£\ÆxsŠ°Ñ²1VRx#Ò»Ÿ‡z™¬\Újñ\ÜJ>\Üñù1ñ#)\Ü\ê~\Ùü;Ó‚\Ö\ÆXªª>sÎˆ\ç¥.\Ìÿ\0	¯F»øeœ­6£\âKX S\Ã<[Iü\Î3ô¬™,¼j\ÛV\Ô/Ÿ\ÒuEü\ÏøV\î\ësÍ–\"3ønþGñd÷+Ž†·<9\ã_xFP4\Ë÷ùÉµ—/	ÿ\0€“\Ç\Ôcñ«£\àýš\Âóþ\ÚÝèµ‘q\0$˜\ã*=n¡H\çœcQ{\ÈúÁ4oI•\è\Zv¦\Ü¤o\Ý\È\Øo_cƒõ¯G\r|Vm‚!yFSû¿\Þö¯Køñz\ïDò´\ïK-Õ‡\n·\æ’L÷eýG½iel-µôX9¥ª¶w¶÷ö‘]ZJ“Á*†ŽH\Û*\Ã\Ô\Z²{UœB\ÑE\0QE\0QE¨*µ\í\í¾Ÿg-\ÕÜ©©y$s€ w5;ƒ\È\Ïjùûâ‡Ÿ]\Ô_G±—þ%ö\ÒbFSþ¾Aü\ÕOOS\ÍL\åÊŽœ&xšœ‘3<wã«¿^ù0\î‹H‰ó\'ƒ)\Æ\ã¹ô¾µ\ÊÀ¾I\ÜT:tñ\ÏjlcŸjvw7^=qI¹;³\îpø:T`¡t€+30\\\í\ÏA\ÎO¥\'Œfž«\Å.*lz§¯b»TG­[)‘\ÍD\Ðñ\Æh1’Ô®E(OZDAæ¶‹™¸\'¸ñ u+>ö9}\Ù+\æ?Zˆ®$R¬»¾ò²¶?/Ê“X\à\ç\0úS_\å@\à2ni¤sJMI\Ål$™‘ŒŽK1\Ï,\Äôú\Ó~c˜Ž V„Z<¯ Y‹Fq»\ËD\Þø\ã9\îõ\É\Èô«/£†’q¼©›\ä\å\àC\äMI-\Ù\ÇRº‹µŠP¾\ã´õúT®ˆyf%•#1Œ…a”\ä¦s\Óü\â‘b_´F¥¤m\Ç<ó\Øþ|~5j\ÇÚ–\Å	 3)\Üs€¿\Ý\ãH¶Jpö­^¬:H89ôªL\åšä•ŽÀ~6¼ðU\è‚o6\ãF•¿{91üh?˜\ïõ¯£¬\ïmõH®­fI •¤ˆr„W\Ë\"K\Ã(9\×uð\ß\ÅrxoP]òBtË—ý\Ñ\'ˆd?\É[ô?Z\Ö3\è\Î<U/z\'¼”SUƒ(*x#Šp\éZžpQE\0S[¡¥¨g™!…å•‚¢)fc\Ð\Ô\Ð¾‡ŸüTñsh\Z*\éör\í¿¾Ê‚1\ÇüM\ì{Æ¾~T\Æ1Ò·|Q®?‰|Iw©±\"6m)\ãlKÂ\ê~µ”‘ó\Ó5\ÅR\\\Ò>\ç*Á*S{½\Ålg{Pˆq\É\çÖ¦’,H\æù}F*D¯µE\ÏUh\Èq´sOP8¨\åm\íÀ)to”Œ\Ô\Æ\ä\Évó•üû\ÓLeŽ\êž\çŒôö=þ”ö\"‰M“ŠˆŒg5e\ÅW“;gþ”\Ðæ•®D£!\Û$`WKcaÀ··¶„A:¢¼³Wxwõ‡8\ÜNWÂƒžµ\ÏÁL°À€&nNO¥m\ê\Ú5Æ™§C{\æ3K\Z¬lü\Æv‘µx\Îzp}±S\'\Ðñq\r7f:{ô²I\í\ì<»uŒ#\Í*1t\Þ>SµOs\Ôæª„Öž%Ì‰\Æñ Y°1“òõÁ\ÆNz\ÒxZ\Ú;\ÝF\ê)\Éò…©$ ŒŒ\ro\É™£Xž]®\í	 ƒp0@ Ž0~ŸJ\ÊSä•’»8\ç)8õFts¬\í2^(ŽWeó±•U\ë…ÿ\0MP¼\Ó\å\Þ6ŽUB»”†\ÇÓ®E]\Õm\ç\ÕVTgiDy@FN‡\é\ëQI{\Ø\ábrÛšEl2ñùýõ­)\ßsšW2\ÑÄˆÀ®\nœuÿ\0?Zi\à\â›\Äs©<o]§?\Þ)\Ï\Ãt\æºb*š)’E!^«\\OF\äjŠj\ÜMÒ®\Ç:w\Ðö\ï†~*}_K:mì¡¯ì°¤“þ²?\áos\Øû×¡Šù‹E\Ö\äð\æ¹kª§D\Ûg¼m\Ã~]\núV\Öe¸¶IQƒ+\0A­\"\Ï:¼9dX¢Š*\ÌFõZ\à>,\ëgKð|¶±¾\Ù\ï\Ø[¯®Þ®.?\ZïºŠðoŒz™»ñe¾œ¤ùVV\áˆ\Ïñ¹ÿ\0\0?:Š’´Nü®‡·\Ä\Æ=7<\é\0ö¡en\ÒÎ}s’*´Jª\ãw\åV|\Ã$(ò\"=Ow\Çb==«‰3ô	;;\"O.\'‘\Ú7R	\Ü1\é\Ø\ÓfC\å\àwqøQöL 1²sý­Ok¬+þµ7¹““Š³*\ÇnH\èj\ÄVM1\Ål[\éžn6þ^µ\Òiþf€6\Ün\ÆO§±­lá­ŠP\Üä…†\Ô\ÚO\Èý}\ê´\Ö\íIµ\èo¡”RJcŽ2+›\Ô\àŠ\Õ\Ê\êƒv	\ÎhpfTqªRÑœ”«Œÿ\0R[{0U2M^{¸\ä|\Æ\ZS¸\î8Ç±\éQE$vº•­Ì‘“\ZH¬\è6ô\ç§Ð€:”Žºµ\ïdUyBÊ­òñµ‰\äc¡ü0+N\ëV¹¹\Ó`KË‰f^$U\àn\î\ÝO\ãŠÊ‘p\ÅÑ·FX…u\ã\'?§Ò¦‰–[so+*\á‹D\Ä\à=AôŽ{R’\êgV”j(Ë±³\àµk\ÓG#¦\æ¶!\îžÞ´ž!Y¢ñÎ¦\ÒS:Îƒsm!A$z?Zt\ZM¼°\ÚA\ê\' ½ð\ÂNK9EP:÷$u\ëVD·¦ò»¶i\î’‹2¢\áƒôƒ\É\àôƒ\Íc\Ëyó#Íœœ*\Ê[ \Ômþ\Ïáˆ£!2n‹\Z\à1\Üÿ\0\ÓKHû0óš\å+mT‘\Æ\Ünéš’O´^•[¹óVt‹ý\\`Á<\Çÿ\0õ\ÅQ¹\Þ$x\å û¼/@aŽ01Z\ÓZ8\Ü\â³qwÐ­|6•¡!‘²r@ÿ\0$S[ #¡ò»†1“\Ô{\Ôvü\Ú \'%2¤\ç\Ð÷ý+¥hJøZ\Z§š±æ«žÔ°·5F)j[t\Ý÷W´|$\Ö\ÛQð²\Ù\Ìû¦±o \çû£\îŸû\çÂ¼e\å\"º…\Z¯\Ø|osd\Äùwp’m\ÈÀšqfxˆ^\ÐtRc>´VÇ˜#t¯—¼_zoüo¬Íœ\æ\í£\ì\åÊ¾ \á	ö¯’\Â\Ü^\ÜÜ¿\Í\æ\Èòt\å·­a_c\ß\áõjÒ—ÿ\0,‡\Øyr	ý*\ÔI\Ðzšª%U9sóI«vò\Æ\Ò(\ržõ\Èö>¹\"Ú—Ž´ñdn4D¬©\Èq\Ûÿ\0­B\ã±\Íhi\Éû\Â\Ø\é\ï\ÍJ3­%6.s4·)§´{n\Î(r:o\å]$þ&\Ó|%v¶\éú\Ö¹70¸þ}\êÖ•o¨Ï¥iÑ”Ž\êör<ó\ËDŠ¹$~œõ\Åwÿ\0\r´+uU‰Yð¡[\Ì9\'ó]0Œ­¡óX¬M>eÏ·c€\Ô<]¯k…\Ò\Ê\Õ, d\nÁ\×s\ê=+\ãF(Z\ëS\îf,9“œñ\Ó\ëw\Ú=”T\"0Aúñýk\Êu[™n\'c( €>R0b¦¥\Ö\çVÓª\íddN\Ê0¨0ª8…P\ï\È?Ê®L\ÃwªO\Ô\Öhú\Å%bº1„\åT0\ê\ÈO\Ê\Ô\æ\Ù(-$\n÷_©¦IÀª\áŠ6\àH>Æ©k¡\Ç4é»­‹±]Š£—h>\ë*ð\Û;€{}3j´úõ\Îô¤y&K¯<#\à³ap±\ê01ŒV|dLŸ/\ßU\Ë/°\ês\éU\ä#<sIC]NZÔ©\Ô\\ñv.¶­%¼QC ¥¾DR¨ á³¸QÏ¥gG©K f“‚[“\ë\ß5/1!\àò\Äð*x\"Š\"²\î:n\è>‚¶QKcÍ•>y.Wr\Ô]Ý\"\Â!\ã{\n³q§y0¤©<Š\ì1¼óŸ¨ª\Ë?9Ú¦7n\èŽTv5HÆ¤P\Ü\Í…»\n½ƒ¨ùOøU\èœuÈ¨IV_\æS\Øò*·–\Û/m—Œr\Ð÷\îÿ\0…QÊ¤m\ÄE\'‡oZ\Ï\â—*66\Ü\íoL0\ÛüÈª\Ü,°	ø\îOoþ½PŠ_²\\CyÈ’[…‘}•X\æ)%bþ$\Ñö³\ï·Fö¢«\éO\æXF}@4V\Èñ‹7ñ\ï\'û¦¾Gµ,,Xui$q\Óòæ¾º”e{WÉ\Â\Ö÷÷|gsÛÇ€Aÿ\0XV\è}¿z\"¼˜ó}x©¬¿\×\ç\Ð\Z¬[-Ÿ^~•b\Ìþô\çû¦°±õWº6a#5~)H„sYQ·\"§óŠ\È1Ö’\Ü\ä¯\âÎ§NŸ\í\Þ<\Ð\â¬‹neT\Æ\ÒXžO~{nÈˆû }\rx_	ºø³nòÀÁÀ\ì­\Ç\ë^\à×­vR\Ö\'\ÈfZTŠò9›{\Ö\îõº’@ œ\ÅÃŽœÿ\0J\æ<S\à{K]\"\çQŽöm\Öñ\î\Ý\0õô®\ãH€\Û\Ãt\ì0\Ó]\Ë.¦\â£ùVG§ø2ø“‚\áR\Ãü(œ\"\â\Û#\r‰©\Z\ÑPzhy6\áK¿=Ð¶š8D\0Ò©Á$ž8\ï\Å[¸øc\â\Éò\Ö\Ò`?¹>	ü®\ãá¯“\á¹.Yp\×7‹uÊ¨ÀýI®\Çr’pAÁ\ÇÒ¢S‰\èbsŠð¯(\Ãc\æ9,§7­d\"f¹y^X\ä–Ý·˜¢ÿ\0A\Õ\ì¤»\Ón¡‰z\Èñ£\êz\Õ\Ôi¶\Ûþ,$Xûºœ­ùjõ\Ùÿ\0jxoQ³\Æ|\ëg\0z¶2¿¨œ)\Ý6vb³\'NP‹[¥sæ¿™6\Èž	ÿ\0–jwH®m\æ˜É†FQ\åª\ãvs’l`q\ï^\×\à(ü¿é¡€!\Ã\Èr:\å\Íy³2I¨\ë¶¢\Ê\0À\ár:zU8\Ù\\Æ–\'\ÛVpKcŸ\0(Â\Ðv€ð>oÎ½_ÁzF›s\ái®´\ëI\æg“/,*Ä\ÜrGµA‘¦?‹5ˆ›Oµ0\ÇS\É]ªNr@\Çzµ¹ŒññŒ¥¾\Ë\Ãž´¢b:\äW¡jz^›ˆ¬aŽ\Â\Ùcx%fQ\0\ãnJlúnš­•±¶Ç´k\Í5’®15{npñH\â¬+vž\ÇÒºŠ\Ìj–IV\ãæ°W²÷\Åo\Û\É\nN!B»\Â\í\ì(±\Í\í\Ò{}(RÁ‰Ù¼\áð~ÿ\0ýlVe\å\Ã\\\Ê\ÎWoËµP«s\Ä\nk\×F»P@²£ük\Îº¿‚\\ù’¢ñ\îØ¤–§u).G#\ìO’tˆ3\×h¢¤Ñ“fŸ°\Å±\â\Ës@\×\Ë>,¶:WŽuˆ\Çv\Ò(#¨oœ:ú“9ü«Á>2if\Û\Å\Ðj\n¸Žö\ÜG÷ÐB+\Z\Êñ=Œ’§.\'—ù‘\ÂÌ‘‹™\èN\å;vðy\éõ$~$i\Za×¯N5D¶±É—/l#Œ*òGÓœ\Ôññ˜\ä7%ºôþU\ÊÏ³ƒ\Ò\Ä\ÈÀwÇ±§0\Þ\êC}j±x\É\à²\äÆ”K\Î;œ\çú\Ò*pº;…\é¿Æ“¹\ä¤rsô\n?­zó\\\íÕ£¶\Ï[v“F\ÅyO\Â4ß®_\Í\é~¬ô®ú{­¿m­ó÷´\É\å\"\×mhŸ™G›\×dl]\\æ¶Œp\ÓM€=‚’Oòü\ëø©q\åxI@\'2]\Æ0;\à1­«Û3\ÆúE \'	kq;\ãª+Ÿø‘\Û@\Ó\ç\ïQŸ¦9?‘5SwG.\Z<µbß©\ÐxjÑ´\ïiv¥6•·V~x~cúšƒ\Â÷\çS\ÐR÷v\á4\Ó2Ÿo5±úb¶Wk \È^Ÿ/ðô¬\Í#I´\Ðt¨4\Û/7\ìð‚\Í}\Í\É\'®­RMX\ÆSRrov\Ï6\Òmÿ\0\âô^.?\Õ\Í<Ÿø\à?û5z‹1Jà´«rŸõ\ÉOð\Û\ïð5Aÿ\0²\×c=\êE©[ØŸõ“G#\ì˜\Ïó¨¦½\Öu\ãd\å8Û¤QJ\Ò\Ñ4½.$\Æ\Èª\ã°\ÜHþuóÌ’ù\âyø>eÔž\çžõô6©7—g<ƒø#fü†k\çmº|C*wn<u\ä÷÷©ª¬²¶ùÜ™\ìþ\Éðf˜ñD\Ïù»Vm”¡üO\â	;^ÿ\0$\Ïõ­øcJ\Ò\Ö?\ÕrsšLŠ÷z\å\Îs\æ_?\à\0-h¶G\åyTg+ñ]÷\ÖHy\ÛŸÍªþ–|½Á{TŸÇšÀñ\Äþv¶ª:G\0ýI?Ò¶|Ï³iˆ?\ç”ü–—r¦ÿ\0waxa·\ë\í\'m®\Çñ\ÅvÐœ\ë^a?\ê\í¿›õ«Šð’¥\Ï\'÷bó5\×Y1“Q»b>UH\ãúðMJ\"z³\×\çó5\ë\Ö\î±@\0*÷‚ôÿ\0´ø‹OR	>r·\Ð/\Íý+.\åÚ­\Ã\\±>\ä“ü±^ƒð¿LûGˆLûI¦\Ñþóõ….§K—-6 t\ä\Ùf‚Šž\Ù\Z¯ ¢µ<\Ñk\Ï~-\è§Tð‹]Æ¹šÁ\Ä\ã½~\\þ\è•ðEqo$2 h\äR¬¤pA\à\Ô\Ê<\ÊÆ´*º5cQt>I·p#«e\Ãõúzœò*\ÔO\"\Ã\å´9\ÜNO˜?\áþ?Z›Äš$¾ñ5Ö”\á‚Fù…ñD~\éþŸQPi“\"\Âø\Ú}}k‹m÷¨ªÁN/t3\Ëfr¨\ä\Ïô\ëNKqüw\"<`‚©“\ï\×Þ§¼\í\\–I\ä}>µI\ß#\0}©Á9-d\Í;bÿ\0Cv¹\Ó/d‰œ•yO\\\Æ1ZøóX]z\r^á ¹¹†C&À\Êqœ\ã¿\Í	¶“\èFõ¨Šd—~E\î\Õ)IT\ÂÑ¿½ß©\ßZüHq\â·Ö¯l)¶\Âe\áy\É`OZ»ñI\Ôõ\íúk[¸b\Ó\ä–GC’Ì›F0F{×™f“­W¶–\Ì\ç–U‡“\æK¥´=‹^ø¡_xoP†\Â\îaw%»$Jñ20-\Ç¶MK\àŸ\é1øKO‚ÿ\0Y·[\ÈÕ–O´Í†û\Ç-×ŒW‹ž•¸#\éU\Z\î÷±\Ë<šŠƒŒ[=\ÃJš\Òˆz\Ý\Ô7PJ­en\ÒE!ŽNpAç ª>!\Õ>\Ëñ#\ÃQ‚6´r#ñ‡\à~ W‹’¥~lSZf2Áuô«Sº9e—\Æ\ær\éc\Þ|_1·ð¶«&\Î??—ú×€þ‹ÿ\0\Ó?\êji5Ë„hM\ÍÌ¡‡\Ü2³\ÎOªø+\äcŠ¹;³5Eµs\Ûlo\à¹Ñ¬\çó@˜\0\ç‘õ¬ka¥\Ø\ËH®^i&w\è>cŸ\Ðb¼\æ\ÓV¿Ó‰ûÜ±)þ\0r¤ýþ¹©j”»ºgO\î*Ÿ®:Óº8*a¥õÑ‹ª]W_‘Ó˜\å\"U\Î3ü\Ít\Z\Ì\Þ^—rHþ£ñ\ãúš\âDŒ®I•)¸¹œ\áç‘<‚\çÈš»It:¿	¨Ž\ÚyÜ®À\É8\àþ½t\Ú–\Ñ\Í\äJ†f\ä \à\ã\Íp¶vûŽ9ü…j`F\'27Eô÷4	Ás\\Š\Ý$“¼’ÁGÒ½\Û\áVöm*;‡_šc\æ“ü¿N\Zñ¿iój\ÚÕ®œ\Ñ1V\åOW¯\Ó?Ö¾ Ð¬…‚¨P¼t¨[‘ZjÜ¦­´UÁA\éE\æŸ<\"úÖŒ5K8÷\Þ\Ø\Û@\ËIñ¨\ê+ÁRB%6Iùú\×\Ø. ©¥|õñ;À\ç\ÃÚ™\Õ4øöm\ËüÊ½ ž˜\ì¤ô÷\â¹\ê\Ó\ê{(\Çr?c=ºó\ím!gA™£\á\Ç|óš\çI\à\äz\ÕýP·;dp!—ýcS\ë\Za·6ý\Ûp}sO	¨K•\ìö1]¹\"„”«+ô4\ÇR¤\æ£\Í49O¹`þð\ä}\ã\Ôv?\áI\Ó \ÔJ\Ø\ëS‰Á\\0\È\ìsÒ†…mP\ÓPHpx©F$ß—Ú«Ç©\äž\0ü*&šÿ\0WbW\ä9\ï\Ô€?Z¨\ÄÂ¶!?„Rkû¸Ü¦B´˜ùPŸSÚ“È…f“\Íb>\âd(9\î{ñü\é..¥¸rò¾\æúüª¹r}kt6~ó¼\Ý\ËS^»\Ä\Ñ.\Ø\á\É\"4\\(\'¯ù5žk’A\ëùÓ˜\Ô,j’9ª\É48üÜŠ…³Ò‘˜Ž†•J¿\Þ\'>\Ã4\Ò8\çS¹	<zÖ“LÀ\ãŒòj8R\Þ<§<,6\Z¼†\æÿ\0\ä[gýRt#Þ¨\å¹a&òl°\Í\Þld/\ÓÖ¯,	glH%¤\åœõo­Z\Ó\ìRK°(\Ç\'\Òx3\ÃO¯\ê‚þh‰µ€‰H\á\È<~4\'++—\Ã?5µ¸»¸B³Í†9ªõú×­ª…\\\n©§Y-•°A÷Rj\í4r7wp¢Š)ˆ(¢Š\0J¥©iÖºŒ¶wp¬\Öò¡GFU\Ú:\Ð4\ÚwG\Ì6ðUßƒõÀ<\Ú\\­ˆg<\ãý–÷÷\ïU¬/EÕšZ\Êw\àdó\ì?\núkS\Ó-uKl\î\âI •v²H2¤Wx\Ë\áÖ¡\áK‰/ô\Ä{­/9*>i!ÿ\0\Þ_~¾µ„\éõG¿…Ì¹\ã\ÉQ\êr:…“@Ä®\nÿ\0*\Ëe\Åt–wð\ÞD#vô\é\ÍR¾\Ò%Ui`ý\âƒ\È\ïY8´zÔ±)û²1òE1›\0\Ó\Û9#}ED\ÔD\Úr\ÓA\ÐKò]&\á\ÈF\Ç<\àŸñ¨[!±\éK|÷AüQž=q\Ïø\ÓY³Ï¯½kmNJ\Éß¸\Ó\ÍDx\ïO\'Š‰š©NCX\ÔLi\ÍÖ‘c.\Ø\0\ÕjT26j\âÙ˜6aºi\"N\äúŸaWm`Š\Î\Ù\ï.s\å‚®9c\è*}.\Ök™\ÚöuGE\Ç\Ü‚©|ª6Ie¦­´[G\Ï!ûÏ\ÐVÅˆ\Þ¯_ZµmbI\Ëq\êMtú\'…®5GP\êñÛž p\Î==…U’\'™Z>…7ˆ\î\Ä†\ZtMû\É\0ÿ\0Zº?Æ½\×\Ãú\Z]œH‘ª\ápŽ{Q¡\èúe´j± *\0P£EnŽ)\ÊnB\ÑEQE\0QE\0QE\0\Ç*•e{Ô´P•ø¿\á=¦¤\ï{¤evy`‹û§>\ë\ØûŠóû][Ã³yZ­«\ÄUù£o£C_P`U;½6\Úý&‰YXaƒ( \Ô8&u\Ò\Å\Î\Z=Qó‘iú€%°ÿ\0\ZVmÎƒ*’ö\Ò,©\éÑ‡ø×·k4k™Zk4{W\'?\è\îUïžŸ–+ˆ¿øeªX11Cö\èÁ\ãmÒ£’\Ç}<™\æ-\Û^£J¬ ›Ž@Á\Éü¹®šUð\íÔ˜º³¸³pªDÝ€2O$rrx•6££]¢´w\Ú¦#\\\Ëü‰\Ï\ãXòµ¼ f\îö\Û>3\Ç\æ)¥b*\×R|\×h\Ú|°—’DÛŽ\Ô#?.x\É8\çüj´š\nyR\í\n\í$±(70\ä°\×T\çý‘þ\äyd#\Ê\Ô&Ÿþ¸À_ª9\ÝY1ö	G!®P\ã\ÐUˆô\ÛkH\Þi\æùuÿ\0¯ô­\rZ\Ôfb·\Õ6\á¤{e‰G\àÜš\í­~\É?“ i\Öd\ä<\à?>»G\ÊÒª\Ç<\ä\ßS\Ï\í´»­V\å.&‰£·Oõ0\ã•§\Ü\×g¦xvW`3\Î9#Šôm+Á\Zu\à\0X¨\\û\âº\Û\r\Ö\ÍG\Ê÷\âš\ÐË˜\áô?e„“!8\é‘À¯B±\Ò\à±@Ao\\U\È\Ñc]¨¸ú	¸QE\0QE\0QE\0QE\0QE\0QE\0QE\0”\Ã\Z?U\ëEšu´bQôN_YK÷¢\ê3EÊ¿ð‰i\å³\ä§ýò*x¼7eD\ØQE\0ZH´OùdÖ­Goc€QE %–Š)€QE\0QE\0QE\0QEÿ\Ù',5999997.00,'tÃ i ','taik3#amil.com',147258369,'tgyuhij');
/*!40000 ALTER TABLE cart_bongda ENABLE KEYS */;
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
