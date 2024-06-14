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
-- Table structure for table `cart_aoquan`
--

DROP TABLE IF EXISTS cart_aoquan;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE cart_aoquan (
  id int NOT NULL AUTO_INCREMENT,
  productName varchar(105) COLLATE utf8mb3_bin DEFAULT NULL,
  size varchar(45) COLLATE utf8mb3_bin DEFAULT NULL,
  quantity int DEFAULT NULL,
  price decimal(10,2) DEFAULT NULL,
  image longblob,
  `Name` varchar(45) COLLATE utf8mb3_bin DEFAULT NULL,
  email varchar(45) COLLATE utf8mb3_bin DEFAULT NULL,
  sdt int DEFAULT NULL,
  address varchar(45) COLLATE utf8mb3_bin DEFAULT NULL,
  PRIMARY KEY (id)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8mb3 COLLATE=utf8mb3_bin;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `cart_aoquan`
--

LOCK TABLES cart_aoquan WRITE;
/*!40000 ALTER TABLE cart_aoquan DISABLE KEYS */;
INSERT INTO cart_aoquan VALUES (6,'Ão Mainoo','XL',1,1999999.00,_binary 'ÿ\Øÿ\à\0JFIF\0\0\0\0\0\0ÿ\Û\0C\0		\n\r\Z\Z $.\' \",#(7),01444\'9=82<.342ÿ\Û\0C			\r\r2!!22222222222222222222222222222222222222222222222222ÿÀ\0\0ª\0ª\"\0ÿ\Ä\0\0\0\0\0\0\0\0\0\0\0	\nÿ\Ä\0µ\0\0\0}\0!1AQa\"q2‘¡#B±ÁR\Ñð$3br‚	\n\Z%&\'()*456789:CDEFGHIJSTUVWXYZcdefghijstuvwxyzƒ„…†‡ˆ‰Š’“”•–—˜™š¢£¤¥¦§¨©ª²³´µ¶·¸¹º\Â\Ã\Ä\Å\Æ\Ç\È\É\Ê\Ò\Ó\Ô\Õ\Ö\×\Ø\Ù\Ú\á\â\ã\ä\å\æ\ç\è\é\êñòóôõö÷øùúÿ\Ä\0\0\0\0\0\0\0\0	\nÿ\Ä\0µ\0\0w\0!1AQaq\"2B‘¡±Á	#3Rðbr\Ñ\n$4\á%ñ\Z&\'()*56789:CDEFGHIJSTUVWXYZcdefghijstuvwxyz‚ƒ„…†‡ˆ‰Š’“”•–—˜™š¢£¤¥¦§¨©ª²³´µ¶·¸¹º\Â\Ã\Ä\Å\Æ\Ç\È\É\Ê\Ò\Ó\Ô\Õ\Ö\×\Ø\Ù\Ú\â\ã\ä\å\æ\ç\è\é\êòóôõö÷øùúÿ\Ú\0\0\0?\0÷ú(¢€EV½\Ô,ôûvžò\æ(\"^¯#…ñ5Ák_4K\Ñ\é\É.¡(\à#ÿ\0¾_ÀRrIjmG\rV³µ8¶z) œ\0=k\Ì<mña4-Sû7Iµr¨ýõ\É?»Žp£H\àŸË®q\ç\Ú÷\Ä-w\Ä%£š\à\ÛÚž<‹rUH÷=O\çŠ\å\ä\Ý \n@\0\n\ÆUº#\è0y¥YüŽ\Èü\\ñKþ•ûq\æiñü\\ñ2žnm\Ø\Æ\Ï\äk‡\Æ/•þ\Èü«.yw=\ï\ì¼-­\ì\Ñ\ì~ø¼oï¢±\Ö\í!À¼°ŠÇ e\' v\ÎH\éœWªC4S ’\'WB2NAòt(Pü§Ï¡­\Í\'Äº–Œ\á¬\ï&€\ç\î©\Êªž?OÆ®5­¹\ä\âøuIóPvò>™h\é^M¤|\\‘6®­h²!\à\ËoÁú\í?\Ð\×{£ø³E\Öð¶W\È\Òã˜›\å\Èó[F¤e³>w—\â0\ïßŽ\Í\ÑÒ”\Ò;Qš³ŒZ(¢€\n(¢€\n(¢€\n(¢€Š¯yu•œ÷S°X¢B\îO`MOž:Wü_\×\áS§\Æ\ÄO~|¼»-Ÿnß);+š\á\é:\Õ#\Ôòxž\ë\ÄzÌ—wr•B\Ä[\ÂI\Â.xÀ\è:ž\ç5Œ£¨\'9\æ³\î[pHA\Ïb5¢\Ç\r‘\Ó5\Ë+\îÏºÀ\Î)Ê”cnQÀ`Ô‰1@ü\ä$`q\×\ëO³’\ï!{˜L\Ð+$`Y{€G9ô÷®³Z“LKôˆÄ‘GMses!\Ü³n\00«)\Ç#!‡9\ëR’z³lN*T¤¡\Þ\æLž¼¶\ÕgÓ®JG,V\ïp\n\å•Â©l\Ç\\ž\Äj[\ß\Ïc¦-ñ%UU9&RF\Ñ\ÏQ\Ç\×=+Fÿ\0Å¶·Zˆ¸KˆšUƒ/¨C+žw\Ã±\Í2b( ¸´\ÝW–÷W\É\Z*2\09*°z¤£\Ô\âusirèŒ›\í÷JDk¸\Ðb™Imp(\Ø<0­QÀ\ÎG?J\ì¬\å´Ô¡³†]G\ìB[Á±\ík»‰_+’v¨#<\äŽO\â&‰µ0‘ù&X\áX\î$B¤“\0wŒ‘\ÆA¨”RWGVR¤ý•H\ë\Ô\Ç 8\à\Ñ\èK•Œ6É¸d\ç<\ãt<}i\ä\0	¬‰—\Ä*	Â \0þ\\ÿ\0:˜+\ß\È\è\ÆUt\Ôb•ù¢>øŽ}oH{k\É|Ë›lbC\Õ\Ð\çþDg¾3Þ»zð‡\Ú\×öwŠ-\ÕÀH§Cc\Ð\ão\á‘ú×¼\ÅuÑ“”u>\'8\Âý_\ÔU“\Õ¢ô£\"µ<±h¢Š\0(¢Š\0(¢Š\0ojù\Ë\âV´\ÚÇŒ.—?¹µö\Î\ãÏ¹?•{¿ˆµ5Ò´+«“q¼›\n\Âòý\Ñ!\\þ8¯ñuÎ «•-§²¹Dt¾XÕž\á€’Ä’±^\0ŠÆ«\ÒÇµ’C÷\Ü\Í¢˜Hœ\×\ëþ@«®\ÙUa\ÜLÔ)8\èC.:žGÒ£…ü\Ëx9\ä®\á\ÅeöO£K“4º£\Ðl¾j7±«%õ¢‚ Œ†\èF{\n»\'\Ã\r\\W\Ô\í(\Â\æaG\'ŽI<zš¯§üHŸN·Š!¦\Å!B\ä\ÌFp1žœt®ÿ\0\Ã\Z\å÷ˆôç½¹Ó’\Òq	i\ê@ `ƒ\Ôô\éZF0{6+˜\Ð\\\ÓÛ¡\å\Þ!ð¥ß†\ÒÙ®. ™nò\ã\0œ\ëUü=\áùüG©5´\ÑD\ë—t™ €FG\0œò+£ø¬\Û\Þ^\Ûi°\ïfX\ÊÀð¬À\r£\Ü’{p=qƒ\á¯7†õc~–\ëpLmFr äƒœ€}+(©Û¡\ía\ê\âª\à}§\Û{,?\n5u!“R³p\Þ\í\×§ÿ\0ÂªÕƒû}>øÊž>1´ —\Ò!PO\0ÜœŸ Ûš‚ó\ã\\\ë	0\è°\Ç&×š\à€=ö\àøVª4\Ù\ãO™\Ó~öÿ\0#\Ä\Þ»ð¸µ7w0KöÁDY\ÈÛŒ“=Eq\Ò\Ç\î¡y.ò‘c!@-‚Àd@À$g\ëZšç‰µ¿\\¬Ú”\í\"&DqÆ‚\Ô3Œó\ÎOSŠ\Æt›K¸\0C*:•’\"+)\à‚	\É×‚1ŠJ1N\ÈÖ­|\\\è\ÆrZÇ©©°Û„¶û•81–p\Ç œ\ÜAñ#\ÄòÙ´ƒP‰J€`\\žH8\ã¶2rG^+€‚;;\Ò>Ár°9ñ\írÀ}C…o\Ç\ëÖ¥Š\ÊöEv\Û\åDŒU\å™\ÂF¤u‰Á?L\Ôr\Ê.\Ñ;\\.&œ]k6»µ§\Å\Ï[Jd¹0\\Ä ’‚ ¹Ç¸®û\Âÿ\0t\ÝV\Þ!¬4ZU\Ä\É\æB“I$yÀ9\è	<\Üs^÷öG\íž\Ï\"‘\nž\ä)\æB=N±ª\Ï\Å\ãµ\Õ\Ý\Är\Ï\'%e¸íž˜À\è¶ŒœW¼\Ï+„§Š°°²]¯!¸†\â!$G*ŒŒ~b¦5òNŸ}¬\è\ì%Ó¯.m:¨¹;Oü»Wc§|cñF”Êš’Z\ÞG\Ø\Ï‰ˆöu\È\Ï\ÔUª‰ž}l²µ=l}K\\…þ*i ºŠ\Æx¥Ó¯e\â4˜†IO¢¸\àŸcƒ]\à9I®‡\á(;IXuQL“\È>-x–\æ\×Q²\Ó,§1´K\ç\ÍÀ ’p ‚\ã×—_j\êWò\Ã2‚	‰>¤3\Ç_zúgTðæ‘­®5-:†\Æ2\á€öa\Èü\ë‰\Ôþ\è÷%ŸOº¸³n\È\Ç\ÌA\íƒ\Î?\Z\Ât\ä\Ý\Ñôyng…¡N0œl\×S\Â\ïN\ë	ÔŒ¤Œt\ç½P\Óz*\ç\î±ÿ\0\ë^¥«|\"ñQÊ¶¿f¼VRªUöF9\Ýþ5\åz\\O\Õ\ÌŒ<NU†s‚	õ§•¨\êz2\ÅÑ¯Œ„©J\é­N«\Ã\Öpj\"\Ó\ì\îƒ%˜#…8$œgß§\Ó5\î7p]\r.K]2Xm&ò\Äq3)+¡\0q\éÁ\æ¾·»–\Î\ê;›y6MG\à•#¡Áâº­\â·¥_\Ý}®Ý˜,ˆÈ \àœd\Î{\ç¢œ”UŸR3l\\CU)´\Ôz\Z¦}¢\ê/k¨¦Ù\Ìv\á \'\ï\Ü\Ôúõ÷¡u/“nÏŒ‘\Ð\ç8ó¯\\ø‰d—>d%¤ªUñ\Î\Ö8#\é\Ðý@¯\Õ|z .{ò\0c¹\Ï5¦ua1Ò«ƒs·¼´*Á—\0¹—b*d\ÆY =‡`=ª\Ò\Û%³‰“\Ýùcøš¯¦¡[‰ó’«ŸÖ¬¤jñªœ–#9Ö”¤öGF„\ä®\Ø\ç289 \Ø\ëQy8\Î\ãþ4\í\ÈnŸZP¤œžEIÜ£ \ëkhbŸ\Îò!cƒ$a”\\	ãŒƒIy\Ûgqqq)\0\0ÁP=\0\0}*x¢nH\àž\ä\ãóÁ$zp1þú\Ôs»\îdð8võŠ+CiY\Îz“O•\â@$¾œÔ	\"4°’I­\Ë/	Ý´+$\Æ‰\ÂH~b`;f¢s²÷™mÒ¡hŒ­›!¤\È\' *\à„M¤ª®¹Áqÿ\0\ÖúÕ¹­\'´˜\ÇsF# ûƒ\Ü{\ÕwUPX<ŒñžzþT)\'ª4´g\é˜þC\Ù],Q\ÊD\ê“ƒ\ç*Àû\×ük\é¿k\ç\Ä~±\Ô?o—8¤^ó#?|Í¨\Å$±3 Ìƒ(v=¿Zõ¯ƒ:¨‚}KJ‘ÿ\0w<Ÿh}0\ãùÀ\×U)­™ò9\ÎÅ¹Ai\Øè¦ƒN®ƒ\æ„\Å´v ã¥|™­X}‡\Æ~!ˆ€\0¾”\'òæ¾³?t\×\Ì~=\n¾?\Ööƒq“õ\Ú3Y\ÕmDör:jx{ÿ\0†–»\á˜\Ñ\âŒ\îˆÁ(\n2<\ã®0G\Ô\Z\ÆÓ¾$z\ç—>¥¶\Ð2»ÆˆD¥I\È<\ãœ\Çn•\Çh>$½ð\íÙšÔ«\Æøó!“;\\\\r¡\ÒC\ã\Û;mb\ïW·\Òg[Û¨\Õe\î³	e´\ç\0¸Àüj Ò¿Cº¶B¤£CX\È\ì>$\Þ\Åm\á¡l|Ë¹UUs\ÈU;‰útx\Ô\ë\æ\ÜA^3ØƒZZ®¹{®\ß5\åô»ŸUaPg€£°\ï\ÎI=k1‰ó£\ç€q\Ïl\ÖS—4®g-Á¼6B{½YY\ËAp„‚\r¤Žù«r1QŽÀâ¢¿_ôou þ4ðÛ•N\ÐA\0\äGsµ{³q\èl\èZTZ¥\Û5\Ô\Ë”D‰7…`¤\à`\Ô\ãð\0ž¸¥ñe¶‘6o%¥Ýº³\"Ž\'H€ü¬\0ô\Ï#\ÜúW¡K>ã ©Cƒò’:q\Çù\æ©=\ZH\ÂT\':Ê«’\èYHÏ–r	$œúéª¬ “\È\Î1ž¼p)P–^¤``õ¸§Œ pqý+#\ÐL ;È¤e,”	\Ç`{W¤iŽyI)§ù¿t¹\ïƒÓ¡9¯7f!JœŽ:Ž*kmNö\ÑH‚FTldvL\ÖUió£…ö\éY\Ø\×\×Š\Ú\Å+Hn#\Þq\à.\ï”ù\Æ2k\ZC˜\È\ë\Û\ê@<Ò¼\Ï$Œò\È\Î\ÍÔ±\Ïóö 7\Ê\0ñ\ÇJ¨Ç•$mBŸ³‚Ž\æz\ä‚\'9\È\Î\0ôµ½¡\êhÚ­\ä9ÿ\0G`À\â\0üÀýA\"²\"\Ì\0\äŸ^µ\Ð\èZ„P<6±\èp_\Ï, b\å\È\'€¸û¤u\Ï\'ð­c«ZØŒkµ	^7Lú\Ò\â;«H®\"`\ÑÊ\Ôú‚2*\Ås\Þº¸–\ÆK{\Éb{‹y^<£d•€O‘‚	À\É\×A^‚\ÔüÒ¤ydÐ´QE?t\×\Ì><m\Þ=\Öÿ\0\ë\ä\È_O†¾^ñ\Ñÿ\0Šó[ÿ\0¯¦þB²ªô=\Þÿ\0y~‡>O\"¤¢\ïOS\ÍsŸbž·\'Œ¶2õ§K’‚1œ\ã>”\Ô†9\Ô\ZqBùYˆ\é\ÇJL\Ñ-]Œ\Ú\ÈÄŽFq\ß5, \ã\åG|z\ÒÏŸ²\Èxé…û*1\Îq\Ø\ÒF3v¨I cÐ“\ÜWm\à@,—Vf\Ö\ÎP¶\ÓÌŽðr\ê¹$§J\Éð…´z¡¾\Ñ\Ù#ó¯ ?g‘”eeO™FzŒŒ\ç\Õ\Þ[Ág©M-»L\Ñ[C¨µ¼ilóB\Û\ãnF	A\È\'§­\"µ¹\ä\æ•\Ë*N?2¿\riWv\Ö÷—S¼s\\w{¨\ãa—Àa´(E†	>¸©\âð¦˜\×1,º<ö¨ož\Øù—Œ‘„b²\Û$\é\Å$zV…,\Ïi*U³\Ý\Ë\Î\ÛJ|\ÄU,q\Ð œT‘\éþµ¿6›á¹¹ò¤¹€»\îVøD9`	œGsWe\Øò•j©róKC:}+B¸ÑšX4\ão;\é­z¯\ç—\Ø\Ê\ÛJ€x \à“ž´k¶¾Ò¯¦ƒ=ô‘lY\äó\ä½†BŒ\ÉÏ·\\\0i\Ú\á\Ð\ìô{¿°X\Ûž\á\á¤\Ñ)@N\Ü8\ç¥jjS\ê‰ º\Ð5kG¶»\Ù3DfEdpFô8EM•žˆ\Ú*«7\'g}ÝŽW\ÄVz/öN¨\éò\Ûù¯$SA+–(\ë\Ôô?\Ìb¹Á\Êó\Îzp+¯ñr´\ZV\Ýü7wóK,÷&)`\0\Æ;\01\ï\Íqù\Ä.Ä=‡\'ƒX\Î\É\è{\Ùl\äð÷“\ê÷õ(,¤Ž„’N=Oµl\èZ³\é7>û€$B’y\r±ˆ\Îqœdt=+\n\É$‚Æ¬òU“Ÿ@9®\ÏGøw\â-R5)jm#n²\\6\Þ=@\äúv¦¢\Þ\È\ÛˆÃªmV’³6|\â‘oâˆ¬\Ò\Êk[¢cf\ê\ì\ÝT–\'$g?‰5\í;yÞð¦\ÓNš;Bþ{É‘ƒ_‘=¹<ßµz.=ë®š’ZŸšT\ÃÕ­Í‡\Ø}QZp†¾Zñ³nñÆ´Þ·Mþõ!\é_+xµü\Ïk-\Ô}²AùV5¶=þ_¿“ò1‡&”i£©¥¶+\ë‘jf¬gŒŽ>•^Ò¦\Ï,\éŽ\Ä2§˜Œ‡£w\0_&ªŽø\Æj\Ëuª÷\'R;ÐŒj\Æ+\Þ\êMi#ÀU\Ñ\Ù•ÔA\çÈ©Áwnò@9<““\ë_z¨¤¸+\Üg¬`3u\È\Îzd\Æ	\ê\Ñ<DÁ9\ã,I\É\éR\"…\à`\ã\0þz\ÕxÝ™\0g\'×­J–œ`ý=\ê¬b»€R\Ã\0‘Œ‘\Ærúô\0 – 7@8š`2I<ü\ÓC\í;UH\Ç\\T•Ê»2\ç$\08\É c±­o\n\ÇßˆôØ¤P\Ê\×HH\È#®=ø¬|Ÿ/®NükcÁ£o‹ô¬Œv€ô<\ÕCY#—\î\á¦\×f{Î—\á\í#F‹fŸ§\Û\ÛX\ã\0ŸÇ­j€\0 t¥¯E#óYI\ÉÝ±\0´Q@‚Š( ž†¾Pñ)\Ý\âXÿ\0\Ó\ä¿ú¯«\ÏJù3^m\Þ\"\Ô\Û9\î_ý\ÖU¶G\ÐpûJ¬\ïØ¢ƒ“NTù²iªÀz0\Î\rs\Øú\Ø\Ê/©\"ñš~N1LR0qN\ç?…+)+_j«sþ¶3ŸO\çVNÿ\0•UŸX\ÅV’q±:m\ã?ü\êE,\ï\È\î?*b•P	9 zóýjB\Ä=FÒCa\ÊN\îz\×\ØU„9 \08<g\é\íUW/Œ`òG¦p\rYB dsÚ¥š¡\å[\äÛ½6B\Ä\àu\Î0=}j@\ÛÔŒœƒ\ßÓ½C¿Àòq\í\Î8¤ŠDðT¨\ç#“ßŠ\Öðx#\Æ:Y#\íI\ÏN¦²-\ÈV ‚IŽ\ßJ\Õð¼€x·K\ä€.\ã\ã\Ûpª‡ÄŽLr¾kÉŸI»KM_»N¯@ü\Ì(¢Š\0);R\Ðy ‘\Åy†£ð?\Ãú†¥sz·úœ\rq#HÈ’®\ÐX’q‘2O\êRi=ÊŒ\åb\ìy#|Ñ\ÝÖµEüPÿ\0J¾\0X\ç1øP_÷¢Cþ\ìTb‹\"ý½_\ægŽ€vã§‰\ïqÿ\0\\üi\áC[ÿ\0\Ð\Íø@ƒú×°\ÑE—aýf²ûLò1ð\Äc>#\Ôýð¨?¥p¾=ðM·ƒ5\r>+{Û«¡pŒ\Ìg\ÆWn0\0æ¾–<ŠñOŽC:Ž\ÆO•(ýV¢i(¶w\åµ\ê\Ï\ÊM£\ÌU2€’0;Óº†\n2O®FMF¤€[§eŽrN1\År\Øû\Èè‡©\Ø“‘ž¼ô«”\n$µTBI9 \É>žõf,+÷†8\î:óR\Ñq&P£ œ’9\ã\Ó5€	$Œž€}iÀ±Œ\0GµC&K|½3Á©F	\í\Üd’@Á>\Ù\ëZš\É\â}0©ûTDŸø\â²# 8`sž qW\ì%hµ­>S…U¸ŒúpU-\ÑÏŠW£%\äÏ§\×\îŠu5O¥(\é^ùp´QE\n(¢€\n(¢€\n(¢€\n(¢€×Šüs¼\Ññ\×d£õ\íU\âŸ\Øýu\"9\ê**|\'£•½Dò\èØ… ŒŽœŠQœäŸ¦i½zôýiù\Ï\Ìq€9¦¹¿OA@\äÁ#8\ÔT‘£y\Çõ1S’:ŒŽyü\êe ü\Ýq\Ôs\ïR\\IFXdýH\Çõ¨\Øñ–\É\ÏA\ß\èOKpHŸcD„…\Ê\à‘ŠF‰\é¨\Ñ$q\è^=ÿ\0Æ­D@º·f#+*œ¨ª‘\Ë\È’A\éWâ¿¹Š\ÒHÀ‹;Š\ìS\Üg’2([˜b9½“\å\ì}Dœ¨§TV\í¾\Û\ÕAý*ZôO\Ì¡h¢ŠQE\0QE\0QE\0QE\0!\èkÆ¾6\éZ”ò\éwö–7vÑ£¤¦,c9\0\'gò¯e ô¤\ÕÕ™¥\Z²£58n|te»L¼\Æý)¦\æ\ìdf\ÝcÇ’\ß\á_c=G ¨öQ=O\í¼Z\ê|uö»¢NtÛ¯o\Ü7øS\Öò\ì1#Nº\'\æÝ¸\Ï\á_am‚ŒAG²ˆ–{‹\î|z.\ï€ iwG‘ÿ\0,·\áOûn¢ýtk¢}­¤ÿ\0\núü\nZ^\Æ!ý»Œ\î|„‡Y|m\Ðu\0\ç\ÖNJ\Õ\Ó4\Ï\ê7±Z\Ã\á«ò\Ó0]ò\ÄÈŠ	\ä’@\0“×µ}OÚŠ~\Ê\"–u‹’qr#·Œ\Çn‘\ç%T.}p1RŽ”´\Z\Ðò^®\áEPÿ\Ù','eqr4tgyh','rgfhgn',147258,'regth'),(7,'Ão Traning','XL',1,1200000.00,_binary 'ÿ\Øÿ\à\0JFIF\0\0\0\0\0\0ÿ\Û\0C\0		\n\r\Z\Z $.\' \",#(7),01444\'9=82<.342ÿ\Û\0C			\r\r2!!22222222222222222222222222222222222222222222222222ÿÀ\0\0ª\0ª\"\0ÿ\Ä\0\0\0\0\0\0\0\0\0\0\0	\nÿ\Ä\0µ\0\0\0}\0!1AQa\"q2‘¡#B±ÁR\Ñð$3br‚	\n\Z%&\'()*456789:CDEFGHIJSTUVWXYZcdefghijstuvwxyzƒ„…†‡ˆ‰Š’“”•–—˜™š¢£¤¥¦§¨©ª²³´µ¶·¸¹º\Â\Ã\Ä\Å\Æ\Ç\È\É\Ê\Ò\Ó\Ô\Õ\Ö\×\Ø\Ù\Ú\á\â\ã\ä\å\æ\ç\è\é\êñòóôõö÷øùúÿ\Ä\0\0\0\0\0\0\0\0	\nÿ\Ä\0µ\0\0w\0!1AQaq\"2B‘¡±Á	#3Rðbr\Ñ\n$4\á%ñ\Z&\'()*56789:CDEFGHIJSTUVWXYZcdefghijstuvwxyz‚ƒ„…†‡ˆ‰Š’“”•–—˜™š¢£¤¥¦§¨©ª²³´µ¶·¸¹º\Â\Ã\Ä\Å\Æ\Ç\È\É\Ê\Ò\Ó\Ô\Õ\Ö\×\Ø\Ù\Ú\â\ã\ä\å\æ\ç\è\é\êòóôõö÷øùúÿ\Ú\0\0\0?\0÷ú(¢€\n(¢€<\ã\âg\Ä\Éüsgeec\Í\Í\Äm)iœ…E\É9¯#\Ô>0x\Îüüº’Z/÷m¡U\Ç\ârj‡ÄŸ\É\â?_\Ü<F¶o²Æ„\ä…BF~¤\ä\×(1Žiˆ\ê\Ó\âWƒ\Þ}iÊ·4ßþ-² ];\äó\Ö-‡óZó‚i¹  ô:E\ä‰³a6ž\ÍÁ™ÌŒ{ž\à~u\ë0\Í\Ä\Í¬‘H¡‘\Ô\ä0<‚+\âA\Í}oðö\â+\0hm‘\È\Ò4m»>þÔ†tôQE\0QE\0QE\0QE\0QE\0QE\0QE\0\åŸ>.E\á\ÛÉ´}&\Ýn¯‘q,\ÎØŽ\"GN9-üª_‹\åð”\ézYSª\\©fr3\ä\Ç\Ó8õ<\ã\é_:\Ü\Ü\Ü^]Kss)’i[s¹\êM\0Ufv™\ÝØ³»bO$“šqnƒ¾)[¹\êiù”piˆ3š)¥€&€Kœ/û\Ô\0¬\á\'\ÐWwð\ÏÄž#\Ð/î¿²­V\îÍ•d¼‰\Ã‰\ÆòW%zõÁ®P\'A“\ëš\ì¼-\âû=-\î\ì\Z…\ËE©\Ø6Ë˜\É\ë»?,‹þÉ ¤´O\ÙkAv\é\æ,,á„©ýø\Üp\ë\î:w·k\ÅA·º·Ž\æVŠPn‘\ìAQ&ß½qn§˜§N¯F®ÿ\0\Ã\Þ.‚]*\ãûj\î\Ö›¾u\Æð±M\Ç2g³ŽÝˆ\"Î®Š\á.þ1x\Ñ\Êÿ\0l	ˆÿ\0ž0»\Ï˜ÿ\0|\Z­…þ\Ñqm\æhÓ¨¯3OŽþln}A>¶¤ÿ\0#V\âø\Õ\ày©\Ëûö\Î?¥\0z\r\Ë\è_ü+\âKñc¥\ê\ÑMtAeˆ«)`:\ã fºŠ\0(¢Š\0(¢Š\0(¢¡º¸[KI®\îDŒ\íô?Ò€>Møƒ¨¾¯\ãýf\êF%V\å¡@{*|£ùÎ¹µ\êOaS^]=\í\å\ÅÔ‡/4­#v$ÿ\0Z¯÷cúšb\'\' S2\Ø#53* 9 ,Gv]³\íSJi´\0Uç‰¢Eþ#\ÍNj]\×Hº3@“ð\Úök“y \Å>Ë·\Û{¦3\ê.qÿ\0\\©õ®C\ÆzÔš¯ˆ¦‚’\Ú\Æ\'+\r³\ËIfO b\Øô\íUmofÓ¯!¼¶”\Åq‰#pyVŠ±\â\íN\Ï\Ä>&¸\Õlc05ÀI2¸aQ¿Û²\Z\0Á—rJ>bž»º–\â™vYP6\ÜÁ\Ïj®“ž™#Š\0¸_ý¡ø\Ò\Åš\Ù8ÜŠlPg\r(\É=¬oE-a@^ÕŸÃž °\Õ`@M¬¡ÊŸ\â^Œ?M}ƒew\rýŒ–\î\ãY‡u#\"¾%3\àˆ\Ì}û\×ÔŸuA{ð÷L‚[«in BRÑ¨c´0\ìqHg{EPEPX8ºûõ¹÷m\Ûg ÜŒZß®\ã-\Ó[|7½U8ó\åŠ#\î•\0|Àü\"\Ü\Ôd\æJb&n•ñŠžNƒ\éP 	\Z£MJ\ÕñPD	7Œd-5\Î\íÜ(Jd\äóLhŽqƒ\ê*\Î2)¸ \nl²lh\ä%\×\Ô\ÒCf°“)lÿ\0tb­2–;GRqO)ûÀ§<s@$rÄŸzrÂŠx¥´@Y²¼»Ó®\Ò\ê\Æ\æ[{„9Y\"r¬?U]‚‚OALI~PÇ½\0}%ð³\âDž)´X¨\ÕaM\ë( \êqÙ‡Î½6¾Dð>¢úg´{¤$b\é°z«¤~µõ\Ø9€(¢Š\0+\Ì~:\ÈÀ¦y{\ØøõÀc^^Eñúp¾\Ò`\ï%\Û7\ä‡üh\ç\Üüß…3þZSúÁM\ëÖ˜‹öúUq÷\ÅO/ZƒþZ\n\0•5~j™¾õ@ü>ô\0ñÒ„û§\ëIœ}ªõå„–)ld3F_‡=?\"?:\0\Õð´^!·Ž\àA–Áõ\ÏÖªkkWFEMø\Â.G\\~9ªV²\É\ï‰\ÙN\rF\í\ÍG/½\Ì_7¹\ÊK`‚MN\Ù[ß“Ÿj„¶ù$sÝ:+6\àp@8>•ùx« ž\Õa{¨’\âS,À<Š»ŠŽ\ç\ë§ñ-¯…\ÓD±“\Ã÷BI\ãb·\"F>d™„žµÈ–\Â\æ7\r\ì„B\0\ê\ÇBÛ°;/C|\ØU>™¥³?»”\ÐømL¾+Ñ¡PI’ú1þø¯®´K¶¾\Ñm.[¤ŒŠùWá¥¿\Û~%\è€ý\Øf3·°U\'úW\Ñ\Þ½ûFƒ]£Ž&G@\ßÖÎ®Š( ¼?ö¹\Ì\Ú®z,Ò‘ÿ\0|ñ¯p¯žþ>»i¨OÊ¶9\ê\ç?Ê€<‰Ž~´‰þ°}i¬yÞ¤‹™¿\Zb%“\ï\Zƒ?8©›’jùh(g\ê*G\Ëô53}ê†A\0D†fX\Ç%\ÈQøœW¡üBÒ–\r>;´\0y\Z½Õ™\Û##ù\Z\àô¯ù\nÙƒÿ\0=\ãÿ\0\Ð\Åz\×\ÄXh>#ŒË·‰Aô’\'õ %Œ\áûb£\ÎZ¤q\å\Ä¹\ä\Ôt,¹˜\î“Q7Zž\0\ÃqÝª\í@yZfpqO\Ãn\r\0W\Ô?Õ¡÷§ÚŒ[©õ¦\Ýüö„÷\ZH\ä\Ûl”\è	\ãÙ®kZ—k\r\"\â@}	\\\ç^õ\à$ò¬\æŒð\Éª‘\éþŽ‡ú×‡|?·0|<ñ…ð\âK¡Ÿ\ÇR\í‚?Q^\Û\áù„>$¿·Sò›Ç‡ŽŸ»‚!þ4†v”QE\0ó—Ç¹IñÅšvÁWjú6¾møóÿ\0#\í¿ýxGÿ\0¡=\0y[’jx?\Öf«Npô«\ç)»ýšb$=\ê¾|*s÷*ºÿ\0¯ 	\Øü\ÔÀy¥có\Zh\ë@\Zþ…^ú\âv\Æ-­š`O@C(Î½\Ç:Æ•sm\ãXµyg¸¾³ž\Ù\Ãy›c±Nõ\ä\ëž£›nŸý	 	fbò\Òc-Š\Í!4\ä\êM\0M.\à©XŽ*Õº™\"¹qü	“ô\ÈÖªž(ƒ­$£rP~õ;¨\"€*?0È§¸ªh\ìûv«7\'b°¨-3\é\Í\0{§ƒl6øÂ–~mW\Äf÷H¹ÿ\0\Ùuþ½\'\Å6\äl\Ô5}U—\è¡T\è‡\áGM~‚\Ëyc\Ñô{‹¹¶\È0²‘Œ~¼T:E\ÃY\ë? o•\æ[‹§þ›Áýi÷J(¢€\nù¯\ã\Éÿ\0Šúúñÿ\0BjúR¾cø\ì.W\âibe‰­c·gQœŸ\Ï#ð 3t2ºD¼³°Qõ\'\×x\ïG:‹\ï\ìv\íEò\Ù01QyüóT¼\áù¼O\ãM3M…‚ šV=£B~=¿\Zõ\ÚG“­Fªs[J@\ä‚7/\å†ü\éˆñ\r\Ý*ÿ\0\\M4\é‚>´ …$\ä\äûP\É\ä\ÑÞ¢.Vý)<ñŽ”iyF¦Fq!ú\ZXX´,qŽi€þô~42}\Â}je\Â\ÆO\áQ\' J’^Wñ4-£\Ö:ˆ?˜ª™\â¬Û°Oþ\Ò\ãõTt ·Z3µÁõ¤4‘@/…6Ë€M>û”S\ê)–_pýhENFEt¾\r¾˜x\ã\Ã\Ï4\Ò:\Ãy&ö\'b–\ÆzzW4˜\ÛZþ\ZR\Þ*\ÒI\ÞÃ‚;|\â€>È¢Š)+\Ã?h{F…|ªKþöÛ†þu\ît\É\"Že\Û$j\ë\è\Ã4ó?À\ËK¦øŠ·+m)·KYU\å\nv©8\ÆOJú\Ä>Ò¼S§\r^\ßÏ·W(T†#\êkN8£…v\Å\Z¢õÂŒ\n}\0y…\×À	Í“º…¹ÿ\0f`À~`\ÖL¿³Î”Í˜µ\Û\Ô7øW²\Ñ@(gk\Þ ¹ÿ\0Àeÿ\0\Zoü3­—ý3ÿ\0\à*ÿ\0ñU\í´P\É;ðŒ>	×†“\ã\Ý)…f2: œñ€}«Ž\rþ’£Þ½\ã5ÈŸ\â=úƒ\ÄQ\Å\ä¹?Î¼\ê\Ö\Òk\ÝR( s¹±\ìªXþ€\Ór–ö\Í2W\Ü\æŸò\á-\Üô¨3ó~4mU³\æo\âÜ }9\Ïôª™\â¯`.S\ØÈ«ùk<š\0\rŒñL-Ž(+Á›rGcQY}\Æú\Ô\Ó\ÂÀúTG†¤½+kÂ¼ø¿Eÿ\0¯\èô1X£¥løOþFýþ¿¡ÿ\0\Ð\Å\0}ERQE\0QE\0QE\0Ph ô ‘~#]}³\Ç\Ú\äÀ\ä}­}úS~\Z\éÿ\0\Ú>3t,š}Ó¨÷ò\È«S>\"Zÿ\0fx÷Zµ-»ý)œP\ß7õ®\Ç\àŽo<O©\êN3½¯’Ax\Èz~B˜.’PA \n3ž+g\Åz|:o‹5k+T)rG\Z\ç;Tf*\í\'ŸJ\0°]›Le\å\'ÜŒJ\Ï,3ŒóZ\Ôi²)a¸¸\ã×ƒT\Ê\äPa‡J\Í5\ç·\åL+Ž \Z\0I‡\î\Û\éW|?¢\\j–\Z½\ä\\G§[	\ä÷\Â\ãõ\'ðª\åž;W¦ü\Z\Ò\îõ]\Æ61\ÛH\Éw§lŽM§igž™\æ€<ýO¶ü\"»¼e¢¨\êo¡ÿ\0\Ð\Å`1h%hfVŽT%YX`©A®‹À\á\çñÆˆ¶ñ¼\Î/\"mˆ2p“@aQE†QE\0QE\0QE\0”Q@\'|]F_‰š±t)¹®\á\Ã`\äz×¤þ\Î\ÐHšµ3F\Â9.#\ã†\Âóƒ\ß¯]¼Ó¬¯T»;{‚:y±+\ãó5½¼6°,6ð\ÇJ8H\Ô(€ gWøo\á=r\êK«\Í\"/´JÅžXÙ‘˜úœk‚>˜±_D}R\äñù\æ½Š\0òWø\áö“+ªj!E;	üö\Ôþ\Ï\ÚCª\×/\Óý\èÑ¿ ¯a¢€<U¿g«Rxñø÷¶_ñ§/\ìó¦\äoñ\áõ\Û\nöŠ(\Î4‚^\ÓXIsúŒƒþ~¤ù\ï•À¯@µ³¶°µK{Kx 8*ÀTôPÇ¿,>\Åñ]ˆ)ö¦q‘\Æ\æþµ\Ô|ƒ\ÄE,0Ž\ÒS»t¢¾“–\Î\Öv\Ý5´2\Ý\Ð\çK\r¥µ¹&x¢-Ô¢\Ï\å@QEÿ\Ù','t','gb',1472583669,'rgh');
/*!40000 ALTER TABLE cart_aoquan ENABLE KEYS */;
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
