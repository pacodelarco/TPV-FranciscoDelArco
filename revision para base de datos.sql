create table empleado(
	nombre varchar(30) not null,
    nombreUsuario varchar(15) unique,
    fotoUsuario blob,
    activo boolean default false,
    primary key(nombreUsuario)
);


create table racion(
	tamaño enum('MEDIA','ENTERA'),
    precio float,
    foto blob,
    nombre varchar(100),
    restaurante varchar(11),
    foreign key (restaurante) references restaurante(cif),
    primary key(nombre,restaurante)
);

create table restaurante)(...

)

insert into restaurante values("
//En ventana, nada mas crearla lees el restaurante y su carta


// Hay que hacer la base de datos de las clases: 
/*
	- Empleados
	- Todos los productos 
    - Restaurante
    - Mesa
    - Comanda
*/