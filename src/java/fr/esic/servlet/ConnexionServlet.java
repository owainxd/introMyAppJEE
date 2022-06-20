/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.esic.servlet;

import fr.esic.dao.UserDao;
import fr.esic.model.User;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author al-am
 */
@WebServlet(name = "ConnexionServlet", urlPatterns = {"/login"})
public class ConnexionServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet ConnexionServlet</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet ConnexionServlet at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // processRequest(request, response);
        request.getRequestDispatcher("index.jsp").forward(request, response);

    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //processRequest(request, response);

        // on recupère les informations saisiespas l'utilisateur 
        String pLogin = request.getParameter("login");
        String pPassword = request.getParameter("password");

        try {
            User utilisateur = UserDao.getByLoginAndPassword(pLogin, pPassword);

            if (utilisateur != null) {
                // je mets dans l'objet request les infos de l'utilisateur 
                // qu'on peut récuprer dans la page jsp
                // request.setAttribute("pLogin", pLogin);
                HttpSession session = request.getSession();
                session.setAttribute("user", utilisateur);
                
                // session.invalidate();
                
                request.getRequestDispatcher("WEB-INF/profile.jsp").forward(request, response);

            } else {
                request.setAttribute("msg", "login + password incorrects. Please try again!");
                request.getRequestDispatcher("index.jsp").forward(request, response);
            }

            /*
            if (login.equals("owain") && password.equals("123")) {
            request.getRequestDispatcher("WEB-INF/home.jsp").forward(request, response);
            } else {
            
            // request.setAttribute crée une variable dans l'objet request
            // String msg = "login + password incorrects. Please try again!"
            request.setAttribute("msg", "login + password incorrects. Please try again!");            
            request.getRequestDispatcher("WEB-INF/login.jsp").forward(request, response);
            }*/
        } catch (Exception ex) {
            Logger.getLogger(ConnexionServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
