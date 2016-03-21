package com.supinfo.SupTrip.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * Created by Windows on 20/03/2016.
 */

@WebServlet (name = "LoginIn", urlPatterns = "/loginIn")
public class LoginIn extends HttpServlet
{
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
    {
        String loginInIdBooster = req.getParameter("loginInIdBooster");
        String loginInPassword = req.getParameter("loginInPassword");

        HttpSession loginInSession = req.getSession();
        loginInSession.setAttribute("loginInIdBooster", loginInIdBooster);



        super.doPost(req, resp);
    }
}
