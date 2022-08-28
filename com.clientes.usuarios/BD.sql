-- --------------------------------------------------------
-- Host:                         127.0.0.1
-- Versión del servidor:         10.4.24-MariaDB - mariadb.org binary distribution
-- SO del servidor:              Win64
-- HeidiSQL Versión:             11.3.0.6295
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!50503 SET NAMES utf8mb4 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;


-- Volcando estructura de base de datos para bd_usuario
CREATE DATABASE IF NOT EXISTS `bd_usuario` /*!40100 DEFAULT CHARACTER SET utf8mb4 */;
USE `bd_usuario`;

-- Volcando estructura para tabla bd_usuario.usuario
CREATE TABLE IF NOT EXISTS `usuario` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `ciudad` varchar(255) DEFAULT NULL,
  `direccion` varchar(255) DEFAULT NULL,
  `p_apellido` varchar(255) DEFAULT NULL,
  `p_nombre` varchar(255) DEFAULT NULL,
  `s_apellido` varchar(255) DEFAULT NULL,
  `s_nombre` varchar(255) DEFAULT NULL,
  `telefono` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=23445323 DEFAULT CHARSET=utf8mb4;

--- insertando la informacion que se va a consultar
INSERT INTO `usuario` (`id`, `ciudad`, `direccion`, `p_apellido`, `p_nombre`, `s_apellido`, `s_nombre`, `telefono`) VALUES (1, 'cali', 'calle#89', 'caicedo', 'edwin', 'angulo', 'andres', 315295);
INSERT INTO `usuario` (`id`, `ciudad`, `direccion`, `p_apellido`, `p_nombre`, `s_apellido`, `s_nombre`, `telefono`) VALUES (23445322, 'cali', 'calle#90', 'perez', 'juan', 'ruiz', 'sebastian', 12345678);

commi;
