/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete06;
import java.io.Serializable;
import paquete02.Propietario;
import paquete03.Barrio;
import paquete04.Ciudad;
import paquete05.Constructora;
/**
/**
 *
 * @author reroes
 */
public class Departamento implements Serializable{
    private Propietario propietario;
    private double precioM2;
    private double numeroMetros;
    private double alicuotaMensual;
    private double costoFinal;
    private Barrio barrio;
    private Ciudad ciudad;
    private String nombreEdificio;
    private String ubiDepartamento;
    private Constructora constructora;
    
    public Departamento ( double pM2, double numMetros,
             String nombre, String ubi ) {
        precioM2 = pM2;
        numeroMetros = numMetros;
        nombreEdificio = nombre;
        ubiDepartamento = ubi;
    }
    
    public Departamento ( Propietario n,double pM2, double numMetros, String nombre, String ubi, Barrio ba, Ciudad ciu, Constructora cs ) {
        propietario = n;
        precioM2 = pM2;
        numeroMetros = numMetros;
        nombreEdificio = nombre;
        ubiDepartamento = ubi;
        barrio = ba;
        ciudad = ciu;
        constructora = cs;
    }
    
    public void establecerPropietario(Propietario n) {
        propietario = n;
    }
    
    public void establecerPrecioM2(double n) {
        precioM2 = n;
    }
    
    public void establecerNumeroMetro(double n) {
        numeroMetros = n;
    }
    public void establecerAlicuotaMensual() {
        alicuotaMensual = 0.18;
    }
    
    public void establecerCostoFinal() {
        costoFinal = (numeroMetros * precioM2) + (alicuotaMensual * 12);
    }
    
    public void establecerBarrio(Barrio n) {
        barrio = n;
    }
    
    public void establecerCiudad(Ciudad n) {
        ciudad = n;
    }
    
    public void establecerNombreEdificio(String n) {
        nombreEdificio = n;
    }
    public void establecerUbicacionEdificio(String n) {
        ubiDepartamento = n;
    }
    
    public void establecerConstructora(Constructora n) {
        constructora = n;
    }
    
    public Propietario obtenerPropietario() {
        return propietario;
    }
    
    public double obtenerPrecioM2() {
        return precioM2; 
    }
    
    public double obtenerNumeroMetros() {
        return numeroMetros;
    }
    
    public double obtenerAlicuotaMensual() {
        return alicuotaMensual;
    }
    
    public double obtenerCostoFinal() {
        return costoFinal;
    }
    
    public Barrio obtenerBarrio() {
        return barrio;
    }
    
    public Ciudad obtenerCiudad() {
        return ciudad;
    }
    
    public String obtenerNombreEdificio() {
        return nombreEdificio;
    }
    
    public String obtenerUbicacionEdificio() {
        return ubiDepartamento;
    }
    
    public Constructora obtenerConstructora() {
        return constructora;
    }
}
