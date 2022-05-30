/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete04;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class EscrituraArchivoSecuencial3 {

    private String nombreArchivo;
    private ObjectOutputStream salida;
    private Ciudad registro;
    private ArrayList<Ciudad> lista;

    public EscrituraArchivoSecuencial3(String nombreArc) {
        nombreArchivo = nombreArc;
        establecerLista();
        try
        {
            salida = new ObjectOutputStream(
                    new FileOutputStream(nombreArchivo));
            if (obtenerLista().size() > 0) {
                for (int i = 0; i < obtenerLista().size(); i++) {
                    establecerRegistro(obtenerLista().get(i));
                    establecerSalida();
                }
            }
        } // fin de try
        catch (IOException ioException) {
            System.err.println("Error al abrir el archivo.");
        } // fin de catch
    }
    
    public void establecerNombreArchivo(String n){
        nombreArchivo = n;
    }
    // agrega registros al archivo
    public void establecerRegistro(Ciudad p) {
        registro = p;
    }

    public void establecerSalida() {
        try {
            salida.writeObject(registro);
        } catch (IOException ex) {
            System.err.println("Error al escribir en el archivo.");
        }
    }
    public void establecerLista() {
        LecturaArchivoSecuencial3 l = new LecturaArchivoSecuencial3(obtenerNombreArchivo());
        l.establecerListaCiudades();
        lista = l.obtenerListaCiudades();
    }

    public String obtenerNombreArchivo(){
        return nombreArchivo;
    }
    
    public ArrayList<Ciudad> obtenerLista() {
        return lista;
    }

    public ObjectOutputStream obtenerSalida(){
        return salida;
    }
    public void cerrarArchivo() {
        try // cierra el archivo
        {
            if (salida != null) {
                salida.close();
            }
        } // fin de try
        catch (IOException ioException) {
            System.err.println("Error al cerrar el archivo.");
            
        } // fin de catch
    } 

}