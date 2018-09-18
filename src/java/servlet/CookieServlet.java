/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Nuntuch Thongyoo
 */
public class CookieServlet extends HttpServlet {

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
        try {

//            String text = request.getParameter("text"); //2. รับพารามิเตอร์มา
//            if (text != null) {//เช็คว่า text เป็น null ไหม
//                Cookie ck = new Cookie("ckname", text);//3.create obj cookie เพื่อรับค่า request ใส่ cookie
////                ck.setMaxAge(55555);//เช็ตอายุคุ๊กกี้
//                response.addCookie(ck); //4. send cookie to ผู้ใช้
//
//            } else {//ถ้าเป็น null
//                Cookie[] ck = request.getCookies();// เก็บ cookie ไว้หลายชิ้น
//
//                if (ck != null) {//ถ้า cookie มีค่า
//                    for (int i = 0; i < ck.length; i++) {
//                        if (ck[i].getName().equals("ckname")) {//เช็คว่า คุ๊กกี้ชิ้นไหนในกล่องที่จะทาน
//                            text = ck[i].getValue();//5. เก็บค่าของcookieลงตัวแปีน text  กรณี 1.cookie เก็บ obj เดียว
//                        }
//                    }
//
//                }
//
//            }
//            
//            request.setAttribute("name", text);
//            getServletContext().getRequestDispatcher("/cookieview.jsp").forward(request, response);
            String bnkgen = request.getParameter("bnkgen");
            String music = request.getParameter("music");
            String idol = request.getParameter("idol");

            if (bnkgen != null) {
                Cookie bnkgencookie = new Cookie("bnkgen", bnkgen);
                response.addCookie(bnkgencookie);

            } else {
                Cookie[] bnkgencookie = request.getCookies(); //find cookie ที่ต้องการจาก cookie ทั้งหมด
                if (bnkgencookie != null) { //ถ้ามีคุกกี้อยู่ในระบบก็ไปหา
                    for (int i = 0; i < bnkgencookie.length; i++) {
                        if (bnkgencookie[i].getName().equals("benkgen")) {//หาว่าใช้คุ๊กกิ้ที่เราหาไหม
                            bnkgen = bnkgencookie[i].getValue();
                        }
                    }

                }

            }
            request.setAttribute("bnkgen", bnkgen);
            
            
            getServletContext().getRequestDispatcher("/cookieview.jsp").forward(request, response);

        } catch (Exception e) {
            /* TODO output your page here. You may use following sample code. */
            PrintWriter out = response.getWriter();
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet CookieServlet</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet CookieServlet at " + request.getContextPath() + "</h1>");
            out.println("<h1>Servlet ERROR !!! " + e + "</h1>");
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
