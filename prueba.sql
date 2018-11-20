-- phpMyAdmin SQL Dump
-- version 3.5.1
-- http://www.phpmyadmin.net
--
-- Servidor: localhost
-- Tiempo de generación: 20-11-2018 a las 21:06:52
-- Versión del servidor: 5.5.24-log
-- Versión de PHP: 5.4.3

SET SQL_MODE="NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Base de datos: `prueba`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `asignatura`
--

CREATE TABLE IF NOT EXISTS `asignatura` (
  `id_asignatura` int(11) NOT NULL,
  `nombre_asignatura` varchar(40) NOT NULL,
  `nota` int(11) NOT NULL,
  PRIMARY KEY (`id_asignatura`),
  KEY `nombre_asignatura` (`nombre_asignatura`),
  KEY `nota` (`nota`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `asignatura`
--

INSERT INTO `asignatura` (`id_asignatura`, `nombre_asignatura`, `nota`) VALUES
(1, 'matemática', 1),
(2, 'Java', 2),
(3, 'C#', 3),
(4, 'Futbol', 4),
(5, 'Excel', 5),
(6, 'Word', 5),
(7, 'musica', 6),
(8, 'Arte', 7),
(9, 'Danza', 7),
(10, 'inglés', 1),
(11, 'Lenguaje', 2),
(12, 'Historia', 3),
(13, 'Química', 5),
(14, 'Sql', 6),
(15, 'Física', 4),
(16, 'Programación', 3),
(17, 'Psicología', 2);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `hibernate_sequence`
--

CREATE TABLE IF NOT EXISTS `hibernate_sequence` (
  `next_val` bigint(20) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `hibernate_sequence`
--

INSERT INTO `hibernate_sequence` (`next_val`) VALUES
(1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `nota`
--

CREATE TABLE IF NOT EXISTS `nota` (
  `id_nota` int(11) NOT NULL,
  `nota` float NOT NULL,
  PRIMARY KEY (`id_nota`),
  KEY `nota` (`nota`),
  KEY `nota_2` (`nota`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `nota`
--

INSERT INTO `nota` (`id_nota`, `nota`) VALUES
(7, 2.8),
(6, 3.5),
(1, 4),
(3, 4.5),
(2, 5),
(4, 5.5),
(5, 6.5);

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `asignatura`
--
ALTER TABLE `asignatura`
  ADD CONSTRAINT `nota` FOREIGN KEY (`nota`) REFERENCES `nota` (`id_nota`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
