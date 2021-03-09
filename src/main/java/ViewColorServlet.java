import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

//5 javax servlets and 1 java exception
//always an expception


//Need webservlet command

@WebServlet("/viewcolor")


public class ViewColorServlet  extends HttpServlet{
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String favoriteColor =  req.getParameter("favorite_color");
        req.setAttribute("favoriteColor", favoriteColor);
        req.getRequestDispatcher("/view-color.jsp").forward(req, resp);


    }
}
