import java.io.*;
        import javax.servlet.*;
        import javax.servlet.annotation.WebServlet;
        import javax.servlet.http.*;





@WebServlet(name = "IndexServlet", urlPatterns = "/index")
public class IndexServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        req.getRequestDispatcher("/webapp/index.jsp").forward(req, resp);




    }
}