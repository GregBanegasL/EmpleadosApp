/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.uthprograoo.empleadosapp.model;

/**
 *
 * @author Gregory Banegas
 */
public class Empleado {
    private int id;
    private String nombres;
    private String apellidos;
    private String puesto;
    private double salario;

    public Empleado(int id, String nombres, String apellidos, String puesto, double salario) {
        this.id = id;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.puesto = puesto;
        this.salario = salario;
    }

    public Empleado() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    
    
}
