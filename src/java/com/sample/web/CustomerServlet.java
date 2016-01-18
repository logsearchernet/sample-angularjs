/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sample.web;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author User
 */
@WebServlet(name = "CustomerServlet", urlPatterns = {"/customerServlet"})
public class CustomerServlet extends HttpServlet {

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
            out.println("{ \"records\":[ {\"Name\":\"Alfreds Futterkiste\",\"City\":\"Berlin\",\"Country\":\"Germany\"}, {\"Name\":\"Ana Trujillo Emparedados y helados\",\"City\":\"México D.F.\",\"Country\":\"Mexico\"}, {\"Name\":\"Antonio Moreno Taquería\",\"City\":\"México D.F.\",\"Country\":\"Mexico\"}, {\"Name\":\"Around the Horn\",\"City\":\"London\",\"Country\":\"UK\"}, {\"Name\":\"B's Beverages\",\"City\":\"London\",\"Country\":\"UK\"}, {\"Name\":\"Berglunds snabbköp\",\"City\":\"Luleå\",\"Country\":\"Sweden\"}, {\"Name\":\"Blauer See Delikatessen\",\"City\":\"Mannheim\",\"Country\":\"Germany\"}, {\"Name\":\"Blondel père et fils\",\"City\":\"Strasbourg\",\"Country\":\"France\"}, {\"Name\":\"Bólido Comidas preparadas\",\"City\":\"Madrid\",\"Country\":\"Spain\"}, {\"Name\":\"Bon app'\",\"City\":\"Marseille\",\"Country\":\"France\"}, {\"Name\":\"Bottom-Dollar Marketse\",\"City\":\"Tsawassen\",\"Country\":\"Canada\"}, {\"Name\":\"Cactus Comidas para llevar\",\"City\":\"Buenos Aires\",\"Country\":\"Argentina\"}, {\"Name\":\"Centro comercial Moctezuma\",\"City\":\"México D.F.\",\"Country\":\"Mexico\"}, {\"Name\":\"Chop-suey Chinese\",\"City\":\"Bern\",\"Country\":\"Switzerland\"}, {\"Name\":\"Comércio Mineiro\",\"City\":\"São Paulo\",\"Country\":\"Brazil\"} ] }");
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
        processRequest(request, response);
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
        
        StringBuffer jb = new StringBuffer();
        String line = null;
        BufferedReader reader = request.getReader();
        while ((line = reader.readLine()) != null) {
            jb.append(line);
        }
        
        System.err.println("[doPost] jb=>"+jb.toString());
        
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("{ \"records\":[ {\"Name\":\"Alfreds Futterkiste\",\"City\":\"Berlin\",\"Country\":\"Germany\"} ] }");
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
