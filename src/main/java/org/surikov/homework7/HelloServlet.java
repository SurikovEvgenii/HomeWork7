package org.surikov.homework7;

import java.io.*;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet(name = "helloServlet", value = "/hello-servlet")
public class HelloServlet extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        response.setContentType("text/html");
        String[] linkdata = new String[]{"RESULT JSP", "FORM"};
        request.setAttribute("linkdata",linkdata);
        String[] users = new String[] {"Tom", "Bob", "Sam"};
        request.setAttribute("users", users);
        getServletContext().getRequestDispatcher("/basic.jsp").forward(request, response);

    }

}