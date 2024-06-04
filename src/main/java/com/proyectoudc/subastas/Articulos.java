/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.proyectoudc.subastas;

import java.io.Serializable;
import java.util.HashMap;
import java.time.LocalDateTime;

public class Articulos implements Serializable {
  
    private int ID;
    private String Nombre;
    private String Descripcion;
    private String InfoEstado;
    private double PrecioBase;
    private String Categoria;
    private String Subcategoria;
    private LocalDateTime FechaLimite;
    private String UN;   
    private static HashMap<String, Articulos> ArticulosBD = new HashMap<>();
    private int Ofertas;
    // Constructor
    public Articulos() {

    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    public String getInfoEstado() {
        return InfoEstado;
    }

    public void setInfoEstado(String InfoEstado) {
        this.InfoEstado = InfoEstado;
    }

    public double getPrecioBase() {
        return PrecioBase;
    }

    public void setPrecioBase(double PrecioBase) {
        this.PrecioBase = PrecioBase;
    }

    public LocalDateTime getFechaLimite() {
        return FechaLimite;
    }

    public void setFechaLimite(LocalDateTime FechaLimite) {
        this.FechaLimite = FechaLimite;
    }
    public void setCategoria(String Categoria) {
        this.Categoria = Categoria;
    }

    public String getCategoria() {
        return Categoria;
    } 

    public String getSubcategoria() {
        return Subcategoria;
    }

    public void setSubcategoria(String Subcategoria) {
        this.Subcategoria = Subcategoria;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }
    public static HashMap<String, Articulos> getArticulosBD() {
        return ArticulosBD;
    }

    public static void setArticulosBD(HashMap<String, Articulos> aArticulosBD) {
        ArticulosBD = aArticulosBD;
    }

    public int getOfertas() {
        return Ofertas;
    }

    public void setOfertas(int Ofertas) {
        this.Ofertas = Ofertas;
    }
    public static void actualizarArticuloEnBD(String ID, Articulos articulo) {
        ArticulosBD.put(ID, articulo);
    }

    public String getUN() {
        return UN;
    }

    public void setUN(String UN) {
        this.UN = UN;
    }
             public static void borrarArtEnBD(int ID, Articulos articulo) {
             ArticulosBD.remove(ID);
    }
}
