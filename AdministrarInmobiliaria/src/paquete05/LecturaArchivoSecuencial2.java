/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete05;

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
public class LecturaArchivoSecuencial2 {

    private ObjectInputStream entrada;
    private ArrayList<Constructora> constructoras;
    private String nombreArchivo;
    private String identificador;
    private Constructora ConstructoraBuscado;

    public LecturaArchivoSecuencial2(String n) {
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

    public void establecerListaConstructoras() {
        constructoras = new ArrayList<>();
        File f = new File(obtenerNombreArchivo());
        if (f.exists()) {

            while (true) {
                try {
                    Constructora registro = (Constructora) entrada.readObject();
                    constructoras.add(registro);
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
    
    public void establecerConstructoraBuscado() {
        
        File f = new File(obtenerNombreArchivo());
        if (f.exists()) {

            while (true) {
                try {
                    Constructora registro = (Constructora) entrada.readObject();
                    
                    if(registro.obtenerIdentificacionConstructora().equals(identificador)){
                        ConstructoraBuscado = registro;
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

    public ArrayList<Constructora> obtenerListaConstructoras() {
        return constructoras;
    }

    public String obtenerNombreArchivo() {
        return nombreArchivo;
    }
    
    public String obtenerIdentificador() {
        return identificador;
    }
        
    public Constructora obtenerConstructoraBuscado() {
        return ConstructoraBuscado;
    }

    @Override
    public String toString() {
        String cadena = "Lista de Constructoras\n";
        for (int i = 0; i < obtenerListaConstructoras().size(); i++) {
            Constructora p = obtenerListaConstructoras().get(i);
            cadena = String.format("%s(%d) %s - %s\n", cadena, i +1,
                    p.obtenerNombreConstructora(), p.obtenerIdentificacionConstructora());
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