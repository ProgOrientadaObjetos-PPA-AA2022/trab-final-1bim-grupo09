/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete06;
import paquete02.Propietario;
import paquete03.Barrio;
import paquete04.Ciudad;
import paquete05.Constructora;
/**
 *
 * @author reroes
 */
public class Casa {
    private Propietario propietario;
    private double precioM2;
    private double numMetros;
    private double costoFinal;
    private Barrio barrio;
    private Ciudad ciudad;
    private int numCuartos;
    private Constructora constructora;
    
    public Casa(Propietario propie, double pM2, double numeroMetros,
            Barrio ba, Ciudad ciu, int numeroCuartos, Constructora cons){
       propietario = propie;
       precioM2 = pM2;
       numMetros = numeroMetros;
       barrio = ba;
       ciudad = ciu;
       numCuartos = numeroCuartos;
       constructora = cons;
    }
    
    public void establecerPropietario (Propietario n) {
        propietario = n;
    }
    
    public void establecerPrecioMetroCuadrado(double n) {
        precioM2 = n;
    }
    
    public void establecerNumeroMetros(double n) {
        numMetros = n;
    } 
    
    public void establecerCostoFinal() {
        costoFinal = numMetros * precioM2;
    }
    
    public void establecerBarrio(Barrio n) {
        barrio = n;
    }
    
    public void establecerCiudad(Ciudad n) {
        ciudad = n;
    }
    
    public void establecerNumeroCuartos(int n) {
        numCuartos = n;
    }
    
    public void establecerConstructora(Constructora n) {
        constructora = n;
    }
    
    public Propietario obtenerPropietario() {
        return propietario;
    }
    
    public double obtenerPrecioMetroCuadrado() {
        return precioM2;
    }
    
    public double obtenerNumeroMetros() {
        return numMetros;
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
    
    public int obtenereNumeroCuartos() {
        return numCuartos;
    }
    
    public Constructora obtenerConstructora() {
        return constructora;
    }
}
