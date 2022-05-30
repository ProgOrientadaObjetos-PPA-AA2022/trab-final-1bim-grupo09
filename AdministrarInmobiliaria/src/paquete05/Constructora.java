/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete05;

import java.io.Serializable;

/**
 *
 * @author reroes
 */
public class Constructora implements Serializable{
    private String nombre;
    private String identificacion;
    
    public Constructora(String nom, String id) {
        nombre = nom;
        identificacion = id;
    }
    
    public void establecerNombreConstructora(String n) {
        nombre = n;
    }
    
    public void establecerIdentificacionEmpresa(String n) {
        identificacion = n;
    }
    
    public String obtenerNombreConstructora() {
        return nombre;
    }
    
    public String obtenerIdentificacionConstructora() {
        return identificacion;
    }
    
}
