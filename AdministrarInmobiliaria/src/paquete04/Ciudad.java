/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete04;

import java.io.Serializable;

/**
 *
 * @author reroes
 */
public class Ciudad implements Serializable{
    private String nombreCiudad;
    private String nombreProvincia;
    
    public Ciudad(String nomCiu, String nomProv) {
        nombreCiudad = nomCiu;
        nombreProvincia = nomProv;
    }
    
    public void establecerNombreCiudad(String n) {
        nombreCiudad = n;
    }
    
    public void establecerNombreProvincia(String n) {
        nombreProvincia = n;
    }
    
    public String obtenerNombreCiudad() {
        return nombreCiudad;
    }
    
    public String obtenerNombreProvincia() {
        return nombreProvincia;
    }
}
