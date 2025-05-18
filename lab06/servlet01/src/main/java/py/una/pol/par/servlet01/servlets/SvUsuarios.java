package py.una.pol.par.servlet01.servlets;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet(name = "SvUsuarios", urlPatterns = {"/SvUsuarios"})
public class SvUsuarios extends HttpServlet {

    // Lista simulando una base de datos en memoria
    private List<String> listaUsuarios = new ArrayList<>();

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {

        String ci = request.getParameter("ci");
        String nombre = request.getParameter("nombre");
        String apellido = request.getParameter("apellido");
        String telefono = request.getParameter("telefono");

        // Guardamos en lista de usuarios
        String usuario = ci + " - " + nombre + " " + apellido + " - " + telefono;
        listaUsuarios.add(usuario);

        // Guardar en sesión (para mantener los datos entre requests)
        HttpSession sesion = request.getSession();
        sesion.setAttribute("usuarios", listaUsuarios);

        // Redirigir de nuevo a index.jsp
        response.sendRedirect("index.jsp");
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {

        HttpSession sesion = request.getSession();
        List<String> usuarios = (List<String>) sesion.getAttribute("usuarios");

        response.setContentType("text/html;charset=UTF-8");
        response.getWriter().println("<html><body>");
        response.getWriter().println("<h1>Lista de Usuarios</h1>");

        if (usuarios != null && !usuarios.isEmpty()) {
            for (String u : usuarios) {
                response.getWriter().println("<p>" + u + "</p>");
            }
        } else {
            response.getWriter().println("<p>No hay usuarios registrados.</p>");
        }

        response.getWriter().println("<a href='index.jsp'>Volver</a>");
        response.getWriter().println("</body></html>");
    }

    @Override
    public String getServletInfo() {
        return "SvUsuarios maneja el registro y listado de usuarios";
    }
}
