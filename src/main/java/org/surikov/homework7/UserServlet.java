package org.surikov.homework7;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebInitParam;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "UserServlet", urlPatterns = "/userServlet", initParams={
        @WebInitParam(name="name", value="Not provided"),
        @WebInitParam(name="email", value="Not provided")})
public class UserServlet extends HttpServlet {

    @Override
    protected void doPost(
            HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
        forwardRequest(request, response, "/result.jsp");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException,IOException {
        processRequest(request,response);
        forwardRequest(request,response,"/result.jsp");
    }

    protected void processRequest(
            HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {

        request.setAttribute("name", getRequestParameter(request, "name"));
        request.setAttribute("email", getRequestParameter(request, "email"));
        request.setAttribute("province", getContextParameter("province"));
        request.setAttribute("country", getContextParameter("country"));
    }

    protected String getContextParameter(String name) {
        return getServletContext().getInitParameter(name);
    }

    protected void forwardRequest(
            HttpServletRequest request,
            HttpServletResponse response,
            String path)
            throws ServletException, IOException {
        request.getRequestDispatcher(path).forward(request, response);
    }

    protected String getRequestParameter(
            HttpServletRequest request,
            String name) {
        String param = request.getParameter(name);
        return !param.isEmpty() ? param : getInitParameter(name);
    }
}
