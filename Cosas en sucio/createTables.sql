CREATE TABLE `empleado` (
  `nombre` varchar(30) NOT NULL,
  `nombreUsuario` varchar(15) NOT NULL,
  `contraseña`varchar(30) NOT NULL,
  `fotoUsuario` blob,
  PRIMARY KEY (`nombreUsuario`),
  UNIQUE KEY `nombreUsuario` (`nombreUsuario`)
);

CREATE TABLE `bebida` (
  `alcoholica` tinyint(1) DEFAULT NULL,
  `precio` float DEFAULT NULL,
  `foto` blob,
  `nombre` varchar(100) NOT NULL,
  `restaurante` varchar(11) NOT NULL,
  PRIMARY KEY (`nombre`,`restaurante`),
  KEY `restaurante` (`restaurante`),
  CONSTRAINT `bebida_ibfk_1` FOREIGN KEY (`restaurante`) REFERENCES `restaurante` (`cif`)
);

CREATE TABLE `bocadillo` (
  `tamaño` enum('VIENA','PITUFO') DEFAULT NULL,
  `precio` float DEFAULT NULL,
  `foto` blob,
  `nombre` varchar(100) NOT NULL,
  `restaurante` varchar(11) NOT NULL,
  PRIMARY KEY (`nombre`,`restaurante`),
  KEY `restaurante` (`restaurante`),
  CONSTRAINT `bocadillo_ibfk_1` FOREIGN KEY (`restaurante`) REFERENCES `restaurante` (`cif`)
);

CREATE TABLE `carta` (
  `id` int NOT NULL,
  `productos_TreeMap` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
);

CREATE TABLE `comanda` (
  `id` int NOT NULL,
  `empleado_nombreUsuario` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `id_UNIQUE` (`id`)
);
CREATE TABLE `mesa` (
  `id` int NOT NULL,
  `comanda_id` int DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `id_UNIQUE` (`id`)
);

CREATE TABLE `racion` (
  `tamaño` enum('MEDIA','ENTERA') DEFAULT NULL,
  `precio` float DEFAULT NULL,
  `foto` blob,
  `nombre` varchar(100) NOT NULL,
  `restaurante` varchar(11) NOT NULL,
  PRIMARY KEY (`nombre`,`restaurante`),
  KEY `restaurante` (`restaurante`),
  CONSTRAINT `racion_ibfk_1` FOREIGN KEY (`restaurante`) REFERENCES `restaurante` (`cif`)
);

CREATE TABLE `restaurante` (
  `cif` varchar(9) NOT NULL,
  `direccion` varchar(100) DEFAULT NULL,
  `telefono` int DEFAULT NULL,
  `carta_id` int DEFAULT NULL,
  `mesa_id` int DEFAULT NULL,
  PRIMARY KEY (`cif`),
  UNIQUE KEY `cif_UNIQUE` (`cif`)
);

CREATE TABLE `tapa` (
  `precio` float DEFAULT NULL,
  `foto` blob,
  `nombre` varchar(100) NOT NULL,
  `restaurante` varchar(11) NOT NULL,
  PRIMARY KEY (`nombre`,`restaurante`),
  KEY `restaurante` (`restaurante`),
  CONSTRAINT `tapa_ibfk_1` FOREIGN KEY (`restaurante`) REFERENCES `restaurante` (`cif`)
);	q