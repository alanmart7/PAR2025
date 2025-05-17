<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="java.io.*, javax.servlet.*" %>
<!DOCTYPE html>
<html>
<head>
    <title>Galería de Imágenes</title>
</head>
<body>
    <h1>Galería de Imágenes</h1>
    <%
        String imagePath = application.getRealPath("/images");
        File folder = new File(imagePath);
        File[] files = folder.listFiles();

        if (files != null && files.length > 0) {
            for (File file : files) {
                if (file.isFile()) {
                    String name = file.getName();
                    if (name.endsWith(".jpg") || name.endsWith(".png") || name.endsWith(".gif")) {
    %>
                        <div style="margin: 10px; display: inline-block;">
                            <img src="images/<%= name %>" alt="<%= name %>" width="150" height="150"><br>
                            <%= name %>
                        </div>
    <%
                    }
                }
            }
        } else {
            out.println("<p>No hay imágenes disponibles.</p>");
        }
    %>
</body>
</html>
