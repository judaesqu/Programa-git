/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author EspinosaBeltran
 */
public class Empleado {
    int idEmpleado;
    String nombre;
    String correo;
    String user;
    String pass;
    String posicion;
    String telefono;
    String salario;
    String estado;
    
    public Empleado(){
    }
    
    public Empleado(int idEmpleado, String nombre, String correo, String user, String pass, String posicion, String telefono, String salario, String estado){
        this.idEmpleado=idEmpleado;
        this.nombre=nombre;
        this.correo=correo;
        this.user=user;
        this.pass=pass;
        this.posicion=posicion;
        this.telefono=telefono;
        this.salario=salario;
        this.estado=estado;
    }

    public int getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(int idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getSalario() {
        return salario;
    }

    public void setSalario(String salario) {
        this.salario = salario;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    
    
}
