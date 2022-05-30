/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete03;

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
public class LecturaArchivoSecuencial1 {

    private ObjectInputStream entrada;
    private ArrayList<Barrio> barrios;
    private String nombreArchivo;
    private String identificador;
    private Barrio BarrioBuscado;

    public LecturaArchivoSecuencial1(String n) {
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

    public void establecerListaBarrios() {
        barrios = new ArrayList<>();
        File f = new File(obtenerNombreArchivo());
        if (f.exists()) {

            while (true) {
                try {
                    Barrio registro = (Barrio) entrada.readObject();
                    barrios.add(registro);
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
    
    public void establecerBarrioBuscado() {
        
        File f = new File(obtenerNombreArchivo());
        if (f.exists()) {

            while (true) {
                try {
                    Barrio registro = (Barrio) entrada.readObject();
                    
                    if(registro.obtenerNombreBarrio().equals(identificador)){
                        BarrioBuscado = registro;
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

    public ArrayList<Barrio> obtenerListaBarrios() {
        return barrios;
    }

    public String obtenerNombreArchivo() {
        return nombreArchivo;
    }
    
    public String obtenerIdentificador() {
        return identificador;
    }
        
    public Barrio obtenerBarrioBuscado() {
        return BarrioBuscado;
    }

    @Override
    public String toString() {
        String cadena = "Lista de Barrios\n";
        for (int i = 0; i < obtenerListaBarrios().size(); i++) {
            Barrio p = obtenerListaBarrios().get(i);
            cadena = String.format("%s(%d) %s - %s\n", cadena, i +1,
                    p.obtenerNombreBarrio(), p.obtenerReferencia());
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