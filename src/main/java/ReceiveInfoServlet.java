import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "ReceiveInfoServlet", value = "/receive")
public class ReceiveInfoServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        String name = (String) session.getAttribute("name");
        request.setAttribute("name", name);
        request.getRequestDispatcher("/WEB-INF/receive.jsp").forward(request, response);
    }
}
