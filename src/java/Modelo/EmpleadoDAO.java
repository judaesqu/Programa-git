/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import config.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author EspinosaBeltran
 */
public class EmpleadoDAO {
    Conexion cn=new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    
    public Empleado validar(String user, String pass){
        Empleado em=new Empleado();
        String sql="SELECT * FROM empleado where user=? pass=?";
        try{
            con=cn.Conexion();
            ps=con.prepareStatement(sql);
            ps.setString(1, user);
            ps.setString(2, pass);
            rs=ps.executeQuery();
            while (rs.next()){
                em.setUser(rs.getString("user"));
                em.setPass(rs.getString("pass"));                
            }
        }catch (Exception e){
        }
        return em;
    } 
}
