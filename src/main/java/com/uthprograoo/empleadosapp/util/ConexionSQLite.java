/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.uthprograoo.empleadosapp.util;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Gregory Banegas
 */
public class ConexionSQLite {
    private static final String urldb =
            "jdbc:sqlite:Empleados.db";
    
    private static Connection conexion()
    {
        try
        {
            return DriverManager.getConnection(urldb);
        }
        catch(Exception ex)
        {
            System.out.println("Fallo la conexion a la Base de Datos");
            return null;
        }
    }
    
    public static void CrearTablas(){
        String sql = "CREATE TABLE IF NOT EXISTS empleados("
                +"id INTEGER PRIMARY KEY AUTOINCREMENT, "
                +"nombres TEXT NOT NULL,"
                +"apellidos TEXT NOT NULL,"
                +"puesto TEXT NOT NULL,"
                +"salario REAL NOT NULL)";
    }
    
}
