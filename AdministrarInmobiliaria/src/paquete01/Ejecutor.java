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
import paquete06.EscrituraArchivoSecuencial5;
import paquete06.EscrituraArchivoSecuencial6;
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
        String nombreArchivo5 = "datos/casas.data";
        String nombreArchivo6= "datos/casas.data";
        
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
                             System.out.println("\nCASA");
                            System.out.println("--------------");
                            System.out.print("Ingrese la identificacion del Propietario: ");
                            sc.nextLine();
                            String idCa_buscar = sc.nextLine();
                            System.out.print("Ingrese el Nombre del Barrio: ");
                            String nomBaCa_buscar = sc.nextLine();
                            System.out.print("Ingrese el Nombre de la Ciudad: ");
                            String nomCiuCa_buscar = sc.nextLine();
                            System.out.print("Ingrese el ID de la Empresa: ");
                            String consCa_buscar = sc.nextLine();
                            System.out.print("Cotización de los m2: ");
                            double precioM2 = sc.nextDouble();
                            System.out.print("Numero de Metros de la Casa: ");
                            double numeroMetro = sc.nextDouble();
                            System.out.print("Numero de Cuartos de la Casa: ");
                            int numeroCua = sc.nextInt();
                            
                            Casa ca = new Casa(precioM2, numeroMetro, numeroCua);
                            ca.establecerCostoFinal();
                            
                            System.out.println("");
                            String idCa_buscar2 = "";
                            try {
                            LecturaArchivoSecuencial lecturaProp = new LecturaArchivoSecuencial(nombreArchivo);
                            lecturaProp.establecerIdentificador(idCa_buscar);
                            lecturaProp.establecerPropietarioBuscado();
                            idCa_buscar = lecturaProp.obtenerPropietarioBuscado().obtenerNombres();
                            idCa_buscar2 = lecturaProp.obtenerPropietarioBuscado().obtenerApellidos();
                            
                            
                            } catch(Exception e){
                                System.out.println("Propietario no encontrado");
                            }
                            Propietario pCa = new Propietario(idCa_buscar, idCa_buscar2);
                            
                            String nomBaCa_buscar2 = "";
                            try {
                            LecturaArchivoSecuencial1 lecturaProp1 = new LecturaArchivoSecuencial1(nombreArchivo1);
                            lecturaProp1.establecerIdentificador(nomBaCa_buscar);
                            lecturaProp1.establecerBarrioBuscado();
                            nomBaCa_buscar = lecturaProp1.obtenerBarrioBuscado().obtenerNombreBarrio();
                            nomBaCa_buscar2 = lecturaProp1.obtenerBarrioBuscado().obtenerReferencia();
                            
                            
                            } catch(Exception e){
                                System.out.println("Barrio no encontrado");
                            }
                            Barrio baCa = new Barrio(nomBaCa_buscar,nomBaCa_buscar2);
                            
                            String nomCiuCa_buscar2 = "";
                            try {
                            LecturaArchivoSecuencial3 lecturaProp2 = new LecturaArchivoSecuencial3(nombreArchivo3);
                            lecturaProp2.establecerIdentificador(nomCiuCa_buscar);
                            lecturaProp2.establecerCiudadBuscado();
                            nomCiuCa_buscar = lecturaProp2.obtenerCiudadBuscado().obtenerNombreCiudad();
                            nomCiuCa_buscar2 = lecturaProp2.obtenerCiudadBuscado().obtenerNombreProvincia();
                            
                            } catch(Exception e){
                                System.out.println("Ciudad no encontrada");
                            }
                            Ciudad ciuCa = new Ciudad(nomCiuCa_buscar, nomCiuCa_buscar2);
                            
                            String consCa_buscar2 = "";
                            try {
                            LecturaArchivoSecuencial2 lecturaProp3 = new LecturaArchivoSecuencial2(nombreArchivo2);
                            lecturaProp3.establecerIdentificador(consCa_buscar);
                            lecturaProp3.establecerConstructoraBuscado();
                            consCa_buscar = lecturaProp3.obtenerConstructoraBuscado().obtenerNombreConstructora();
                            consCa_buscar2 = lecturaProp3.obtenerConstructoraBuscado().obtenerNombreConstructora();
                            
                            } catch(Exception e){
                                System.out.println("Constructora no encontrada");
                            }
                            
                            Constructora csCa = new Constructora(consCa_buscar,consCa_buscar2);
                            if(idCa_buscar!=null){
                                System.out.print("\n" + idCa_buscar + " " + idCa_buscar2 + " - ");
                            }
                            if(nomBaCa_buscar!=null){
                                System.out.print(nomBaCa_buscar + " - ");
                            }
                            if(nomCiuCa_buscar!=null){
                                System.out.print(nomCiuCa_buscar + " - ");
                            }
                            if(consCa_buscar!=null){
                                System.out.print(consCa_buscar + " - ");
                            }
                            
                            System.out.printf("N° Cuartos: %d\n"
                                    + "COSTO FINAL: $%.2f\n",ca.obtenereNumeroCuartos(),
                                    ca.obtenerCostoFinal());
                            
                            Casa casa = new Casa(pCa, precioM2, numeroMetro, baCa, ciuCa, numeroCua, csCa);
                            
                            EscrituraArchivoSecuencial5 archivo5 = new EscrituraArchivoSecuencial5(nombreArchivo5);
                            archivo5.establecerRegistro(casa);
                            archivo5.establecerSalida();
                            archivo5.cerrarArchivo();
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
                            System.out.print("Cotización de los m2: ");
                            double valorM2 = sc.nextDouble();
                            System.out.print("Numero de Metros del Departamento: ");
                            double numMetro = sc.nextDouble();
                            System.out.print("Ingrese el nombre del Edifico: ");
                            sc.nextLine();
                            String nombreEdi = sc.nextLine();
                            System.out.print("Ingrese la Ubicación del Edificio: ");
                            String ubi = sc.nextLine();
                            
                            Departamento dep = new Departamento(valorM2,numMetro,nombreEdi,ubi);
                            dep.establecerCostoFinal();
                            
                            System.out.println("");
                            String idDep_buscar2 = "";
                            try {
                            LecturaArchivoSecuencial lecturaProp = new LecturaArchivoSecuencial(nombreArchivo);
                            lecturaProp.establecerIdentificador(idDep_buscar);
                            lecturaProp.establecerPropietarioBuscado();
                            idDep_buscar = lecturaProp.obtenerPropietarioBuscado().obtenerNombres();
                            idDep_buscar2 = lecturaProp.obtenerPropietarioBuscado().obtenerApellidos();
                            } catch(Exception e){
                                System.out.println("Propietario no encontrado");
                            }
                            
                            Propietario pDep = new Propietario(idDep_buscar,idDep_buscar2);
                            
                            String nomBaDep_buscar2 = "";
                            try {
                            LecturaArchivoSecuencial1 lecturaProp1 = new LecturaArchivoSecuencial1(nombreArchivo1);
                            lecturaProp1.establecerIdentificador(nomBaDep_buscar);
                            lecturaProp1.establecerBarrioBuscado();
                            nomBaDep_buscar = lecturaProp1.obtenerBarrioBuscado().obtenerNombreBarrio();
                            nomBaDep_buscar2 = lecturaProp1.obtenerBarrioBuscado().obtenerReferencia();
                            } catch(Exception e){
                                System.out.println("Barrio no encontrado");
                            }
                            
                            Barrio baDep = new Barrio(nomBaDep_buscar,nomBaDep_buscar2);
                            
                            String nomCiuDep_buscar2 = "";
                            try {
                            LecturaArchivoSecuencial3 lecturaProp2 = new LecturaArchivoSecuencial3(nombreArchivo3);
                            lecturaProp2.establecerIdentificador(nomCiuDep_buscar);
                            lecturaProp2.establecerCiudadBuscado();
                            nomCiuDep_buscar = lecturaProp2.obtenerCiudadBuscado().obtenerNombreCiudad();
                            nomCiuDep_buscar2 = lecturaProp2.obtenerCiudadBuscado().obtenerNombreProvincia();
                            } catch(Exception e){
                                System.out.println("Ciudad no encontrada");
                            }
                            
                            Ciudad ciuDep = new Ciudad(nomCiuDep_buscar, nomCiuDep_buscar2);
                            
                            String consDep_buscar2 = "";
                            try {
                            LecturaArchivoSecuencial2 lecturaProp3 = new LecturaArchivoSecuencial2(nombreArchivo2);
                            lecturaProp3.establecerIdentificador(consDep_buscar);
                            lecturaProp3.establecerConstructoraBuscado();
                            consDep_buscar = lecturaProp3.obtenerConstructoraBuscado().obtenerNombreConstructora();
                            } catch(Exception e){
                                System.out.println("Constructora no encontrada");
                            }
                            
                            Constructora csDep = new Constructora(consDep_buscar,consDep_buscar2);
                            
                            if(idDep_buscar!=null){
                                System.out.print("\n" + idDep_buscar + " " + idDep_buscar2 + " - ");
                            }
                            if(nomBaDep_buscar!=null){
                                System.out.print(nomBaDep_buscar + " - ");
                            }
                            if(nomCiuDep_buscar!=null){
                                System.out.print(nomCiuDep_buscar + " - ");
                            }
                            if(consDep_buscar!=null){
                                System.out.print(consDep_buscar + " - ");
                            }
                            
                            System.out.printf("%s"
                                    + " - %s\n"
                                    + "COSTO FINAL: $%.2f\n",dep.obtenerNombreEdificio(), dep.obtenerUbicacionEdificio(),
                                    dep.obtenerCostoFinal());
                            
                            Departamento depa = new Departamento(pDep, valorM2, numMetro, nombreEdi, ubi, baDep, ciuDep, csDep);
                            EscrituraArchivoSecuencial6 archivo6 = new EscrituraArchivoSecuencial6(nombreArchivo6);
                            archivo6.establecerRegistro(depa);
                            archivo6.establecerSalida();
                            archivo6.cerrarArchivo();
                            break;
                        default :
                            System.out.println("\nOPCION FUERA DE RANGO!!");
		}
 
		
    }
}
