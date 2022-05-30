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
import paquete03.EscrituraArchivoSecuencial1;
import paquete03.LecturaArchivoSecuencial1;
import paquete05.EscrituraArchivoSecuencial2;
import paquete05.LecturaArchivoSecuencial2;
import paquete04.EscrituraArchivoSecuencial3;
import paquete04.LecturaArchivoSecuencial3;
/**
 *
 * @author reroes
 */
public class Ejecutor {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nombreArchivo = "datos/propietarios.data";
        String nombreArchivo1 = "datos/barrios.data";
        String nombreArchivo3= "datos/ciudades.data";
        String nombreArchivo2 = "datos/constructoras.data";
         String nombreArchivo5 = "datos/departamentos.data";
        
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
                            System.out.println("\nPROPIETARIO");
                            System.out.println("-------------");
                            System.out.print("Ingrese sus Nombres: ");
                            sc.nextLine();
                            String nombres = sc.nextLine();
                            System.out.print("Ingrese sus Apellidos: ");
                            String apellidos = sc.nextLine();
                            System.out.print("Ingrese su Identificación(C.I): ");
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
                            System.out.println("\nBARRIOS");
                            System.out.println("-------------");
                            System.out.print("Ingrese el nombre del Barrio: ");
                            sc.nextLine();
                            String nombreBa = sc.nextLine();
                            System.out.print("Ingrese Referencia del Barrio: ");
                            String refe = sc.nextLine();
                            
                            Barrio ba = new Barrio(nombreBa, refe);
                            
                            EscrituraArchivoSecuencial1 archivo1 = new EscrituraArchivoSecuencial1(nombreArchivo1);
                            archivo1.establecerRegistro(ba);
                            archivo1.establecerSalida();
                            archivo1.cerrarArchivo();
                            
                            LecturaArchivoSecuencial1 lectura1 = new LecturaArchivoSecuencial1(nombreArchivo1);
                            lectura1.establecerListaBarrios();
                            System.out.printf("\n%s\n", lectura1);
                            
                            break;
			case 3:
                            System.out.println("\nCIUDAD");
                            System.out.println("--------------");
                            System.out.print("Ingrese el nombre de la Ciudad: ");
                            sc.nextLine();
                            String nombreCiu = sc.nextLine();
                            System.out.print("Ingrese el nombre de la provincia: ");
                            String nombreProv = sc.nextLine();
                            
                            Ciudad ciu = new Ciudad (nombreCiu, nombreProv);
                            
                            EscrituraArchivoSecuencial3 archivo3 = new EscrituraArchivoSecuencial3(nombreArchivo3);
                            archivo3.establecerRegistro(ciu);
                            archivo3.establecerSalida();
                            archivo3.cerrarArchivo();
                            
                            LecturaArchivoSecuencial3 lectura3 = new LecturaArchivoSecuencial3(nombreArchivo3);
                            lectura3.establecerListaCiudades();
                            System.out.printf("\n%s\n", lectura3);
                            break; 
			case 4:
                            System.out.println("\nCONSTRUCTORA");
                            System.out.println("--------------");
                            System.out.print("Ingrese el nombre de la Empresa: ");
                            sc.nextLine();
                            String nombreEmp = sc.nextLine();
                            System.out.print("Ingrese el ID de la Empresa: ");
                            String idEmp = sc.nextLine();
                            
                            Constructora cs = new Constructora(nombreEmp, idEmp);
                            
                            EscrituraArchivoSecuencial2 archivo2 = new EscrituraArchivoSecuencial2(nombreArchivo2);
                            archivo2.establecerRegistro(cs);
                            archivo2.establecerSalida();
                            archivo2.cerrarArchivo();
                            
                            LecturaArchivoSecuencial2 lectura2 = new LecturaArchivoSecuencial2(nombreArchivo2);
                            lectura2.establecerListaConstructoras();
                            System.out.printf("\n%s\n", lectura2);
                            
                            break;
                        case 5:
                            System.out.println("");
                            break;
                        case 6:
                            System.out.println("\nDEPARTAMENTO");
                            System.out.println("--------------");
                            System.out.print("Ingrese la identificacion del Propietario: ");
                            sc.nextLine();
                            String idDep_buscar = sc.nextLine();
                            System.out.print("Ingrese el Nombre del Barrio: ");
                            String nomBaDep_buscar = sc.nextLine();
                            System.out.print("Ingrese el Nombre de la Ciudad: ");
                            String nomCiuDep_buscar = sc.nextLine();
                            System.out.print("Ingrese el ID de la Empresa: ");
                            String consDep_buscar = sc.nextLine();
                            
                            try {
                               Departamento departamento_buscar;
                            LecturaArchivoSecuencial lecturaProp = new LecturaArchivoSecuencial(nombreArchivo);
                            lecturaProp.establecerIdentificador(idDep_buscar);
                            lecturaProp.establecerPropietarioBuscado();
                            idDep_buscar = lecturaProp.obtenerPropietarioBuscado().obtenerNombres();
                            if(idDep_buscar!=null){
                                System.out.print("\n" + idDep_buscar + " - ");
                            }
                            } catch(Exception e){
                                System.out.println("\nPropietario no encontrado\n");
                            }
                            try {
                               Departamento departamento_buscar1;
                            LecturaArchivoSecuencial1 lecturaProp1 = new LecturaArchivoSecuencial1(nombreArchivo1);
                            lecturaProp1.establecerIdentificador(nomBaDep_buscar);
                            lecturaProp1.establecerBarrioBuscado();
                            nomBaDep_buscar = lecturaProp1.obtenerBarrioBuscado().obtenerNombreBarrio();
                            if(nomBaDep_buscar!=null){
                                System.out.print(nomBaDep_buscar + " - ");
                            }
                            } catch(Exception e){
                                System.out.println("\nBarrio no encontrado\n");
                            }
                            try {
                               Departamento departamento_buscar2;
                            LecturaArchivoSecuencial3 lecturaProp2 = new LecturaArchivoSecuencial3(nombreArchivo3);
                            lecturaProp2.establecerIdentificador(nomCiuDep_buscar);
                            lecturaProp2.establecerCiudadBuscado();
                            nomCiuDep_buscar = lecturaProp2.obtenerCiudadBuscado().obtenerNombreCiudad();
                            if(nomCiuDep_buscar!=null){
                                System.out.print(nomCiuDep_buscar + " - ");
                            }
                            } catch(Exception e){
                                System.out.println("\nCiudad no encontrada\n");
                            }
                            try {
                               Departamento departamento_buscar3;
                            LecturaArchivoSecuencial2 lecturaProp3 = new LecturaArchivoSecuencial2(nombreArchivo2);
                            lecturaProp3.establecerIdentificador(consDep_buscar);
                            lecturaProp3.establecerConstructoraBuscado();
                            consDep_buscar = lecturaProp3.obtenerConstructoraBuscado().obtenerNombreConstructora();
                            if(consDep_buscar!=null){
                                System.out.print(consDep_buscar + " - ");
                            }
                            } catch(Exception e){
                                System.out.println("\nConstructora no encontrada\n");
                            }
                            
                            break;
		}
 
		
    }
}
