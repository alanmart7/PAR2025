<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Formulario inicial</title>
</head>
<body>
    <h1>Datos del Usuario</h1>
    <form action="SvUsuarios" method="POST">
        <p><label>CI:</label><input type="text" name="ci" required></p>
        <p><label>Nombre:</label><input type="text" name="nombre" required></p>
        <p><label>Apellido:</label><input type="text" name="apellido" required></p>
        <p><label>Teléfono:</label><input type="text" name="telefono" required></p>
        <button type="submit">Enviar</button>
    </form>

    <h1>Ver Usuario</h1>
    <form action="SvUsuarios" method="GET">
        <p>Para ver los datos de los usuarios cargados haga click en el siguiente botón:</p>
        <button type="submit">Mostrar Usuarios</button>
    </form>
</body>
</html>
