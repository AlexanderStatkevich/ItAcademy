package by.itacademy.jd2.academyproject.controller;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;
import java.util.Map;


@WebServlet(name = "PrintNamesTask", urlPatterns = "/print_names")
public class PrintNamesTask extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        resp.setContentType("text/html; charset=UTF-8");
        PrintWriter writer = resp.getWriter();

        Enumeration<String> params = req.getParameterNames();
        Map<String, String[]> parameterMap = req.getParameterMap();
        String name = "name";

        while (params.hasMoreElements()) {
            String paramName = params.nextElement();
            if(paramName.startsWith(name)){
                String[] strings = parameterMap.get(paramName);
                for(String s:strings){
                    writer.write(paramName +" :"+s);
                }
            }
        }
    }
}