import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class expressionServlet {
}


import java.io.*;
        import javax.servlet.*;
        import javax.servlet.annotation.WebServlet;
        import javax.servlet.http.*;





@WebServlet(name = "HelloWorldServlet", urlPatterns = "/hello")
public class HelloWorldServlet extends HttpServlet {

//    @Override
//    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        response.setContentType("text/html");
//        PrintWriter out = response.getWriter();
//        out.println("<h1>Hello, World!</h1>");
//    }

    int pageViewCount;

    public void init(){
        pageViewCount  = 0;
    }



    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("name");
        response.setContentType("text/html");
        pageViewCount++;
        PrintWriter out = response.getWriter();
        if(name !=null){
            pageViewCount = 0;
            out.printf("<h1>Hello %s</h1>", name);
        }
        else{
            out.println("<h1>Hello, World</h1>");
        }
        String youVisited = "You visited my page:";
        out.print("<h2>" + youVisited + "<h2>" + pageViewCount +"<h2/>"+ "<h2>times!</h2>");



    }

}