/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.uthprograoo.empleadosapp;

import com.uthprograoo.empleadosapp.model.Empleado;
import com.uthprograoo.empleadosapp.dao.EmpleadosDAO;
import com.uthprograoo.empleadosapp.util.ConexionSQLite;

/**
 *
 * @author Gregory Banegas
 */
public class EmpleadosApp {

    public static void main(String[] args) {
        try{
            System.out.println("");
            ConexionSQLite.CrearTablas();
            Empleado emple = new Empleado();
            emple.setNombres("Gregory");
            emple.setApellidos("Banegas");
            emple.setPuesto("Motorista");
            emple.setSalario(15000.00);

            EmpleadosDAO dao = new EmpleadosDAO();

            if(dao.GuardarEmpleado(emple)){
                System.out.println("Empleado ingresado con exito");
            }
            else{
                System.out.println("Ha ocurrido un error");
            }
           
        }
        catch(Exception ex){
            System.out.println(ex);
        }
    }
}
