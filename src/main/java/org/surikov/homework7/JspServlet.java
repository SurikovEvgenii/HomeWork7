package org.surikov.homework7;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(name = "getTestCollection", value = "/get-test-collection")
public class JspServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String[] strings = new String[]{"RESULT JSP", "FORM"};
        req.setAttribute("linkdata",strings);
        getServletContext().getRequestDispatcher("/index.jsp").forward(req, resp);
    }
}
