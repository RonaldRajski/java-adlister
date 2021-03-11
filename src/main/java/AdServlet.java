//import javax.servlet.ServletException;
//import javax.servlet.annotation.WebServlet;
//import javax.servlet.http.HttpServlet;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import java.io.IOException;
//import java.util.List;
//
//
//@WebServlet(name = "AdsViewServlet", urlPatterns = "/ads")
//
//public class AdServlet extends HttpServlet {
//
//    @Override
//    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//    List<Ad> adList=DaoFactory.getAdsDao().all();
//    req.setAttribute("adList", adList);
//    req.getRequestDispatcher("/ads/index.jsp").forward(req,
//            resp);
//    }
//
//    @Override
//    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        if(req.getMethod().equalsIgnoreCase("post"));
//        String username = req.getParameter("username");
//        String password = req.getParameter("password");
//        if(username.equals("admin")&& password.equals("password")){
//            resp.sendRedirect("/profile");
//        }
//    }
//}

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "AdServlet", value = "/ads")
public class AdServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        List<Ad> adList = DaoFactory.getAdsDao().all();

        request.setAttribute("ads", adList);

        request.getRequestDispatcher("/ads/index.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}

