/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author EspinosaBeltran
 */
public class Controlador extends HttpServlet {

    /**
     *
     * @param request
     * @param response
     * @throws ServletException
     * @throws IOException
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       String accion=request.getParameter("accion");
       switch (accion){
           case "Principal":
           request.getRequestDispatcher("Principal.jsp").forward(request, response);
           break;
           
           case "Catalogo":
               request.getRequestDispatcher("Catalogo.jsp").forward(request, response);
           break;
           
           case "Empleados":
               request.getRequestDispatcher("Empleados.jsp").forward(request, response);
           break;
           
           case "Clientes":
               request.getRequestDispatcher("Clientes.jsp").forward(request, response);
           break;
           
           case "Ventas":
               request.getRequestDispatcher("Ventas.jsp").forward(request, response);
           break;
           default:
               throw new AssertionError();
        }
        }
        
    }

  