/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package com.gecp.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 *
 * @author GEC PATAN
 */
public class ProfessionalServlet extends HttpServlet {

    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
        out.println("<html lang='en'>");
        out.println("<head>");
        out.println("    <meta charset='UTF-8'>");
        out.println("    <meta name='viewport' content='width=device-width, initial-scale=1.0'>");
        out.println("    <title>Professional Web Page</title>");
        out.println("    <style>");
        out.println("        body { font-family: Arial, sans-serif; margin: 0; padding: 0; background-color: #f4f4f4; }");
        out.println("        header, footer { background-color: #333; color: white; padding: 1em; text-align: center; }");
        out.println("        nav { background-color: #444; padding: 0.5em; text-align: center; }");
        out.println("        nav a { color: white; margin: 0 15px; text-decoration: none; font-weight: bold; }");
        out.println("        nav a:hover { text-decoration: underline; }");
        out.println("        .content { padding: 20px; background-color: white; margin: 20px auto; width: 80%; box-shadow: 0 0 10px rgba(0,0,0,0.1); }");
        out.println("        table { width: 100%; border-collapse: collapse; margin-top: 20px; }");
        out.println("        th, td { border: 1px solid #ddd; padding: 8px; text-align: center; }");
        out.println("        th { background-color: #333; color: white; }");
        out.println("    </style>");
        out.println("</head>");
        out.println("<body>");

        out.println("<header>");
        out.println("    <h1>Welcome to Our Professional Web Page</h1>");
        out.println("</header>");

        out.println("<nav>");
        out.println("    <a href='#'>Home</a>");
        out.println("    <a href='#'>About Us</a>");
        out.println("    <a href='#'>Services</a>");
        out.println("    <a href='#'>Contact</a>");
        out.println("</nav>");

        out.println("<div class='content'>");
        out.println("    <h2>About Our Company</h2>");
        out.println("    <p>We are dedicated to providing top-notch services to our clients. Our team of professionals ensures excellence in every project.</p>");
        out.println("    <p>Explore our website to learn more about what we offer and how we can help your business grow.</p>");

        out.println("    <h3>Our Services Overview</h3>");
        out.println("    <table>");
        out.println("        <tr><th>Service ID</th><th>Service Name</th><th>Description</th><th>Price</th></tr>");
        out.println("        <tr><td>001</td><td>Web Development</td><td>Creating professional websites tailored to your business needs.</td><td>$2000</td></tr>");
        out.println("        <tr><td>002</td><td>SEO Optimization</td><td>Improving your website's visibility on search engines.</td><td>$1500</td></tr>");
        out.println("        <tr><td>003</td><td>Digital Marketing</td><td>Comprehensive marketing strategies to boost your brand.</td><td>$1800</td></tr>");
        out.println("        <tr><td>004</td><td>App Development</td><td>Developing mobile apps for both Android and iOS platforms.</td><td>$3000</td></tr>");
        out.println("    </table>");
        out.println("</div>");

        out.println("<footer>");
        out.println("    <p>&copy; 2025 Professional Web Solutions. All rights reserved.</p>");
        out.println("</footer>");

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
        processRequest(request, response);
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
