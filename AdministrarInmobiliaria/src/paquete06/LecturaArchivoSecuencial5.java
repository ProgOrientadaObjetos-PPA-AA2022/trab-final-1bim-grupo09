/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete06;

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
public class LecturaArchivoSecuencial5 {

    private ObjectInputStream entrada;
    private ArrayList<Casa> casas;
    private String nombreArchivo;
    private String identificador;

    public LecturaArchivoSecuencial5(String n) {
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

    public void establecerListaCasas() {
        casas = new ArrayList<>();
        File f = new File(obtenerNombreArchivo());
        if (f.exists()) {

            while (true) {
                try {
                    Casa registro = (Casa) entrada.readObject();
                    casas.add(registro);
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
    

    public ArrayList<Casa> obtenerListaCasas() {
        return casas;
    }

    public String obtenerNombreArchivo() {
        return nombreArchivo;
    }
    
    public String obtenerIdentificador() {
        return identificador;
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