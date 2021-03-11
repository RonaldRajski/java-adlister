import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "DarkModeServlet", value = "/dark-mode")
public class DarkModeServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        if (session.getAttribute("dark-mode") == null) {
            session.setAttribute("dark-mode", false);
            request.getRequestDispatcher("/WEB-INF/dark-mode.jsp").forward(request, response);
        } else {
            response.sendRedirect("/");
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        String darkMode = request.getParameter("dark-mode");
        if (darkMode.equals("yes")) {
            session.setAttribute("dark-mode", true);
        } else {
            session.setAttribute("dark-mode", false);
        }
        response.sendRedirect("/profile");
    }
}
