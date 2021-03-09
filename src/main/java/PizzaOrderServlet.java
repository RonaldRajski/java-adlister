import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

//5 javax servlets and 1 java exception
//always an expception


//Need webservlet command

@WebServlet(name= "PizzaOrderServlet", urlPatterns = "/pizza-order")

//always need to extend servlet
public class PizzaOrderServlet extends HttpServlet{
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("pizza-order.jsp").forward(req, resp);
        resp.getWriter().println("<h1>Pizza form</h1>");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String crustType  = req.getParameter("crust_types");
        String sauce = req.getParameter("sauce_types");
        String size = req.getParameter("size");
        System.out.println("crustType");
        System.out.println("sauceType");
        System.out.println("size");

        String[] toppings = req.getParameterValues("toppings");

        for (int i =0; i <= toppings.length - 1; i++){
            System.out.println(toppings[i]);
        }

        String usersAddress = req.getParameter("address");
        System.out.println(usersAddress);





        req.getRequestDispatcher("pizza-order.jsp").forward(req, resp);

    }
}
