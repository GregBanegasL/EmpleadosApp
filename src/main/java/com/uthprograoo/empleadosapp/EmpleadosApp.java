/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.uthprograoo.empleadosapp;

import com.uthprograoo.empleadosapp.model.Empleado;
import com.uthprograoo.empleadosapp.dao.EmpleadosDAO;
import com.uthprograoo.empleadosapp.util.ConexionSQLite;
import com.uthprograoo.empleadosapp.views.JFormEmple;

/**
 *
 * @author Gregory Banegas
 */
public class EmpleadosApp {

    public static void main(String[] args) {
        
        java.awt.EventQueue.invokeLater(()->
        {
            new JFormEmple().setVisible(true);
        });
    }
}
