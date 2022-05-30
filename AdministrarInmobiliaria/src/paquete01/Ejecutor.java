/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete01;
import paquete02.Propietario;
import paquete03.Barrio;
import paquete04.Ciudad;
import paquete05.Constructora;
import paquete06.Casa;
import paquete06.Departamento;
import java.util.Scanner;
import paquete02.LecturaArchivoSecuencial;
import paquete02.EscrituraArchivoSecuencial;
/**
 *
 * @author reroes
 */
public class Ejecutor {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("INMOBILIARIA JUAN-CARLOS");
        System.out.println("-------------------------");
        System.out.println("");
        System.out.println("OPCIONES");
        System.out.printf("1) Ingresar datos de Propietario\n" 
                + "2) Ingresar datos del Barrio\n" 
                + "3) Ingresar datos del la Ciudad\n"
                + "4) Ingresar datos de la Constructora\n"
                + "5) Ingresar datos de la Casa\n"
                + "6) Ingresar datos del la Departamentos\n");
        System.out.print("ELIGE UNA OPCION!: ");
        int n = sc.nextInt();
        
        
		switch(n) {
			case 1:
                            String nombreArchivo = "/datos/propietarios.data";
                            System.out.println("\nPROPIETARIO");
                            System.out.println("-------------");
                            System.out.print("ingrese sus Nombres: ");
                            sc.nextLine();
                            String nombres = sc.nextLine();
                            System.out.print("ingrese sus Apellidos: ");
                            String apellidos = sc.nextLine();
                            System.out.print("ingrese su Identificación(C.I): ");
                            String id = sc.nextLine();
                            
                            Propietario p1 = new Propietario(nombres, apellidos, id);
                            
                            EscrituraArchivoSecuencial archivo = new EscrituraArchivoSecuencial(nombreArchivo);
                            archivo.establecerRegistro(p1);
                            archivo.establecerSalida();
                            archivo.cerrarArchivo();
                            
                            LecturaArchivoSecuencial lectura = new LecturaArchivoSecuencial(nombreArchivo);
                            lectura.establecerListaPropietarios();
                            System.out.printf("\n%s\n", lectura);
                            break;
			case 2:
                            System.out.println("Habitación 2");
                            break;
			case 3:
                            System.out.println("Habitación 3");
                            break; 
			case 4:
                            System.out.println("Habitación 4");
                            break;
                        case 5:
                          
                            
                            System.out.println("Habitación 5");
                            break;
                        case 6:
                            System.out.println("Habitación 5");
                            break;
                        default: 
                            System.out.println ("OPCIONES FUERA DE RANGO"); 
                            break;
		}
 
		
    }
}
