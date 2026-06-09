/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.uthprograoo.empleadosapp.dao;

import com.uthprograoo.empleadosapp.model.Empleado;
import com.uthprograoo.empleadosapp.util.ConexionSQLite;
import java.sql.Connection;
import java.sql.PreparedStatement;


/**
 *
 * @author Gregory Banegas
 */

//CRUD

//CREATE crear objero sqlite

public class EmpleadosDAO {
     public boolean GuardarEmpleado(Empleado emple){
         String sqlQuery = "INSERT INTO empleados "
                 + "(nombres,apellidos, puesto,salario)"
                 + "VALUES(?,?,?,?)";
         try(Connection con = ConexionSQLite.conexion();
             PreparedStatement ps = con.prepareStatement(sqlQuery)){
             
             ps.setString(1, emple.getNombres());
             ps.setString(2, emple.getApellidos());
             ps.setString(3, emple.getPuesto());
             ps.setDouble(4, emple.getSalario());
             
             ps.executeUpdate();
             return true;
         }
         catch(Exception ex){
             ex.printStackTrace();
             return true;
         }
     }
}
