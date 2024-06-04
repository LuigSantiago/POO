/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.proyectoudc.subastas;
import java.io.Serializable;
import java.util.HashMap;

public class Usuarios implements Serializable {

    public static HashMap<String, Usuarios> getUsuariosBD() {
        return UsuariosBD;
    }

    public static void setUsuariosBD(HashMap<String, Usuarios> aUsuariosBD) {
        UsuariosBD = aUsuariosBD;
    }
    private String Nombres;
    private String Direccion;
    private int Edad;
    private char[] Contraseña;
    private String Documento;
    private String Correo;
    private static HashMap<String, Usuarios> UsuariosBD;

    public String getNombres() {
        return Nombres;
    }

    public void setNombres(String Nombres) {
        this.Nombres = Nombres;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }

    public char[] getContraseña() {
        return Contraseña;
    }

    public void setContraseña(char[] Contraseña) {
        this.Contraseña = Contraseña;
    }

    public String getDocumento() {
        return Documento;
    }

    public void setDocumento(String Documento) {
        this.Documento = Documento;
    }

    public String getCorreo() {
        return Correo;
    }

    public void setCorreo(String Correo) {
        this.Correo = Correo;
    }
    public static void actualizarUsuarioEnBD(String nombre, Usuarios usuario) {
        UsuariosBD.put(nombre, usuario);
    }
        public static void borrarUsuarioEnBD(String nombre, Usuarios usuario) {
        UsuariosBD.remove(nombre, usuario);
    }
}