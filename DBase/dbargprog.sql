-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1:3306
-- Tiempo de generación: 14-08-2022 a las 21:33:15
-- Versión del servidor: 8.0.27
-- Versión de PHP: 7.4.26

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `dbargprog`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `estudio`
--

DROP TABLE IF EXISTS `estudio`;
CREATE TABLE IF NOT EXISTS `estudio` (
  `id_estudio` bigint NOT NULL,
  `añoegreso` varchar(255) DEFAULT NULL,
  `añoingreso` varchar(255) DEFAULT NULL,
  `intitucion` varchar(255) DEFAULT NULL,
  `titulo` varchar(255) DEFAULT NULL,
  `urlimgestudio` varchar(255) DEFAULT NULL,
  `id_persona` bigint DEFAULT NULL,
  `anioegreso` varchar(255) DEFAULT NULL,
  `anioingreso` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id_estudio`),
  KEY `FKb49fnaksp8nb1ybgde5puif41` (`id_persona`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Volcado de datos para la tabla `estudio`
--

INSERT INTO `estudio` (`id_estudio`, `añoegreso`, `añoingreso`, `intitucion`, `titulo`, `urlimgestudio`, `id_persona`, `anioegreso`, `anioingreso`) VALUES
(1, NULL, NULL, 'Universidad de Buenos Aires', 'Veterinario', './assets/uba.jpg', NULL, '2013', '2003'),
(2, NULL, NULL, 'Min. Desarrollo Productivo - Argentina Programa', 'Full Stack Developer', './assets/argpro.png', NULL, '2022', '2021'),
(3, NULL, NULL, 'Universidad Tecnologica Nacional - Muni. Las Flores', 'Programador Web Inicial', './assets/utndelta.png', NULL, '2022', '2021');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `experiencia`
--

DROP TABLE IF EXISTS `experiencia`;
CREATE TABLE IF NOT EXISTS `experiencia` (
  `id_experiencia` bigint NOT NULL,
  `actualidad` bit(1) DEFAULT NULL,
  `añoegreso` varchar(255) DEFAULT NULL,
  `añoingreso` varchar(255) DEFAULT NULL,
  `funciones` varchar(255) DEFAULT NULL,
  `institucion` varchar(255) DEFAULT NULL,
  `puesto` varchar(255) DEFAULT NULL,
  `urlimgexperiencia` varchar(255) DEFAULT NULL,
  `id_persona` bigint DEFAULT NULL,
  `anioegreso` varchar(255) DEFAULT NULL,
  `anioingreso` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id_experiencia`),
  KEY `FK2kgkm2qtkciorqpmsrh4pebcl` (`id_persona`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `hibernate_sequence`
--

DROP TABLE IF EXISTS `hibernate_sequence`;
CREATE TABLE IF NOT EXISTS `hibernate_sequence` (
  `next_val` bigint DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Volcado de datos para la tabla `hibernate_sequence`
--

INSERT INTO `hibernate_sequence` (`next_val`) VALUES
(7);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `persona`
--

DROP TABLE IF EXISTS `persona`;
CREATE TABLE IF NOT EXISTS `persona` (
  `id_persona` bigint NOT NULL,
  `about` varchar(255) DEFAULT NULL,
  `apellido` varchar(255) DEFAULT NULL,
  `email` varchar(255) DEFAULT NULL,
  `facebook` varchar(255) DEFAULT NULL,
  `instagram` varchar(255) DEFAULT NULL,
  `linkedin` varchar(255) DEFAULT NULL,
  `nacimiento` datetime(6) DEFAULT NULL,
  `nacionalidad` varchar(255) DEFAULT NULL,
  `nombre` varchar(255) DEFAULT NULL,
  `residencia` varchar(255) DEFAULT NULL,
  `telefono` varchar(255) DEFAULT NULL,
  `urlimgfondo` varchar(255) DEFAULT NULL,
  `urlimgpersonal` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id_persona`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Volcado de datos para la tabla `persona`
--

INSERT INTO `persona` (`id_persona`, `about`, `apellido`, `email`, `facebook`, `instagram`, `linkedin`, `nacimiento`, `nacionalidad`, `nombre`, `residencia`, `telefono`, `urlimgfondo`, `urlimgpersonal`) VALUES
(1, 'nose', 'Isola', 'marceloisola@gmail.com', 'nose', 'nose', 'nose', '1982-10-14 00:00:00.000000', 'Argentino/Italiano', 'Marcelo', 'Argentina', '+5491138896935', 'nose', 'nose');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `rol`
--

DROP TABLE IF EXISTS `rol`;
CREATE TABLE IF NOT EXISTS `rol` (
  `id` int NOT NULL AUTO_INCREMENT,
  `rol_nombre` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Volcado de datos para la tabla `rol`
--

INSERT INTO `rol` (`id`, `rol_nombre`) VALUES
(1, 'ROLE_ADMIN'),
(2, 'ROLE_USER');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `usuario`
--

DROP TABLE IF EXISTS `usuario`;
CREATE TABLE IF NOT EXISTS `usuario` (
  `id` int NOT NULL AUTO_INCREMENT,
  `email` varchar(255) DEFAULT NULL,
  `nombre` varchar(255) DEFAULT NULL,
  `nombre_usuario` varchar(255) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Volcado de datos para la tabla `usuario`
--

INSERT INTO `usuario` (`id`, `email`, `nombre`, `nombre_usuario`, `password`) VALUES
(1, 'a@a.a', 'admin', 'admin', '$2a$10$F5wn2BY8nzfxhEF1wAlRfeZ2/VKRhKYt/tjFTmiKTBfuvRPWAgedq'),
(2, 'u@u.u', 'user', 'user', '$2a$10$WgBK4Hbw1uTWw8HB.IaPiu42yv1G.GI7rS1Yo54kQ69z3a6Ma3DH6');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `usuario_rol`
--

DROP TABLE IF EXISTS `usuario_rol`;
CREATE TABLE IF NOT EXISTS `usuario_rol` (
  `usuario_id` int NOT NULL,
  `rol_id` int NOT NULL,
  PRIMARY KEY (`usuario_id`,`rol_id`),
  KEY `FK610kvhkwcqk2pxeewur4l7bd1` (`rol_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Volcado de datos para la tabla `usuario_rol`
--

INSERT INTO `usuario_rol` (`usuario_id`, `rol_id`) VALUES
(1, 1),
(1, 2),
(2, 2);

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `estudio`
--
ALTER TABLE `estudio`
  ADD CONSTRAINT `FKb49fnaksp8nb1ybgde5puif41` FOREIGN KEY (`id_persona`) REFERENCES `persona` (`id_persona`);

--
-- Filtros para la tabla `experiencia`
--
ALTER TABLE `experiencia`
  ADD CONSTRAINT `FK2kgkm2qtkciorqpmsrh4pebcl` FOREIGN KEY (`id_persona`) REFERENCES `persona` (`id_persona`);

--
-- Filtros para la tabla `usuario_rol`
--
ALTER TABLE `usuario_rol`
  ADD CONSTRAINT `FK610kvhkwcqk2pxeewur4l7bd1` FOREIGN KEY (`rol_id`) REFERENCES `rol` (`id`),
  ADD CONSTRAINT `FKbyfgloj439r9wr9smrms9u33r` FOREIGN KEY (`usuario_id`) REFERENCES `usuario` (`id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
