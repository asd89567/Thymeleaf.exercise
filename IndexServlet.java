package com.thymeleaf.myspringmvc;

import com.thymeleaf.Imp.FruitDAPImp;
import com.thymeleaf.fruit;
import com.thymeleaf.myspringmvc.ViewBaseServlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.List;
@WebServlet("/index")
public class IndexServlet extends ViewBaseServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        FruitDAPImp fruitDAO = new FruitDAPImp();
        List<fruit> fruitList = fruitDAO.getfruitlist();
            HttpSession session = req.getSession(true);
            if(session !=null&&fruitList!=null) {
                session.setAttribute("fruitList", (List<fruit>)fruitList);
            }
            super.processTemplate("index",req,resp);
    }
}