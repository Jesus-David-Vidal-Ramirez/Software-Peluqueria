-- --------------------------------------------------------
-- Host:                         127.0.0.1
-- Versión del servidor:         10.4.13-MariaDB - mariadb.org binary distribution
-- SO del servidor:              Win64
-- HeidiSQL Versión:             10.1.0.5464
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!50503 SET NAMES utf8mb4 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;


-- Volcando estructura de base de datos para peluqueria
CREATE DATABASE IF NOT EXISTS `peluqueria` /*!40100 DEFAULT CHARACTER SET utf8mb4 */;
USE `peluqueria`;

-- Volcando estructura para tabla peluqueria.configuracion
CREATE TABLE IF NOT EXISTS `configuracion` (
  `Precio1` int(11) NOT NULL,
  `Precio2` int(11) NOT NULL,
  `Precio3` int(11) NOT NULL,
  `Mani` int(11) NOT NULL,
  `Pedi` int(11) NOT NULL,
  `Figu` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- Volcando datos para la tabla peluqueria.configuracion: ~1 rows (aproximadamente)
/*!40000 ALTER TABLE `configuracion` DISABLE KEYS */;
INSERT INTO `configuracion` (`Precio1`, `Precio2`, `Precio3`, `Mani`, `Pedi`, `Figu`) VALUES
	(10000, 15000, 20000, 10000, 15000, 20000);
/*!40000 ALTER TABLE `configuracion` ENABLE KEYS */;

-- Volcando estructura para tabla peluqueria.contabilidad
CREATE TABLE IF NOT EXISTS `contabilidad` (
  `ID` varchar(50) DEFAULT NULL,
  `Valor` int(11) DEFAULT NULL,
  `Fecha` datetime DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- Volcando datos para la tabla peluqueria.contabilidad: ~2 rows (aproximadamente)
/*!40000 ALTER TABLE `contabilidad` DISABLE KEYS */;
INSERT INTO `contabilidad` (`ID`, `Valor`, `Fecha`) VALUES
	('012', 3, '2020-07-24 04:20:32'),
	('1', 15000, '2020-07-25 11:16:33');
/*!40000 ALTER TABLE `contabilidad` ENABLE KEYS */;

-- Volcando estructura para tabla peluqueria.deudas
CREATE TABLE IF NOT EXISTS `deudas` (
  `Fecha` datetime DEFAULT NULL,
  `Gastos` int(11) DEFAULT NULL,
  `Razon` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- Volcando datos para la tabla peluqueria.deudas: ~2 rows (aproximadamente)
/*!40000 ALTER TABLE `deudas` DISABLE KEYS */;
INSERT INTO `deudas` (`Fecha`, `Gastos`, `Razon`) VALUES
	('2020-07-19 03:48:01', 10000, 'Jabon'),
	('2020-07-25 11:01:17', 10000, 'mil');
/*!40000 ALTER TABLE `deudas` ENABLE KEYS */;

-- Volcando estructura para tabla peluqueria.finanzas
CREATE TABLE IF NOT EXISTS `finanzas` (
  `ID` varchar(50) DEFAULT NULL,
  `Ganancias` int(11) DEFAULT NULL,
  `Fecha` datetime DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- Volcando datos para la tabla peluqueria.finanzas: ~27 rows (aproximadamente)
/*!40000 ALTER TABLE `finanzas` DISABLE KEYS */;
INSERT INTO `finanzas` (`ID`, `Ganancias`, `Fecha`) VALUES
	('64576179', 35000, '2020-06-16 11:18:18'),
	('64576179', 141000, '2020-07-16 12:16:45'),
	('64576179', 105000, '2020-07-19 03:44:28'),
	('1', 45000, '2020-07-19 03:49:00'),
	('2', 45000, '2020-07-19 03:49:36'),
	('2', 15000, '2020-07-19 03:50:04'),
	('1020', 53379, '2020-07-19 03:51:55'),
	('155', 11, '2020-07-20 05:42:08'),
	('1020', 55, '2020-07-20 05:42:27'),
	('Seleccionar ID', 0, '2020-07-24 04:17:00'),
	('64576179', 25000, '2020-07-24 04:51:17'),
	('1', 25000, '2020-07-24 04:51:43'),
	('2', 2, '2020-07-24 04:52:34'),
	('64576179', 25000, '2020-07-24 04:52:59'),
	('1102887756', 35000, '2020-07-24 08:19:26'),
	('Seleccionar ID', 0, '2020-07-24 09:48:15'),
	('2', 65000, '2020-07-24 09:51:48'),
	('1102887756', 15000, '2020-07-24 10:10:25'),
	('23', 10000, '2020-07-24 10:10:59'),
	('23', 10000, '2020-07-24 10:11:25'),
	('2', 35000, '2020-07-25 11:06:34'),
	('155', 185000, '2020-07-25 11:06:43'),
	('64576179', 35000, '2020-07-25 11:06:47'),
	('1020', 15000, '2020-07-25 11:06:51'),
	('1', 70000, '2020-07-25 11:07:03'),
	('13', 175000, '2020-07-25 11:07:07'),
	('64576179', 20000, '2020-07-25 11:15:02');
/*!40000 ALTER TABLE `finanzas` ENABLE KEYS */;

-- Volcando estructura para tabla peluqueria.login
CREATE TABLE IF NOT EXISTS `login` (
  `Usuario` varchar(50) DEFAULT NULL,
  `Contraseña` varchar(50) DEFAULT NULL,
  `Clave` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- Volcando datos para la tabla peluqueria.login: ~3 rows (aproximadamente)
/*!40000 ALTER TABLE `login` DISABLE KEYS */;
INSERT INTO `login` (`Usuario`, `Contraseña`, `Clave`) VALUES
	('1', '1', '1'),
	('2', '2', '2'),
	('3', '3', '3');
/*!40000 ALTER TABLE `login` ENABLE KEYS */;

-- Volcando estructura para tabla peluqueria.trabajadores
CREATE TABLE IF NOT EXISTS `trabajadores` (
  `Nombre` varchar(50) DEFAULT NULL,
  `Apellido` varchar(50) DEFAULT NULL,
  `ID` varchar(50) DEFAULT NULL,
  `Telefono` bigint(20) DEFAULT NULL,
  `Labor` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- Volcando datos para la tabla peluqueria.trabajadores: ~7 rows (aproximadamente)
/*!40000 ALTER TABLE `trabajadores` DISABLE KEYS */;
INSERT INTO `trabajadores` (`Nombre`, `Apellido`, `ID`, `Telefono`, `Labor`) VALUES
	('Amalfy Dionicia', 'Ramirez Hernandez', '64576179', 3116541670, 'Estilista'),
	('Adriana C', 'Vidal', '1020', 12, 'Manicurista'),
	('Martha lina', 'Mendoza', '155', 155, 'Estilista'),
	('Luisa F', 'Grajales Salazar', '2', 323, 'Manicurista'),
	('Ana A', 'Montes ', '1102887756', 3015987585, 'Estilista'),
	('Uno', 'Numero', '1', 3111, 'Manicurista'),
	('Blanca Ines', 'Salazar M.', '13', 310, 'Manicurista');
/*!40000 ALTER TABLE `trabajadores` ENABLE KEYS */;

/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IF(@OLD_FOREIGN_KEY_CHECKS IS NULL, 1, @OLD_FOREIGN_KEY_CHECKS) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
