/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete04;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

/**
 *
 * @author reroes
 */
public class LecturaArchivoSecuencial3 {

    private ObjectInputStream entrada;
    private ArrayList<Ciudad> ciudades;
    private String nombreArchivo;
    private String identificador;
    private Ciudad CiudadBuscado;

    public LecturaArchivoSecuencial3(String n) {
        nombreArchivo = n;
        File f = new File(n);
        if (f.exists()) {
            try 
            {
                entrada = new ObjectInputStream(
                        new FileInputStream(n));
            }
            catch (IOException ioException) {
                System.err.println("Error al abrir el archivo.");

            }
        }
    }

    public void establecerNombreArchivo(String n) {
        nombreArchivo = n;
    }

    public void establecerListaCiudades() {
        ciudades = new ArrayList<>();
        File f = new File(obtenerNombreArchivo());
        if (f.exists()) {

            while (true) {
                try {
                    Ciudad registro = (Ciudad) entrada.readObject();
                    ciudades.add(registro);
                } catch (EOFException endOfFileException) {
                    return;

                } catch (IOException ex) {
                    System.err.println("Error al leer el archivo: " + ex);
                } catch (ClassNotFoundException ex) {
                    System.err.println("No se pudo crear el objeto: " + ex);
                } catch (Exception ex) {
                    break;
                }
            }
        }

    }
    
    public void establecerIdentificador(String n) {
        identificador = n;
    }
    
    public void establecerCiudadBuscado() {
        
        File f = new File(obtenerNombreArchivo());
        if (f.exists()) {

            while (true) {
                try {
                    Ciudad registro = (Ciudad) entrada.readObject();
                    
                    if(registro.obtenerNombreCiudad().equals(identificador)){
                        CiudadBuscado = registro;
                        break;
                    }
                    
                } catch (EOFException endOfFileException) {
                    return;

                } catch (IOException ex) {
                    System.err.println("Error al leer el archivo: " + ex);
                } catch (ClassNotFoundException ex) {
                    System.err.println("No se pudo crear el objeto: " + ex);
                } catch (Exception ex) {
                    System.err.println("No hay datos en el archivo: " + ex);

                }
            }
        }
    }

    public ArrayList<Ciudad> obtenerListaCiudades() {
        return ciudades;
    }

    public String obtenerNombreArchivo() {
        return nombreArchivo;
    }
    
    public String obtenerIdentificador() {
        return identificador;
    }
        
    public Ciudad obtenerCiudadBuscado() {
        return CiudadBuscado;
    }

    @Override
    public String toString() {
        String cadena = "Lista de Ciudades\n";
        for (int i = 0; i < obtenerListaCiudades().size(); i++) {
            Ciudad p = obtenerListaCiudades().get(i);
            cadena = String.format("%s(%d) %s - %s\n", cadena, i +1,
                    p.obtenerNombreCiudad(), p.obtenerNombreProvincia());
        }

        return cadena;
    }

    public void cerrarArchivo() {
        try
        {
            if (entrada != null) {
                entrada.close();
            }
            System.exit(0);
        }
        catch (IOException ioException) {
            System.err.println("Error al cerrar el archivo.");
            System.exit(1);
        }
    }
}