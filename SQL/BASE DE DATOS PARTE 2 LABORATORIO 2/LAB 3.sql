SELECT 
    e.ID_ENCARGADO AS "ID Encargado",
    e.NOMBRE_ENCARGADO AS "Nombre del Encargado",
    b.TELEFONO AS "Teléfono Biblioteca",
    c.NOMBRE_CLIENTE AS "Cliente",
    c.CORREO_CLIENTE AS "Correo del Cliente",
    l.NOMBRE AS "Libro",
    l.AUTOR AS "Autor",
    l.ANO_EDICION AS "Año de Edición",
    v.CANTIDAD AS "Cantidad Vendida",
    v.FECHA_VENTA AS "Fecha de Venta"
FROM ENCARGADOS e
JOIN BIBLIOTECAS b 
    ON e.ID_BIBLIOTECA = b.ID_BIBLIOTECA
JOIN VENTAS_LIBROS v 
    ON b.ID_BIBLIOTECA = v.ID_BIBLIOTECA
JOIN CLIENTES c 
    ON v.ID_CLIENTE = c.ID_CLIENTE
JOIN LIBROS l 
    ON v.ID_LIBRO = l.ID_LIBRO
WHERE v.CANTIDAD > 1;
