CREATE DATABASE  IF NOT EXISTS `cinesystem` /*!40100 DEFAULT CHARACTER SET latin1 */;
USE `cinesystem`;
-- MySQL dump 10.13  Distrib 5.6.24, for Win64 (x86_64)
--
-- Host: localhost    Database: cinesystem
-- ------------------------------------------------------
-- Server version	5.5.42

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `ingresso`
--

DROP TABLE IF EXISTS `ingresso`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `ingresso` (
  `Codigo` int(11) NOT NULL AUTO_INCREMENT,
  `codSessao` int(11) NOT NULL,
  `codPoltrona` int(11) NOT NULL,
  PRIMARY KEY (`Codigo`),
  KEY `fk_Ingresso_Sessao1_idx` (`codSessao`),
  KEY `fk_Ingresso_Poltrona1_idx` (`codPoltrona`),
  CONSTRAINT `fk_Ingresso_Poltrona1` FOREIGN KEY (`codPoltrona`) REFERENCES `poltrona` (`codigo`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_Ingresso_Sessao1` FOREIGN KEY (`codSessao`) REFERENCES `sessao` (`codigo`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `ingresso`
--

LOCK TABLES `ingresso` WRITE;
/*!40000 ALTER TABLE `ingresso` DISABLE KEYS */;
/*!40000 ALTER TABLE `ingresso` ENABLE KEYS */;
UNLOCK TABLES;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = latin1 */ ;
/*!50003 SET character_set_results = latin1 */ ;
/*!50003 SET collation_connection  = latin1_swedish_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'STRICT_TRANS_TABLES,NO_AUTO_CREATE_USER,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
/*!50003 CREATE*/ /*!50017 DEFINER=`root`@`localhost`*/ /*!50003 trigger auditoria_log_insert_ingresso after insert on ingresso  
for each row  
           insert into auditoria_log(new_id,old_id,new_codigo,old_codigo,new_dia,old_dia,new_valor,old_valor,new_idioma,old_idioma,new_descricao,old_descricao,new_nome,old_nome,new_codIdioma,old_codIdioma,new_codClassificacao,old_codClassificacao,new_codLegenda,old_codLegenda,new_codCategoria,old_codCategoria,new_cpf,old_cpf,new_permissoes,old_permissoes,new_horario,old_horario,new_codSala,old_codSala,new_codFilme,old_codFilme,new_fileira,old_fileira,new_numero,old_numero,new_codSessao,old_codSessao,new_codPoltrona,old_codPoltrona,new_emissao,old_emissao,new_total,old_total,new_cpfCliente,old_cpfCliente,new_codUsuario,old_codUsuario,new_codVenda,old_codVenda,new_codIngresso,old_codIngresso,new_duracao,old_duracao, acao, usuario, hora)   
                     values(null,null,new.codigo,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,new.codSessao,null,new.codPoltrona,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null, 'INSERT', user(), now()) */;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = latin1 */ ;
/*!50003 SET character_set_results = latin1 */ ;
/*!50003 SET collation_connection  = latin1_swedish_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'STRICT_TRANS_TABLES,NO_AUTO_CREATE_USER,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
/*!50003 CREATE*/ /*!50017 DEFINER=`root`@`localhost`*/ /*!50003 trigger auditoria_log_update_ingresso after update on ingresso 
for each row  
           insert into auditoria_log(new_id,old_id,new_codigo,old_codigo,new_dia,old_dia,new_valor,old_valor,new_idioma,old_idioma,new_descricao,old_descricao,new_nome,old_nome,new_codIdioma,old_codIdioma,new_codClassificacao,old_codClassificacao,new_codLegenda,old_codLegenda,new_codCategoria,old_codCategoria,new_cpf,old_cpf,new_permissoes,old_permissoes,new_horario,old_horario,new_codSala,old_codSala,new_codFilme,old_codFilme,new_fileira,old_fileira,new_numero,old_numero,new_codSessao,old_codSessao,new_codPoltrona,old_codPoltrona,new_emissao,old_emissao,new_total,old_total,new_cpfCliente,old_cpfCliente,new_codUsuario,old_codUsuario,new_codVenda,old_codVenda,new_codIngresso,old_codIngresso,new_duracao,old_duracao, acao, usuario, hora)   
                     values(null,null,new.codigo,old.codigo,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,new.codSessao,old.codSessao,new.codPoltrona,old.codPoltrona,null,null,null,null,null,null,null,null,null,null,null,null,null, 'UPDATE', user(), now()) */;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = latin1 */ ;
/*!50003 SET character_set_results = latin1 */ ;
/*!50003 SET collation_connection  = latin1_swedish_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'STRICT_TRANS_TABLES,NO_AUTO_CREATE_USER,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
/*!50003 CREATE*/ /*!50017 DEFINER=`root`@`localhost`*/ /*!50003 trigger auditoria_log_delete_ingresso after delete on ingresso  
for each row  
           insert into auditoria_log(new_id,old_id,new_codigo,old_codigo,new_dia,old_dia,new_valor,old_valor,new_idioma,old_idioma,new_descricao,old_descricao,new_nome,old_nome,new_codIdioma,old_codIdioma,new_codClassificacao,old_codClassificacao,new_codLegenda,old_codLegenda,new_codCategoria,old_codCategoria,new_cpf,old_cpf,new_permissoes,old_permissoes,new_horario,old_horario,new_codSala,old_codSala,new_codFilme,old_codFilme,new_fileira,old_fileira,new_numero,old_numero,new_codSessao,old_codSessao,new_codPoltrona,old_codPoltrona,new_emissao,old_emissao,new_total,old_total,new_cpfCliente,old_cpfCliente,new_codUsuario,old_codUsuario,new_codVenda,old_codVenda,new_codIngresso,old_codIngresso,new_duracao,old_duracao, acao, usuario, hora)   
                     values(null,null,null,old.codigo,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,old.codSessao,null,old.codPoltrona,null,null,null,null,null,null,null,null,null,null,null,null,null,null, 'DELETE', user(), now()) */;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2020-08-29  7:15:55
