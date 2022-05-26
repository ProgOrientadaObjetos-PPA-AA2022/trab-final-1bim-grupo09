/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete03;

/**
 *
 * @author reroes
 */
public class Barrio {
    private String nombre;
    private String referencia;
    
    public Barrio(String nom, String ref){
        nombre = nom;
        referencia = ref;
    }
    
    public void establecerNombreBarrio(String n) {
        nombre = n;
    }
    
    public void establecerReferencia(String n) {
        referencia = n;
    }
    
    public String obtenerNombreBarrio() {
        return nombre;
    }
    
    public String obtenerReferencia() {
        return referencia;
    }
 }
