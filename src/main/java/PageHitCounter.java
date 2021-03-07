import java.io.*;
import java.util.regex.Pattern;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;


@WebServlet(name = "ViewCountServlet", urlPatterns = "/count")
public class PageHitCounter extends HttpServlet{
    public int hitCount;

    public void init(){
        hitCount = 0;
    }
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException{
        String reset = request.getParameter("reset");

        response.setContentType(("text/html"));
        hitCount++;
        PrintWriter out = response.getWriter();
        if (reset != null) {
            init();
            out.println("<h1>Count has been reset!</h1>");

        }
        out.println("<h1>You are guest number: " + hitCount + "</h1>");
    }
}
