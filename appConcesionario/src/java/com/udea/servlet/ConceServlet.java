/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.udea.servlet;

import com.udea.ejb.ClienteFacadeLocal;

import com.udea.ejb.VehiculoFacadeLocal;
import com.udea.ejb.VentaFacadeLocal;
import com.udea.entity.Cliente;
import com.udea.entity.Vehiculo;
import com.udea.entity.Venta;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.List;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author USER
 */
public class ConceServlet extends HttpServlet {

    @EJB
    private VentaFacadeLocal ventaFacade;

    @EJB
    private VehiculoFacadeLocal vehiculoFacade;

    @EJB
    private ClienteFacadeLocal clienteFacade;

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
        PrintWriter out = response.getWriter();
        try {
            String action = request.getParameter("action");
            String url ="index.jsp";
            if("listCliente".equals(action)){
                List<Cliente>findAll = clienteFacade.findAll();
                request.getSession().setAttribute("Cliente", findAll);
                url="listCliente.jsp";
            }else if("insertCliente".equals(action)){
                Cliente a = new Cliente();
                a.setIdCliente(Integer.valueOf(request.getParameter("idCliente")));
                a.setCiudad(request.getParameter("ciudad"));
                a.setNombreCliente(request.getParameter("nombreCliente"));
                clienteFacade.create(a);
                url = "RegistrarCliente.jsp";
            }else if ("deleteCliente".equals(action)){
                String id = request.getParameter("id");
                Cliente a = clienteFacade.find(Integer.valueOf(id));
                clienteFacade.remove(a);
                url = "ConceServlet?=action=listCliente";
            }
            response.sendRedirect(url);
        }finally{
            out.close();
        }
            
        }

    
    protected void processRequestVehiculo(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
            String action = request.getParameter("action");
            String url ="vehiculo.jsp";
            if("listVehiculo".equals(action)){
                List<Vehiculo>findAll = vehiculoFacade.findAll();
                request.getSession().setAttribute("Vehiculo", findAll);
                url="listVehiculo.jsp";
            }else if("insertVehiculo".equals(action)){
                Vehiculo a = new Vehiculo();
                a.setIdVehiculo(Integer.valueOf(request.getParameter("idVehiculo")));
                a.setMarca(request.getParameter("marca"));
                a.setModelo(request.getParameter("modelo"));
                vehiculoFacade.create(a);
                url = "InsertVehiculo.jsp";
            }else if ("deleteVehiculo".equals(action)){
                String id = request.getParameter("idVehiculo");
                Vehiculo a = vehiculoFacade.find(Integer.valueOf(id));
                vehiculoFacade.remove(a);
                url = "ConceServlet?=action=listVehiculo";
            }
            response.sendRedirect(url);
        }finally{
            out.close();
        }
            
        }

    
    
    protected void processRequestVenta(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
            String action = request.getParameter("action");
            String url ="venta.jsp";
            if("listVenta".equals(action)){
                List<Vehiculo>findAll = vehiculoFacade.findAll();
                request.getSession().setAttribute("Venta", findAll);
                url="listVenta.jsp";
            }else if("insertVenta".equals(action)){
                Venta a = new Venta();
                a.setIdVenta(Integer.valueOf(request.getParameter("IdVenta")));
                a.setIdVehiculo(Integer.valueOf(request.getParameter("IdVehiculo")));
                a.setIdCliente(Integer.valueOf(request.getParameter("IdCliente")));
                a.setPrecio(Integer.valueOf(request.getParameter("Precio")));
                 SimpleDateFormat formatter1=new SimpleDateFormat("dd/MM/yyyy");  
                 try {
                //The code you are trying to exception handle
                a.setFechaVenta(formatter1.parse((request.getParameter("FechaVenta"))));
                }
                catch (Exception e) {
                 //The handling for the code
                }
                
                ventaFacade.create(a);
                url = "InsertVenta.jsp";
            }else if ("deleteVenta".equals(action)){
                String id = request.getParameter("IdVenta");
                Vehiculo a = vehiculoFacade.find(Integer.valueOf(id));
                vehiculoFacade.remove(a);
                url = "ConceServlet?=action=listVenta";
            }
            response.sendRedirect(url);
        }finally{
            out.close();
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
